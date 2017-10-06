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
class Gato extends Animal {
    public String mia(){
        return "miau";
    }

    public Gato(String nome) {
        super(nome);
    }
    
}
