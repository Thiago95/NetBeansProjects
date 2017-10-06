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
public class ExercicioQuatro {
    
            public ExercicioQuatro(){
      }
        public String inverte(String conta){
        String conta_inv=""; // Variavel que receberá a conta na ordem inversa
            int i=4; // Variável contadora
        while(i>-1)//Ciclo que controla os elementos da conta
              { conta_inv = conta_inv + conta.charAt(i); // o ultimo valor da conta será o 1º da conta_inv
               i--; //Decrementa a variavel i
                        }
String soma = Integer.parseInt(conta) + Integer.parseInt(conta_inv)+""; // soma o numero de conta com a sua inversa                       
                        int result=0;
                        String num="";
                        i=0; // inicialização da variável i


                        while(i<soma.length())//Ciclo que controla os elementos da conta
                        {
                                    num = soma.charAt(i)+"";
                                    result +=Integer.parseInt(num)*(i+1);
                                    i++; //incrementa a variavel i
                        }
                        String soma_total=""+result;
                        return soma_total; 

      
}
}