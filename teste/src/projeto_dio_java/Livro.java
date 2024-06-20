package projeto_dio_java;

import java.util.ArrayList;
import java.util.List;

public class Livro {
	
	private static List<Livro> livrosCadastrados = new ArrayList<>();
	private static List<Livro> livrosEmprestados = new ArrayList<>();
	
	private int id;
	private String nome;
	private String autor;
	private String editora;
	private boolean emprestado;
		
	public Livro(int id, String nome, String autor, String editora, boolean emprestado) {
		this.id = id;
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.emprestado = emprestado;
		}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public boolean getEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
		  
	public void cadastrarLivro() {
		livrosCadastrados.add(this);
		System.out.println("O livro " + this.nome + " foi cadastrado.");
	}
	 
	public static void exibirLivrosCadastrados() {
		if (livrosCadastrados.isEmpty()) {
			System.out.println("Nenhum livro cadastrado.");
		} else {
			for (Livro livro : livrosCadastrados) {
				System.out.println("Exibir livro cadastrado: " + livro);
			}
		}
	}  
    
    public void emprestarLivro() {
        if (this.getEmprestado()) {
            livrosEmprestados.add(this); 
            this.setEmprestado(false);
            System.out.println("O livro " + this.getNome() + " foi emprestado.");
        }
    }
    
    public void devolverLivro() {
        if (livrosEmprestados.contains(this)) {
            livrosEmprestados.remove(this);
            this.setEmprestado(true);
            System.out.println("O livro " + this.getNome() + " foi devolvido.");
        } else {
            System.out.println("Este livro não foi devolvido.");
        }
    }
    
    public void excluirLivro() {
        if (livrosCadastrados.contains(this)) {
            livrosCadastrados.remove(this);
            System.out.println("O livro " + this.getNome() + " foi excluído.");
        } else {
            System.out.println("O livro " + this.getNome() + " não está no catálogo.");
        }
    }
    
    public void alterarLivro(String nomeAntigo, String nomeNovo) {
        for (Livro livro : livrosCadastrados) {
            if (livro.getNome().equals(nomeAntigo)) {
                livro.setNome(nomeNovo);
                System.out.println("O nome do livro foi alterado para: " + nomeNovo + ".");
            }
        }    
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", emprestado=" + (emprestado ? "Sim" : "Não") +
                '}';
    }

}
