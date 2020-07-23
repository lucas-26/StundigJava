package byteBankEncapsulado;

public class CriaConta {

	public static void main(String[] args) {
		Titular lucas = new Titular("Lucas","98112221761","dev");
		Conta conta = new Conta(199, 87, 1241, lucas); //<- intancia/ objeto 1
		conta.Deposita(200);
		System.out.println(conta.getSaldo());
		
		
		Titular pedro = new Titular("pedro","12332223123" ,"pedreiro");
		Conta conta2 = new Conta(199, 87, 1241, pedro); //<- intancia/ objeto 2 
		conta2.Deposita(400);
		System.out.println(conta2.getSaldo());

	}

}
