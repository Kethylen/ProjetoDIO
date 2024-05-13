package collections_exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi inserido.
*/

public class Ex2_Map {
	public static void main(String[] args) {
		// Criar um objeto Random para gerar números aleatórios
		Random random = new Random();
		
		// Criar um mapa para armazenar os resultados do lançamento do dado
		Map<Integer, Integer> resultados = new HashMap<>();
		
		// Simular o lançamento do dado 100 vezes
		for (int i = 0; i < 100; i++) {
			// Gerar um número aleatório entre 1 e 6 (valores do dado)
			int resultado = random.nextInt(6) + 1;
			
			// Atualizar o mapa com o resultado do lançamento
			resultados.put(resultado, resultados.getOrDefault(resultado, 0) + 1);
	        }
	        
	        // Mostrar quantas vezes cada valor foi inserido
	        System.out.println("Resultado do lançamento do dado:");
	        for (Map.Entry<Integer, Integer> entry : resultados.entrySet()) {
	            System.out.println("Valor " + entry.getKey() + ": " + entry.getValue() + " vezes");
	        }		
			
	}

}
