/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Resultado;
import model.dao.ResultadoDAO;

/**
 *
 * @author thiag
 */
public class Main {
    
    public static void main(String[] args) throws SQLException {
        Resultado r = new Resultado();
        ResultadoDAO dao = new ResultadoDAO();
        int opcao = 0;
        int conf = 0;
        float numero_um = 0;
        float numero_dois = 0;
        float numero_tres = 0;
        int numeroum = 0;
        int numerodois = 0;
        int numerotres = 0;
        float valor = 0;
        float resultado =0;
        int valorI = 0;
        String Nconta = null;
        String conta = null;
        String nome;
        

        conf = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Resolver" + "\n 2 - Exibir " + "\n 3 - Excluir"));
        if(conf == 1){
        opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o exercicio."));
        switch (opcao) {

            case 1:
                ExercicioUm um = new ExercicioUm();
                numero_um = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex1)Digite o número a ser somado:", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                numero_dois = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex1)Digite o número a ser somado:", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                numero_tres = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex1)Digite o número a ser somado:", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                valor = um.somarNumeros(numero_um, numero_dois, numero_tres);
                r.setResultado(valor);
                dao.create(r);
                JOptionPane.showMessageDialog(null, "Resultado: " + valor);
                break;
            case 2:
                 ExercicioDois dois = new ExercicioDois();
                numeroum = Integer.parseInt(JOptionPane.showInputDialog(null, "ex2)Digite o número para calcular media", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                numerodois = Integer.parseInt(JOptionPane.showInputDialog(null, "ex2)Digite o número para calcular media", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                numerotres = Integer.parseInt(JOptionPane.showInputDialog(null, "ex2)Digite o número para calcular media", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                valor = dois.mediaNumeros(numeroum, numerodois, numerotres);
                r.setResultado(valor);
                dao.create(r);
                JOptionPane.showMessageDialog(null, "Resultado: " + valor);
                break;
            case 3:
                ExercicioTres tres = new ExercicioTres();
                numeroum = Integer.parseInt(JOptionPane.showInputDialog(null, "ex3)Digite um número", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                numerodois = Integer.parseInt(JOptionPane.showInputDialog(null, "ex3)Digite um número", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                valorI = tres.compararNumeros(numeroum, numerodois);
                JOptionPane.showMessageDialog(null, "Resultado: " + valorI);
                r.setResultado(valorI);
                dao.create(r);
                break;
            case 4:
                ExercicioQuatro quatro = new ExercicioQuatro();
                conta = (JOptionPane.showInputDialog(null, "ex4)Digite um número", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                valor = quatro.inverte(conta).charAt(quatro.inverte(conta).length() - 1);
                JOptionPane.showMessageDialog(null, "Resultado: " + valor);
                r.setResultado(valor);
                dao.create(r);
                break;
            case 5:
                ExercicioCinco cinco = new ExercicioCinco();
                numero_um = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex5)Digite o número a ser somado:", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                numero_dois = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex5)Digite o número a ser somado:", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                valor = cinco.somarNumeros(numero_um, numero_dois);
                JOptionPane.showMessageDialog(null, "Resultado: " + valor);
                r.setResultado(valor);
                dao.create(r);
                break;
            case 6:
                ExercicioSeis seis = new ExercicioSeis();
                numero_um = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex6)Digite o número a ser somado:", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                numero_dois = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex6)Digite o número a ser somado:", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                String val = "Soma: " + seis.soma(numero_um, numero_dois) + " Multiplicação: " + seis.multiplicacao(numero_um, numero_dois)
                        + " Subtração: " + seis.subtracao(numero_um, numero_dois) + " Divisão: " + seis.divisao(numero_um, numero_dois);
                JOptionPane.showMessageDialog(null, val);
               r.setResultado(Float.parseFloat(val));
                dao.create(r);
                break;
            case 7:
                ExercicioSete sete = new ExercicioSete();
                numero_um = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex7)Digite a distancia percorrida:", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                numero_dois = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex7)Digite o total de combústivel gasto:", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                valor = sete.consumoMedio(numero_um, numero_dois);
                JOptionPane.showMessageDialog(null, "Consumo medio: " + valor);
               r.setResultado(valor);
                dao.create(r);
                break;
            case 8:

                ExercicioOito oito = new ExercicioOito();
                float salario,
                 total_vendas;
                float totals;
                nome = (JOptionPane.showInputDialog(null, "Ex8)Digite o nome do vendedor", "Nome vendedor", JOptionPane.QUESTION_MESSAGE));
                salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex8)Digite o salário fixo", "Salário do vendedor", JOptionPane.QUESTION_MESSAGE));
                total_vendas = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex8)Digite o valor total das vendas", "Total das vendas", JOptionPane.QUESTION_MESSAGE));

                totals = oito.salario(total_vendas);
                JOptionPane.showMessageDialog(null, "Nome:" + nome);
                JOptionPane.showMessageDialog(null, "Ex8)Salário fixo: " + salario);
                JOptionPane.showMessageDialog(null, "Ex8)Salário total: " + totals);
                r.setResultado(valor);
                dao.create(r);
                break;
            case 9:
                ExercicioNove nove = new ExercicioNove();
                nome = (JOptionPane.showInputDialog(null, "Digite o nome do aluno", "Nome vendedor", JOptionPane.QUESTION_MESSAGE));
                numero_um = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex9)Digite a nota do aluno:", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                numero_dois = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex9)Digite a nota do aluno:", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                numero_tres = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex9)Digite a nota do aluno:", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                valor = nove.mediaAluno(numero_um, numero_dois, numero_tres);
                JOptionPane.showMessageDialog(null, "Nome: " + nome + "  Média: " + valor);
               r.setResultado(valor);
               r.setNome(nome);
                dao.create(r);
                break;
            case 10:
                ExercicioDez dez = new ExercicioDez();
                numero_um = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex10)Digite o valor de A:", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                numero_dois = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex10)Digite o valor de B", "Valor do número", JOptionPane.QUESTION_MESSAGE));
                JOptionPane.showMessageDialog(null, "A = " + dez.trocaA(numero_um, numero_dois) + " B = " + dez.trocaB(numero_um, numero_dois));
                r.setResultado(valor);
                dao.create(r);
                break;
            case 11:
                ExercicioOnze onze = new ExercicioOnze();
                numero_um = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex11)Informe a temperatura", "Valor do número", JOptionPane.QUESTION_MESSAGE));
               valor = onze.conversao(numero_um);
                JOptionPane.showMessageDialog(null, "Temperatura Fahrenheit: " + valor);
            r.setResultado(valor);
                dao.create(r);
                break;
            case 12:
                ExercicioDoze doze = new ExercicioDoze();
                numero_um = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex12)Informe o valor", "Quantida em dólares", JOptionPane.QUESTION_MESSAGE));
                numero_dois = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex12)Informe a cotação do dólar", "Valor do dólar", JOptionPane.QUESTION_MESSAGE));
                valor = doze.dolar(numero_um, numero_dois);
                JOptionPane.showMessageDialog(null, "Valor em reais: " + valor);
               r.setResultado(valor);
                dao.create(r);
                break;
            case 13:
                ExercicioTreze treze = new ExercicioTreze();
                numero_um = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex13)Informe o deposito", "Quantida em dólares", JOptionPane.QUESTION_MESSAGE));
                valor = treze.conta(numero_um);
                JOptionPane.showMessageDialog(null, "Total: " + valor);
               r.setResultado(valor);
                dao.create(r);
                break;
            case 14:
               ExercicioQuatorze quatorze = new ExercicioQuatorze();
               numero_um = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex14)Informe o valor da compra", "Quantida em dólares", JOptionPane.QUESTION_MESSAGE));
               valor = quatorze.produto(numero_um);
               JOptionPane.showMessageDialog(null, "5 parcelas de:   " + valor);
               r.setResultado(valor);
                dao.create(r); 
                break;
            case 15:
                ExercicioQuinze quinze = new ExercicioQuinze();
                numero_um = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex15)Informe o preço de custo do produto: ", "Quantida em dólares", JOptionPane.QUESTION_MESSAGE));
                numero_dois = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex15)Porcentagem de lucro: ", "Valor do dólar", JOptionPane.QUESTION_MESSAGE));
                valor = quinze.lucro(numero_um, numero_dois);
                JOptionPane.showMessageDialog(null, "Valor final do produto: " + valor);
                  r.setResultado(valor);
                dao.create(r);
                break;
            case 16:
                 ExercicioDezeseis dezeseis = new ExercicioDezeseis();
                 numero_um = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex16)Informe o custo de frabrica: ", "Quantida em dólares", JOptionPane.QUESTION_MESSAGE));
                 valor =dezeseis.carros(numero_um);
                 JOptionPane.showMessageDialog(null, "Custo ao consumidor: " + valor);
               r.setResultado(valor);
                dao.create(r);
                 break;
            case 17:
                 ExercicioDezesete dezesete = new ExercicioDezesete();
                 numero_um = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex17)Informe um número: ", "Quantidade em dólares", JOptionPane.QUESTION_MESSAGE));
                nome = dezesete.comparar(numero_um);
                 JOptionPane.showMessageDialog(null, nome);
                 r.setNome(nome);
                dao.create(r);
                 break;
            case 18:
                ExercicioDezoito dezoito = new ExercicioDezoito();
                 numero_um = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex18)Informe um número : ", "Comparações", JOptionPane.QUESTION_MESSAGE));
                 numero_dois = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex18)Informe um número: ", "Comparações", JOptionPane.QUESTION_MESSAGE));
                valor = dezoito.maior(numero_um, numero_dois);
                 JOptionPane.showMessageDialog(null, "O maior número é" + valor);
               r.setResultado(valor);
                dao.create(r);
                 break;
            case 19:
                ExercicioDezenove dezenove = new ExercicioDezenove();
                 numero_um = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex18)Informe um número : ", "Comparações", JOptionPane.QUESTION_MESSAGE));
                 JOptionPane.showMessageDialog(null, dezenove.intervalo(numero_um));
               r.setResultado(Float.parseFloat(dezenove.intervalo(numero_um)));
                dao.create(r);
                 break;
            case 20:
                ExercicioVinte vinte = new ExercicioVinte();
                nome = JOptionPane.showInputDialog(null,"Informe o nome do aluno");
                 numero_um = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex20)Informe a nota: ", "Média", JOptionPane.QUESTION_MESSAGE));
                 numero_dois = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex20)Informe a nota: ", "Média", JOptionPane.QUESTION_MESSAGE));
                 numero_tres = Float.parseFloat(JOptionPane.showInputDialog(null, "Ex20)Informe a nota: ", "Média", JOptionPane.QUESTION_MESSAGE));
                 
                 JOptionPane.showMessageDialog(null, nome + " Está " + vinte.media(numero_um, numero_dois,numero_tres));
                r.setResultado(valor);
                dao.create(r);
                break;
        }
        }
        else if (conf == 2){
                    for(Resultado re: dao.read()){
                        JOptionPane.showMessageDialog(null, "ID: " + re.getId() + " Nome = " + re.getNome() + " Resultado = " + re.getResultado());
                     }
        }
        else if (conf == 3){
            int ide = Integer.parseInt(JOptionPane.showInputDialog(null,"Remover resposta" ,"Digite o Id"));
            int resposta = JOptionPane.showConfirmDialog(null,"Deseja Realmente excluir ?", "escolha dois", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                        r.setId(ide);
                        dao.delete(r);
              }
              else {
                 System.exit(0);
              }

        }
    }
}
