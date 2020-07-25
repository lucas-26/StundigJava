package byteBankHerdado;

public class EditorDeVideo extends Funcionario{

	public EditorDeVideo(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		
	}

	@Override
	public double getbonificacao() {
		return super.getSalario() + 100;
	}
}
