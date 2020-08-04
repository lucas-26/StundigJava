package br.com.lucasEstudo;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class TesteIterator {

	public static void main(String[] args) {
		
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");

		letras.forEach(letra -> {
		    System.out.println(letra); //usado a partir do  java 8
		});
		
		Iterator<String> a = letras.iterator();
		while (a.hasNext()) { //iterando da maneira antiga
			System.out.println(a.next());
			
		}

	}

}
