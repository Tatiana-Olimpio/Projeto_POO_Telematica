import java.util.Scanner;

//classe Ambiente 

public class Ambiente{
	
	//Atributos
	private String descricao;
	private int capacidadeTotal;
	private String endereço;
	private String nome;
	private String pontoDeReferencia;
	private int vagasDeEstacionamento;
	
	Scanner entrada = new Scanner(System.in);
	
	// construtor 
	
	public Ambiente(String descricao, int capacidadeTotal,String endereço, 
					String nome, String pontoDeReferencia, int vagasDeEstacionamento){
		this.descricao = descricao;
		this.capacidadeTotal = capacidadeTotal;
		this.endereço = endereço;
		this.nome = nome;
		this.pontoDeReferencia = pontoDeReferencia;
		this.vagasDeEstacionamento = vagasDeEstacionamento;
		
	}
	
	// Dados do Cliente
	
	String getDados(){
		return "Dados do ambiente: \n Descrição do Ambiente: " + this.descricao + "\n Capacidade total: " + this.capacidadeTotal
				+ "\nEndereço: " + this.endereço + "\nNome: " + this.nome + 
				"\nPonto de Referencia: " + this.pontoDeReferencia + "\nQuantidade de vagas no estacionamento: " + this.vagasDeEstacionamento;
	}
	
	//Metodos
	void mostrarFotos(){
		
	}
	
	void adicionarAmbiente(){
		
	}
	
	void pesquisarAmbiente(){
		
	}
}
