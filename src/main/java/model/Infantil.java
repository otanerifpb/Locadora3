package model;

import services.CodigoDePrecoEnum;

public class Infantil extends Classificacao {
	
	@Override
	public int getCodigoDePreco() {
		return CodigoDePrecoEnum.INFANTIL.getValor();
	}

	@Override
	public double valorDeUmAluguel(Aluguel umAluguel) {
		double valorDoAluguel = 0.0;
		valorDoAluguel+= 1.5;

		if(umAluguel.getDiasAlugado() > 3) {
			valorDoAluguel += (umAluguel.getDiasAlugado() - 3) * 1.5;
		}
	
   	return valorDoAluguel;
	}

}
