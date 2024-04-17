package Book6.chapter2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AddSubtract extends Application implements EventHandler<ActionEvent> {
    public static void main(String[] args) {
        launch(args);
    }

    Button btnAdd;
    Button btnSubtract;
    Label lbl;
    int iCounter = 0;



    @Override
    public void start(Stage primaryStage) throws Exception {
        //create add button
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(this);

        //create subtract button
        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(this);

        //create the label
        lbl = new Label();
        lbl.setText(Integer.toString(iCounter));

        //add buttons and labels to Hbox pane
        HBox pane = new HBox(10);
        pane.getChildren().addAll(lbl,btnAdd,btnSubtract);

        //Add layout pane to a scene
        Scene scene = new Scene(pane,200,75);

        //add scene to the stage and set the title and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Add/subtract");
        primaryStage.show();


    }

    @Override
    public void handle(ActionEvent e) {

        if(e.getSource() == btnAdd)
        {
            iCounter++;
        }
        else
        {
            if(e.getSource() == btnSubtract)
            {
                iCounter--;
            }
        }
        lbl.setText(Integer.toString(iCounter));
    }
}
