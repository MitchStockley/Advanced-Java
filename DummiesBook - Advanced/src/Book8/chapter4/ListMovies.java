package Book8.chapter3;
//connecting java programme to a database
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.text.NumberFormat;
import java.util.Properties;

public class ListMovies {
    private static Properties properties = new Properties();

    static {
        try (InputStream input = new FileInputStream("config.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // Connect to the database
        try (Connection con = getConnection()) {
            // Create the movies table if it doesn't exist
            createMoviesTable(con);

            // Insert some sample data into the movies table (optional)
            insertSampleData(con);

            // Retrieve and print movie details
            printMovieDetails(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Connection getConnection() throws SQLException {
        String url = properties.getProperty("db.url");
        String user = properties.getProperty("db.username");
        String password = properties.getProperty("db.password");
        return DriverManager.getConnection(url, user, password);
    }

    private static void createMoviesTable(Connection con) throws SQLException {
        try (Statement statement = con.createStatement()) {
            String createTableSQL = "CREATE TABLE IF NOT EXISTS movies (" +
                    "id SERIAL PRIMARY KEY," +
                    "title VARCHAR(255) NOT NULL," +
                    "year INTEGER NOT NULL," +
                    "price DECIMAL(10,2) NOT NULL)";
            statement.execute(createTableSQL);
        }
    }

    private static void insertSampleData(Connection con) throws SQLException {
        try (Statement statement = con.createStatement()) {
            statement.execute("INSERT INTO movies (title, year, price) VALUES " +
                    "('Movie 1', 2022, 15.99), " +
                    "('Movie 2', 2020, 12.99), " +
                    "('Movie 3', 2019, 14.99)");
        }
    }

    private static void printMovieDetails(Connection con) throws SQLException {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        try (Statement statement = con.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM movies")) {
            while (resultSet.next()) {
                int year = resultSet.getInt("year");
                String title = resultSet.getString("title");
                double price = resultSet.getDouble("price");
                String msg = year + ": " + title + " (" + cf.format(price) + ")";
                System.out.println(msg);
            }
        }
    }
}

