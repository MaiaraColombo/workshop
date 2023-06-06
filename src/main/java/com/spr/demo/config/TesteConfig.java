package com.spr.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spr.demo.entidades.Usuario;
import com.spr.demo.recursos.UsuarioRecurso;
import com.spr.demo.repositorios.Repositorio;



@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	
	@Autowired
	private Repositorio userRepository;

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com","98888888","123456"); 
		Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
	
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
	
}
