package Book8.chapter1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickMe extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Button btn;
    Label labl;
    int ClickCount = 0;

    @Override
    public void start(Stage primaryStage) {
        //creating button
        btn = new Button();
        btn.setText("Click Me!");
        btn.setOnAction(e -> buttonClick());
        //creating label
        labl = new Label();
        labl.setText("You have not clicked me yet");
        //adding layout
        BorderPane pane = new BorderPane();
        pane.setTop(labl);
        pane.setCenter(btn);
        Scene scene = new Scene(pane, 250, 150);
        //show stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Counter");
        primaryStage.show();

    }

    public void buttonClick() {
        ClickCount++;
        if(ClickCount == 1) {
            labl.setText("You clicked once");
        }else {
            labl.setText("You clicked " + ClickCount + " times");
        }
    }

}
