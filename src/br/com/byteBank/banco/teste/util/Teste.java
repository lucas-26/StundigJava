package br.com.byteBank.banco.teste.util;

import java.util.ArrayList;

import br.com.byteBank.banco.modelo.*;

public class Teste {

	public static void main(String[] args) {
		
	
		 ArrayList lista = new ArrayList();

         Conta cc = new ContaCorrente(22, 11);
         lista.add(cc);

         Conta cc2 = new ContaCorrente(22, 22);
         lista.add(cc2);

         System.out.println(lista.size());
         Conta ref = (Conta) lista.get(0);
         System.out.println(ref.getNumero());

         lista.remove(0);

         System.out.println("Tamanho: " + lista.size());

         Conta cc3 = new ContaCorrente(33, 311);
         lista.add(cc3);

         Conta cc4 = new ContaCorrente(33, 322);
         lista.add(cc4);

         for(int i = 0; i < lista.size(); i++) {
             Object oRef = lista.get(i);
             System.out.println(oRef);
         }

         System.out.println("-------");

         for(Object o : lista) {
             System.out.println(o);
         }
		
	}

}
