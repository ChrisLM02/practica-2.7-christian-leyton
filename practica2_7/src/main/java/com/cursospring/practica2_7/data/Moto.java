package com.cursospring.practica2_7.data;

import com.cursospring.practica2_7.interfaz.CreacionFacturas;
import com.cursospring.practica2_7.interfaz.Vehiculo;


public class Moto implements Vehiculo{
	
	private CreacionFacturas facturaNueva;
	
	private String combustible;
	
	public Moto(CreacionFacturas facturaNueva) {
		this.facturaNueva = facturaNueva;
	}
	
	//Constructor default necesario para realizar ID mediante setter
	public Moto(){
		
	}

	public String getMatricula() {
		return "5678XYZ";
	}

	@Override
	public String getFactura() {
		return "Factura creada para la moto [" + getMatricula() + "]: " + facturaNueva.getFactura();
	}

	//Este setter sera el encargado de realizar la ID
	public void setFacturaNueva(CreacionFacturas facturaNueva) {
		this.facturaNueva = facturaNueva;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
}
