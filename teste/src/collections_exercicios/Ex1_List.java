package collections_exercicios;

import java.util.ArrayList;
import java.util.Iterator;

/*Faça um programa que receba a temperatura média dos 6 primeiros meses
do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as
temperaturas acima desta média, e em que mês elas ocorrem (mostrar o mês
por extenso: 1 - Janeiro, 2 - Fevereiro e etc).
*/

public class Ex1_List {
	public static void main(String[] args) {
		
		ArrayList<Double> temperaturas = new ArrayList<Double>(); 
		temperaturas.add(35.5);
		temperaturas.add(34.0);
		temperaturas.add(36.2);
		temperaturas.add(33.0);
		temperaturas.add(32.7);
		temperaturas.add(35.1);
		
		System.out.println("Temperaturas: " + temperaturas.toString());
		
		Iterator<Double> iterator = temperaturas.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Soma das temperaturas: " + soma); 
		
		double mediaSemestral = soma / temperaturas.size();
		System.out.println("Média semestral das temperaturas: " + mediaSemestral); 
		
		System.out.println("Temperaturas acima da média semestral: ");
        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > mediaSemestral) {
                String mes = "";
                switch (i) {
                    case 0: mes = "Janeiro"; break;
                    case 1: mes = "Fevereiro"; break;
                    case 2: mes = "Março"; break;
                    case 3: mes = "Abril"; break;
                    case 4: mes = "Maio"; break;
                    case 5: mes = "Junho"; break;
                }
                System.out.println(temperaturas.get(i) + " - " + mes);   		
		 
	}
             
    } 
        
	}
	
}
