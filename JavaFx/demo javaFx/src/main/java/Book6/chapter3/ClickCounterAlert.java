package Book6.chapter3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickCounterAlert extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Button btn;
    Label lbl;
    int iClickCount = 0;
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        // Create the button
        btn = new Button();
        btn.setText("Click me please!");
        btn.setOnAction(e -> buttonClick());

        //add button to layout pane
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);

        //add layout pane to scene
        Scene scene = new Scene(pane,250,150);

        // Add the scene to the stage, set the title
        // and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Counter");
        primaryStage.show();

    }

    private void buttonClick()
    {
        iClickCount++;
        if(iClickCount == 1)
        {
            Alert a = new Alert(Alert.AlertType.INFORMATION,"You have clicked once");
            a.showAndWait();
        } else
        {
            Alert a = new Alert(Alert.AlertType.INFORMATION,"You have clicked: " + iClickCount + " times");
            a.showAndWait();
        }
    }
}
