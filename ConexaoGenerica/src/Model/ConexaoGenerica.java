package Model;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoGenerica {

    private String bd;
    private String local;
    private String porta;
    private String banco;
    private String usuario;
    private String senha;
    private Connection c;
    private Statement statment;
    private String str_conexao;
    private String driverjdbc;

   

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Connection getC() {
        return c;
    }

    public void setC(Connection c) {
        this.c = c;
    }

    public Statement getStatment() {
        return statment;
    }

    public void setStatment(Statement statment) {
        this.statment = statment;
    }

    public String getStr_conexao() {
        return str_conexao;
    }

    public void setStr_conexao(String str_conexao) {
        this.str_conexao = str_conexao;
    }

    public String getDriverjdbc() {
        return driverjdbc;
    }

    public void setDriverjdbc(String driverjdbc) {
        this.driverjdbc = driverjdbc;
    }

    public ConexaoGenerica(String bd, String local, String porta, String banco, String usuario, String senha) {
        if (bd.equalsIgnoreCase("MySQL")) {
            setStr_conexao("jdbc:mysql://" + local + ":" + porta + "/" + banco);
            setLocal(local);
            setSenha(senha);
            setUsuario(usuario);
            setDriverjdbc("com.mysql.jdbc.Driver");
            JOptionPane.showMessageDialog(null,"Conectando com MySQL..");
        }else if (bd.equalsIgnoreCase("PostgreeSQL")){
            setStr_conexao("jdbc:postgresql://" + local + ":" + porta + "/" + banco);
            setLocal(local);
            setSenha(senha);
            setUsuario(usuario);
            setDriverjdbc("org.postgresql.Driver"); 
             JOptionPane.showMessageDialog(null,"Conectando com Postgree..");
        }
    }
    public void conect(){
        try{
            Class.forName(getDriverjdbc());
            setC(DriverManager.getConnection(getStr_conexao(),getUsuario(),getSenha()));
            setStatment(getC().createStatement());
            JOptionPane.showMessageDialog(null,"Conexao efetuada com sucesso");
          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
