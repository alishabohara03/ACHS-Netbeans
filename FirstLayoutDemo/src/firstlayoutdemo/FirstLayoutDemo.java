/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstlayoutdemo;


import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author asyla
 */


public class FirstLayoutDemo extends Application {
    public static void main(String[] args) {
        launch(args); 
    }

    @Override
    public void start(Stage stage) throws Exception {
    Button b1 = new Button("button1");
    FlowPane fp = new FlowPane();
    fp.getChildren().add(b1);
    Scene sc = new Scene(fp,200,200);
    stage.setTitle("layout");
    stage.setScene(sc);
    stage.show();
    }
    
}
;


