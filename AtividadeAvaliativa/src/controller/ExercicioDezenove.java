/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author adham
 */
public class ExercicioDezenove {
    String resultado;
    public ExercicioDezenove(){
    
    }
    
    public String intervalo(float numero_um){
        if(numero_um > 100 && numero_um < 200){
            resultado = "O número "+ numero_um + " está entre 100 e 200";
        } else {
            resultado = "O número " + numero_um + "Não está entre 100 e 200";
        }
        return resultado;
    }
}
