package com.skillex.proyecto.tienda.virtual.apirest.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.skillex.proyecto.tienda.virtual.apirest.models.entity.Cliente;
import com.skillex.proyecto.tienda.virtual.apirest.models.entity.Region;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public Cliente findById(Long id);
	
	public List<Region> findAllRegiones();
}
