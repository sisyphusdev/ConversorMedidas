package com.sisyphus.conversorMedidas.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sisyphus.conversorMedidas.model.ConverterMedidasCm;

/**
 * Servlet implementation class FormularioServlet
 */
@WebServlet("/Resposta")
public class FormularioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ConverterMedidasCm convert = new ConverterMedidasCm();
		String ent = request.getParameter("entrada");
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><title>Resposta do Servidor</title></head><body>");
		out.print("<h1>"+convert.converterCmParaPolegadas(Double.parseDouble(ent))+"</h1>");
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
