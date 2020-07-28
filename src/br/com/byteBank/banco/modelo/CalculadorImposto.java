package br.com.byteBank.banco.modelo;

public class CalculadorImposto {

	public double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getValorImposto() {
		return totalImposto;
	}
}
