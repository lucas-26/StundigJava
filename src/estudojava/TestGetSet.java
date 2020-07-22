package estudojava;

public class TestGetSet {

	public static void main(String[] args) {
		Titular luan = new Titular("Lucas","98112221761","dev");
		Conta conta = new Conta(199, 87, 1241, luan);
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
		
		Titular cliente = new Titular("lucas", "78112223123", "dev");

	}

}
