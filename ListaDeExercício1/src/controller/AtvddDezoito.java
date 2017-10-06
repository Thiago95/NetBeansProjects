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
public class AtvddDezoito {
    private String numeroMaior;

    public AtvddDezoito() {
    }

    public String getNumeroMaior() {
        return numeroMaior;
    }

    public void setNumeroMaior(int nmr1, int nmr2) {
        if(nmr1 > nmr2){
            this.numeroMaior = "O número maior é " + nmr1;
        }else if(nmr1 == nmr2){
            this.numeroMaior = "Os números informados são iguais " + nmr1 + ", " + nmr2;
        }else{
            this.numeroMaior = "O número maior é " + nmr2; 
        }
        
    }
    
}
