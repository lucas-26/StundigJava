package br.com.lucasEstudo;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	//um conjunto "set" nao aceita elementos repetidos, tem metodos para buscar e remover elementos como contains() ou remove() e um conjunto nao garante ordem de insercao
	//set e filho da interface collection
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>(); //a diferencao de um set para uma lista e que o set nao tem uma ordenaca como a lista, os valores sao inseridos de uma maneira que nao se pode  apontar qual valor sempre vai ser o primeiro ou segundo
		alunos.add("Lucas magno");
		alunos.add("Adalberto jonas");
		alunos.add("pedro joaderson");
		alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        alunos.add("Mauricio Aniche");//em um conjunto "set" nao se pode inserir valores repetidos, mesmo que esse seja a intencao
        
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
		
		System.out.println(alunos);
		
		boolean lucas = alunos.contains("Lucas magno"); //metodo contains funciona em  conjuntos
		System.out.println(lucas); 
		
		Collection<String> alunosa = new HashSet<>(); //declarando um conjunto mas de maneira mais generica usando a super class Collection
		
		List<String> alunoLista = new ArrayList<>(alunosa);
		
		Collections.sort(alunoLista);//mas se transformar um hashset em uma arraylist e possivel fazer uma ordenacao
		
		
		
				
	}

}
