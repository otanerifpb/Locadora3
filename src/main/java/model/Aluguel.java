package model;

import org.springframework.stereotype.Component;

import iterfaces.Alugavel;

@Component
public class Aluguel {
	   private Alugavel item;
	   private int diasAlugado;

	   public Aluguel(Alugavel item, int diasAlugado) {
	      this.item = item;
	      this.diasAlugado = diasAlugado;
	   }
	   
	   public Aluguel() {
		   
	   }
	 
	   public Alugavel getItem() {
	      return item;
	   }
	 
	   public int getDiasAlugado() {
	      return diasAlugado;
	   }
		
		public double calculeValorTotal(Aluguel umAluguel,  Cliente cliente) {
			cliente.setValorTotalPago(umAluguel.getItem().valorDeUmAluguel(umAluguel) + cliente.getValorTotalPago());
			return cliente.getValorTotalPago();		
		}
	   
		public int valorPontos(Aluguel umAluguel, Cliente cliente) {
		   umAluguel.getItem().setPontosTotaisDeAlugadorFrequente(Classificacao.getPontosTotaisDeAlugadorFrequente());
		   if((umAluguel.getItem().getCodigoDePreco() == DVD.LANCAMENTO && umAluguel.getDiasAlugado() > 1)) {
			   umAluguel.getItem().setPontosTotaisDeAlugadorFrequente(umAluguel.getItem().getPontosTotaisDeAlugadorFrequente() + 
					   Classificacao.getPontosTotaisDeAlugadorFrequente());
				}
		   return umAluguel.getItem().getPontosTotaisDeAlugadorFrequente();  
		}
	   
}
