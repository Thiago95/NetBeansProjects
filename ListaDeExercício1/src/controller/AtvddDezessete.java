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
public class AtvddDezessete {
    private String maiorQueDez;

    public AtvddDezessete() {
    }

    public String getMaiorQueDez() {
        return maiorQueDez;
    }

    public void setMaiorQueDez(int nmr1) {
        if(nmr1 > 10){
             this.maiorQueDez = "O número informado, " + nmr1 + ", é maior que 10.";
        }else{
            this.maiorQueDez = "O número informado, " + nmr1 + ", não é maior que 10.";
        }
       
    }
     
}
