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
		ConverterMedidasCm converterCm = new ConverterMedidasCm();
		
		converterCm.setEntrada(Double.parseDouble(request.getParameter("entrada")));
		converterCm.setSaida(converterCm.converterCmParaPolegadas(converterCm.getEntrada()));
		
		request.setAttribute("convert", converterCm);
	    request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
