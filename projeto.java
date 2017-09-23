//Author: Tatiana Olímpio

import java.util.ArrayList;
import java.util.Iterator;


public class projeto{

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<Evento> eventos = new ArrayList<>();
		//ArrayList<Ambientes> ambientes = new ArrayList<>();
		
  		Cliente c1 = new Cliente( "098.097.9876-78", "fulano@gmailcom", 
				 "Rua Sergipe, São Luiz", 2218764, 98765, "Fulano_alburqueque", 45678);
		clientes.add(c1);
		
		//Ambiente a = new Ambiente("Espaço de show", 1000 ,"Rua: Palmeiras","Recanto do lazer","Proximo ao MACRO supermercado",600);
		//ambientes.add(c1);
		
		//Esporte e = new Esporte("Futsal" , "Maraisa, Monalisa, Jessyka, Carol");
		
		Evento ev = new Esporte("Futsal", "Jogo com 4 pessoas", "13/10/2017", "14hrs", "Maraisa, Monalisa, Jessyka, Carol", null);
		eventos.add(ev);
		
		for (Iterator<Evento> iterator = eventos.iterator(); iterator.hasNext();) {
			System.out.println(iterator.toString());
			
		}
			
		}
		//Filme f = new Filme("Invasão Zumbi", 16, "Terro, zumbi");
		
		//verificar dados:
		//System.out.println(c.getDados());
		//System.out.println(a.getDados());
		//System.out.println(e.getDados());
		//System.out.println(ev.getDados());
		//System.out.println(f.getDados());
	}
	 
