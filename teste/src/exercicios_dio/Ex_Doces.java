package exercicios_dio;

import java.util.Scanner; 

/* Desafio: Uma lojinha de doces tem muitos clientes por ser ao lado de uma escola. 
Para aumentar as vendas o dono resolveu colocar uma máquina onde os clientes, 
principalmente as crianças que estão muito acostumadas com a tecnologia, poderiam 
colocar suas moedas e receber dois doces aleatórios. Cada 1 real irá render 2 doces 
aleatórios.
Entrada: Será a quantidade de dinheiro que cada cliente, um por vez, possui.
Saída: Deverá ser a quantidade de doces que cada cliente conseguiu obter 
(sem as aspas).
Ex.: Entrada = 10, Saída = "O cliente obteve 20 doces"
     Entrada = 20, Saída = "O cliente obteve 40 doces"
     Entrada = 40, Saída = "O cliente obteve 80 doces"
Crie a condição necessária para que cada cliente saiba quantos doces vai obter de 
acordo com a entrada.
*/

public class Ex_Doces {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	    int dinheiro = leitor.nextInt();
	    int calcularQuantidade = dinheiro*2;
	    System.out.print("O cliente obteve " + calcularQuantidade + " doces");
	
	}
	
}
