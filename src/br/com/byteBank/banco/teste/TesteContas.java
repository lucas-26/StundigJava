package br.com.byteBank.banco.teste;

import br.com.byteBank.banco.modelo.*;

public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 871);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(123, 9771);
		cp.deposita(7121);
		try {
			cc.transfere(60, cp);
		}
		catch (Exception e) {
			
		}
		
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		try {
			cc.saca(10);
		}
		catch (Exception e) {
			
		}
		
	}
}
