package java.io;

import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws IOException {
		
		Scanner re = new Scanner(new File("contas.csv"), "UTF-8");
		while (re.hasNext()) {
			String linha = re.nextLine();
			System.out.println(linha);
			
			Scanner linhas = new Scanner(linha);
			linhas.useLocale(Locale.US);
			linhas.useDelimiter(",");
			
			String tipoConta = linhas.next();
			int agencia = linhas.nextInt();
			int numero = linhas.nextInt();
			String titular = linhas.next();
			double saldo = linhas.nextDouble();
			
			  System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %05.2f %n", 
                      tipoConta, agencia, numero, titular, saldo);
			  
			  linhas.close();
			
			
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
			
			
			}
			re.close();
	}

}
