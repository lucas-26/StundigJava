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
	

}
