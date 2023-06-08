package com.spr.demo.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;

import com.spr.demo.entidades.Pedido;


public interface RepositorioPedido extends JpaRepository<Pedido, Long>{
	

}
