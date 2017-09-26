
public class Ingresso {
	//Atributos
	
	private String setor;
	private int cadeiraNumerada;
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public int getCadeiraNumerada() {
		return cadeiraNumerada;
	}
	public void setCadeiraNumerada(int cadeiraNumerada) {
		this.cadeiraNumerada = cadeiraNumerada;
	}
	@Override
	public String toString() {
		return "Ingresso [setor=" + setor + ", cadeiraNumerada="
				+ cadeiraNumerada + "]";
	}
	
	
}
