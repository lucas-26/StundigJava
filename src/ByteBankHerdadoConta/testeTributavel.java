package ByteBankHerdadoConta;

public class testeTributavel {

	public static void main(String[] args) {
		ContaCorrente a = new ContaCorrente(413, 6121);
		a.deposita(255);
		
		seguroDeVida seguro = new seguroDeVida();
		
		CalculadorImposto j = new CalculadorImposto();
		j.registra(a);
		j.registra(seguro);
		
		System.out.println(j);
	}

}
