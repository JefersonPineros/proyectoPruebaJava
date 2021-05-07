package com.skillex.proyecto.tienda.virtual.apirest.models.services;

import java.util.List;

import com.skillex.proyecto.tienda.virtual.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public Cliente findById(Long id);
}
