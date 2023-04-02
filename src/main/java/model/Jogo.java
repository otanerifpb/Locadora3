package model;

import iterfaces.Alugavel;
import services.CodigoDePrecoEnum;

public class Jogo implements Alugavel  {
	  public static final int NORMAL = CodigoDePrecoEnum.NORMAL.ordinal();
	  public static final int LANCAMENTO = CodigoDePrecoEnum.LANCAMENTO.getValor();
	  public static final int ONLINE = CodigoDePrecoEnum.ONLINE.getValor();
      private Online online = new Online();
      private Normal normal = new Normal();
      private Lancamento lancamento = new Lancamento();
	  private String titulo;
	  private String console;
	  private int codigoDePreco;
	  private int pontosTotaisDeAlugadorFrequente;
	  
	  public Jogo(String titulo, String console, int codigoDePreco) {
	    this.titulo = titulo;
	    this.codigoDePreco = codigoDePreco;
	    this.setConsole(console);
	  }
	  
	  public int getPontosTotaisDeAlugadorFrequente() {
			return pontosTotaisDeAlugadorFrequente;
	  }

	  public void setPontosTotaisDeAlugadorFrequente(int pontosTotaisDeAlugadorFrequente) {
			this.pontosTotaisDeAlugadorFrequente = pontosTotaisDeAlugadorFrequente;
	  }
	 
	  public String getTitulo() {
	    return titulo;
	  }
	  
	  public String getConsole() {
		    return console;
	  }
	  
	  public void setConsole(String console) {
			this.console = console;
	  }
	 
	  public int getCodigoDePreco() {
	    return codigoDePreco;
	  }
	 
	  public void setCodigoDePreco(int códigoDePreço) {
	    this.codigoDePreco = códigoDePreço;
	  }
	  
	  
	  public Online getOnline() {
		return online;
	 }

	 public void setOnline(Online online) {
		this.online = online;
	 }
  
	
	public Normal getNormal() {
		return normal;
	}

	public void setNormal(Normal normal) {
		this.normal = normal;
	}

	public Lancamento getLancamento() {
		return lancamento;
	}

	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}
	
	public float valorDeUmAluguel(Aluguel umAluguel) {
		   float valorDoAluguel = 0;

		   // R$ 2.00 por 2 dias. O dia adicional acrescenta R$ 1.50
		   if (Jogo.NORMAL == umAluguel.getItem().getCodigoDePreco()) { 
			    valorDoAluguel = (float)this.normal.valorDeUmAluguel(umAluguel);
		   }
		   // R$ 3.00 por dia
		   if (Jogo.LANCAMENTO == umAluguel.getItem().getCodigoDePreco()) { 
				valorDoAluguel = (float) this.lancamento.valorDeUmAluguel(umAluguel);
		   }
		   // R$ 4.00 por 3 dias. O dia adicional acrescenta R$ 3.00 
		   if (Jogo.ONLINE  == umAluguel.getItem().getCodigoDePreco()) { 
				valorDoAluguel = (float) this.online.valorDeUmAluguel(umAluguel);
		   }
		   return valorDoAluguel;
	}

}
