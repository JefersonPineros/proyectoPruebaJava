package com.skillex.proyecto.tienda.virtual.apirest.models.services;

import com.skillex.proyecto.tienda.virtual.apirest.models.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);
}
