package model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class Cliente {
	private String nome;
	private double valorTotalPago;
	private ExtratoNormal extratoNormal = new ExtratoNormal();
	private ExtratoHTML extratoHTML = new ExtratoHTML();
	private List<Aluguel> dvdsAlugados = new ArrayList<Aluguel>();

	
	public Cliente() {
		
	}
    public Cliente(String nome) {
		this.nome = nome;
	}

	public List<Aluguel> getDvdsAlugados() {
		return dvdsAlugados;
	}

	public void setDvdsAlugados(List<Aluguel> dvdsAlugados) {
		this.dvdsAlugados = dvdsAlugados;
	}

	public String getNome() {
		return nome;
	}	
	
	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValorTotalPago() {
		return valorTotalPago;
	}

	public void setValorTotalPago(double valorTotal) {
		this.valorTotalPago = valorTotal;
	}

	public ExtratoNormal getExtratoNormal() {
		return extratoNormal;
	}

	public void setExtratoNormal(ExtratoNormal extratoNormal) {
		this.extratoNormal = extratoNormal;
	}
	
	public ExtratoHTML getExtratoHTML() {
		return extratoHTML;
	}

	public void setExtratoHTML(ExtratoHTML extratoHTML) {
		this.extratoHTML = extratoHTML;
	}	

}