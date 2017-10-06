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
public class ExercicioDoze {
    
    float total;
    public ExercicioDoze(){
    
    }
    
    public float dolar(float numero_um, float numero_dois){
        total = numero_um * numero_dois;
        return total;
    }
}
