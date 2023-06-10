package com.spr.demo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spr.demo.entidades.Pedido;
import com.spr.demo.entidades.Usuario;
import com.spr.demo.enuns.PedidoStatus;
import com.spr.demo.repositorios.Repositorio;
import com.spr.demo.repositorios.RepositorioPedido;



@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	
	@Autowired
	private Repositorio repositorioUsuario;
	@Autowired
	private RepositorioPedido repositorioPedido;

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com","98888888","123456"); 
		Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
	
		Pedido o1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), PedidoStatus.PAGO, u1); 
		Pedido o2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), PedidoStatus.ESPERA_PAGAMENTO,u2); 
		Pedido o3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), PedidoStatus.ESPERA_PAGAMENTO,u1); 
	
		
		repositorioUsuario.saveAll(Arrays.asList(u1,u2));
		repositorioPedido.saveAll(Arrays.asList(o1,o2,o3));
		
		
	}
	
	
	
}
