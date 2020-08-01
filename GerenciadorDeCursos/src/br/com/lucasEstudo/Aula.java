package br.com.lucasEstudo;

public class Aula implements Comparable<Aula>{
	private String titulo;
	private int tempo;
	
	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	@Override
	public String toString() {
		return "Aula: " + this.titulo + "," + this.tempo + " Minutos";  
	}

	@Override
	public int compareTo(Aula o) {
		return this.titulo.compareTo(o.titulo);
	}
	
}
