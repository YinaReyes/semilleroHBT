/**
 * GestionarPersonajeBean.java
 */
package com.hbt.semillero.ejb;

import org.apache.log4j.Logger;

/**
 * Descripcion: Clase que determina el bean para gestionar la informacion
 * de los personajes de los comics.
 * @author YINAREYES
 *
 */

public class GestionarPersonajeBean implements GestionarPersonajeLocal{
	
	final static Logger logger = Logger.getLogger(GestionarPersonajeBean.class);
	
	
	
	public void CrearInfoPersonaje() {
		logger.debug("Se ha iniciado el metodo CrearInfoPersonaje ");
		logger.debug("Se ha finalizado el metodo CrearInfoPersonaje ");
	}
	
	public void ModificarInfoPersonaje() {
		logger.debug("Se ha iniciado el metodo ModificarInfoPersonaje ");
		logger.debug("Se ha finalizado el metodo ModificarInfoPersonaje ");	
	}
	
	public void EliminarInfoPersonaje() {
		logger.debug("Se ha iniciado el metodo EliminarInfoPersonaje ");
		logger.debug("Se ha finalizado el metodo EliminarInfoPersonaje ");
	}
	
	public void ConsultarInfoPersonaje() {
		logger.debug("Se ha iniciado el metodo ConsultarInfoPersonaje ");
		logger.debug("Se ha finalizado el metodo ConsultarInfoPersonaje ");
	}

}
