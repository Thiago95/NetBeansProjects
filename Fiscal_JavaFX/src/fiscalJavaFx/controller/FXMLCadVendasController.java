/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiscalJavaFx.controller;

import fiscalJavaFx.model.domain.Vendas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author thiag
 */
public class FXMLCadVendasController implements Initializable {

    
    
    private Stage dialogStage;//mostra que a telinha está aberta ou não
    private boolean btnConfirmarClicked = false;//mostrar quando o botão confirmar for clicado
    private Vendas venda;
    
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

    public Vendas getVenda() {
        return venda;
    }

    public void setVenda(Vendas venda) {
        this.venda = venda;
    }
    
    @FXML
    public void mnplcBtnCadastrar() {
        
            //pega os novos valores passados pelos txtFields e passa para cliente
            venda.();
            venda.setCliente();
            venda.setDtFaturaNotaFiscal();
            
            btnConfirmarClicked = true;
            dialogStage.close();
    }
    public void mnplcBtnCancelar() {
        
        dialogStage.close();
    }
    
}
