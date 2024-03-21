package com.cursospring.practica2_7.main;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cursospring.practica2_7.data.Moto;
import com.cursospring.practica2_7.interfaz.Vehiculo;


public class UsoVehiculo {
	
	//Uso del Logger por recomendacion de Sonar
	private static final Logger logger = Logger.getLogger(UsoVehiculo.class.getName());
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Recomendacion de Sonar [FordMustang -> fordMustang / YamahaR1 -> yamahaR1]
		Vehiculo fordMustang = contexto.getBean("miVehiculo", Vehiculo.class);
		
		Moto yamahaR1 = (Moto) contexto.getBean("miVehiculoMoto", Vehiculo.class);
		
		logger.info(fordMustang.getMatricula());
		logger.info(fordMustang.getFactura());
		
		logger.info(yamahaR1.getMatricula());
		logger.info(yamahaR1.getFactura());
		
		//Para obtener el dato inyectado directamente desde nuestro bean,
		//debemos cambiar el tipo de objeto al que hace referencia "yamahaR1" [Vehiculo -> Moto]
		logger.info(yamahaR1.getCombustible());
		
		contexto.close();
	}
}
