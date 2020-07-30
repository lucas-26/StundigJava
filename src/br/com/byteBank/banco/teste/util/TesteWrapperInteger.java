package br.com.byteBank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		int[] idades = new int[5];  //existem arrays de primitivos e arrays de referencias de objetos
		String[] nomes = new String[5];
		
		List numeros = new ArrayList();
		
		int idade = 29;//aqui o java transforma esse tipo primitivo em uma referencia do tipo Integer e insere na lista
		numeros.add(idades);
		List<String> a = new ArrayList<>(); //o que est� entre o sinal de <> � um generics, assim que uma lista � tipada e nesse generics s� se pode colocar referencia e n�o primitivos
		numeros.add(29);//isso � chamado de autoboxing ou seja, tranformar um tipo primitivo em um tipo de referncia para inserir na lista.
		
		int s = 29;
		Integer p = new Integer(s); //assim, transformando um primitivo int em uma referencia do tipo integer � chamdo autoboxing e a opera��o contraria � chamada unboxing
		Integer r = Integer.valueOf(22);//autoboxing
		int val = r.intValue();//unboxing
	}

}
