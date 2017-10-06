/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiscalJavaFx.model.domain;

/**
 *
 * @author thiag
 */
public class Cliente {
    private int codCli;
    private String nome;
    private String endereco;
    private String telefone;
    private String cidade_uf;
    private String cpfCnpj;
    
    public Cliente(){
    }
    
    public Cliente(int codCli,String nome, String endereco, String telefone, String cidade_uf, String cpfCnpj) {
        this.codCli = codCli;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cidade_uf = cidade_uf;
        this.cpfCnpj = cpfCnpj;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }    

    public String getCidade_uf() {
        return cidade_uf;
    }

    public void setCidade_uf(String cidade_uf) {
        this.cidade_uf = cidade_uf;
    }

    public int getCodCli() {
        return codCli;
    }
    
    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }
    
}
