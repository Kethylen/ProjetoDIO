package projeto_dio_java;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private static List<Usuario> usuariosCadastrados = new ArrayList<>();
		
	private int id;
	private String nome;
	private String cpf;
	private String endereco;
	
	public Usuario(int id, String nome, String cpf, String endereco) {
		  this.id = id;
		  this.nome = nome;
		  this.cpf = cpf;
		  this.endereco = endereco;
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

	public String getCpf() {
		return cpf;
	}

	public void setAutor(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
		  
	public void cadastrarUsuario() {
		usuariosCadastrados.add(this);
		System.out.println("O usuário " + this.nome + " foi cadastrado.");
	}
	
	public static void exibirUsuariosCadastrados() {
		if (usuariosCadastrados.isEmpty()) {
			System.out.println("Nenhum usuario cadastrado.");
		} else {
			for (Usuario usuario : usuariosCadastrados) {
				System.out.println("Exibir usuario cadastrado: " + usuario);
			}
		}
	}
    
    public void excluirUsuario() {
    	if (usuariosCadastrados.contains(this)) {
            usuariosCadastrados.remove(this);
            System.out.println("O usuário " + this.getNome() + " foi excluído.");
        } else {
            System.out.println("O usuário " + this.getNome() + " não está na lista.");
        }
    }	
    
    public void alterarUsuario(String enderecoAntigo, String enderecoNovo) {
        for (Usuario usuario : usuariosCadastrados) {
            if (usuario.getEndereco().equals(enderecoAntigo)) {
                usuario.setEndereco(enderecoNovo);
                System.out.println("O endereço do usuário foi alterado para: " + enderecoNovo + ".");
            }
        }    
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }

}
