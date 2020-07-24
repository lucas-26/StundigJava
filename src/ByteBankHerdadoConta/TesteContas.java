package ByteBankHerdadoConta;

public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 871);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(123, 9771);
		cp.deposita(7121);
		
		cc.transfere(60, cp);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		cc.saca(10);//teste
	}
}
