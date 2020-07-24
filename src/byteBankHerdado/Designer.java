package byteBankHerdado;

public class Designer extends Funcionario{

	public Designer(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getbonificacao() {
		return super.getbonificacao() + 300;
	}

}
