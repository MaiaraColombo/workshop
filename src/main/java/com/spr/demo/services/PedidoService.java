package com.spr.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.spr.demo.entidades.Pedido;
import com.spr.demo.repositorios.RepositorioPedido;

@org.springframework.stereotype.Service
public class PedidoService {
	
	@Autowired
	private RepositorioPedido repositorio;
	
	public List<Pedido> findAll(){
		return repositorio.findAll();
		
	}
	
	public Pedido encontrarId(Long id) {
		
		Optional<Pedido> obj = repositorio.findById(id);
		return obj.get();
	}

}
