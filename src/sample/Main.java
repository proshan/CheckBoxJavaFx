package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       Stage window = primaryStage;
       window.setTitle("Checkbox");


       //creating checkboxes
        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");
        box2.setSelected(true);

        Button button = new Button("Order Now");
        button.setOnAction(e -> {
            handleOptions(box1, box2);
        });

       VBox layout = new VBox(10);
       layout.setAlignment(Pos.CENTER);
       layout.getChildren().addAll(box1, box2, button);

       Scene scene = new Scene(layout, 250, 250);
       window.setScene(scene);



       window.show();
    }

    private void handleOptions(CheckBox box1, CheckBox box2){
        String message = "";
        if(box1.isSelected()){
            message += "Bacon selected";
        }
        if(box2.isSelected()){
            message += "Tuna selected";
        }
        System.out.println(message);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
