/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tutorialrelatorios.entidades;

/**
 * Representa um Cliente.
 *
 * @author David Buzatto
 */
public class Cliente {

    private Long id;
    private String nome;
    private String sobrenome;

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome( String sobrenome ) {
        this.sobrenome = sobrenome;
    }

}
