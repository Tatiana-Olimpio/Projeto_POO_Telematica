
//Classe que chamada os métodos 
 


public class projeto{

	public static void main(String[] args) {
		Cliente c = new Cliente( "098.097.9876-78", "fulano@gmailcom", 
				 "Rua Sergipe, São Luiz", 2218764, 98765);
		
		
		Ambiente a = new Ambiente("Espaço de show", 1000 , "Rua: Palmeiras", "Proximo ao MACRO supermercado");
		

		//verificar dados:
		System.out.println(c.getDados());
		System.out.println(a.getDados());
	}
	
}
