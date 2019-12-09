package com.hbt.semillero.ejb;

import java.util.List;

import com.hbt.semillero.dto.PersonajeDTO;

public interface GestionarPersonajeLocal {
	
	public void crearInfoPersonaje(PersonajeDTO personajeDTO);
	
	public void modificarInfoPersonaje();
	
	public void eliminarInfoPersonaje();
	
	public List<PersonajeDTO> consultarInfoPersonaje();
	
	public List<PersonajeDTO> consultarInfoPersonaje(Long idComic);

}
