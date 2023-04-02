package model;

import java.util.Iterator;
import java.util.List;

public class ExtratoHTML extends Extrato{

	@Override
	public String exibeExtrato(Cliente cliente, List<Aluguel> dvdsAlugados, int valorPonto) {
		final String fimDeLinha = System.getProperty("line.separator");
		
		Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
		String resultado = "<H1>Registro de Alugueis de <EM>" + cliente.getNome() + "</EM></H1><P>" + fimDeLinha;
		Aluguel umAluguel = null;
		//double valotTotalAluguel=0;
		cliente.setValorTotalPago(0);
		while(alugueis.hasNext()) {
			umAluguel = alugueis.next();
			
			// mostra valores para este aluguel
			resultado += umAluguel.getItem().getTitulo() + ": R$ " + 
					umAluguel.getItem().valorDeUmAluguel(umAluguel)+"<BR>"+ fimDeLinha;
			umAluguel.calculeValorTotal(umAluguel, cliente);
			
		} // while
		
		// adiciona rodapé
		resultado += "<P>Valor total pago: <EM>R$ " + cliente.getValorTotalPago() + "</EM>"+ fimDeLinha;
		resultado += "<P>Você acumulou <EM>" + valorPonto + 
					" pontos </EM> de alugador frequente";
		
		return resultado;
	}

}
