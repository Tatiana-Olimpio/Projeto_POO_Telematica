import java.util.Scanner;

//classe Ambiente 

public abstract class Ambiente{
	
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
	
	
	
	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getCapacidadeTotal() {
		return capacidadeTotal;
	}


	public void setCapacidadeTotal(int capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}


	public String getEndereço() {
		return endereço;
	}


	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getPontoDeReferencia() {
		return pontoDeReferencia;
	}


	public void setPontoDeReferencia(String pontoDeReferencia) {
		this.pontoDeReferencia = pontoDeReferencia;
	}


	public int getVagasDeEstacionamento() {
		return vagasDeEstacionamento;
	}


	public void setVagasDeEstacionamento(int vagasDeEstacionamento) {
		this.vagasDeEstacionamento = vagasDeEstacionamento;
	}



	public Scanner getEntrada() {
		return entrada;
	}


	public void setEntrada(Scanner entrada) {
		this.entrada = entrada;
	}


	//Metodos
	void mostrarFotos(){
		
	}
	
	void adicionarAmbiente(){
		
	}
	
	void pesquisarAmbiente(){
		
	}
}
