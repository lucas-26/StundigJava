package byteBankHerdado;

public class Gerente extends Funcionario{

	private int senha;
	
	public boolean autentica(int senha){
		if(this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getbonificacaio() {
		return super.getbonificacao() + super.getSalario();
	}
	
	
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		
	}

}
