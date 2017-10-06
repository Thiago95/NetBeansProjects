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
public class AtvddSeis {
    public int soma, multiplicacao, subtracao;
    public double divisao;

    public AtvddSeis() {
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int nmr1, int nmr2) {
        this.soma = nmr1 + nmr2;
    }

    public int getMultiplicacao() {
        return multiplicacao;
    }

    public void setMultiplicacao(int nmr1, int nmr2) {
        this.multiplicacao = nmr1 * nmr2;
    }

    public int getSubtracao() {
        return subtracao;
    }

    public void setSubtracao(int nmr1, int nmr2) {
        this.subtracao = nmr1 - nmr2;
    }

    public double getDivisao() {
        return divisao;
    }

    public void setDivisao(int nmr1, int nmr2) {
        this.divisao = nmr1 / nmr2;
    }
    
    
}
