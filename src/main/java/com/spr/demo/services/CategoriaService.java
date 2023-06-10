package com.spr.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.spr.demo.entidades.Categoria;
import com.spr.demo.repositorios.RepositorioCategoria;

@org.springframework.stereotype.Service
public class CategoriaService {
	
	@Autowired
	private RepositorioCategoria repositorio;
	
	public List<Categoria> findAll(){
		return repositorio.findAll();
		
	}
	
	public Categoria encontrarId(Long id) {
		
		Optional<Categoria> obj = repositorio.findById(id);
		return obj.get();
	}

}
