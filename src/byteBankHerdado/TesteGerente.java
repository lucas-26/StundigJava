package byteBankHerdado;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente h1 = new Gerente("lucas", "42223442342", 5000);
		h1.getNome();
		h1.getSalario();
		h1.getCpf();
		
		boolean a = h1.autentica(222);
			
	}

}
