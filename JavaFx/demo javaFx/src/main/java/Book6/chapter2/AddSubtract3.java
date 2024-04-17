package Book6.chapter2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

//using anonymous inner classes
public class AddSubtract3 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Button btnAdd;
    Button btnSubtract;
    Label lbl;
    int iCounter =0;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //generate add button
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                iCounter++;
                lbl.setText(Integer.toString(iCounter));
            }
        });

        //generate subtract button with anonymous inner class
        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                iCounter--;
                lbl.setText(Integer.toString(iCounter));
            }
        });

        //Create the label
        lbl = new Label();
        lbl.setText(Integer.toString(iCounter));

        //add the buttons and label to the HBox pane
        HBox pane = new HBox(10);
        pane.getChildren().addAll(lbl,btnAdd,btnSubtract);

        //add the layout pane to a scene
        Scene scene = new Scene(pane, 200, 75);

        //add scene to stage, set the title and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Add/Subtract");
        primaryStage.show();
    }
}
