package com.spr.demo.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spr.demo.entidades.Usuario;
import com.spr.demo.services.Service;


@RestController
@RequestMapping(value = "/usuario")
public class UsuarioRecurso {
	
	@Autowired
	private Service service;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll(){
		
		List<Usuario> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}


	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> encontrarId( @PathVariable Long id){
		Usuario obj = service.encontrarId(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
