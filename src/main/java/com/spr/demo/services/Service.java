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
	
	public Usuario atualizar(Long id, Usuario obj) {
		Usuario entity = repositorio.getReferenceById(id);
		atualizarDados(entity, obj);
		return repositorio.save(entity);
	}

	private void atualizarDados(Usuario entity, Usuario obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}

}
