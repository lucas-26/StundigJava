package ByteBankHerdadoConta;

public class ContaCorrente extends Conta{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean saca(double valor) {
		double valorAsacar = valor + 0.2;
		return super.saca(valorAsacar);
	}

}
