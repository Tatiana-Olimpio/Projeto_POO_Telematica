import java.util.Scanner;

//Autor: Tatiana Olímpio
public class Evento {
	//Atributos
	private String descricao;
	private String dataEvento;
	private String horaEvento;
	private String sinopse;
	private String elenco;
	
	Scanner entrada = new Scanner(System.in);
	
	public Evento(String descricao, String dataEvento, String horaEvento, String sinopse, String elenco){
		this.descricao = descricao;
		this.dataEvento = dataEvento;
		this.horaEvento = horaEvento;
		this.sinopse = sinopse;
		this.elenco = elenco;
	}

//  dados do cliente
		String getDados(){
			return "\n\nDados do evento:\n\nDecrição do evento: " + this.descricao + "\nData do evento: " + this.dataEvento + "\nHorario do evento: " + this.horaEvento + 
					"\nSinopse do evento:" + this.sinopse + "\n Elenco: " + this.elenco;
		}	
	
	//Meteods
	
	void mostrarEvento(){
		
	}
	
	void pesquisarEvento(){
		
	}
	
	void mostrarDescontoPorCompraAntecipada(){
		
	}
}
