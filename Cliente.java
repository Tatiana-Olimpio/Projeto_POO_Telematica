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
		
		Scanner entrada = new Scanner(System.in);
		
		
           // construtor
		public Cliente( String cpf, String email,String endereco, int dataDeNascimento, int telefone ){
			this.cpf= cpf;
			this.email= email;
			this.endereco=endereco;
			this.dataDeNascimento=dataDeNascimento;
			this.telefone=telefone;
			
			
		}
		//  dados do cliente
		String getDados(){
			return " Dados do cliente:\n\n CPF: " + this.cpf + "\n Email: " + this.email + "\n Endereço: " +this.endereco+" \n Data de Nascimento: " + this.dataDeNascimento + "\n Telefone: " + this.telefone ;
		}	
}		
