package com.spr.demo.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;

import com.spr.demo.entidades.PedidoItem;
import com.spr.demo.entidades.pk.PedidoItemPk;


public interface RepositorioPedidoItem extends JpaRepository<PedidoItem, PedidoItemPk>{
	

}
