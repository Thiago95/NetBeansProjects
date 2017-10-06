/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiscalJavaFx.controller;

import fiscalJavaFx.model.dao.VendasDAO;
import fiscalJavaFx.model.database.Database;
import fiscalJavaFx.model.database.DatabaseFactory;
import fiscalJavaFx.model.domain.Vendas;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author thiag
 */
public class FXMLAlterarVendaController implements Initializable {

    @FXML
    private TableView<Vendas> tblViewVendas;
    @FXML
    private TableColumn<Vendas, String> tblColunaVendaNome;
    @FXML
    private TableColumn<Vendas, String> tblColunaVendaVlrNtFiscal;
    @FXML
    private Label lblVendaCodigo;
    @FXML
    private Label lblClienteNome;
    @FXML
    private Label lblVendaDtFatura;
    @FXML
    private Label lblVendaPrmrPrcl;
    @FXML
    private Label lblVendaSgndPrcl;
    @FXML
    private Label lblVendaTrcrPrcl;
    @FXML
    private Label lblVlrParcela;
    @FXML
    private Label lblNmrParcela;
    @FXML
    private Label lblVendaVlrNt;
    
    private List<Vendas> listVendas;
    private ObservableList<Vendas> observableListVendas;
    
    private final Database database = DatabaseFactory.getDatabase("mysql");
    private final Connection connection = database.conectar();
    private final VendasDAO vendasDAO = new VendasDAO();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        vendasDAO.setConnection(connection);
        carregarTblViewVendas();
        
        //liten acionado assim que um item do tableView for selelcionado
        tblViewVendas.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> selecionarItemTblViewVendas(newValue));
    }    
    
    public void carregarTblViewVendas(){
        
        //configura as duas colunas e informa o que será exibido por elas
        tblColunaVendaNome.setCellValueFactory(new PropertyValueFactory<>("codVenda"));
        tblColunaVendaVlrNtFiscal.setCellValueFactory(new PropertyValueFactory<>("cliente"));
        
        //usa o clientedao para listar os dados do banco e armazena no listClientes
        listVendas = vendasDAO.listar();
        
        /* converte o listCliente em observableListCliente, 
        depois passa observableListCliente para tblViewClientes
         e mostrar os clientes na tela*/
        observableListVendas = FXCollections.observableArrayList(listVendas);
        tblViewVendas.setItems(observableListVendas);
        
    }
    
    private void selecionarItemTblViewVendas(Vendas venda) {
        if(venda != null){
            lblVendaCodigo.setText(String.valueOf(venda.getCodVenda()));
            lblClienteNome.setText(venda.getCliente());
            lblVendaDtFatura.setText(venda.getDtFaturaNotaFiscal());
            lblVendaPrmrPrcl.setText(String.valueOf(venda.getDtPrmrParcela()));
            lblVendaSgndPrcl.setText(String.valueOf(venda.getDtSgndParcela()));
            lblVendaTrcrPrcl.setText(String.valueOf(venda.getDtTrcrParcela()));
        }else{
            lblVendaCodigo.setText("");
            lblClienteNome.setText("");
            lblVendaDtFatura.setText("");
            lblVendaPrmrPrcl.setText("");
            lblVendaSgndPrcl.setText("");
            lblVendaTrcrPrcl.setText("");
        }   
    }
    
    @FXML
    public void mnplcBtnInserir() throws IOException {
        //instancia um novo cliente e passa para o método showFXMLCadastroClientesDialog que abre a telinha
        Vendas venda = new Vendas();
        boolean btnConfirmarClicked = showFXMLCadastroClientesDialog(venda);
        if(btnConfirmarClicked){
            vendasDAO.inserir(venda);
            carregarTblViewVendas();
        }
    }
    
     @FXML
    public void mnplcBtnAlterar() throws IOException {
        //instancia um novo cliente e passa para o método showFXMLCadastroClientesDialog que abre a telinha
        Vendas venda = tblViewVendas.getSelectionModel().getSelectedItem();
        if(venda != null){
            boolean btnConfirmarClicked = showFXMLCadastroClientesDialog(venda);
            if (btnConfirmarClicked) {
                vendasDAO.alterar(venda);
                carregarTblViewVendas();
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Por favor, escolha um cliente na tabela!");
            alert.show();
        }
    }
    
    @FXML
    public void mnplcBtnRemover() throws IOException {
        //instancia um novo cliente e passa para o método showFXMLCadastroClientesDialog que abre a telinha
        Vendas venda = tblViewVendas.getSelectionModel().getSelectedItem();
        if(venda != null){
                vendasDAO.remover(venda);
                carregarTblViewVendas();
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Por favor, escolha um cliente na tabela!");
            alert.show();
        }
    }
    
    public boolean showFXMLCadastroClientesDialog(Vendas venda) throws IOException {
        // chamando a telinha 
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(FXMLCadClienteController.class.getResource("/fiscalJavaFx/view/FXMLCadVendas.fxml"));
        AnchorPane page = (AnchorPane) loader.load();
        // criando um estagio de dialogo
        Stage dialogStage = new Stage();
        dialogStage.setTitle("Cadastro de Cliente");
        Scene scene = new Scene(page);
        dialogStage.setScene(scene);
        //passando o cliente para o controller
        FXMLCadVendasController controller = loader.getController();
        controller.setDialogStage(dialogStage);
        controller.setVenda(venda);
        
        //mostra o dialog e espera que o usuario feche
        dialogStage.showAndWait();
        
        return controller.isBtnConfirmarClicked();
    }
    
}
