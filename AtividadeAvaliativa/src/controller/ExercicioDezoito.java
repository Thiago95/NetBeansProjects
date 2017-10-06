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
public class ExercicioDezoito {
    float maior;
    public ExercicioDezoito(){
    
    }
    public float maior(float numero_um, float numero_dois){
        if(numero_um > numero_dois){
            maior = numero_um;
        }else if(numero_dois > numero_um){
            maior = numero_dois;
        }
    return maior;
    }
}
