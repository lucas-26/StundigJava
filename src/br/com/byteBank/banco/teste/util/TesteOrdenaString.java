package br.com.byteBank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.byteBank.banco.modelo.Conta;
import br.com.byteBank.banco.modelo.ContaCorrente;
import br.com.byteBank.banco.modelo.ContaPoupanca;
import br.com.byteBank.banco.modelo.Titular;


public class TesteOrdenaString {
	 public static void main(String[] args) {

         Conta cc1 = new ContaCorrente(22, 33);
         Titular clienteCC1 = new Titular();
         clienteCC1.setNome("Nico");
         cc1.setTitular(clienteCC1);
         cc1.deposita(333.0);

         Conta cc2 = new ContaPoupanca(22, 44);
         Titular clienteCC2 = new Titular();
         clienteCC2.setNome("Guilherme");
         cc2.setTitular(clienteCC2);
         cc2.deposita(444.0);

         Conta cc3 = new ContaCorrente(22, 11);
         Titular clienteCC3 = new Titular();
         clienteCC3.setNome("Paulo");
         cc3.setTitular(clienteCC3);
         cc3.deposita(111.0);

         Conta cc4 = new ContaPoupanca(22, 22);
         Titular clienteCC4 = new Titular();
         clienteCC4.setNome("Ana");
         cc4.setTitular(clienteCC4);
         cc4.deposita(222.0);


         List<Conta> lista = new ArrayList<>();
         lista.add(cc1);
         lista.add(cc2);
         lista.add(cc3);
         lista.add(cc4);

         for (Conta conta : lista) {
                 System.out.println(conta);
         }

         NumeroDaCaontaComparator comparator = new NumeroDaCaontaComparator();
         
         TitularComparator compareString = new TitularComparator();
         
         lista.sort(comparator);//ordena pela conta
         
         System.out.println("---------");

         for (Conta conta : lista) {
                 System.out.println(conta);
         }
         
	 	System.out.println("---------");
	 	
	 	lista.sort(compareString);//ordena pelo nome do titular
	 		
	    for (Conta conta : lista) {
        System.out.println(conta);
        }
	    
	}
	 
}


class NumeroDaCaontaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		if(c1.getNumero() < c2.getNumero()) {
			return -1;
		}

		if(c1.getNumero() > c2.getNumero()) {
			return 1;
		}

		return 0;
	}
}

class TitularComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta o1, Conta o2) {
		String nome1 = o1.getTitular().getNome();
		String nome2 = o2.getTitular().getNome();
		return nome1.compareTo(nome1);
	}
	
}