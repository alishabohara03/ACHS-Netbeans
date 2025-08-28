/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;
import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.layout.HBox;  
import javafx.stage.Stage;


/**
 *
 * @author asyla
 */


public class HBoxExample extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button btn1 = new Button("OK");  
        Button btn2 = new Button("Reset");  
        HBox root = new HBox();  
        Scene scene = new Scene(root,200,200);  
        root.getChildren().addAll(btn1,btn2);  
        root.setSpacing(40);  
        stage.setScene(scene); 
        stage.setTitle("HBox");
        stage.show(); 
    }
    public static void main(String[] args) {  
        launch(args);  
}  
    
    
}
