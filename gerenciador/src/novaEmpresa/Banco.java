package novaEmpresa;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	public static List<Empresa> lista = new ArrayList<>();
	
	static {
		
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		lista.add(empresa1);
		lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresa(){
		return Banco.lista;
	}

}
