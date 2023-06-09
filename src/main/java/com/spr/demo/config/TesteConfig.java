package com.spr.demo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spr.demo.entidades.Categoria;
import com.spr.demo.entidades.Pagamento;
import com.spr.demo.entidades.Pedido;
import com.spr.demo.entidades.PedidoItem;
import com.spr.demo.entidades.Produto;
import com.spr.demo.entidades.Usuario;
import com.spr.demo.enuns.PedidoStatus;
import com.spr.demo.repositorios.Repositorio;
import com.spr.demo.repositorios.RepositorioCategoria;
import com.spr.demo.repositorios.RepositorioPedido;
import com.spr.demo.repositorios.RepositorioPedidoItem;
import com.spr.demo.repositorios.RepositorioProduto;



@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	
	@Autowired
	private Repositorio repositorioUsuario;
	@Autowired
	private RepositorioPedido repositorioPedido;
	@Autowired
	private RepositorioCategoria repositorioCategoria;
	@Autowired
	private RepositorioProduto repositorioProduto;
	@Autowired
	private RepositorioPedidoItem repositorioPedidoItem;

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Electronicos"); 
		Categoria cat2 = new Categoria(null, "Livros"); 
		Categoria cat3 = new Categoria(null, "Computadores"); 
		
		Produto p1 = new Produto(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, ""); 
		Produto p2 = new Produto(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, ""); 
		Produto p3 = new Produto(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, ""); 
		Produto p4 = new Produto(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, ""); 
		Produto p5 = new Produto(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, ""); 
		
		repositorioCategoria.saveAllAndFlush(Arrays.asList(cat1, cat2, cat3));
		repositorioProduto.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		p1.getCategorias().add(cat2);
		p2.getCategorias().add(cat1);
		p2.getCategorias().add(cat3);
		p3.getCategorias().add(cat3);
		p4.getCategorias().add(cat3);
		p5.getCategorias().add(cat2);
		
		repositorioProduto.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		
		Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com","98888888","123456"); 
		Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
	
		Pedido o1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), PedidoStatus.PAGO, u1); 
		Pedido o2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), PedidoStatus.ESPERA_PAGAMENTO,u2); 
		Pedido o3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), PedidoStatus.ESPERA_PAGAMENTO,u1); 
	
		
		repositorioUsuario.saveAll(Arrays.asList(u1,u2));
		repositorioPedido.saveAll(Arrays.asList(o1,o2,o3));
		
		PedidoItem pi1 = new PedidoItem(o1, p1, 2, p1.getPrice()); 
		PedidoItem pi2 = new PedidoItem(o1, p3, 1, p3.getPrice()); 
		PedidoItem pi3 = new PedidoItem(o2, p3, 2, p3.getPrice()); 
		PedidoItem pi4 = new PedidoItem(o3, p5, 2, p5.getPrice()); 
		
		repositorioPedidoItem.saveAll(Arrays.asList(pi1, pi2, pi3, pi4));
		
		Pagamento pag1 = new Pagamento(null, Instant.parse("2019-06-20T17:53:07Z"), o1);
		o1.setPagamento(pag1);
		
		repositorioPedido.save(o1);
		
		
	}
	
	
	
}
