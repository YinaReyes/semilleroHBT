package com.hbt.semillero.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.hbt.semillero.dto.PersonajeDTO;
import com.hbt.semillero.dto.RolDTO;
import com.hbt.semillero.entidad.Personaje;
import com.hbt.semillero.entidad.Rol;

/**
 * Descripcion: Clase que determina el bean para gestionar la informacion
 * del rol de los personajes de los comics.
 * @author YINAREYES
 *
 */


public class GestionarRolBean implements IGestionarRolLocal {
	
	final static Logger logger = Logger.getLogger(GestionarRolBean.class);
	
	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * Metodo que permite crear un Rol
	 * @author YINAREYES
	 */
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void crearRol(RolDTO rolDTO) {
		logger.debug("Se ha iniciado el metodo CrearRol ");
		Rol rol = convertirDTOEntidad(rolDTO);
		entityManager.persist(rol);
		logger.debug("Se ha finalizado el metodo CrearRol ");
	}
	
	/**
	 * Metodo que permite modificar un registro de un rol
	 * @author YINAREYES
	 */
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void modificarRol() {
		logger.debug("Se ha iniciado el metodo ModificarRol ");
		logger.debug("Se ha finalizado el metodo ModificarRol ");	
	}
	
	/**
	 * Metodo que permite eliminar un registro de un rol 
	 * @author YINAREYES
	 */
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void eliminarRol() {
		logger.debug("Se ha iniciado el metodo EliminarRol ");
		logger.debug("Se ha finalizado el metodo EliminarRol ");
	}
	
	/**
	 * Metodo que permite consultar un rol registrado
	 * @author YINAREYES
	 */
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public List <RolDTO> consultarRol() {
		logger.debug("Se ha iniciado el metodo consultarRol ");
		String query = "SELECT rol" 
				+ "FROM Rol rol";
	
		List<Rol> listaRoles = entityManager.createQuery(query).getResultList(); 
		List<RolDTO> listaRolesDTO = new ArrayList();
		
		for (Rol rol : listaRoles) {
			listaRolesDTO.add(convertirEntidadDTO(rol));
			
		}
		logger.debug("Se ha finalizado el metodo consultarRol ");
		
		return listaRolesDTO;
	}
	
	/**
	 * Metodo que permite convertir un rolDTO a rol
	 * @author YINAREYES
	 */
	
	private Rol convertirDTOEntidad(RolDTO rolDTO) {
		Rol rol = new Rol();
		rol.setId(rolDTO.getId());
		rol.setNombre(rolDTO.getNombre());
		rol.setEstado(rolDTO.getEstado());
		
		return rol;
	}
	
	/**
	 * Metodo que permite convertir un rol en un rolDTO
	 * @author YINAREYES
	 */
	
	private RolDTO convertirEntidadDTO(Rol rol) {
		RolDTO rolDTO = new RolDTO();
		rolDTO.setId(rol.getId());
		rolDTO.setNombre(rol.getNombre());
		rolDTO.setEstado(rol.getEstado());
		
		return rolDTO;
	}

}
