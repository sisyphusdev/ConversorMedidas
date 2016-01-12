package com.sisyphus.conversorMedidas.model;

public class ConverterMedidasCm {
	private double entrada;
	private double saida;
	
	public double getEntrada() {
		return entrada;
	}
	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}
	public double getSaida() {
		return saida;
	}
	public void setSaida(double saida) {
		this.saida = saida;
	}
	
	public double converterCmParaPolegadas(double entrada) {
		return entrada * 2.54;
	}

}
