/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views.auth.login;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

/**
 *  
 * @author Windyl
 */
public class Main extends Application{
    public static void main(String args[]){
        Application.launch(args);
    }
    
    @Override
    public void start(Stage stage ) throws Exception {
        //loading the css file
        Parent parent = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene root =new Scene(parent,800,500);
        stage.setScene(root);
        stage.show();
        
    }
    
}
