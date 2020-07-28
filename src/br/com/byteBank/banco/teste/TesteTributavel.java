package br.com.byteBank.banco.teste;

import br.com.byteBank.banco.modelo.*;

public class TesteTributavel {

	public static void main(String[] args) {
		ContaCorrente a = new ContaCorrente(413, 6121);
		a.deposita(255);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto j = new CalculadorImposto();
		j.registra(a);
		j.registra(seguro);
		
		System.out.println(j);
	}

}
