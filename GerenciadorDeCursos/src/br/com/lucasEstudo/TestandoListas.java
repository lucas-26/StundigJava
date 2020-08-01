package br.com.lucasEstudo;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com cursos e sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		String aulaa = aulas.get(0);
		System.out.println("A primeira aula é: " + aulaa);
		
		for(int a = 0; a < aulas.size(); a++) {
			System.out.println("aulas: " + aulas.get(a));
		}
		
		aulas.forEach((aulaj) -> 
				{ System.out.println("percorrendo Aula: " + aulaj); });
		
		Collections.sort(aulas);
	}
}
