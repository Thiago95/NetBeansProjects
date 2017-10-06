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

/**
 *
 * @author thiag
 */
public class RelatorioDAO {
   Connection con = ConnectionFactory.getConnection();
   PreparedStatement stmt = null;

    public String busca(){        
        try {
            stmt = con.prepareStatement("SELECT vlrParcela, nmrParcela FROM bdrepresentantecomercial.vendas");
            stmt.getdouble(1, vnd.getCliente());
            stmt.get(2, vnd.getData());
            stmt.setDouble(3, vnd.getVlrNotaFiscal());
            stmt.setDouble(4, vnd.getVlrParcela());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!" + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
}
