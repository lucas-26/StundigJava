package br.com.lucasEstudo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira"); 
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));
		
		System.out.println(javaColecoes.getAulas());
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		Collections.sort(aulasImutaveis); //aqui vai dar um erro pois o m�todo compareTo da classe aula que � chamado pelo sort retorna uma lista imut�vel, sendo assim n�o � permitido efetuar o m�todo de reordena��o da lista
	     System.out.println(aulasImutaveis);
	     
	     List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
	     Collections.sort(aulasMutaveis);//Assim j� vai funcionar pois a cole��o aulasMutaveis � uma copia ent�o � possivel de ser male�vel
	     System.out.println(aulasMutaveis);
	     
	     
	     System.out.println(javaColecoes.getTempoTotal());
	     
	}

}
