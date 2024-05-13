package collections_exercicios;

import java.util.ArrayList;
import java.util.Scanner;

/*Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:
1. "Telefonou para vítima?"
2. "Esteve no local  do crime?"
3. "Mora perto  da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser 
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como 
"Assassina". Caso contrário, ela será classificada como "Inocente".
*/

public class Ex2_List {
	public static void main(String[] args) {
		
		ArrayList<String> perguntas = new ArrayList<String>();
        perguntas.add("Telefonou para vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");
		
        Scanner leitor = new Scanner(System.in);
		int respostasPositivas = leitor.nextInt();
		
        if (respostasPositivas == 2) {
            System.out.println("Suspeita");
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("Assassina");
        } else {
            System.out.println("Inocente");
        }
      
	}

}
