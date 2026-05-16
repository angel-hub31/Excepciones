package com.krakedev.taller.Excepciones;



import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuardarContacto {
	private static final Logger log = LoggerFactory.getLogger(GuardarContacto.class);
	
	public static void guardar(String nombre,String apellido,String telefono) {
		FileWriter escritor =null;
		
		try {
			escritor=new FileWriter("contactos.txt",true);
			
			escritor.write(nombre +"\n");
			escritor.write(apellido +"\n");
            escritor.write(telefono +" \n");
            
            log.info("Contacto guardado exitosamente: {} {}", nombre, apellido);
			
		}catch(IOException e) {
			log.error("Error al intentar guardar el contacto: ", e);
		}finally {
			if (escritor !=null) {
				try {
					escritor.close();
				}catch(IOException e) {
					log.error("Error: ",e);
				}
			}
		}
	}
}
