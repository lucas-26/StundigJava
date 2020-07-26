package byteBankEncapsulado;

public class TesteReferencias {
	public static void main(String[] args) {
		Titular luan = new Titular("Lucas","98112221761","dev");
		Conta primeiraConta = new Conta(199, 87, 1241, luan);// referencia apontando para um tipo conta
		primeiraConta.Deposita(300);
		
		Conta segundaConta = primeiraConta; // as duas variaveis apontam para a mesmo objeto
		System.out.println(primeiraConta);
	}

}
