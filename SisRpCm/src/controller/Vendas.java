/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Calendar;

/**
 *
 * @author thiag
 */
public class Vendas {
     private String cliente;
     private Calendar data;
     private double vlrNotaFiscal;
     private int nmrDeParcela;

    public int getNmrDeParcela() {
        return nmrDeParcela;
    }

    public void setNmrDeParcela(int nmrDeParcela) {
        this.nmrDeParcela = nmrDeParcela;
    }
     private double vlrParcela;

    public double getVlrParcela() {
        return vlrParcela;
    }

    public void setVlrParcela(double vlrParcela, int numParcela) {
        this.vlrParcela = vlrParcela / numParcela;
    }
     

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

   

    public double getVlrNotaFiscal() {
        return vlrNotaFiscal;
    }

    public void setVlrNotaFiscal(double vlrNotaFiscal) {
        this.vlrNotaFiscal = vlrNotaFiscal;
    }
     
}
