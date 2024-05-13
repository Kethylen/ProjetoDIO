package orientacao_objeto;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	private LocalDate data;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
	
	public Mentoria() {
	}
	 
	public LocalDate data() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	} 
	
	@Override
	public String toString( ) {
		return "Mentoria{" +
	           "titulo='" + getTitulo() + '\'' +
	           ", descricao'" + getDescricao() + '\'' +
	           ", data=" + data +
	           '}';
	}

}