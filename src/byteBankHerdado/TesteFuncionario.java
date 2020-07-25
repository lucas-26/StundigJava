package byteBankHerdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		//Funcionario func = new Funcionario("lucas","81221112312", 1310);
		Gerente func = new Gerente("lucas","81221112312", 1310);
		System.out.println(func.getNome());
		System.out.println(func.getbonificacao());
		
		Funcionario funa = new Gerente("lucas", "32334443234", 12312);

	}

}
