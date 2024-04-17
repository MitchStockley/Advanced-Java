package Book6.chapter3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SceneSwitcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    //fields for click counter scene
    int iClickCounter = 0;
    Label lblClicks;
    Button btnClickMe;
    Button btnSwitchToScene2;
    Scene scene1;

    //fields for add/subtract scene
    int iCounter = 0;
    Label lblCounter;
    Button btnAdd;
    Button btnSubtract;
    Button btnSwitchToScene1;
    Scene scene2;


    //class field for stage
    Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        stage = primaryStage;
        //Build the click counter scene
        lblClicks = new Label();
        lblClicks.setText("You have not clicked the button");

        btnClickMe = new Button();
        btnClickMe.setText("Click me please!");
        btnClickMe.setOnAction(e -> btnClickMe_Click());

        btnSwitchToScene2 = new Button();
        btnSwitchToScene2.setText("Switch");
        btnSwitchToScene2.setOnAction(e -> btnSwitchToScene2_Click());

        VBox pane1 = new VBox(10);
        pane1.getChildren().addAll(lblClicks,btnClickMe,btnSwitchToScene2);

        scene1 = new Scene(pane1,250,150);

        //Build the add/subtract scene
        lblCounter = new Label();
        lblCounter.setText(Integer.toString(iCounter));

        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(e -> btnAdd_Click());

        btnSubtract = new Button();
        btnSubtract.setText("Sub");
        btnSubtract.setOnAction(e -> btnSubtract_Click());

        btnSwitchToScene2 = new Button();
        btnSwitchToScene2.setText("Switch");
        btnSwitchToScene2.setOnAction(e -> btnSwitchToScene1_Click());

        //Hbox pane
        HBox pane2 = new HBox(10);
        pane2.getChildren().addAll(lblCounter,btnAdd,btnSubtract,btnSwitchToScene2);

        //scene for scene2
        scene2 = new Scene(pane2,300,75);

        //set the stage with stage 1 and show the title
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Scene Switcher");
        primaryStage.show();


    }

    private void btnSwitchToScene1_Click()
    {
        stage.setScene(scene1);
    }

    private void btnSubtract_Click()
    {
        iCounter--;
        lblCounter.setText(Integer.toString(iCounter));
    }

    private void btnAdd_Click()
    {
        iCounter++;
        lblCounter.setText(Integer.toString(iCounter));
    }

    private void btnSwitchToScene2_Click()
    {
        stage.setScene(scene2);
    }

    private void btnClickMe_Click()
    {
        iClickCounter++;
        if(iClickCounter ==1)
        {
            lblClicks.setText("You have clicked once");
        } else
        {
            lblClicks.setText("You have clicked: " + iClickCounter + " times");
        }
    }
}
