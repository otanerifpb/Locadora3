package com.example.lcadora;


import model.Aluguel;
import model.Cliente;
import model.DVD;
import model.Jogo;
import services.ClienteService;

public class Locadora {
	public static void main(String[] args) {
		
		
		Cliente cli1 = new Cliente("Alex Sandro");
		Cliente cli2 = new Cliente("Maria Julia");
		
		ClienteService c1 = new ClienteService(cli1);
		ClienteService c2 = new ClienteService(cli2);

		c1.adicionaAluguel(new Aluguel(new DVD("O Atirador", DVD.NORMAL), 10));
		c1.adicionaAluguel(new Aluguel(new DVD("Luca", DVD.INFANTIL), 2));
		c1.adicionaAluguel(new Aluguel(new DVD("O Gato de Botas 2", DVD.LANCAMENTO), 30));
		c1.adicionaAluguel(new Aluguel(new DVD("Arremessando Alto", DVD.LANCAMENTO), 4));
		c1.adicionaAluguel(new Aluguel(new DVD("Moana", DVD.INFANTIL), 10));
		c1.adicionaAluguel(new Aluguel(new DVD("Uma Noite no Museu", DVD.NORMAL), 3));
		
		c2.adicionaAluguel(new Aluguel(new Jogo("Need For Speed", "PS5", Jogo.NORMAL), 3));
		c2.adicionaAluguel(new Aluguel(new Jogo("Pac Man", "PS5", Jogo.NORMAL), 2));
		c2.adicionaAluguel(new Aluguel(new Jogo("Race Driver", "Xbox", Jogo.LANCAMENTO), 1));
		c2.adicionaAluguel(new Aluguel(new Jogo("Super Mario Br", "Nintendo", Jogo.ONLINE), 4));
		c2.adicionaAluguel(new Aluguel(new Jogo("Super Sonic", "Nintendo", Jogo.ONLINE), 3));

		System.out.println("********Cliente 01 Extrato Normal***********");
		System.out.println(c1.extratoNormal());
//		System.out.println();
//		System.out.println("********Cliente 01 Extrato HTML*************");
//		System.out.println(c1.extratoHTML());
//		System.out.println();
//		System.out.println("********Cliente 02 Extrato Normal***********");
//		System.out.println(c2.extratoNormal());
	}
}
