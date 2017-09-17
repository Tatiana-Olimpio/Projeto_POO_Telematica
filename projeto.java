
//Classe que chamada os métodos 
 


public class projeto{

	public static void main(String[] args) {
		Cliente c = new Cliente( "175.678.543-06", "jose@gmailcom", 
				 "Rua Rio de Janeiro 501", 22121980, 987380045);
		
		
		Ambiente a = new Ambiente("Espaço de show", 1000 , "Rua: Palmeiras", "Proximo ao MACRO supermercado");
		

		//verificar dados:
		System.out.println(c.getDados());
		System.out.println(a.getDados());
	}
	
}