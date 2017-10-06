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
public class CalcSalario {
    public double salarioLiquido, sal1, sal2, salarioTemp;
    public CalcSalario(){
        
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salario, double dependente) {
        salarioTemp = salario - (salario * 0.08);
        
        if(salario >= 2700 ){
            sal1 = (salario * 0.08);
            sal2 = (salario * 0.27);
            salarioTemp =  salario - (sal1 + sal2);
        }
        sal2 = 0;
        if(dependente <= 2){
            sal2 = (salarioTemp * 0.05) * dependente;
            salarioTemp = salarioTemp + sal2;
        }
        this.salarioLiquido = salarioTemp;
        
    }
}
