package br.com.byteBank.banco.teste;

import br.com.byteBank.banco.modelo.*;

public class TesteSaca {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(767, 21311);
		conta.deposita(20);
		
		try {
			conta.saca(220);
		} catch (Exception e) {
			
		}
		System.out.println(conta.getSaldo());

	}

}
