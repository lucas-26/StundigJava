package br.com.byteBank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		int[] idades = new int[5];  //existem arrays de primitivos e arrays de referencias de objetos
		String[] nomes = new String[5];
		
		List numeros = new ArrayList();
		
		int idade = 29;//aqui o java transforma esse tipo primitivo em uma referencia do tipo Integer e insere na lista
		numeros.add(idades);
		List<String> a = new ArrayList<>(); //o que está entre o sinal de <> é um generics, assim que uma lista é tipada e nesse generics só se pode colocar referencia e não primitivos
		numeros.add(29);//isso é chamado de autoboxing ou seja, tranformar um tipo primitivo em um tipo de referncia para inserir na lista. 
	}

}
