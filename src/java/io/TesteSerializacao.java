package java.io;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
//		String nome = "Lucas Rocha";
//		FileOutputStream objFile = new FileOutputStream("objeto.bin");
//		ObjectOutputStream oos = new ObjectOutputStream(objFile);
//		oos.writeObject(nome);
//		oos.close();
//		
//		FileInputStream inputObj = new FileInputStream("objeto.bin");
//		ObjectInputStream ois = new ObjectInputStream(inputObj);
//		String valor = (String) ois.readObject();
//		ois.close();
//		System.out.println(valor);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Lucas Araujo da Rocha");
		cliente.setCpf("32552214512");
		cliente.setProfissao("dev");
		
		FileOutputStream objFile = new FileOutputStream("cliente.bin");
		ObjectOutputStream oos = new ObjectOutputStream(objFile);
		oos.writeObject(cliente);
		oos.close();
		System.out.println(cliente);
		
		FileInputStream readFile = new FileInputStream("cliente.bin");
		ObjectInputStream ois = new ObjectInputStream(readFile);
		Cliente clientea  = (Cliente) ois.readObject();
		ois.close();
		System.out.println(clientea.getCpf());
	}

}
