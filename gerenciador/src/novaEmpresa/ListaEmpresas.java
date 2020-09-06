package novaEmpresa;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListaEmpresas {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresa();
		
		request.setAttribute("empresas", lista);
		RequestDispatcher rd = request.getRequestDispatcher("/ListaNovaEmpresa.jsp");
		rd.forward(request, response);
		
		return "ListaEmpresas.jsp";
	}

}
