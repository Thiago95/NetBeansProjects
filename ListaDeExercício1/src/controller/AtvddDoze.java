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
public class AtvddDoze {
    private double conversao;

    public AtvddDoze() {
    }

    public double getConversao() {
        return conversao;
    }

    public void setConversao(float quantiaDolar, float cotacaoDolar) {
        this.conversao = quantiaDolar * cotacaoDolar;
    }
    
    
}
