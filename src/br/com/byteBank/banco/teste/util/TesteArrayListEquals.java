package br.com.byteBank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

import br.com.byteBank.banco.modelo.*;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		Collection<Conta> list = new ArrayList<Conta>(); 
		
		Vector<Conta> a = new Vector<Conta>(); // o vector é thread saveou seja, pode ser manipulado atráves de várias pilhas de chamadas. 
	
		LinkedList<Conta> conta = new LinkedList<Conta>();//linked list deve ser utilizado quando é necessário apagar valores no meio dessa lista várias vezes
		
		 ArrayList<Conta> lista = new ArrayList<Conta>();//Array list deve ser usado quando não se sabe quantos posições vão ser usadas
		 
		 ArrayList<String> nomes = new ArrayList<String>();

         Conta cc = new ContaCorrente(22, 11);
         lista.add(cc);

         Conta cc2 = new ContaCorrente(22, 22);
         lista.add(cc2);
 
         boolean exists = lista.contains(cc2);
         
         System.out.println("-------");

         for(Object o : lista) {
             System.out.println(o);
         }
		
	}

}
