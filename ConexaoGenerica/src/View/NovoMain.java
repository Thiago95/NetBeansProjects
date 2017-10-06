/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.ConexaoGenerica;
import javax.swing.JOptionPane;

/**
 *
 * @author thiag
 */
public class NovoMain {

    public static void main(String[] args) {

        String bd = JOptionPane.showInputDialog(null, "Escolha entre os bancos disponíveis, MySQL ou PostgreeSQL");
        String local = JOptionPane.showInputDialog(null, "Digite o local:\nExemplo: localhost");
        String porta = JOptionPane.showInputDialog(null, "Informe a porta:\nMySQL: 3306\nPostgreeSQL: 5433");
        String banco = JOptionPane.showInputDialog(null,"Digite o nome do Banco:");
        String usuario = JOptionPane.showInputDialog(null, "Digite o usuario:");
        String senha = JOptionPane.showInputDialog(null, "Digite a senha:");
        ConexaoGenerica c = new ConexaoGenerica(bd, local, porta, banco, usuario, senha);
        c.conect();
     
    }

}
