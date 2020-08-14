	package novaEmpresa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NovaEmpresa")
public class NovaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();
		String nome = req.getParameter("nome");
		Empresa empresa = new Empresa();
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		out.println("<html><body> Empresa " + nome + " cadastrada com sucesso </body></html>");
	}
}
