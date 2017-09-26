//Autor Tatiana Olímpio


class Peca extends Evento{
	public Peca(String nome, String descricao, String dataEvento,
			String horaEvento, String sinopse, String elenco) {
		super(nome, descricao, dataEvento, horaEvento, sinopse, elenco);
			}
	
	

	@Override
	public String toString() {
		return "Peca [nomePeca=" + nomePeca + ", companhia=" + companhia
				+ ", genero=" + genero + "]";
	}



	//Atributos
	private String nomePeca;
	private String companhia;
	private String genero;
	
	
	//metodos
	
	public String getNomePeca() {
		return nomePeca;
	}

	public void setNomePeca(String nomePeca) {
		this.nomePeca = nomePeca;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	void registrarTeatro(){
		
	}
	
	void pesquisarTeatro(){
	
	}
	
	//Metodos
	
		void registrarPeca(){
			
		}

		void pesquisarPeca(){
			
		}
}
