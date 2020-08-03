package br.com.lucasEstudo;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {

	public static void main(String[] args) {
		Set<String> nomes = Collections.emptySet(); //ao criar um conjunto vazio nao e possivel inserir um dado erro -> java.lang.UnsupportedOperationException 
		nomes.add("lucas");
	}

}
