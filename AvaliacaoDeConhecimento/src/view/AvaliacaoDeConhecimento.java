/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CalcSalario;
import javax.swing.JOptionPane;

/**
 *
 * @author thiag
 */
public class AvaliacaoDeConhecimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salario;
        int dependente;
        CalcSalario x = new CalcSalario();
        
        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu salário bruto:"));
        dependente = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de dependentes:"));
        
        x.setSalarioLiquido(salario, dependente);
        
        JOptionPane.showMessageDialog(null, x.getSalarioLiquido());
    }
    
}
