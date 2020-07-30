package java.io;

public class testeReadSimplificado {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("teste2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("akjdfkjaskdfjkasdfljaksdfjlsajdkfjaskdfhsaçdf");
		bw.newLine();
		bw.newLine();
		bw.write("askdfhjaskdfhsajfhsa");
		
		bw.close();
	}

}
