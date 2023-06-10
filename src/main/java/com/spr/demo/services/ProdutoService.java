package com.spr.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.spr.demo.entidades.Produto;
import com.spr.demo.repositorios.RepositorioProduto;

@org.springframework.stereotype.Service
public class ProdutoService {
	
	@Autowired
	private RepositorioProduto repositorio;
	
	public List<Produto> findAll(){
		return repositorio.findAll();
		
	}
	
	public Produto encontrarId(Long id) {
		
		Optional<Produto> obj = repositorio.findById(id);
		return obj.get();
	}

}
