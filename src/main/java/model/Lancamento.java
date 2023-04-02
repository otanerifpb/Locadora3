package model;

import services.CodigoDePrecoEnum;

public class Lancamento extends Classificacao{

	@Override
	public int getCodigoDePreco() {
		return CodigoDePrecoEnum.LANCAMENTO.getValor();
	}

	@Override
	public double valorDeUmAluguel(Aluguel umAluguel) {
		double valorDoAluguel = 0.0;
		valorDoAluguel += umAluguel.getDiasAlugado() * 3.00;
		return valorDoAluguel;
	}

}
