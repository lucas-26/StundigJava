package br.com.lucasEstudo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	
	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);// aqui quando o met�do � chamado ser� enviado uma lista "read only" n�o poder� ser alterado nem deletado nenhum valor
	}

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public void adiciona(Aula a) {
		this.aulas.add(a);
	}
	
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();//esse m�todo retorna o tempo de soma das aulas desse curso
	}
	
	  @Override
	    public String toString() {
	        return "[Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal()
	                + ", aulas: + " + this.aulas + "]";
	    }
	
//	public int getTempoTotal() { esse m�todo faz exatamente o mesmo do m�todo que est� na linha 35 tem uma implementa��o muito mais curta
//	    int tempoTotal = 0;
//	    for (Aula aula : aulas) {
//	        tempoTotal += aula.getTempo();
//	    }
//	    return tempoTotal;
//	}
}