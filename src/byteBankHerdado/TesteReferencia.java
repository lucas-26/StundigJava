package byteBankHerdado;

public class TesteReferencia {
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("valdecir", "12721112123", 9111);
		
		Gerente G2 = new Gerente("valdecir", "12721112123", 9111);
		
		EditorDeVideo ev = new EditorDeVideo("valdecir", "12721112123", 9111);
		
		f1.setNome("Augusto");
		String nome = f1.getNome();
		
		((Gerente) f1).autentica(222);
		
		ControleBonificacao cont = new ControleBonificacao();
		cont.registra(G2);
		cont.registra(f1);
		cont.registra(ev);
		
		cont.getSoma();
		
	}

}
