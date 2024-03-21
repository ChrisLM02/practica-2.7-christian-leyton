package com.cursospring.practica2_7.data;

import com.cursospring.practica2_7.interfaz.CreacionFacturas;
import com.cursospring.practica2_7.interfaz.Vehiculo;


public class Coche implements Vehiculo{
	
	private CreacionFacturas facturaNueva;
	
	public Coche(CreacionFacturas facturaNueva) {
		this.facturaNueva = facturaNueva;
	}

	public String getMatricula() {
		return "1234ABC";
	}

	@Override
	public String getFactura() {
		return "Factura creada para el coche [" + getMatricula() + "]: " + facturaNueva.getFactura();
	}

	//Este setter sera el encargado de realizar la ID
	public void setFacturaNueva(CreacionFacturas facturaNueva) {
		this.facturaNueva = facturaNueva;
	}
}
