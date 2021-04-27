package com.skillex.proyecto.tienda.virtual.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.skillex.proyecto.tienda.virtual.apirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
