package byteBankHerdado;

public class EditorDeVideo extends Funcionario{

	public EditorDeVideo(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		
	}

	public double getBonificacao() {
		return super.getbonificacao() + 100;
	}
}
