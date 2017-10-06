/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import controller.Cliente;


/**
 *
 * @author thiag
 */
public class ClienteDAO {
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;

    public void create(Cliente cli){        
        try {
            stmt = con.prepareStatement("INSERT INTO BDRepresentanteComercial.clientes (nome, endereco, telefone, cidade_uf)VALUES(?,?,?,?)");
            stmt.setString(1, cli.getCliente());
            stmt.setString(2, cli.getEndereco());
            stmt.setString(3, cli.getTelefone());
            stmt.setString(4, cli.getCidade_uf());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!" + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }
}
