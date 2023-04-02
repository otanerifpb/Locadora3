package iterfaces;

import model.Aluguel;

public interface Alugavel {
	public String getTitulo();
	public int getCodigoDePreco();
	public int getPontosTotaisDeAlugadorFrequente();
	public float valorDeUmAluguel(Aluguel umAluguel);
	public void setPontosTotaisDeAlugadorFrequente(int pontos);

}
