package javaPilha;

public class TesteConexao {
	public static void main(String[] args) {
	
		try(Conexao ca = new Conexao()){
			ca.leDados();
		}catch (IllegalStateException e) {
			System.out.println("Deu erro na conexao");
		}
//		Conexao con = null;
//	    try {
//	        con = new Conexao();
//	        con.leDados();
//	    } catch(IllegalStateException ex) {
//	        System.out.println("Deu erro na conexao");
//	    } finally {
//	        System.out.println("finally");
//	        if(con != null) {
//	            con.fecha();
//	        }
//	}
	}
}
