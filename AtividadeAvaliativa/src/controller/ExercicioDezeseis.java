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
public class ExercicioDezeseis {
    float distribuidor = 0;
    float impostos = 0;
    public ExercicioDezeseis(){
        
    }
    
    public float carros(float numero_um){
       impostos = (float) ((numero_um * 0.45) + numero_um) ;
       distribuidor = (float)((impostos * 0.28) + impostos);
       return distribuidor;
    }
}
