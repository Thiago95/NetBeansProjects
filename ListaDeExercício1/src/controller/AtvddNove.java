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
public class AtvddNove {
    private double mediaAritmetica;

    public AtvddNove() {
    }

    public double getMediaAritmetica() {
        return mediaAritmetica;
    }

    public void setMediaAritmetica(float n1, float n2, float n3) {
        this.mediaAritmetica = (n1 + n2 + n3) / 3;
    }
}
