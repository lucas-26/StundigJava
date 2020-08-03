package br.com.lucasEstudo;

public class Aluno {
	
	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("nome nao pode ser null");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}
	
	@Override
	public boolean equals(Object obj) { //se for sobreescrever o metodo equals e necessario sobreescrever o hashCode
		Aluno OutroAluno = (Aluno) obj;
		return this.nome.equals(OutroAluno.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();//A classe string ja tem um metidi hashcode e eficient e confavel
	}

}
