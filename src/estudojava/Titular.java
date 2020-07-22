package estudojava;

public class Titular {
	private String nome;
	private String cpf;
	private String profissao;
	
	public Titular(String Nome, String cpf, String profissao) {
		this.nome = Nome;
		this.cpf = cpf;
		this.profissao = profissao;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getProfissao() {
		return profissao;
	}
	
}
