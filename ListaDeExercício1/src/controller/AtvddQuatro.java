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
public class AtvddQuatro {
    private String digitoDeVerificacao, contaInverso = "", soma, nmr = "", somaFinal;
    private int n = 4, resultado = 0;

    public AtvddQuatro(String conta) {
        while(n>-1){
            contaInverso = contaInverso + conta.charAt(n);
            n--;
        }
        soma = Integer.parseInt(conta) + Integer.parseInt(contaInverso) + "";
        n = 0;
        
        while(n<soma.length()){
            nmr = soma.charAt(n) + "";
            resultado += Integer.parseInt(nmr) * (n+1);
            n++;
        }
        somaFinal = "" + resultado;
        this.digitoDeVerificacao = "" + somaFinal.charAt(somaFinal.length()-1);
    }

    public String getDigitoDeVerificacao() {
        return digitoDeVerificacao;
    }
    
}
