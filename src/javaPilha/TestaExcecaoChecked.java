package javaPilha;

public class TestaExcecaoChecked {
	
	public static void main(String[] args) {
		Conta c = new Conta();
		try {
			c.deposita();
		}
		catch(MyException2 e) {
			System.out.println("tratando.............");
		}
		
	}
}
