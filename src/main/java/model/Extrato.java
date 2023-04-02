package model;

import java.util.Iterator;
import java.util.List;

public abstract class Extrato {
	
	public int extratoDefault(List<Aluguel> dvdsAlugados, Cliente cliente) {
		Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
		Aluguel umAluguel = null;
		int valorTotal = 0;
		
		while(alugueis.hasNext()) {
			umAluguel = alugueis.next();
			//faz a iteração dos pontos
			valorTotal += umAluguel.valorPontos(umAluguel, cliente);		
		}
	return  valorTotal;
	}
	
	public abstract String exibeExtrato(
			Cliente cliente, List<Aluguel> dvdsAlugados, int valorTotal); 
	
}