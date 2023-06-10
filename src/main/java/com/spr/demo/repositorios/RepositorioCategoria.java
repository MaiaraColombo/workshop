package com.spr.demo.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;

import com.spr.demo.entidades.Categoria;


public interface RepositorioCategoria extends JpaRepository<Categoria, Long>{
	

}
