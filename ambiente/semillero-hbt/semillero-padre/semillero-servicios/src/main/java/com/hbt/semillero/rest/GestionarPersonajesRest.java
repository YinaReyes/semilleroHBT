package com.hbt.semillero.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.PersonajeDTO;
import com.hbt.semillero.ejb.GestionarPersonajeLocal;

@Path("/GestionarPersonaje")
public class GestionarPersonajesRest {
	
	@EJB 
	private GestionarPersonajeLocal gestionarPersonajeLocal;
	
	@POST
	@Path("/crear")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void crearInfoPersonaje(PersonajeDTO personajeDTO) {
		gestionarPersonajeLocal.crearInfoPersonaje(personajeDTO);
		
	}
	
	@GET
	@Path("/consultarPersonajes")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PersonajeDTO> consultarInfoPersonaje(){
		return gestionarPersonajeLocal.consultarInfoPersonaje();
	}
	
	@GET
	@Path("/consultarPersonajesPorId")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PersonajeDTO> consultarInfoPersonaje( @QueryParam("idComic") Long idComic){
		return gestionarPersonajeLocal.consultarInfoPersonaje(idComic);
	}
}
