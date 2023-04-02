package services;

public enum CodigoDePrecoEnum {
	NORMAL(0),	
	LANCAMENTO(1),
	INFANTIL(2),
	ONLINE(2);
	
	private final int valor;
	private CodigoDePrecoEnum(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}

}
