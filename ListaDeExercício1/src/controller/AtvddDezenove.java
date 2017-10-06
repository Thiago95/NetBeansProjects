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
public class AtvddDezenove {
    private String entreCemEDuzentos;

    public AtvddDezenove() {
    }

    public String getEntreCemEDuzentos() {
        return entreCemEDuzentos;
    }

    public void setEntreCemEDuzentos(int nmr1) {
        if(nmr1 >= 100 && nmr1 <= 200){
            this.entreCemEDuzentos = "O número " + nmr1 + " está entre 100 e 200"; 
        }else{
            this.entreCemEDuzentos = "O número " + nmr1 + " não está entre 100 e 200";   
        }
        
    }
    
}
