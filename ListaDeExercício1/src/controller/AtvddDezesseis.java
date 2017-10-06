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
public class AtvddDezesseis {
    private double precoFinal, precoComImpostos;

    public AtvddDezesseis() {
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(float precoDeFabrica) {
        precoComImpostos = precoDeFabrica * 1.45;
        precoComImpostos = precoComImpostos * 1.28;
        this.precoFinal = precoComImpostos;
    }
    
}
