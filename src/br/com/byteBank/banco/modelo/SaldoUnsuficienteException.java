package br.com.byteBank.banco.modelo;

public class SaldoUnsuficienteException extends RuntimeException{
	public SaldoUnsuficienteException(String msg) {
		super(msg);
	}
}
