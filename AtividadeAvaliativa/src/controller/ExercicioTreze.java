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
public class ExercicioTreze {
    
    float juros=0;
    float total=0;
    public ExercicioTreze(){
        
    }
    public float conta(float numero_um){
    juros = (float) (( numero_um * 0.70 ) / 100); 
    total = juros + numero_um;
    return total;
    }
}
