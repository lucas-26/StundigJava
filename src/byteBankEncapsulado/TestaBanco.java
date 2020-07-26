package byteBankEncapsulado;

public class TestaBanco {

	public static void main(String[] args) {
		Titular lucas = new Titular("Lucas", "182.199.918-13", "Desenvolvedor");
		
		Conta conta = new Conta(199, 87, 1241, lucas);
		conta.Deposita(200);
		conta.Deposita(200);
		
		
	}

}
