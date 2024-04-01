package teste;

public class DadosCadastrais {
	
	public static void main (String [] args) {
		
		int idade = 36;
		String nome = "Kéthylen";
		String sobrenome = "Benevides";
		int anoNascimento = 1987;
		double altura = 1.52;
		String corFavorita = "rosa";
		String comidaFavorita = "camarão";
		String nomeCompleto = nomeCompleto (nome, sobrenome);
		
		System.out.println (nomeCompleto);
		System.out.println (anoNascimento);
		System.out.println (idade);
		System.out.println (altura);
		System.out.println (corFavorita);
		System.out.println (comidaFavorita);
	}
		
	public static String nomeCompleto(String nome, String sobrenome) {
		return "nomeCompleto " + nome + sobrenome; 
	}
		
	public static int anoNascimento(int anoNascimento) {
		return anoNascimento; 
		}
	
	public static int idade(int idade) {
		return idade; 
	}
	
	public static double altura(double altura) {
		return altura; 
	}
	
	public static String corFavorita (String corFavorita) {
		return corFavorita; 
	}
	
	public static String comidaFavorita (String comidaFavorita) {
		return comidaFavorita; 
	}
	
}