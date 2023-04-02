package model;

public abstract class Classificacao {
	public abstract int getCodigoDePreco();
	public abstract double valorDeUmAluguel(Aluguel umAluguel);
	public static int getPontosTotaisDeAlugadorFrequente() {
		return 1;
	}

}
