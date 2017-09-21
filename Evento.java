import java.util.Scanner;
import java.util.ArrayList;

public abstract class Evento {
	//Atributos
	private String nome;
	private String descricao;
	private String dataEvento;
	private String horaEvento;
	private String sinopse;
	private String elenco;
	private ArrayList<Ingresso> ingressos;
	
	Scanner entrada = new Scanner(System.in);
	
	public Evento(String nome, String descricao, String dataEvento, String horaEvento, String sinopse, String elenco){
		this.nome = nome;
		this.descricao = descricao;
		this.dataEvento = dataEvento;
		this.horaEvento = horaEvento;
		this.sinopse = sinopse;
		this.elenco = elenco;
		
	}

//  dados do Evento
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public String getData(){
		return dataEvento;
	}
	
	public void setData(String dataEvento){
		this.dataEvento = dataEvento;
	}
	
	public String getHora(){
		return horaEvento;
	}
	
	public void setHora(String horaEvento){
		this.horaEvento = horaEvento;
	}
	
	public String getSinopse(){
		return sinopse;
	}
	
	public void setSinopse(String sinopse){
		this.sinopse = sinopse;
	}
	
	public String getElenco (){
		return elenco;
	}
	
	public void setElenco(String elenco){
		this.elenco = elenco;
	}
	
	public ArrayList<Ingresso> getIngressos(){
		return ingressos; 
	}
	//Meteods
	
	void mostrarEvento(){
		
	}
	
	void pesquisarEvento(){
		
	}
	
	void mostrarDescontoPorCompraAntecipada(){
		
	}
}
