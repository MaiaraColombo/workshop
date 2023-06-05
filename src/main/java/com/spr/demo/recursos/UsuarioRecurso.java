package com.spr.demo.recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spr.demo.entidades.Usuario;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioRecurso {
	
	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		
		Usuario u = new Usuario(1L, "Maria", "maria@exemplo", "999999", "12345");
		return ResponseEntity.ok().body(u);
		
	}

}
