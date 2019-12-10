/**
 * GestionarPersonajeBean.java
 */
package com.hbt.semillero.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.hbt.semillero.dto.PersonajeDTO;
import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.entidad.Personaje;

/**
 * Descripcion: Clase que determina el bean para gestionar la informacion
 * de los personajes de los comics.
 * @author YINAREYES
 *
 */

public class GestionarPersonajeBean implements GestionarPersonajeLocal{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	final static Logger logger = Logger.getLogger(GestionarPersonajeBean.class);
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void crearInfoPersonaje(PersonajeDTO personajeDTO) {
		logger.debug("Se ha iniciado el metodo CrearInfoPersonaje ");
		Personaje personaje = convertirDTOEntidad(personajeDTO);
		entityManager.persist(personaje);
		logger.debug("Se ha finalizado el metodo CrearInfoPersonaje ");
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void modificarInfoPersonaje() {
		logger.debug("Se ha iniciado el metodo ModificarInfoPersonaje ");
		logger.debug("Se ha finalizado el metodo ModificarInfoPersonaje ");	
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void eliminarInfoPersonaje() {
		logger.debug("Se ha iniciado el metodo EliminarInfoPersonaje ");
		logger.debug("Se ha finalizado el metodo EliminarInfoPersonaje ");
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public List<PersonajeDTO> consultarInfoPersonaje() {
		logger.debug("Se ha iniciado el metodo ConsultarInfoPersonaje ");
		String query = "SELECT personaje" 
				+ "FROM Personaje personaje";
	
		List<Personaje> listaPersonajes = entityManager.createQuery(query).getResultList(); 
		List<PersonajeDTO> listaPersonajesDTO = new ArrayList();
		
		for (Personaje personaje : listaPersonajes) {
			listaPersonajesDTO.add(convertirEntidadDTO(personaje));
			
		}
		logger.debug("Se ha finalizado el metodo ConsultarInfoPersonaje ");
		
		return listaPersonajesDTO;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public List<PersonajeDTO> consultarInfoPersonaje(Long idComic) {
		logger.debug("Se ha iniciado el metodo ConsultarInfoPersonaje ");
		String query = "SELECT personaje" 
				+ "FROM Personaje personaje"
				+ "WHERE personaje.comic.id = :idComic";
	
		List<Personaje> listaPersonajes = entityManager.createQuery(query).setParameter("idComic", idComic)
				.getResultList(); 
		List<PersonajeDTO> listaPersonajesDTO = new ArrayList();
		
		for (Personaje personaje : listaPersonajes) {
			listaPersonajesDTO.add(convertirEntidadDTO(personaje));
			
		}
		logger.debug("Se ha finalizado el metodo ConsultarInfoPersonaje ");
		
		return listaPersonajesDTO;
	}
 
	private Personaje convertirDTOEntidad(PersonajeDTO personajeDTO) {
		Personaje personaje = new Personaje();
		personaje.setId(personajeDTO.getId());
		personaje.setNombre(personajeDTO.getNombre());
		personaje.setComic(new Comic());
		personaje.getComic().setId(personajeDTO.getIdcomic());
		personaje.setEstado(personajeDTO.getEstado());
		personaje.setSuperPoder(personajeDTO.getSuperPoder());
		
		return personaje;
	}
	
	private PersonajeDTO convertirEntidadDTO(Personaje personaje) {
		PersonajeDTO personajeDTO = new PersonajeDTO();
		personajeDTO.setId(personajeDTO.getId());
		personajeDTO.setNombre(personajeDTO.getNombre());
		personajeDTO.setIdcomic(personaje.getComic().getId());
		personajeDTO.setEstado(personajeDTO.getEstado());
		personajeDTO.setSuperPoder(personajeDTO.getSuperPoder());
		
		return personajeDTO;
	}

	
}
