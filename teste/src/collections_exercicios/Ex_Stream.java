package collections_exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex_Stream {
	public static void main(String[] args) {
		
		List<String> numerosAleatorios =
				Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
		
		System.out.println("Imprima todos os elementos dessa lista de String: ");
		numerosAleatorios.forEach(System.out::println);		
		
	    System.out.println("Pegue os 5 primeiros e coloque dentro de um Set: ");
		Set<Integer> firstFiveSet = numerosAleatorios.stream()
		        .limit(5)
		        .map(Integer::parseInt) 
		        .collect(Collectors.toSet());
        firstFiveSet.forEach(System.out::println);
       
        System.out.println("Transforme essa lista de String em uma lista de números inteiros: ");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt) 
                .collect(Collectors.toList());
        collectList.forEach(System.out::println);
        
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList());
        
        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista: "); 
        List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream() 
                .map(Integer::parseInt) 
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList()); 
        System.out.println(ListParesMaioresQue2);
        
        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);
            
        System.out.println("Remova os valores ímpares: ");
        numerosAleatoriosInteger.removeIf(integer -> (integer % 2 != 0));
        System.out.println(numerosAleatoriosInteger);
         
        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante: ");
        numerosAleatorios.stream()
                .skip(3) 
                .forEach(System.out::println); 
        
        System.out.println("Retirando os números repetidos da lista, quantos números ficam?: ");
        long numerosUnicos = numerosAleatorios.stream()
                .distinct()  
                .count();
        System.out.println(numerosUnicos);
        
        System.out.println("Mostre o menor valor da lista: ");
        Optional<Integer> menorValor = numerosAleatorios.stream()
                .map(Integer::parseInt) 
                .min(Integer::compareTo);  
        menorValor.ifPresent(System.out::println);
        
        System.out.println("Mostre o maior valor da lista: ");
        Optional<Integer> maiorValor = numerosAleatorios.stream()
                .map(Integer::parseInt) 
                .max(Integer::compareTo); 
        maiorValor.ifPresent(System.out::println);
        
        System.out.println("Pegue apenas os números ímpares e some: ");
        int somaDosImpares = numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .filter(n -> n % 2 != 0)
                .sum(); 
        System.out.println(somaDosImpares);
        
        System.out.println("Mostre a lista na ordem numérica: ");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .sorted() 
                .forEach(System.out::println); 
        
        System.out.println("Agrupar os valores ímpares múltiplos de 3 e de 5: ");
        Map<Boolean, List<Integer>> grupos = numerosAleatorios.stream()
                .map(Integer::parseInt) 
                .filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0)) 
                .collect(Collectors.groupingBy(n -> n % 2 == 0)); 

        grupos.forEach((par, numeros) -> {
            if (par) {
                System.out.println("Pares:");
            } else {
                System.out.println("Ímpares:");
            }
            numeros.forEach(System.out::println);
        });
        
	}

}
