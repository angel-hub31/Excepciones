package com.krakedev.taller.Excepciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLeerArchivo {
	
	private static final Logger log = LoggerFactory.getLogger(TestLeerArchivo.class);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println("------------ERROR PROVOCADO-------------");

		log.info("--- Iniciando Prueba 2 (Telefono Valido) ---");
        ejecutarFlujo("Maria", "Gomez", "0981234567");
        

	}
	private static void ejecutarFlujo(String nombre, String apellido, String telefono) {
		try {
			ValidarContacto.validarTelefono(telefono);

			GuardarContacto.guardar(nombre, apellido, telefono);
			LeerContacto.leer();

			log.info("Proceso exitoso");
		} catch (IllegalArgumentException e) {
			log.error("Validación fallida - El telefono es invalido: {}", e.getMessage());
		}
	}

}
