//Autor: Tatiana Olímpio
import java.util.Scanner;

//Classe Esporte

public class Esporte {
	//Atributos
	
	private String nomeDoEsporte;
	private String equipe;
	
	Scanner entrada = new Scanner(System.in);
		
// construtor
	public Esporte( String nomeDoEsporte, String equipe){
		this.nomeDoEsporte = nomeDoEsporte;
		this.equipe= equipe;
	}

//  dados do esporte
		String getDados(){
			return "\n\nTipo de esporte:\n\nNome do esporte: " + this.nomeDoEsporte + "\nEquipe: " + this.equipe;
		}	

	//Metodos
	
	void registrarGinasio(){
		
	}
	
	void pesquisarEsporte(){
	
	}
}
