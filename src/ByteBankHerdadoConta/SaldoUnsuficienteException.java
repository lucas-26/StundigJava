package ByteBankHerdadoConta;

public class SaldoUnsuficienteException extends RuntimeException{
	public SaldoUnsuficienteException(String msg) {
		super(msg);
	}
}
