package byteBankHerdado;

public class Cliente implements Autenticar{
	
	private AutenticaUtil aut;
	 
	public Cliente() {
		this.aut = new AutenticaUtil();
	}
	
	

	@Override
	public boolean autentica(int param) {
		boolean a = aut.autentica(param);
		return a;
	}



	@Override
	public void setSenha(int param) {
		aut.setSenha(param);
		}
}
