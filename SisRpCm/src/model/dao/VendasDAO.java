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
import controller.Vendas;

/**
 *
 * @author thiag
 */
public class VendasDAO {
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;

    public void create(Vendas vnd){        
        try {
            stmt = con.prepareStatement("INSERT INTO BDRepresentanteComercial.vendas (Cliente, dtFaturaNotaFiscal, vlrNotaFIscal, vlrParcela, nmrParcela)VALUES(?,?,?,?,?)");
            stmt.setString(1, vnd.getCliente());
            stmt.setString(2, vnd.getData());
            stmt.setDouble(3, vnd.getVlrNotaFiscal());
            stmt.setDouble(4, vnd.getVlrParcela());
            stmt.setInt(5, vnd.getNmrDeParcela());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!" + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }
}
