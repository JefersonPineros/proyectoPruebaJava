package com.skillex.proyecto.tienda.virtual.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillex.proyecto.tienda.virtual.apirest.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

}
