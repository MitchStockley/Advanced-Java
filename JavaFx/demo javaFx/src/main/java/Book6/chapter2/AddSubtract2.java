package Book6.chapter2;

import eu.hansolo.tilesfx.DemoLauncher;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AddSubtract2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Button btnAdd;
    Button btnSubtract;
    Label lbl;
    int iCounter = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //create click handler instance
        ClickHandler ch = new ClickHandler();

        //create add button
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(ch);

        //Create subtract button
        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(ch);

        //create the label
        lbl = new Label();
        lbl.setText(Integer.toString(iCounter));

        //add labels and buttons to an Hbox pane
        HBox pane = new HBox(10);
        pane.getChildren().addAll(lbl,btnAdd,btnSubtract);

        //add layout to pane
        Scene scene = new Scene(pane,200,75);

        //add scene to stage, set title and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Add/Sub");
        primaryStage.show();


    }
    private class ClickHandler implements EventHandler <ActionEvent>{

        @Override
        public void handle(ActionEvent e) {
            if(e.getSource() == btnAdd)
            {
                iCounter++;
            } else {
                if(e.getSource() == btnSubtract)
                {
                    iCounter--;
                }
            }
            lbl.setText(Integer.toString(iCounter));
        }

    }
}
