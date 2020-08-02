package br.com.lucasEstudo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira"); 
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		System.out.println(javaColecoes.getAulas());
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		Collections.sort(aulasImutaveis); //aqui vai dar um erro pois o método compareTo da classe aula que é chamado pelo sort retorna uma lista imutável, sendo assim não é permitido efetuar o método de reordenação da lista
	     System.out.println(aulasImutaveis);
	     
	     List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
	     Collections.sort(aulasMutaveis);//Assim já vai funcionar pois a coleção aulasMutaveis é uma copia então é possivel de ser maleável
	     System.out.println(aulasMutaveis);
	     
	     
	     System.out.println(javaColecoes.getTempoTotal());
	     
	}

}
