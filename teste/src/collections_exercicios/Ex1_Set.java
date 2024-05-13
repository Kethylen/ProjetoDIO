package collections_exercicios;

import java.util.ArrayList;
import java.util.Arrays; 
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Crie um conjunto contendo as cores do arco-íris e:
A. Exiba todas as cores uma abaixo da outra
B. A quantidade de cores que o arco-íris tem
C. Exiba as cores em ordem alfabética
D. Exiba as cores na ordem inversa da que foi informada (list - set - inverter método collections)
E. Exiba todas as cores que começam com a letra "v"
F. Remova todas as cores que não começam com a letra "v"
G. Limpe o conjunto
H. Confira se o conjunto está vazio
*/

public class Ex1_Set {
	public static void main(String[] args) { 
		
		System.out.println("Crie um conjunto contendo as cores do arco-íris: ");
		ArrayList<String> coresArcoIris = new ArrayList<>();
		coresArcoIris.add("vermelho");
		coresArcoIris.add("laranja");
		coresArcoIris.add("amarelo");
		coresArcoIris.add("verde");
		coresArcoIris.add("azul");
		coresArcoIris.add("anil");
		coresArcoIris.add("violeta");
		System.out.println(coresArcoIris); 
	    
		System.out.println("Exiba todas as cores uma abaixo da outra: ");
		for (String cor : coresArcoIris) {
			System.out.println(cor);
			} 
		
		System.out.println("Exiba a quantidade de cores que o arco-íris tem: ");
		System.out.println("O arco-íris tem " + coresArcoIris.size() + " cores.");
		
		System.out.println("Exiba as cores em ordem alfabética: ");
		Set<String> coresArcoIris1 = new TreeSet<>(coresArcoIris);
		System.out.println(coresArcoIris1); 
	         
		System.out.println("Exiba as cores na ordem inversa da que foi informada: ");
		Collections.reverse(coresArcoIris);
			System.out.println(coresArcoIris);
		
	    System.out.println("Exiba todas as cores que começam com a letra v: ");
	    for (String cor : coresArcoIris) {
	    	if (cor.startsWith("v")) {
	    		System.out.println(cor);
	    		}
	    }
		
		System.out.println("Remova todas as cores que não começam coma letra v: ");
		Iterator<String> iterator = coresArcoIris.iterator();
		while(iterator.hasNext()) { 
			String cor = iterator.next();
			if (!cor.startsWith("v")) {
				iterator.remove();
			}
		}
		System.out.println(coresArcoIris);
		
		System.out.println("Limpe o conjunto: ");
		coresArcoIris.clear();
		
		System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());
				
	}
	
}
	
	        
	
