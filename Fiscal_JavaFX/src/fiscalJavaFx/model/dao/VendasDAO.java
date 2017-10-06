/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiscalJavaFx.model.dao;

import fiscalJavaFx.model.domain.Vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thiag
 */
public class VendasDAO {
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public boolean inserir(Vendas vendas) {
        String sql = "INSERT INTO vendas(dtFaturaNotaFiscal, dtPrmrParcela, dtSgndParcela, dtTrcrParcela, vlrNotaFIscal, vlrParcela, nmrParcela)"
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, vendas.getDtFaturaNotaFiscal());
            stmt.setString(2, vendas.getDtPrmrParcela());
            stmt.setString(3, vendas.getDtSgndParcela());
            stmt.setString(4, vendas.getDtTrcrParcela());
            stmt.setString(5, Integer.toString(vendas.getNmrParcela()));
            stmt.setString(6, Integer.toString(vendas.getVlrNotaFiscal()));
            stmt.setString(7, Integer.toString(vendas.getVlrParcela()));
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VendasDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    public boolean alterar(Vendas vendas) {
        String sql = "UPDATE vendas SET dtFaturaNotaFiscal=?, dtPrmrParcela=?, dtSgndParcela=?, dtTrcrParcela=?, vlrNotaFIscal=?, vlrParcela=?, nmrParcela=? where codVenda=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, vendas.getDtFaturaNotaFiscal());
            stmt.setString(2, vendas.getDtPrmrParcela());
            stmt.setString(3, vendas.getDtSgndParcela());
            stmt.setString(4, vendas.getDtTrcrParcela());
            stmt.setString(5, Integer.toString(vendas.getNmrParcela()));
            stmt.setString(6, Integer.toString(vendas.getVlrNotaFiscal()));
            stmt.setString(7, Integer.toString(vendas.getVlrParcela()));
            stmt.setString(8, Integer.toString(vendas.getCodVenda()));
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VendasDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean remover(Vendas vendas) {
        String sql = "DELETE FROM vendas WHERE codVenda=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, vendas.getCodVenda());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VendasDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public List<Vendas> listar() {
        String sql = "select v.CodVenda, c.nome, v.dtFaturaNotaFiscal, v.dtPrmrParcela, v.dtSgndParcela, v.dtTrcrParcela, v.vlrNotaFIscal, v.vlrParcela, v.nmrParcela\n" +
                        "from clientes c, vendas v where v.codCli = c.codCli;";
        
        List<Vendas> retorno = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
               
                Vendas venda = new Vendas();
                
                venda.setCodVenda(resultado.getInt("codVenda"));
                venda.setCliente(resultado.getString("nome"));
                venda.setDtFaturaNotaFiscal(resultado.getString("dtFaturaNotaFiscal"));
                venda.setDtPrmrParcela(resultado.getString("dtPrmrParcela"));
                venda.setDtSgndParcela(resultado.getString("dtSgndParcela"));
                venda.setDtTrcrParcela(resultado.getString("dtTrcrParcela"));
                venda.setVlrNotaFiscal(resultado.getInt("vlrNotaFIscal"));
                venda.setVlrParcela(resultado.getInt("vlrParcela"));
                venda.setNmrParcela(resultado.getInt("nmrParcela"));
                retorno.add(venda);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(VendasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    public Vendas buscar(Vendas venda) {
        String sql = "SELECT * FROM Vendas WHERE codVenda=?";
        Vendas retorno = new Vendas();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, venda.getCodVenda());
            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                venda.setCodVenda(resultado.getInt("codVenda"));
                venda.setCliente(resultado.getString("codCli"));
                venda.setDtFaturaNotaFiscal(resultado.getString("dtFaturaNotaFiscalclientes"));
                venda.setDtPrmrParcela(resultado.getString("dtPrmrParcela"));
                venda.setDtSgndParcela(resultado.getString("dtSgndParcela"));
                venda.setDtTrcrParcela(resultado.getString("dtTrcrParcela"));
                venda.setVlrNotaFiscal(resultado.getInt("vlrNotaFIscal"));
                venda.setVlrParcela(resultado.getInt("vlrParcela"));
                venda.setNmrParcela(resultado.getInt("nmrParcela"));
                retorno = venda;
            }
        } catch (SQLException ex) {
            Logger.getLogger(VendasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
    
}
