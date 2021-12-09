package test1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class exCours extends Application{
	
	
    public static void main(String[] args) {
        Application.launch();
    }
    	
       public void start(Stage primaryStage) {
    	   
    	primaryStage.setTitle("Fruits");
        BorderPane root = new BorderPane();
        Scene sc = new Scene(root, 300, 300);
        primaryStage.setScene(sc);
        HBox hbox1 = new HBox();
        hbox1.setPadding(new Insets(10));
        hbox1.setSpacing(5);
        Label label = new Label ("Fruit : ");
        TextField tf = new TextField();
        Button btn = new Button("Ajouter");
        hbox1.getChildren().addAll(label,tf,btn);
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10));
        ListView <String> fruits = new ListView <String>();
        fruits.getItems().addAll("Orange","Pomme","Bannane");
        vbox.getChildren().add(fruits);
        root.setTop(hbox1);
        root.setCenter(vbox);
        primaryStage.show();
        
        btn.setOnAction(new EventHandler<ActionEvent> (){
        	public void handle(ActionEvent e) {
        		fruits.getItems().add(tf.getText());
        	}
        });
        
       }

  }

