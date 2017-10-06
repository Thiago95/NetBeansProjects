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
public class ExercicioDezesete {
    String resultado;

    public ExercicioDezesete(){
    
    }

    public String comparar(float numero_um){
    
    if (numero_um > 10){
        resultado = numero_um + " É Maior";
    }
    else if(numero_um == 0){
        resultado = numero_um +" É menor";
    }
    else if(numero_um < 10){
        resultado = numero_um + "É igual";
    }
        return resultado;
    }
}
