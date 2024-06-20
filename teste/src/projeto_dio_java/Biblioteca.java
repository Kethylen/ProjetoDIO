package projeto_dio_java;

public class Biblioteca { 
	public static void main (String [] args) {
		
		Livro l1 = new Livro(1,"Dom Quixote", "Miguel de Cervantes", "Editora X", false);
		Livro l2 = new Livro(2,"O Senhor dos Anéis", "J.R.R. Tolkien", "Editora Y", false);
		Livro l3 = new Livro(3,"Capitu", "Machado de Assis", "Editora Z", false);
		
		Usuario u1 = new Usuario(4,"Maria da Silva", "153.678.945-21", "Rua das Flores");
		Usuario u2 = new Usuario(5,"Felipe Campos", "765.237.856-87", "Av. Floripa");
		Usuario u3 = new Usuario(6,"Fernanda Melo", "854.236.549-09", "Rua da Reforma");
		
		l1.cadastrarLivro(); 
		l2.cadastrarLivro();  
		l3.cadastrarLivro();
		
		Livro.exibirLivrosCadastrados();
		
		l1.setEmprestado(true);
		l1.emprestarLivro();		
		
		l1.devolverLivro();
		 
		l2.excluirLivro();
		
		System.out.println("Catálogo de livros após exclusão: ");
		Livro.exibirLivrosCadastrados();
		
	    System.out.println("Alterando o nome do livro de 'Capitu' para 'Capitu e Bentinho'.");
	    l3.alterarLivro("Capitu", "Capitu e Bentinho");
	    
	    System.out.println("Catálogo de livros após a alteração: ");
	    Livro.exibirLivrosCadastrados();
		
		u1.cadastrarUsuario(); 
		u2.cadastrarUsuario();
		u3.cadastrarUsuario(); 
		 
		Usuario.exibirUsuariosCadastrados();
		 
		u2.excluirUsuario();
		
		System.out.println("Lista de usuários após exclusão: ");
		Usuario.exibirUsuariosCadastrados();
		
		System.out.println("Alterando o endereço do usuário de 'Rua da Reforma' para 'Rua Sete de Setembro'.");
	    u3.alterarUsuario("Rua da Reforma", "Rua Sete de Setembro");
	    
	    System.out.println("Lista de usuários após a alteração: ");
	    Usuario.exibirUsuariosCadastrados();
		
	}
		
}


