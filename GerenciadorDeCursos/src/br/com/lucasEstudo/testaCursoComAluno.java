package br.com.lucasEstudo;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class testaCursoComAluno {

	public static void main(String[] args) {
		//List e uma sequencia e aceita elementos duplicados
		//set nao aceita duplicados e nao define ordem
		
		//Caso nao saber como declarar entao use collection pois e o mais generico possivel
		
		//Collection<Aluno> aluno = new List<>();//errado
		//List<Aluno> alunos = new ArrayList<>();//certo
		//List<Aluno> alunos = new Collection();//errado
		//ArrayList<Aluno> alunos = new ArrayList<>();//correto
		//Collection<Aluno> alunos = new HashSet<>();//correto
		
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira"); 
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 3472);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Alunos Modificados: ");
		javaColecoes.getAlunos().forEach((aluno) -> {
			System.out.println(aluno);
		});
		
		
		String alunoProcura = "Mauricio Aniche";
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("O a1 é equals ao Turini?");
		System.out.println(a1.equals(turini));
	}

}
