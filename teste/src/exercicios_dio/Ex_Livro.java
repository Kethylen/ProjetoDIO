package exercicios_dio;

import java.util.Scanner; 

/* Desafio: Sua tia Gertrudes é uma leitora assídua. E ela gostaria de ter um 
aplicativo que dissesse para ela, de acordo com o número de páginas de um livro, 
quanto tempo ela levaria para ler lendo apenas 3 páginas por dia. Como você está 
aprendendo Java, você se disponibilizou para ajudá-la com esse desenvolvimento.
Entrada: Será o número de páginas de um determinado livro.
Saída: Deverá ser quanto tempo ela vai levar para ler esse livro.
Ex.: Entrada = 30, Saída = "10 dias"
     Entrada = 15, Saída = "5 dias"
     Entrada = 90, Saída = "30 dias"
Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus 
livros.
*/

public class Ex_Livro {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        int calcularTempo = paginas/paginasLidas;
	    System.out.print(calcularTempo + " dias");

	}
}
