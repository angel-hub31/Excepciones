package com.krakedev.taller.Excepciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

	private static final Logger log = LoggerFactory.getLogger(Test.class);

	public static void main(String[] args) {
		//telefono invalido
		System.out.println();
		System.out.println("------------Prueba 1-------------");
		System.out.println();
		log.info("Prueba 1: ");
		ejecutarFlujo("Maria","Gomez","123");

		System.out.println("------------");
		
		//telefono valido
		System.out.println();
		System.out.println("------------Prueba 2-------------");

		log.info("--- Iniciando Prueba 2 (Teléfono Válido) ---");
        ejecutarFlujo("Maria", "Gomez", "0981234567");
        
      
        
	}

	private static void ejecutarFlujo(String nombre, String apellido, String telefono) {
		try {
			ValidarContacto.validarTelefono(telefono);

			GuardarContacto.guardar(nombre, apellido, telefono);
			LeerContacto.leer();

			log.info("Proceso exitoso");
		} catch (IllegalArgumentException e) {
			log.error("Validación fallida - El teléfono es inválido: {}", e.getMessage());
		}

	}
}
