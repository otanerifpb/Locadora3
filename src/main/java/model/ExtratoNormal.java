package model;

import java.util.List;
import java.util.Iterator;

public class ExtratoNormal extends Extrato {

	@Override
	public String exibeExtrato(Cliente cliente, List<Aluguel> dvdsAlugados, int valorPonto) {
		final String fimDeLinha = System.getProperty("line.separator");
		
		Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
		String resultado = "Registro de Alugueis de " + cliente.getNome()+fimDeLinha+
				"********************************************" + fimDeLinha;
		Aluguel umAluguel = null;
		cliente.setValorTotalPago(0);
		while(alugueis.hasNext()) {
			umAluguel = alugueis.next();
			
			// mostra valores para este aluguel
			resultado += "\t" + umAluguel.getItem().getTitulo() + "     \t R$ " + 
					umAluguel.getItem().valorDeUmAluguel(umAluguel) + fimDeLinha;
			umAluguel.calculeValorTotal(umAluguel, cliente);

		} // while
		
		// adiciona rodapé
		resultado += "********************************************"+fimDeLinha+
				"Valor total pago:                R$ " + cliente.getValorTotalPago()+ fimDeLinha;
		resultado += "Você acumulou " + valorPonto + 
					" pontos de alugador frequente";
		
		return resultado;
	}

}
