package model;

public class Online extends Classificacao{

	@Override
	public int getCodigoDePreco() {
		return Jogo.ONLINE;
	}

	@Override
	public double valorDeUmAluguel(Aluguel umAluguel) {
		double valorDoAluguel = 0.0;
		valorDoAluguel += 4.0;

		if(umAluguel.getDiasAlugado() > 3) {
			valorDoAluguel += (umAluguel.getDiasAlugado() - 3) * 3.0;
		}
	
   	return valorDoAluguel;
	}
	

}
