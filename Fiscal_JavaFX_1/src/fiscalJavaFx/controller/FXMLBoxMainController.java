/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiscalJavaFx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.LoadException;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author thiag
 */
public class FXMLBoxMainController implements Initializable {

    @FXML
    private MenuItem menuItemCadastrosClientes;
    @FXML
    private MenuItem menuItemCadastrosVendas;
    @FXML
    private MenuItem menuItemAlterarCliente;
    @FXML
    private MenuItem menuItemAlterarVenda;
    @FXML
    private AnchorPane anchorPane;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void mnplcMenuItemCadastrosClientes() throws IOException{
        try{
            AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/fiscalJavaFx/view/FXMLAlterarCliente.fxml"));
            anchorPane.getChildren().setAll(a);
        }catch(LoadException e){
            System.out.println("erro: " + e);
        }
    }
    
    @FXML
    public void mnplcMenuItemCadastrosVendas() throws IOException{
        try{
            AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/fiscalJavaFx/view/FXMLAlterarVenda.fxml"));
            anchorPane.getChildren().setAll(a);
        }catch(LoadException e){
            System.out.println("erro: " + e);
        }
    }
    
    @FXML
    public void mnplcMenuItemAlterarCliente() throws IOException{
        try{
            AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/fiscalJavaFx/view/FXMLAlterarCliente.fxml"));
            anchorPane.getChildren().setAll(a);
        }catch(LoadException e){
            System.out.println("erro: " + e);
        }
    }
    
    @FXML
    public void mnplcMenuItemAlterarVenda() throws IOException{
        try{
            AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/fiscalJavaFx/view/FXMLAlterarVenda.fxml"));
            anchorPane.getChildren().setAll(a);
        }catch(LoadException e){
            System.out.println("erro: " + e);
        }
    }
    
}
