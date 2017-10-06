/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiscalJavaFx.model.domain;

import java.text.SimpleDateFormat;

/**
 *
 * @author thiag
 */
public class Vendas {
    private String cliente;
    private String dtFaturaNotaFiscal;
    private String dtPrmrParcela;
    private String dtSgndParcela;
    private String dtTrcrParcela;
    private int codVenda;
    private int vlrNotaFiscal;
    private int vlrParcela;
    private int nmrParcela;

    public Vendas() {
    }
    
    public Vendas(String cliente, String dtFaturaNotaFiscal, String dtPrmrParcela, String dtSgndParcela, String dtTrcrParcela, int codVenda, int vlrNotaFiscal, int vlrParcela, int nmrParcela) {
        this.cliente = cliente;
        this.dtFaturaNotaFiscal = dtFaturaNotaFiscal;
        this.dtPrmrParcela = dtPrmrParcela;
        this.dtSgndParcela = dtSgndParcela;
        this.dtTrcrParcela = dtTrcrParcela;
        this.codVenda = codVenda;
        this.vlrNotaFiscal = vlrNotaFiscal;
        this.vlrParcela = vlrParcela;
        this.nmrParcela = nmrParcela;
    }
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDtFaturaNotaFiscal() {
        return dtFaturaNotaFiscal;
    }

    public void setDtFaturaNotaFiscal(String dtFaturaNotaFiscal) {
        /*int data = Integer.parseInt(dtFaturaNotaFiscal);
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        dtFaturaNotaFiscal = formatar.format(data);*/
        this.dtFaturaNotaFiscal = dtFaturaNotaFiscal;
    }

    public String getDtPrmrParcela() {
        return dtPrmrParcela;
    }

    public void setDtPrmrParcela(String dtPrmrParcela) {
        this.dtPrmrParcela = dtPrmrParcela;
    }

    public String getDtSgndParcela() {
        return dtSgndParcela;
    }

    public void setDtSgndParcela(String dtSgndParcela) {
        this.dtSgndParcela = dtSgndParcela;
    }

    public String getDtTrcrParcela() {
        return dtTrcrParcela;
    }

    public void setDtTrcrParcela(String dtTrcrParcela) {
        this.dtTrcrParcela = dtTrcrParcela;
    }

    public int getVlrNotaFiscal() {
        return vlrNotaFiscal;
    }

    public void setVlrNotaFiscal(int vlrNotaFiscal) {
        this.vlrNotaFiscal = vlrNotaFiscal;
    }

    public int getVlrParcela() {
        return vlrParcela;
    }

    public void setVlrParcela(int vlrParcela) {
        this.vlrParcela = vlrParcela;
    }

    public int getNmrParcela() {
        return nmrParcela;
    }

    public void setNmrParcela(int nmrParcela) {
        this.nmrParcela = nmrParcela;
    }

    
    public int getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }
    
    
}
