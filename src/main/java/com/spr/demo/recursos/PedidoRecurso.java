package com.spr.demo.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spr.demo.entidades.Pedido;
import com.spr.demo.services.PedidoService;


@RestController
@RequestMapping(value = "/pedido")
public class PedidoRecurso {
	
	@Autowired
	private PedidoService service;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> findAll(){
		
		List<Pedido> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}


	@GetMapping(value = "/{id}")
	public ResponseEntity<Pedido> encontrarId( @PathVariable Long id){
		Pedido obj = service.encontrarId(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
