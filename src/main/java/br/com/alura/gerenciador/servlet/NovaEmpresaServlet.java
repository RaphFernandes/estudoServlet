package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		
		String nomeEmpresa = request.getParameter("nomeEmpresa");
		String dataAbertura = request.getParameter("dataAbertura");
		
		Date dtAberturaFormatada = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			 dtAberturaFormatada = sdf.parse(dataAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
			
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dtAberturaFormatada);
		
		Banco banco = new Banco();
		
		banco.adiciona(empresa);
		
		response.sendRedirect("listaEmpresas");
	
		request.setAttribute("empresa", empresa.getNome());

		
	}

}
