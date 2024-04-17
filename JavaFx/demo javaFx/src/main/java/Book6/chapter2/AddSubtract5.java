package Book6.chapter2;

//more common way of making use of lambda expressions

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AddSubtract5 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Button btnAdd;
    Button btnSubtract;
    Label lbl;
    int iCounter = 0;
    @Override
    public void start(Stage primaryStage) throws Exception {
        //add the button
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(e -> btnAdd_Clicked());

        //subtract button
        btnSubtract = new Button();
        btnSubtract.setText("Sub");
        btnSubtract.setOnAction(e -> btnSubtract_Clicked());

        //create label
        lbl = new Label();
        lbl.setText(Integer.toString(iCounter));

        //Create HBox
        HBox pane = new HBox(10);
        pane.getChildren().addAll(lbl,btnAdd,btnSubtract);

        //scene
        Scene scene = new Scene(pane,200,75);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Add/Subtract");
        primaryStage.show();
    }

    private void btnSubtract_Clicked() {
        iCounter--;
        lbl.setText(Integer.toString(iCounter));
    }

    private void btnAdd_Clicked() {
        iCounter++;
        lbl.setText(Integer.toString(iCounter));
    }
}
