package com.spr.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.spr.demo.entidades.Usuario;
import com.spr.demo.repositorios.Repositorio;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	private Repositorio repositorio;
	
	public List<Usuario> findAll(){
		return repositorio.findAll();
		
	}
	
	public Usuario encontrarId(Long id) {
		
		Optional<Usuario> obj = repositorio.findById(id);
		return obj.get();
	}
	
	public Usuario insert(Usuario obj) {
		return repositorio.save(obj);
		
	}
	
	public void delete (Long id) {
		repositorio.deleteById(id);
	}

}
