/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author thiag
 */
public class AtvddOito {
    private double salarioFinal;

    public AtvddOito() {
    }
    
    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(float salarioFixo, float totalVendas) {
        this.salarioFinal = salarioFixo + (totalVendas * 0.15);
    }
}
