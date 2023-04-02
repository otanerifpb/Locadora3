package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Aluguel;
import model.Cliente;

@Service
public class ClienteService {
	
	private Cliente cliente;
	
    @Autowired
	public ClienteService(Cliente cliente) {
		this.cliente = cliente;
	}    
	
	public void adicionaAluguel(Aluguel aluguel) {
		this.cliente.getDvdsAlugados().add(aluguel);
	}
	
	public String extratoNormal() {
		int valorTotalPontos = 0;
		String resultado = null;
		valorTotalPontos = cliente.getExtratoNormal().extratoDefault(cliente.getDvdsAlugados(), cliente);
		resultado = cliente.getExtratoNormal().exibeExtrato(cliente, cliente.getDvdsAlugados(), valorTotalPontos);
	
		return resultado;
	}

	public String extratoHTML() {
		int valorTotalPontos = 0;
		String resultado = null;
		valorTotalPontos = cliente.getExtratoHTML().extratoDefault(cliente.getDvdsAlugados(), cliente);
		resultado = cliente.getExtratoHTML().exibeExtrato(cliente, cliente.getDvdsAlugados(), valorTotalPontos);
	
		return resultado;
	}

}
