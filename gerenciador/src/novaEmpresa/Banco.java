package novaEmpresa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	public static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa1 = new Empresa();
		empresa1.setId(chaveSequencial++);
		empresa1.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		empresa2.setId(chaveSequencial++);
		lista.add(empresa1);
		lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresa(){
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
		}
//		
//		for(Empresa empresa	: lista) {
//			if(empresa.getId() == id) {
//				lista.remove(empresa);
//			}
//		}
		
	}

	public Empresa buscaEmpresapeloId(Integer id) {
		for (Empresa empresa : lista) {
			 if(empresa.getId() == id) {
				 return empresa;
			 }
		}
		return null;
	}

}
