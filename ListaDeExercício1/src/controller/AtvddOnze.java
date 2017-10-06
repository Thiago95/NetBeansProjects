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
public class AtvddOnze {
    private double convercao;

    public AtvddOnze() {
    }

    public double getConvercao() {
        return convercao;
    }

    public void setConvercao(float n1) {
        this.convercao = (9 * n1 + 160)/ 5;
    }
}
