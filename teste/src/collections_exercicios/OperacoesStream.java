package collections_exercicios;  

import java.util.Comparator;
import java.util.HashMap;  
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

/*Dadas as seguintes informações de id e contato, crie um dicionário e 
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

public class OperacoesStream {
	public static void main(String[] args) { 
		
		System.out.println("--\tOrdem aleatória\t--");	
		Map<Integer, Contato> agenda = new HashMap<Integer, Contato>(){{
            put(1, new Contato ("Simba", 2222));
        	put(4, new Contato ("Cami", 5555));
        	put(3, new Contato ("Jon", 1111)); 
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
        	System.out.println(entry.getKey() + " - " + entry.getValue().getNome()); 
        }
		
        System.out.println("--\tOrdem número telefone\t--");
		//Lambda: lado esquerdo = pede um argumento e lado direito = pede o corpo (código)
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
				cont -> cont.getValue().getNumero()));	
        set.addAll(agenda.entrySet());
		for (Map.Entry<Integer, Contato> entry: set) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + 
					": " + entry.getValue().getNome());
		}
		
		System.out.println("--\tOrdem nome contato\t--");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new ComparatorOrdemNomeContato());
		set1.addAll(agenda.entrySet());
		for (Map.Entry<Integer, Contato> entry: set1) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}
		
	}
}  

class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
	@Override
	public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
		return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
	}
}

class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {
	@Override
	public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
		return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
	}
}
