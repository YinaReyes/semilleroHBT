package com.hbt.semillero.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.hbt.semillero.dto.RolDTO;
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
	public void crearRol() {
		logger.debug("Se ha iniciado el metodo CrearRol ");
		//Rol rol = convertirDTOEntidad(rolDTO);
		//entityManager.persist(rol);
		logger.debug("Se ha finalizado el metodo CrearRol ");
	}
	
	/**
	 * Metodo que permite modificar un registro de un rol
	 * @author YINAREYES
	 */
	
	public void modificarRol() {
		logger.debug("Se ha iniciado el metodo ModificarRol ");
		logger.debug("Se ha finalizado el metodo ModificarRol ");	
	}
	
	/**
	 * Metodo que permite eliminar un registro de un rol 
	 * @author YINAREYES
	 */
	
	public void eliminarRol() {
		logger.debug("Se ha iniciado el metodo EliminarRol ");
		logger.debug("Se ha finalizado el metodo EliminarRol ");
	}
	
	/**
	 * Metodo que permite consultar un rol registrado
	 * @author YINAREYES
	 */
	public void consultarRol() {
		logger.debug("Se ha iniciado el metodo consultarRol ");
		logger.debug("Se ha finalizado el metodo consultarRol ");
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
