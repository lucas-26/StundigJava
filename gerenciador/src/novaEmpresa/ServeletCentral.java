package novaEmpresa;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServeletCentral
 */
@WebServlet("/ServeletCentral")
public class ServeletCentral extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 String parametroAcao = request.getParameter("acao");
		 String nome = null;
		 
		  if(parametroAcao.equals("ListaEmpresas")) {
			    ListaEmpresas acao = new ListaEmpresas();
			    nome = acao.executa(request, response);
	        } else 
	        	if(parametroAcao.equals("RemoveEmpresa")) {
	        	 	RemoveEmpresaServelet acao = new RemoveEmpresaServelet();
	        	    nome = acao.executa(request, response);
	        } else 
	        	if(parametroAcao.equals("MostraEmpresa")) {
	        	MostraEmpresa acao = new MostraEmpresa();
	            nome = acao.executa(request, response);
	        } else 
	        	if (parametroAcao.equals("AlteraEmpresa")) {
		    AlteraEmpresaServelet acao = new AlteraEmpresaServelet();
		    nome = acao.executa(request, response);
	        } else 
	        	if (parametroAcao.equals("NovaEmpresa")) {
	            NovaEmpresa acao = new NovaEmpresa();
	            nome = acao.executa(request, response);
	    } 
		  String[] tipoEndereco = nome.split(":");
		  if(tipoEndereco[0].equals("forward")) {
			  RequestDispatcher rd = request.getRequestDispatcher(tipoEndereco[1]);
				rd.forward(request, response);
		  }
		  else {
			  response.sendRedirect(tipoEndereco[1]);
		  }
		 
	 }

}
