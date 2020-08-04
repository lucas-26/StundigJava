package br.com.lucasEstudo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercicio {

	public static void main(String[] args) {
		
		Map<Integer, String> pessoas = new HashMap<>(); //hash map nao garante a ordem de insercao mas, o linkedHashMap garente essa ordem

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");
        
        Set<Integer> a = pessoas.keySet();
        
        a.forEach(pessoa -> {
        	System.out.println("Valores: " + pessoa);
        });

	}
	

}
