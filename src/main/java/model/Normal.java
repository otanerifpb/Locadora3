package model;

import services.CodigoDePrecoEnum;

public class Normal extends Classificacao{

	@Override
	public int getCodigoDePreco() {
		return CodigoDePrecoEnum.NORMAL.getValor();
	}

	@Override
	public double valorDeUmAluguel(Aluguel umAluguel) {
		double valorDoAluguel = 0.0;
		valorDoAluguel += 2.0;
		if(umAluguel.getDiasAlugado() > 2) {
			valorDoAluguel += (umAluguel.getDiasAlugado() - 2) * 1.5;
		}
		return valorDoAluguel;
	}

}
