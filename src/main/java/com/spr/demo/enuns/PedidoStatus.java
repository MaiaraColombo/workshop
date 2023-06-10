package com.spr.demo.enuns;

public enum PedidoStatus {
	
	ESPERA_PAGAMENTO(1),
	PAGO(2),
	ENVIADO(3),
	ENTREGUE(4),
	CANCELADO(5);
	
	private int codigo;
	
	private PedidoStatus(int code) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public static PedidoStatus valueOf(int code) {
		for (PedidoStatus value: PedidoStatus.values()) {
			if (value.getCodigo() == code) {
				return value;
			}
		}
		
		throw new IllegalArgumentException("Inválido PedidoStatus");
	}
	
}
