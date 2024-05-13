package exercicios_dio;

import java.util.Scanner;

/*
Desafio: Você foi contratado para criar um gerenciador de pacotes. Porém, o que 
restou para você fazer foi o contador de porcentagem de download dos pacotes. Mas 
como o espaço para essa informação ficou pequeno, a empresa optou por fazer uma 
escala de 10 – 1. Então a escala será 1 = 10%, 2 = 20%, 3 = 30% e etc.
Para cada 10% de download, o programa deve printar, em sequência e sem espaços, 
uma barra “/”.
Entrada: Será um número que representará a porcentagem.
Saída: Serão as barras sem espaços entre elas. 
Ex.: Entrada = 1, Saída = /
     Entrada = 3, Saída = ///
     Entrada = 7, Saída = ///////
Crie a condição necessária para que, de acordo com o tamanho, seja printado no 
console barras representando o download.
*/

public class Ex_TamanhoWhile {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int tamanho = leitor.nextInt();
	   
		int count = 0;
		while(count < tamanho){
			System.out.print("/");
			count ++;
			}
		
		}
	
}
