package collections_exercicios;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Comparator;

/*Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e ide. Em 
seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
A. Ordem de Inserção
B. Ordem Natural (nome)
C. IDE
D. Ano de criação e nome
E. Nome, ano de criação e IDE
Ao final, exiba as linguagens no console, uma abaixo da outra.
*/

public class Ex2_Set {
	public static void main(String[] args) { 
		
	    String nome;
	    int anoDeCriacao;
	    String ide; 
		
		System.out.println("--\tOrdem de inserção\t--");
		Set<LingFavorita> minhaLingFavorita = new LinkedHashSet<>();
		minhaLingFavorita.add(new LingFavorita(nome="java", anoDeCriacao=1991, 
				ide="eclipse"));
		minhaLingFavorita.add(new LingFavorita(nome="c#", anoDeCriacao=2000, 
				ide="visual studio"));
		minhaLingFavorita.add(new LingFavorita(nome="python", anoDeCriacao=1991, 
				ide="anaconda"));
		for (LingFavorita lingFavorita: minhaLingFavorita) System.out.println(lingFavorita.getNome() 
				+ " - " + lingFavorita.getAnoDeCriacao() + " - " + lingFavorita.getIde());
		
		System.out.println("--\tOrdem Natural (nome)\t--");
		Set<LingFavorita> minhaLingFavorita1 = new TreeSet<>(Comparator.comparing(LingFavorita:: getNome));
		minhaLingFavorita1.add(new LingFavorita(nome="java", anoDeCriacao=1991, 
				ide="eclipse"));
		minhaLingFavorita1.add(new LingFavorita(nome="c#", anoDeCriacao=2000, 
				ide="visual studio"));
		minhaLingFavorita1.add(new LingFavorita(nome="python", anoDeCriacao=1991, 
				ide="anaconda")); 
		for (LingFavorita lingFavorita: minhaLingFavorita1) System.out.println(lingFavorita.getNome() 
				+ " - " + lingFavorita.getAnoDeCriacao() + " - " + lingFavorita.getIde());
		
		System.out.println("--\tOrdem IDE\t--");
		Set<LingFavorita> minhaLingFavorita2 = new TreeSet<>(Comparator.comparing(LingFavorita::getIde));
		minhaLingFavorita2.add(new LingFavorita(nome="java", anoDeCriacao=1991, 
				ide="eclipse"));
		minhaLingFavorita2.add(new LingFavorita(nome="c#", anoDeCriacao=2000, 
				ide="visual studio"));
		minhaLingFavorita2.add(new LingFavorita(nome="python", anoDeCriacao=1991, 
				ide="anaconda")); 
		for (LingFavorita lingFavorita: minhaLingFavorita2) System.out.println(lingFavorita.getNome() 
				+ " - " + lingFavorita.getAnoDeCriacao() + " - " + lingFavorita.getIde());
		
		System.out.println("--\tOrdem AnoDeCriacao/Nome\t--");
		Set<LingFavorita> minhaLingFavorita3 = new TreeSet<>(new ComparatorAnoDeCriacaoNome());
		minhaLingFavorita3.add(new LingFavorita(nome="java", anoDeCriacao=1991, 
				ide="eclipse"));
		minhaLingFavorita3.add(new LingFavorita(nome="c#", anoDeCriacao=2000, 
				ide="visual studio"));
		minhaLingFavorita3.add(new LingFavorita(nome="python", anoDeCriacao=1991, 
				ide="anaconda")); 
		for (LingFavorita lingFavorita: minhaLingFavorita3) System.out.println(lingFavorita.getNome() 
				+ " - " + lingFavorita.getAnoDeCriacao() + " - " + lingFavorita.getIde());
		
		System.out.println("--\tOrdem Nome/AnoDeCriacao/IDE\t--");
		Set<LingFavorita> minhaLingFavorita4 = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIde());
		minhaLingFavorita4.add(new LingFavorita(nome="java", anoDeCriacao=1991, 
				ide="eclipse"));
		minhaLingFavorita4.add(new LingFavorita(nome="c#", anoDeCriacao=2000, 
				ide="visual studio"));
		minhaLingFavorita4.add(new LingFavorita(nome="python", anoDeCriacao=1991, 
				ide="anaconda")); 
		for (LingFavorita lingFavorita: minhaLingFavorita4) System.out.println(lingFavorita.getNome() 
				+ " - " + lingFavorita.getAnoDeCriacao() + " - " + lingFavorita.getIde());
		
	} 
	
}

class LingFavorita implements Comparable <LingFavorita>{
	private String nome;
	private int anoDeCriacao;
	private String ide;
	
	public LingFavorita(String nome, int anoDeCriacao, String ide) {
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAnoDeCriacao() {
		return anoDeCriacao;
	}
	
	public String getIde() {
		return ide;
	}
	
	@Override
    public String toString() {
        return "{" +
        		"nome='" + nome + '\'' +
        		", anoDeCriacao='" + '\'' +
        		", ide=" + ide +
        		'}';
    }
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LingFavorita lingFavorita = (LingFavorita) o;
        return nome.equals(lingFavorita.nome) && anoDeCriacao == lingFavorita.anoDeCriacao 
        		&& ide == lingFavorita.ide; 
    }
	
	@Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }
	
	@Override
    public int compareTo(LingFavorita lingFavorita) { 
		int anoDeCriacao = Integer.compare(this.getAnoDeCriacao(), lingFavorita.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;
        
        return this.getNome().compareTo(lingFavorita.getNome());
    } 
	
}

class ComparatorAnoDeCriacaoNome implements Comparator<LingFavorita>{
	
	@Override
    public int compare(LingFavorita l1, LingFavorita l2) {   
        int anoDeCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;
        
        return l1.getNome().compareTo(l2.getNome());    
	}
	
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LingFavorita>{
	
	@Override
    public int compare(LingFavorita l1, LingFavorita l2) {
		int nome = l1.getNome().compareTo(l2.getNome());
        if (nome != 0) return nome;	
        
        int anoDeCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;
        
        return l1.getIde().compareTo(l2.getIde());    
	}
	
}
	
	