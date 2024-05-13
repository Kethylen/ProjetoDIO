package collections_exercicios;

/*Dadas as seguintes informações sobre meus gatos, crie uma lista e 
ordene esta lista exibindo:
(nome - idade - cor);

Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/
  
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class OrdenacaoList {
	public static void main(String[] args) {
		
		List<Gato> meusGatos = new ArrayList<>();
        meusGatos.add(new Gato("Jon", 18, "preto"));
        meusGatos.add(new Gato("Simba", 6, "tigrado"));
        meusGatos.add(new Gato("Jon", 12, "amarelo"));
		
        System.out.println(meusGatos);

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        /*System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        */
        
        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        
        System.out.println("--\tOrdem Idade\t---");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);
        
        System.out.println("--\tOrdem cor\t---");
        //Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);
        
        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        //Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
        
	}	
	
}

class Gato implements Comparable<Gato>{
	private String nome;
	private int idade;
	private String cor;
	
	public Gato(String nome, int idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getCor() {
		return cor;
	}
	
	@Override
    public String toString() {
        return nome + " - " + idade + " - " + cor;
    }
	
	@Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
	
}
	
class ComparatorIdade implements Comparator<Gato> {
	
    @Override
    public int compare(Gato g1, Gato g2) {
    	return Integer.compare(g1.getIdade(), g2.getIdade());
    }   
}
   
class ComparatorCor implements Comparator<Gato> {
	
    @Override
    public int compare(Gato g1, Gato g2) {
    	return g1.getCor().compareToIgnoreCase(g2.getCor());
    } 
}
    
class ComparatorNomeCorIdade implements Comparator<Gato> {
	
	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if(nome != 0) return nome;
		
		int cor = g1.getNome().compareToIgnoreCase(g2.getCor());
		if(cor != 0) return cor;
		
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}  
}