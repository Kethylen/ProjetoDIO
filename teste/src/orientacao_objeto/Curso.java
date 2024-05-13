package orientacao_objeto;

import java.time.LocalDate;

public class Curso extends Conteudo{
	
	int cargaHoraria;
	
	public Curso() {
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO + cargaHoraria;
	}
	
	public int cargaHoraria() {
		return cargaHoraria;
	}
	
	public void setcargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	} 
	
	@Override
	public String toString( ) {
		return "Curso{" +
	           "titulo='" + getTitulo() + '\'' +
	           ", descricao'" + getDescricao() + '\'' +
	           ", cargaHoraria=" + cargaHoraria +
	           '}';
	}
	
}

