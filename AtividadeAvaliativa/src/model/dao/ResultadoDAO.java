/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Resultado;

/**
 *
 * @author thiag
 */
public class ResultadoDAO {

    public void create(Resultado r) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO resultado (nome, resposta)VALUES(?,?)");
            stmt.setString(1, r.getNome());
            stmt.setFloat(2, r.getResultado());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Resultado> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Resultado> Resultados = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM resultado");
            rs = stmt.executeQuery();
            
            while(rs.next()){
            
                
                Resultado resultado = new Resultado();
                resultado.setId(rs.getInt("id"));
                resultado.setNome(rs.getString("nome"));
                resultado.setResultado(rs.getFloat("resposta"));
                Resultados.add(resultado);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ResultadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return Resultados;
    }
    
        public void delete(Resultado r) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM resultado WHERE id = ?");
            stmt.setInt(1, r.getId());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
