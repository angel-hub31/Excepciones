package com.krakedev.taller.Excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeerContacto {
	private static final Logger log = LoggerFactory.getLogger(LeerContacto.class);
	
	public static void leer() {
		BufferedReader br =null;
		
		try {
			br=new BufferedReader(new FileReader("prueba.txt"));
			
			for (Object lineaObj : br.lines().toArray()) {
				System.out.println(lineaObj);
			}
			log.info("Archivos de contacto leido correctamente: ");
			
		}catch (FileNotFoundException e) {
			log.error("Error: no fue encontrado (FileNotFoundException;",e);
			
		}catch (IOException e) {
			log.error("Error general de Entrada/Salida (IOException): ", e);
			
		}finally {
			if (br != null) {
				try {
					br.close();
				}catch (IOException e) {
					log.error("Error al cerrar: ", e);
					
				}
			}
		}
	}


}
