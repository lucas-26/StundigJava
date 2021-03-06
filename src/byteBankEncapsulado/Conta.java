package byteBankEncapsulado;

public class Conta extends Object implements Comparable { //Uma classe contem atributos(Caracteristica de um objeto) e comportamentos
	
	private double saldo;
	private int agencia;
	private int numero;
	public Titular titular;
	private static int totalContas;
	
	public Conta(double saldo, int agencia, int numero, Titular titular) {
		totalContas++;
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}

	public static int getTotalContas() {
		return totalContas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void Deposita(double valor) {
		this.saldo = valor; //this se refencia a conta que esta sendo invocada na chamada do metodo
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.Deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public Titular getTitular() {
		return titular;
	}

	@Override
	public int compareTo(Object outra) {
		Conta a = (Conta) outra;
		
		return Double.compare(this.saldo, a.saldo);
	}
	
}
