package com.spr.demo.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spr.demo.entidades.Produto;
import com.spr.demo.services.ProdutoService;


@RestController
@RequestMapping(value = "/produtos")
public class ProdutoRecurso {
	
	@Autowired
	private ProdutoService service;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll(){
		
		List<Produto> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}


	@GetMapping(value = "/{id}")
	public ResponseEntity<Produto> encontrarId( @PathVariable Long id){
		Produto obj = service.encontrarId(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
