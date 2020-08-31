package novaEmpresa;

import java.io.IOException;

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
		 
		  if(parametroAcao.equals("ListaEmpresas")) {
			    ListaEmpresas acao = new ListaEmpresas();
			    acao.executa(request, response);
	        } else if(parametroAcao.equals("RemoveEmpresa")) {
	        	 	RemoveEmpresa acao = new RemoveEmpresa();
	        	    acao.executa(request, response);
	        } else if(parametroAcao.equals("MostraEmpresa")) {
	        	MostraEmpresa acao = new MostraEmpresa();
	            acao.executa(request, response);
	        } else if (parametroAcao.equals("AlteraEmpresa")) {
		    AlteraEmpresaServelet acao = new AlteraEmpresaServelet();
		    acao.executa(request, response);
	        } else if (parametroAcao.equals("NovaEmpresa")) {
	            NovaEmpresa acao = new NovaEmpresa();
	            acao.executa(request, response);
	    } 
		 
	 }

}
