package byteBankEncapsulado;

public class testaMetodo {

	public static void main(String[] args) {
		Titular lucas = new Titular("Lucas","98112221761","dev");
		Conta conta = new Conta(199, 87, 1241, lucas);
		conta.Deposita(50);//isso e um metodo, porque tem um sujeito a esquerda, que seria conta
		
		conta.sacar(20);
		System.out.println(conta.getSaldo());
		
		Titular luan = new Titular("Lucas","98112221761","dev");
		Conta contadaMarcela = new Conta(199, 87, 1241, luan);
		contadaMarcela.Deposita(1000);
		contadaMarcela.transfere(300, conta);
		System.out.println(contadaMarcela.getSaldo());
	}

}
