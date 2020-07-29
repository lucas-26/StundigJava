package br.com.byteBank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;

import br.com.byteBank.banco.modelo.*;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
	
		LinkedList<Conta> conta = new LinkedList<Conta>();
		
		 ArrayList<Conta> lista = new ArrayList<Conta>();
		 
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
