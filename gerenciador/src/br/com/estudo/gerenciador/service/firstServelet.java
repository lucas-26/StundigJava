package br.com.estudo.gerenciador.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/oi")
public class firstServelet extends HttpServlet{

	 @Override
	    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
	        
		 	PrintWriter out = resp.getWriter();
		 	out.println("<html>");
		 	out.println("<body>");
		 	out.println("Primeiro Servelet do arquivo FirstServelet");
		 	out.println("</body>");
		 	out.println("</html>");
		 	
		 	
		 
	    }

}
