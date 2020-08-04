 package br.com.lucasEstudo;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Set<Aluno> alunoas = new LinkedHashSet<>();//diferente do hash set esse objeto retorna o conjunto respeitando a ordem de insercao dos elementos.
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	
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

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno); //cadastrando um novo aluno 
		//Em um Hash map usamos put para inserir uma valor como o add em collection
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);//fazendo referencia do numero matricula e do aluno usando um hash map pois e mais performatico
		
	}
	
	public Map<Integer, Aluno> getMatriculaParaAluno() {
		return matriculaParaAluno;
	}

	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(this.alunos);
	}
//	public int getTempoTotal() { esse m�todo faz exatamente o mesmo do m�todo que est� na linha 35 tem uma implementa��o muito mais curta
//	    int tempoTotal = 0;
//	    for (Aula aula : aulas) {
//	        tempoTotal += aula.getTempo();
//	    }
//	    return tempoTotal;
//	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
//		for (Aluno aluno : alunoas) {
//			if(aluno.getNumeroMatricula() == numero) {
//				return aluno;
//			}
//		}
//		throw new NoSuchElementException("matricula " + numero + "nao encontrado");
		return this.matriculaParaAluno.get(numero);
		}
}
