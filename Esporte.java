//Autor: Tatiana Olímpio
import java.util.Scanner;


//Classe Esporte

class Esporte extends Evento{
	public Esporte(String nome, String descricao, String dataEvento,
			String horaEvento, String sinopse, String elenco) {
		super(nome, descricao, dataEvento, horaEvento, sinopse, elenco);
	
	}

	//Atributos
	private String nomeDoEsporte;
	private String equipe;
	
	Scanner entrada = new Scanner(System.in);
		
// construtor
	//public Esporte( String nomeDoEsporte, String equipe){
	//	this.nomeDoEsporte = nomeDoEsporte;
		//this.equipe= equipe;
	//}



	//Metodos
	
	public String getNomeDoEsporte() {
			return nomeDoEsporte;
		}

		public void setNomeDoEsporte(String nomeDoEsporte) {
			this.nomeDoEsporte = nomeDoEsporte;
		}

		public String getEquipe() {
			return equipe;
		}

		public void setEquipe(String equipe) {
			this.equipe = equipe;
		}

		@Override
		public String toString() {
			return "Nome do esporte: " + this.nomeDoEsporte + ", Equipe: " + this.equipe;
		}
	void registrarGinasio(){
		
	}
	
	void pesquisarEsporte(){
	
	}
}
