/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;
import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.layout.VBox;  
import javafx.stage.Stage;

/**
 *
 * @author asyla
 */
public class VBoxExample extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Button btn1 = new Button("Button 1");  
        Button btn2 = new Button("Button 2");  
        VBox root = new VBox();  
        Scene scene = new Scene(root,200,200);  
        root.getChildren().addAll(btn1,btn2);  
        stage.setScene(scene);  
        stage.setTitle("VBOX");
        stage.setOnCloseRequest(stage.getOnCloseRequest());
        stage.show();  
    }
    public static void main(String[] args) {
        launch(args);
    }
}
