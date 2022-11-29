package it.michele;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        Writer w = resp.getWriter();
        
        w.write("<h1> PROVA </h1>");		 
        w.flush();
        w.close();
    }
	

}
