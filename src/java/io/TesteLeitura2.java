package java.io;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws IOException {
		
		Scanner re = new Scanner(new File("contas.csv"));
		while (re.hasNext()) {
			String linha = re.nextLine();
			System.out.println(linha);
			
			Scanner linhas = new Scanner(linha);
			linhas.useLocale(Locale.US);
			linhas.useDelimiter(",");
			
			String valor1 = linhas.next();
			int valor2 = linhas.nextInt();
			int valor3 = linhas.nextInt();
			String valor4 = linhas.next();
			double valor5 = linhas.nextDouble();
			
			  System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			  
			  linhas.close();
			
			
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
			
			
			}
			re.close();
	}

}
