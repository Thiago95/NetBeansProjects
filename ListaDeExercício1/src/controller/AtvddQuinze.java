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
public class AtvddQuinze {
    private double precoDeVenda;

    public AtvddQuinze() {
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(float precoDeCusto, float porcentagemDeAumento) {
        this.precoDeVenda = precoDeCusto * porcentagemDeAumento / 100 + precoDeCusto;
    }
    
    
}
