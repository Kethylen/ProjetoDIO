package exercicios_dio;

import java.util.Scanner; 

/* Desafio: Seu sobrinho começou a ganhar mesada dos pais. No auge dos seus 8 anos 
recebendo 50 reais por mês, ele quer saber quanto terá se juntar todo o dinheiro, 
sem gastar nada, durante alguns meses. E você, como um bom tio com habilidades de 
programação, vai criar um programa que com as entradas do seu sobrinho vai calcular 
automaticamente a quantidade de dinheiro que ele terá em X meses.
Entrada: Será o número de meses que o sobrinho polpará o dinheiro.
Saída: Deve ser o valor que o sobrinho terá ao final dos meses.
Ex.: Entrada = 2, Saída = Você terá 100 reais 
     Entrada = 4, Saída = Você terá 200 reais
Crie a condição necessária para que o sobrinho saiba quanto dinheiro irá juntar nos 
meses da entrada.
*/

public class Ex_Mesada {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        int calcularValorTotal = entrada*mesada; 
        System.out.println(calcularValorTotal);
    }
  
}
