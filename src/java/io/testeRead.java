package java.io;

public class testeRead {

	public static void main(String[] args) throws IOException	 {
		
		FileInputStream fis = new FileInputStream("teste.txt"); 
		InputStreamReader red = new InputStreamReader(fis);
		BufferedReader bus = new BufferedReader(red);
		
		String linha = bus.readLine();
		
		System.out.println(linha);
		
		bus.close();
	}

}
