package com.hbt.semillero.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.RolDTO;
import com.hbt.semillero.ejb.IGestionarRolLocal;

public class GestionarRolRest {
	
	@EJB 
	private IGestionarRolLocal gestionarRolLocal;
	
	@POST
	@Path("/crear")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void crearRol(RolDTO rolDTO) {
		gestionarRolLocal.crearRol(rolDTO);
		
	}
	
	@GET
	@Path("/consultarRol")
	@Produces(MediaType.APPLICATION_JSON)
	public List<RolDTO> consultarInfoPersonaje(){
		return gestionarRolLocal.consultarRol();
	}

}
