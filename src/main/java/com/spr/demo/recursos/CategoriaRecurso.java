package com.spr.demo.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spr.demo.entidades.Categoria;
import com.spr.demo.services.CategoriaService;


@RestController
@RequestMapping(value = "/categorias")
public class CategoriaRecurso {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll(){
		
		List<Categoria> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}


	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> encontrarId( @PathVariable Long id){
		Categoria obj = service.encontrarId(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
