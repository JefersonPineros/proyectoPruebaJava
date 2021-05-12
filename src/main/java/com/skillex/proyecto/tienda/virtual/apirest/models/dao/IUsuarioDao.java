package com.skillex.proyecto.tienda.virtual.apirest.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.skillex.proyecto.tienda.virtual.apirest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	/*
	 * Ejemplo 1
	 *	public Usuario findByUsername(String username);
	 * */
	
	@Query("Select u from Usuario u where u.username=?1")
	public Usuario findByUsername(String username);
}
