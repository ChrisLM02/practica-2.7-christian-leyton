package com.cursospring.practica2_7.data;

import com.cursospring.practica2_7.interfaz.CreacionFacturas;


public class Factura implements CreacionFacturas {

	@Override
	public String getFactura() {
		return "Esta es la factura nºX";
	}
}
