//Autor: Tatiana Olímpio
import java.util.Scanner;

 // classe Cliente.
 
public class Cliente {
	
	//Atributos
		private String cpf;
		private String email;
		private String endereco;
		private int dataDeNascimento;
		private int telefone;
		private String login;
		private int senha;
		
		Scanner entrada = new Scanner(System.in);
		
		
           // construtor
		public Cliente( String cpf, String email,String endereco, int dataDeNascimento, int telefone, String login, int senha){
			this.cpf= cpf;
			this.email= email;
			this.endereco=endereco;
			this.dataDeNascimento=dataDeNascimento;
			this.telefone=telefone;
			this.login = login;
			this.senha = senha;
			
			
		}
		
		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public int getDataDeNascimento() {
			return dataDeNascimento;
		}

		public void setDataDeNascimento(int dataDeNascimento) {
			this.dataDeNascimento = dataDeNascimento;
		}

		public int getTelefone() {
			return telefone;
		}

		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public int getSenha() {
			return senha;
		}

		public void setSenha(int senha) {
			this.senha = senha;
		}

		public Scanner getEntrada() {
			return entrada;
		}

		public void setEntrada(Scanner entrada) {
			this.entrada = entrada;
		}

		public void realizarAutenticacao(String login, int senha){
			this.login = login;
			this.senha = senha;
		}
		
}		
