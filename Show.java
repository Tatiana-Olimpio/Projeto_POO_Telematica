//Author: Tatiana Olímpio


class Show extends Evento{
	public Show(String nome, String descricao, String dataEvento,
			String horaEvento, String sinopse, String elenco) {
		super(nome, descricao, dataEvento, horaEvento, sinopse, elenco);
	}





	@Override
	public String toString() {
		return "Show [nome=" + nome + ", artista=" + artista + ", estilo="
				+ estilo + "]";
	}



	//atributos
	private String nome;
	private String artista;
	private String estilo;	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	//Metodos
	void registrarShow(){
		
	}
	
	void pesquisarShow(){
		
	}
}
	


