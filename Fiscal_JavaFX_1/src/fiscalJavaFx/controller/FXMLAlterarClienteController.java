/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiscalJavaFx.controller;

import fiscalJavaFx.model.dao.ClienteDAO;
import fiscalJavaFx.model.database.Database;
import fiscalJavaFx.model.database.DatabaseFactory;
import fiscalJavaFx.model.domain.Cliente;
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
import javafx.scene.control.Button;
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
public class FXMLAlterarClienteController implements Initializable {

    @FXML
    private TableView<Cliente> tblViewClientes;
    @FXML
    private TableColumn<Cliente, String> tblColunaClienteNome;
    @FXML
    private TableColumn<Cliente, String> tblColunaClienteCPF;
    @FXML
    private Button btnInserir;
    @FXML
    private Button btnAlterar;
    @FXML
    private Button btnRemover;
    @FXML
    private Label lblClienteCodigo;
    @FXML
    private Label lblClienteNome;
    @FXML
    private Label lblClienteLogradouro;
    @FXML
    private Label lblClienteTelefone;
    @FXML
    private Label lblClienteCidadeUF;
    @FXML
    private Label lblClienteCpfCnpj;
    
    private List<Cliente> listClientes;
    private ObservableList<Cliente> observableListClientes;
    
    //manipulando o banco de dados
    private final Database database = DatabaseFactory.getDatabase("mysql");
    private final Connection connection = database.conectar();
    private final ClienteDAO clienteDAO = new ClienteDAO();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        clienteDAO.setConnection(connection);
        carregarTblViewClientes();
        
        //liten acionado assim que um item do tableView for selelcionado
        tblViewClientes.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> selecionarItemTblViewClientes(newValue));
    }    
    
    public void carregarTblViewClientes(){
        //configura as duas colunas e informa o que será exibido por elas
        tblColunaClienteNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        tblColunaClienteCPF.setCellValueFactory(new PropertyValueFactory<>("cpfCnpj"));
        
        //usa o clientedao para listar os dados do banco e armazena no listClientes
        listClientes = clienteDAO.listar();
        
        /* converte o listCliente em observableListCliente, 
        depois passa observableListCliente para tblViewClientes
         e mostrar os clientes na tela*/
        observableListClientes = FXCollections.observableArrayList(listClientes);
        tblViewClientes.setItems(observableListClientes);
        
    }

    private void selecionarItemTblViewClientes(Cliente cliente) {
        if(cliente != null){
            lblClienteCodigo.setText(String.valueOf(cliente.getCodCli()));
            lblClienteNome.setText(cliente.getNome());
            lblClienteLogradouro.setText(cliente.getEndereco());
            lblClienteTelefone.setText(cliente.getTelefone());
            lblClienteCidadeUF.setText(cliente.getCidade_uf());
            lblClienteCpfCnpj.setText(cliente.getCpfCnpj());
        }else{
            lblClienteCodigo.setText("");
            lblClienteNome.setText("");
            lblClienteLogradouro.setText("");
            lblClienteTelefone.setText("");
            lblClienteCidadeUF.setText("");
            lblClienteCpfCnpj.setText("");
        }   
    }
    
    @FXML
    public void mnplcBtnInserir() throws IOException {
        //instancia um novo cliente e passa para o método showFXMLCadastroClientesDialog que abre a telinha
        Cliente cliente = new Cliente();
        boolean btnConfirmarClicked = showFXMLCadastroClientesDialog(cliente);
        if(btnConfirmarClicked){
            clienteDAO.inserir(cliente);
            carregarTblViewClientes();
        }
    }
    
    @FXML
    public void mnplcBtnAlterar() throws IOException {
        //instancia um novo cliente e passa para o método showFXMLCadastroClientesDialog que abre a telinha
        Cliente cliente = tblViewClientes.getSelectionModel().getSelectedItem();
        if(cliente != null){
            boolean btnConfirmarClicked = showFXMLCadastroClientesDialog(cliente);
            if (btnConfirmarClicked) {
                clienteDAO.alterar(cliente);
                carregarTblViewClientes();
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
        Cliente cliente = tblViewClientes.getSelectionModel().getSelectedItem();
        if(cliente != null){
                clienteDAO.remover(cliente);
                carregarTblViewClientes();
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Por favor, escolha um cliente na tabela!");
            alert.show();
        }
    }
    
    public boolean showFXMLCadastroClientesDialog(Cliente cliente) throws IOException {
        // chamando a telinha 
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(FXMLCadClienteController.class.getResource("/fiscalJavaFx/view/FXMLCadCliente.fxml"));
        AnchorPane page = (AnchorPane) loader.load();
        // criando um estagio de dialogo
        Stage dialogStage = new Stage();
        dialogStage.setTitle("Cadastro de Cliente");
        Scene scene = new Scene(page);
        dialogStage.setScene(scene);
        //passando o cliente para o controller
        FXMLCadClienteController controller = loader.getController();
        controller.setDialogStage(dialogStage);
        controller.setCliente(cliente);
        
        //mostra o dialog e espera que o usuario feche
        dialogStage.showAndWait();
        
        return controller.isBtnConfirmarClicked();
    }
    
}
