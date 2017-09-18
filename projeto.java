
//Classe que chamada os métodos 
 


public class projeto{

	public static void main(String[] args) {
		Cliente c = new Cliente( "098.097.9876-78", "fulano@gmailcom", 
				 "Rua Sergipe, São Luiz", 2218764, 98765);
		
		
		Ambiente a = new Ambiente("Espaço de show", 1000 ,"Rua: Palmeiras","Recanto do lazer","Proximo ao MACRO supermercado",600);
		
		Esporte e = new Esporte("Futsal" , "Maraisa, Monalisa, Jessyka, Carol");
		
		Evento ev = new Evento("Show de rap", "10 de março de 2018", "19hrs", "Banda conhecida nacionalmente, parcerias com bandas que deixam o seu som mais gosto de ouvir, apresentamos Maneva");

		Filme f = new Filme("Invasão Zumbi", 16, "Terro, zumbi");
		
		//verificar dados:
		System.out.println(c.getDados());
		System.out.println(a.getDados());
		System.out.println(e.getDados());
		System.out.println(ev.getDados());
		System.out.println(f.getDados());
	}
	
}
