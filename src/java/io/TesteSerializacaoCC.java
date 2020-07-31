package java.io;

import br.com.byteBank.banco.modelo.ContaCorrente;
import br.com.byteBank.banco.modelo.Titular;

public class TesteSerializacaoCC {

	public static void main(String[] args) throws IOException {
		
		Titular titular = new Titular();
		titular.setNome("Lucas Araujo da Rocha");
		titular.setCpf("32552214512");
		titular.setProfissao("dev");
		
		ContaCorrente cc = new ContaCorrente(222, 484);
		cc.setTitular(titular);
		cc.deposita(2222);
		
		FileOutputStream objFile = new FileOutputStream("cc.bin");
		ObjectOutputStream oos = new ObjectOutputStream(objFile);
		oos.writeObject(cc);
		oos.close();
		}

}
