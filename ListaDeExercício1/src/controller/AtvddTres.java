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
public class AtvddTres {
    public int maior;
    
    public AtvddTres(){
        
    }
    /**
     * @return the maior
     */
    public int getMaior() {
        return maior;
    }
    
    public void setMaior(int nmr1, int nmr2) {
        if(nmr1 > nmr2){
            this.maior = nmr2;
        }else{
            this.maior = nmr1;
        }
        
    }
    
}
