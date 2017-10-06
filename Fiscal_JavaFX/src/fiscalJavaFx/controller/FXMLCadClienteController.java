/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiscalJavaFx.controller;

import fiscalJavaFx.model.domain.Cliente;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author thiag
 */
public class FXMLCadClienteController implements Initializable {

    @FXML
    private TextField txtFieldNomeCli;
    @FXML
    private TextField txtFieldCpfCnpj;
    @FXML
    private TextField txtFieldLogradouro;
    @FXML
    private TextField txtFieldTelefone;
    @FXML
    private TextField txtFieldCidadeUF;
    @FXML
    private Button btnCancelar;
    @FXML
    private Button btnCadastrar;
    
    private Stage dialogStage;//mostra que a telinha está aberta ou não
    private boolean btnConfirmarClicked = false;//mostrar quando o botão confirmar for clicado
    private Cliente cliente;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
     public Stage getDialogStage() {
        return dialogStage;
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public boolean isBtnConfirmarClicked() {
        return btnConfirmarClicked;
    }
    
    public void setBtnConfirmarClicked(boolean btnConfirmarClicked) {
        this.btnConfirmarClicked = btnConfirmarClicked;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @FXML
    public void mnplcBtnCadastrar() {
        
            //pega os novos valores passados pelos txtFields e passa para cliente
            cliente.setNome(txtFieldNomeCli.getText());
            cliente.setEndereco(txtFieldLogradouro.getText());
            cliente.setTelefone(txtFieldTelefone.getText());
            cliente.setCidade_uf(txtFieldCidadeUF.getText());
            cliente.setCpfCnpj(txtFieldCpfCnpj.getText());
            
            btnConfirmarClicked = true;
            dialogStage.close();
    }
    public void mnplcBtnCancelar() {
        
        dialogStage.close();
    }
    
}
