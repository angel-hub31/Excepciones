package com.krakedev.taller.Excepciones;

public class ValidarContacto {
	
	public static void validarTelefono(String telefono) throws IllegalArgumentException{
		if (telefono == null || telefono.length() !=10) {
			throw new IllegalArgumentException("El número de teléfono debe tener exactamente 10 dígitos");
		}
	}

}
