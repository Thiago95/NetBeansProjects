/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudFxmlMain;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.fxml.LoadException;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws IOException{
        try{
            Parent root = FXMLLoader.load(getClass().getResource("view/FXMLBoxMain.fxml"));
            
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.setTitle("sistema de Vendas");
            stage.setResizable(false);
            stage.show();
        }catch(LoadException e){
            System.out.println("erro: " + e);
        }
       
    }

    
    public static void main(String[] args) {
        launch(args);
    }

    
    
}
