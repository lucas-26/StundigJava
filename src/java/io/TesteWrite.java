package java.io;

public class TesteWrite {

	public static void main(String[] args) throws IOException {
		
		
		OutputStream out = new FileOutputStream("teste.txt"); 
		Writer we = new  OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(we);
		
		bw.write("escrevendo uma linha no arquivo");
		bw.newLine();
		bw.newLine();
		bw.write("escrevendo novamente uma linha no arquivo");
		
		bw.close();

	}

}
