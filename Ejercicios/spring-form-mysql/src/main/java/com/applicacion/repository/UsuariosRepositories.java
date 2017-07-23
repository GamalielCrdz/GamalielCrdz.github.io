package com.applicacion.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.applicacion.entities.Usuarios;


public interface UsuariosRepositories extends CrudRepository<Usuarios, Integer> {
	
	List<Usuarios> findById(Integer id);

}
