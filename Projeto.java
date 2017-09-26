//Author: Tatiana Olímpio

import java.util.ArrayList;


public class Projeto{

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<Evento> eventos = new ArrayList<>();
		ArrayList<Ambiente> ambientes = new ArrayList<>();
		
  		Cliente c1 = new Cliente( "098.097.9876-78", "fulano@gmailcom", 
				 "Rua Sergipe, São Luiz", 2218764, 98765, "Fulano_alburqueque", 45678);
		clientes.add(c1);
		System.out.println(c1);
		
		Ambiente a1 = new Estadio("Espaço de show",1000,"Rua: Palmeiras","Recanto do lazer","Proximo ao MACRO supermercado",600);
		ambientes.add(a1);
		System.out.println(a1);		
		
		
		
		Evento ev = new Esporte("Futsal", "Jogo com 4 pessoas", "13/10/2017", "14hrs", "Maraisa, Monalisa, Jessyka, Carol", null);
		eventos.add(ev);
		System.out.println(ev);
		
	
		}
		
	}
	 
