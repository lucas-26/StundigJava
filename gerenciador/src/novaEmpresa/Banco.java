package novaEmpresa;

import java.util.List;

public class Banco {

	public static List<Empresa> lista;
	
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresa(){
		return Banco.lista;
	}

}
