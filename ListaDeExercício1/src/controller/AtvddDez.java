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
public class AtvddDez {
    private int a, b;

    public AtvddDez() {
    }
    
    public void setTrocaDeValores(int nmr1, int nmr2) {
        nmr2 = nmr1 + nmr2;
        nmr1 = nmr2 - nmr1;
        nmr2 = nmr2 - nmr1;
        this.a = nmr1;
        this.b = nmr2;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
