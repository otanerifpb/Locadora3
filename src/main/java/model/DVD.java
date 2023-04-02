package model;

import iterfaces.Alugavel;
import services.CodigoDePrecoEnum;

public class DVD implements Alugavel  {
	  public static final int NORMAL = CodigoDePrecoEnum.NORMAL.ordinal();
	  public static final int LANCAMENTO = CodigoDePrecoEnum.LANCAMENTO.getValor();
	  public static final int INFANTIL = CodigoDePrecoEnum.INFANTIL.getValor();
      private Infantil infantil = new Infantil();
      private Normal normal = new Normal();
      private Lancamento lancamento = new Lancamento();
	  private String titulo;
	  private int codigoDePreco;
	  private int pontosTotaisDeAlugadorFrequente;
	  
	  public DVD(String titulo, int codigoDePreco) {
	    this.titulo = titulo;
	    this.codigoDePreco = codigoDePreco;
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
	 
	  public int getCodigoDePreco() {
	    return codigoDePreco;
	  }
	 
	  public void setCodigoDePreço(int codigoDePreco) {
	    this.codigoDePreco = codigoDePreco;
	  }
	  
	  
	  public Infantil getInfantil() {
		return infantil;
	 }

	 public void setInfantil(Infantil infantil) {
		this.infantil = infantil;
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
		 if (DVD.NORMAL == umAluguel.getItem().getCodigoDePreco()) { 
			    valorDoAluguel = (float)this.normal.valorDeUmAluguel(umAluguel);
		 }
		 // R$ 3.00 por dia
		 if (DVD.LANCAMENTO == umAluguel.getItem().getCodigoDePreco()) { 
				valorDoAluguel = (float) this.lancamento.valorDeUmAluguel(umAluguel);
		 }
		 // R$ 1.50 por 3 dias. O dia adicional acrescenta R$ 1.50 
		 if (DVD.INFANTIL  == umAluguel.getItem().getCodigoDePreco()) { 
				valorDoAluguel = (float) this.infantil.valorDeUmAluguel(umAluguel);
		 }
		 return valorDoAluguel;
	 
	}

	
	
}
