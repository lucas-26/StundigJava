package byteBankHerdado;

public class AutenticaUtil {//Composi��o 
	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		else 
		{
		return false;
		}	
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}
