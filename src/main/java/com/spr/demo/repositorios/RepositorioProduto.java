package com.spr.demo.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;

import com.spr.demo.entidades.Produto;


public interface RepositorioProduto extends JpaRepository<Produto, Long>{
	

}
