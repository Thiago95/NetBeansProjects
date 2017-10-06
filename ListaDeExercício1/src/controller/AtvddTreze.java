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
public class AtvddTreze {
    private double contaPoupanca;

    public AtvddTreze() {
    }

    public double getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(float deposito) {
        this.contaPoupanca = deposito * 1.007;
    }
    
    
}
