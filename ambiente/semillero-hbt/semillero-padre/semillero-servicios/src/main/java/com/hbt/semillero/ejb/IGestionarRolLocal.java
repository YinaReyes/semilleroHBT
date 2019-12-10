package com.hbt.semillero.ejb;

import java.util.List;

import com.hbt.semillero.dto.RolDTO;

public interface IGestionarRolLocal {
	
	public void crearRol(RolDTO rolDTO);
	
	public void modificarRol(); 
	
	public void eliminarRol();
	
	public List<RolDTO> consultarRol(); 

}
