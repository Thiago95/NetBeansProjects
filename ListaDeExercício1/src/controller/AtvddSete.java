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
public class AtvddSete {
    public double consumoMedio;

    public AtvddSete() {
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(float n1, float n2) {
        this.consumoMedio = (n1 + n2)/2;
    }
    
    
}
