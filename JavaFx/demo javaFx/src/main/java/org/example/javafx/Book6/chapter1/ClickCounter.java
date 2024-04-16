package org.example.javafx.Book6.chapter1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickCounter extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Button btn;

    @Override
    public void start(Stage primaryStage) {
        //creating button
        btn = new Button();
        btn.setText("Click Me!");
        btn.setOnAction(e -> buttonClick());
        //adding layout
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);
        Scene scene = new Scene(pane, 300, 250);
        //show stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Welcome to the Click Me App");
        primaryStage.show();
    }

    public void buttonClick() {
        if(btn.getText() == "Click Me!") {
            btn.setText("You clicked!");
        }else {
            btn.setText("Click Me!");
        }
    }

}
