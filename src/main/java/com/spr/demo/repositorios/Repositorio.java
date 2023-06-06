package com.spr.demo.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;

import com.spr.demo.entidades.Usuario;


public interface Repositorio extends JpaRepository<Usuario, Long>{
	

}
