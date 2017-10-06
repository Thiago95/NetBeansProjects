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
public class AtvddVinte {
    private String resultadoFinal;
    private double media;

    public AtvddVinte(float nmr1, float nmr2, float nmr3) {
        media = (nmr1 + nmr2 + nmr3)/ 3;
        if(media >= 7){
            this.resultadoFinal = "APROVADO!!";
        }else if(media <= 5){
            this.resultadoFinal = "REPROVADO!!";
        }else if(media >= 5.1 && media <= 6.9){
            this.resultadoFinal = "RECUPERAÇÃO!!";
        }
        
    }

    public String getResultadoFinal() {
        return resultadoFinal;
    }
    
}
