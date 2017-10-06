 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AtvddVinte;
import controller.AtvddDezenove;
import controller.AtvddDezoito;
import controller.AtvddDezessete;
import controller.AtvddDezesseis;
import controller.AtvddQuinze;
import controller.AtvddQuatorze;
import controller.AtvddTreze;
import controller.AtvddDoze;
import controller.AtvddOnze;
import controller.AtvddDez;
import controller.AtvddNove;
import controller.AtvddOito;
import controller.AtvddSete;
import controller.AtvddSeis;
import controller.AtvddCinco;
import controller.AtvddDois;
import controller.AtvddQuatro;
import controller.AtvddTres;
import controller.AtvddUm;
import javax.swing.JOptionPane;
import model.bean.Resultado;
import model.dao.ResultadoDAO;

/**
 *
 * @author thiag
 */
public class ListaDeExercício1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Resultado r = new Resultado();
        ResultadoDAO dao = new ResultadoDAO();
        int conf = 0;
        // TODO code application logic here
        int opc, nmr1, nmr2, nmr3;
        int vlr = 0;
        float n1, n2, n3;
        float valor = 0;
        String x, nome;
        
        AtvddUm ex1 = new AtvddUm();
        AtvddDois ex2 = new AtvddDois();
        AtvddTres ex3 = new AtvddTres();
        AtvddCinco ex5 = new AtvddCinco();
        AtvddSeis ex6 = new AtvddSeis();
        AtvddSete ex7 = new AtvddSete();
        AtvddOito ex8 = new AtvddOito();
        AtvddNove ex9 = new AtvddNove();
        AtvddDez ex10 = new AtvddDez();
        AtvddOnze ex11 = new AtvddOnze();
        AtvddDoze ex12 = new AtvddDoze();
        AtvddTreze ex13 = new AtvddTreze();
        AtvddQuatorze ex14 = new AtvddQuatorze();
        AtvddQuinze ex15 = new AtvddQuinze();
        AtvddDezesseis ex16 = new AtvddDezesseis();
        AtvddDezessete ex17 = new AtvddDezessete();
        AtvddDezoito ex18 = new AtvddDezoito();
        AtvddDezenove ex19 = new AtvddDezenove();
        
        conf = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Resolver" + "\n 2 - Exibir " + "\n 3 - Excluir"));
        if(conf == 1){
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número do exercício desejado de 1 a 20:"));
            switch(opc){
                case 1:
                    n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o primeiro número para a soma:"));
                    n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o segundo número para a soma:"));                
                    n3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o terceiro número para a soma:"));

                    ex1.setSoma(n1,n2,n3);

                    x = "" + ex1.getSoma();
                    nome = "as";
                    //valor = um.somarNumeros(numero_um, numero_dois, numero_tres)
                    r.setNome(nome);
                    r.setResultado(Float.parseFloat(x));
                    dao.create(r);
                    JOptionPane.showMessageDialog(null, x , "Resultado da Soma", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    nmr1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número inteiro para calcular a média:"));
                    nmr2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número inteiro para calcular a média:"));                
                    nmr3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o terceiro número inteiro para calcular a média:"));

                    ex2.setMedia(nmr1,nmr2,nmr3);

                    x = "Resultado: " + ex2.getMedia();
                    JOptionPane.showMessageDialog(null, x , "Resultado da Média", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    nmr1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número para saber se é menor que o segundo:"));
                    nmr2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número para saber se é menor que o segundo:"));

                    ex3.setMaior(nmr1, nmr2);

                    x = "Número menor: " + ex3.getMaior();
                    JOptionPane.showMessageDialog(null, x , "Resultado da Média", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    x = JOptionPane.showInputDialog(null, "Informe o número da conta");
                    AtvddQuatro ex4 = new AtvddQuatro(x);

                    JOptionPane.showMessageDialog(null, "Digito de veficação da sua conta: " + ex4.getDigitoDeVerificacao());
                    break;
                case 5:
                    nmr1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número para a soma:"));
                    nmr2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número para a soma:"));

                    ex5.setSoma(nmr1, nmr2);

                    x = "Resultado: " + ex5.getSoma();
                    JOptionPane.showMessageDialog(null, x , "Resultado da Soma", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 6:
                    nmr1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
                    nmr2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro número:"));

                    ex6.setSoma(nmr1, nmr2);
                    ex6.setMultiplicacao(nmr1, nmr2);
                    ex6.setDivisao(nmr1, nmr2);
                    ex6.setSubtracao(nmr1, nmr2);

                    x = "Resultado:\nSoma: " + ex6.getSoma() + "\nMultiplicação: " + ex6.getMultiplicacao() + "\nDivisão: " + 
                            ex6.getDivisao() + "\nSubtração: " + ex6.getSubtracao();
                    JOptionPane.showMessageDialog(null, x , "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 7:
                    n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a distância total percorrida:"));
                    n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o gasto total de combutível:"));

                    ex7.setConsumoMedio(n1, n2);

                    x = "Consumo Médio: " + ex7.getConsumoMedio();
                    JOptionPane.showMessageDialog(null, x , "Consumo Médio", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 8:
                    nome = JOptionPane.showInputDialog(null, "Nome do vendedor:");
                    n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Seu salário fixo:"));
                    n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Total de vendas em dinheiro:"));

                    ex8.setSalarioFinal(n1, n2);

                    x = "" + nome + " recebe um salário fixo de R$ " + n1 + "\nSeu salário final com o acréscimo da comissão é de R$ " + ex8.getSalarioFinal();
                    JOptionPane.showMessageDialog(null, x);
                    break;
                case 9:
                    nome = JOptionPane.showInputDialog(null, "Nome do aluno:");
                    n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Sua nota 1:"));
                    n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Sua nota 2:"));
                    n3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Sua nota 3:"));

                    ex9.setMediaAritmetica(n1, n2, n3);

                    x = "O aluno " + nome + " obteve uma média de " + ex9.getMediaAritmetica();
                    JOptionPane.showMessageDialog(null, x);
                    break;
                case 10:
                    nmr1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
                    nmr2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro número:"));

                    ex10.setTrocaDeValores(nmr1, nmr2);

                    x = "Valor de A informado: " + nmr1 + "\nValor de B informado: " + nmr2 + "\nValor de A depois da troca: " + ex10.getA() 
                            + "\nValor de B depois da troca: " + ex10.getB();
                    JOptionPane.showMessageDialog(null, x);
                    break;
                case 11:
                    n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Temperatura em Celsius:")); 

                    ex11.setConvercao(n1);

                    x = "" + n1 + " Cº equivalem a " + ex11.getConvercao() + " Fahrenheit.";
                    JOptionPane.showMessageDialog(null, x);
                    break;
                case 12:
                    n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a quantia em Dólares:"));
                    n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a contação atual do Dólar:"));

                    ex12.setConversao(n1, n2);

                    x = "US$ " + n1 + " equivalem a R$ " + ex12.getConversao();
                    JOptionPane.showMessageDialog(null, x);
                    break;
                case 13:
                    n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a quantia deposita na conta:"));

                    ex13.setContaPoupanca(n1);

                    x = "Após um mês seu saldo é de R$ " + ex13.getContaPoupanca();
                    JOptionPane.showMessageDialog(null, x);
                    break;
                case 14:
                    n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da compra:"));

                     ex14.setPrestacao(n1);

                    x = "O cliente pagará 5 parcelas no preço de R$ " + ex14.getPrestacao();
                    JOptionPane.showMessageDialog(null, x);
                    break;
                case 15:
                    n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor de custo do produto:"));
                    n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da porcentagem de aumento desejado:"));

                    ex15.setPrecoDeVenda(n1, n2);

                    x = "O produto custará R$ " + ex15.getPrecoDeVenda();
                    JOptionPane.showMessageDialog(null, x);
                    break;
                case 16:
                    n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor de fábrica do carro desejado:"));

                    ex16.setPrecoFinal(n1);

                    x = "Com a atribuição dos impostos devidos o carro custará R$ " + ex16.getPrecoFinal();
                    JOptionPane.showMessageDialog(null, x);
                    break;
                case 17:
                    nmr1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));

                    ex17.setMaiorQueDez(nmr1);

                    JOptionPane.showMessageDialog(null, ex17.getMaiorQueDez());
                    break;
                case 18:
                    nmr1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
                    nmr2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));

                    ex18.setNumeroMaior(nmr1, nmr2);

                    JOptionPane.showMessageDialog(null, ex18.getNumeroMaior());
                    break;
                case 19:
                    nmr1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));

                    ex19.setEntreCemEDuzentos(nmr1);

                    JOptionPane.showMessageDialog(null, ex19.getEntreCemEDuzentos());
                    break;
                case 20:
                    nome = JOptionPane.showInputDialog(null, "Nome do aluno:");
                    n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Sua nota 1:"));
                    n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Sua nota 2:"));
                    n3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Sua nota 3:"));

                    AtvddVinte ex20 = new AtvddVinte(n1, n2, n3);

                    JOptionPane.showMessageDialog(null, nome + "..." + ex20.getResultadoFinal());
                    break;
            }
        }else if (conf == 2){
            Resultado re = new Resultado(); 
            dao.read();
                JOptionPane.showMessageDialog(null, "ID: " + re.getId() + " Nome = " + re.getNome() + " Resultado = " + re.getResultado());
            
        }else if (conf == 3){
            int ide = Integer.parseInt(JOptionPane.showInputDialog(null,"Remover resposta" ,"Digite o Id"));
            int resposta = JOptionPane.showConfirmDialog(null,"Deseja Realmente excluir ?", "escolha dois", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                r.setId(ide);
                dao.delete(r);
            }else{
                System.exit(0);
            }

        }
    }
}
        
  
