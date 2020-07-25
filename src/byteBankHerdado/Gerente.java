package byteBankHerdado;

public class Gerente extends Funcionario implements Autenticar{

	private int senha;
	private AutenticaUtil aut;
	
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.aut = new AutenticaUtil();
	}
	
	@Override
	public double getbonificacao() {
		 double valor = super.getSalario();
		 return valor;
		 }

	@Override
	public boolean autentica(int param) {
		return this.aut.autentica(param);
	}

	@Override
	public void setSenha(int param) {
		this.aut.setSenha(param);
	}

 

}
