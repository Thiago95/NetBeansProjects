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
public class ExercicioTres {
    
    int maior;
        public ExercicioTres(){
      }
        public int compararNumeros(int numeroum, int numerodois){
            if(numeroum > numerodois){
                maior = numeroum;
            }else{
                maior = numerodois;
            }
            return maior;
        }

}
