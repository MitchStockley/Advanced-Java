package Book6.chapter2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

//using lambda expressions
public class AddSubtract4 extends Application {

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
        btnAdd.setOnAction(e ->
        {
            iCounter++;
            lbl.setText(Integer.toString(iCounter));
        });
        //create subtract button
        btnSubtract = new Button();
        btnSubtract.setText("Sub");
        btnSubtract.setOnAction(e ->
        {
            iCounter--;
            lbl.setText(Integer.toString(iCounter));
        });

        //create label
        lbl = new Label();
        lbl.setText(Integer.toString(iCounter));

        //create HBox pane
        HBox pane = new HBox(10);
        pane.getChildren().addAll(lbl,btnAdd,btnSubtract);

        //add the scene
        Scene scene = new Scene(pane,200,75);

        //primary stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Add/Subtract!");
        primaryStage.show();
    }
}
