import java.util.Scanner;
//Autor Tatiana Olímpio
public class Filme {
	//Atributos
	private String nomeDoFilme;
	private int censura;
	private String genero;
	
	Scanner entrada = new Scanner(System.in);
	
	public Filme(String nomeDoFilme, int censura, String genero){
		this.nomeDoFilme = nomeDoFilme;
		this.censura = censura;
		this.genero = genero;
	}
	
	//  dados do Evento
	String getDados(){
		return "\n\nDados do filme:\n\nNome do filme: " + this.nomeDoFilme + "\nFaixa de idade para assistir o filme: " + this.censura + "\nGenero do filme: " + this.genero;
		}
	
	//Metodos
	
	void registrarCinema(){
		
	}

	void pesquisarCinema(){
		
	}
}
