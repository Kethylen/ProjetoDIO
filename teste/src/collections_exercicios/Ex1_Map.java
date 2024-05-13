package collections_exercicios;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Dada a população estimada de alguns estados do NE brasileiro, faça:
Estado = PE - População = 9.616.621
Estado = AL - População = 3.351.543
Estado = CE - População = 9.187.103
Estado = RN - População = 3.534.265
- Crie um dicionário e relacione os estados e suas populações;
- Substitua a população do estado do RN por 3.534.165;
- Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
- Exiba a população PE;
- Exiba todos os estados e suas populações na ordem que foi informado;
- Exiba o estados e suas populações em ordem alfabética;
- Exiba o estado com a menor população e sua quantidade;
- Exiba o estado com a maior população e sua quantidade;
- Exiba a soma da população desses estados;
- Exiba a média da população deste dicionário de estados;
- Remova os estados com a população menor que 4.000.000;
- Apague o dicionário de estados;
- Confira se o dicionário está vazio.
*/

public class Ex1_Map {
	public static void main(String[] args) {
		
		System.out.println("Crie um dicionário e relacione os estados e suas populações: ");
        Map<String, Integer> dicionarioEstados = new HashMap<String, Integer>(){{
        	put("PE", 9616621);
        	put("AL", 3351543);
        	put("CE", 9187103); 
        	put("RN", 3534265);
        }};
        System.out.println(dicionarioEstados.toString());    
		
        System.out.println("Substitua a população do estado do RN por 3.534.165: ");   
        dicionarioEstados.put("RN", 3534165);
        System.out.println(dicionarioEstados);
        
        System.out.println("Confira se o estado PB está no dicionário: " 
                + dicionarioEstados.containsKey("PB"));  
        
        System.out.println("Adicione o estado PB - 4.039.277 no dicionário: ");
        dicionarioEstados.put("PB", 4039277);
        System.out.println(dicionarioEstados.toString());
         
        System.out.println("Exiba a população PE: " + dicionarioEstados.get("PE")); 
        
        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado: ");
        Map<String, Integer> dicionarioEstados1 = new LinkedHashMap<String, Integer>(){{
        	put("PE", 9616621);
        	put("AL", 3351543);
        	put("CE", 9187103);  
        	put("RN", 3534265);
        	put("PB", 4039277);
        }};
        System.out.println(dicionarioEstados1.toString());  
        
        System.out.println("Exiba o estados e suas populações em ordem alfabética: ");
        Map<String, Integer> dicionarioEstados2 = new TreeMap<String, Integer>(dicionarioEstados);
        System.out.println(dicionarioEstados2.toString());  
			
        System.out.println("Exiba o estado com a menor população e sua quantidade: "); 
        Integer menorPopulacao = Collections.min(dicionarioEstados.values());
        String menorEstado = "";
        for (Map.Entry<String, Integer> entry: dicionarioEstados.entrySet()) {
        	if (entry.getValue().equals(menorPopulacao)) {
        		menorEstado = entry.getKey();
        		System.out.println(menorEstado + " - " + menorPopulacao);
        	}
        } 
        
        System.out.println("Exiba o estado com a maior população e sua quantidade: "); 
        Integer maiorPopulacao = Collections.max(dicionarioEstados.values());
        Set<Map.Entry<String, Integer>> entries = dicionarioEstados.entrySet();
        String maiorEstado = "";
        for (Map.Entry<String, Integer> entry: entries) {
        	if (entry.getValue().equals(maiorPopulacao)) 
        		maiorEstado = entry.getKey();
        	}
        System.out.println(maiorEstado + " - " + maiorPopulacao); 
        
        Iterator<Integer> iterator = dicionarioEstados.values().iterator();        	
        Integer soma = 0;
        while(iterator.hasNext()) {
        	soma += iterator.next();
        }
        System.out.println("Exiba a soma da população desses estados: " + soma);
        
        System.out.println("Exiba a média da população deste dicionário de estados: " 
                + (soma/dicionarioEstados.size())); 
        
        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = dicionarioEstados.values().iterator();        	
        while(iterator1.hasNext()) {
        	if(iterator1.next() < 4000000) iterator1.remove();
        } 
        System.out.println(dicionarioEstados);
        
        System.out.println("Apague o dicionário de estados: ");
        dicionarioEstados.clear();
        
        System.out.println("Confira se o dicionário está vazio: " + dicionarioEstados.isEmpty());       
        
	}
	
}
