package Book6.chapter3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Optional;

public class ClickCounterExit extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Stage stage;
    int iClickCount = 0;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        stage = primaryStage;
        //click me button
        Button btnClickMe = new Button();
        btnClickMe.setText("Click me please");
        btnClickMe.setOnAction(e -> btnClickMe_Click());

        //create the close button
        Button btnClose = new Button();
        btnClose.setText("Close");
        btnClose.setOnAction(e -> btnClose_click());

        //add buttons to layout pane
        VBox pane = new VBox(10);
        pane.getChildren().addAll(btnClickMe,btnClose);
        pane.setAlignment(Pos.CENTER);

        //add layout pane to scene
        Scene scene = new Scene(pane, 250,150);

        //Finish and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Counter");
        primaryStage.setOnCloseRequest(e ->
        {
            e.consume();
            btnClose_click();
        });
        primaryStage.show();
    }

    public void btnClose_click()
    {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION,"Are you sure you want to quit? ", ButtonType.YES, ButtonType.NO);
        Optional<ButtonType> confirm = a.showAndWait();
        if(confirm.isPresent() && confirm.get() == ButtonType.YES)
        {
            stage.close();
        }

    }

    private void btnClickMe_Click()
    {
        iClickCount++;
        if(iClickCount == 1)
        {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "You have clicked once");
            a.showAndWait();
        } else
        {
            Alert a = new Alert(Alert.AlertType.INFORMATION,"you have clicked: " + iClickCount + " times");
            a.showAndWait();
        }
    }
}
