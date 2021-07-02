import java.util.*;
/*Crie uma classe para um ônibus turístico para levar pessoas de São Paulo até uma cidade turística.
A classe deve armazenar o local atual, quantidade de paradas, capacidade do ônibus e quantas pessoas estão
presentes nele.

 A classe deve também disponibilizar os seguintes métodos: Inicializa (método construtor), Entra (quando entra alguém), Sai (quando alguém desce do ônibus), Parar (o ônibus para de andar) e andar.

Crie um prgrama que instacie essa classe três vezes, listando suas paradas, quantas pessoas sobem e quantas pessoas descem.
Dentro do programa, deve ser possível modificar cada um dos atributos do ônibus.
*/

class Onibus{

	String    local_atual;
	int       qnt_paradas;
	int       capacidade_pessoas;
	int       pessoas_abordo;
	String[]  paradas;
	
  
	Scanner sc =  new Scanner(System.in);

	//Classe contrutora
	public Onibus(String local_atual, int qnt_paradas,int capacidade_pessoas, int pessoas_abordo){

		this.local_atual        = local_atual;
		this.qnt_paradas        = qnt_paradas;
		this.capacidade_pessoas = capacidade_pessoas;
		this.pessoas_abordo     = pessoas_abordo;
	
	}

	//Classes de alteração	

	public void alterLocal_atual(String local_atual){
		
		this.local_atual = local_atual;

	}

	public void alterQnt_paradas(int qnt_paradas){
		
		this.qnt_paradas = qnt_paradas;

	}

	public void alterCapacidade_pessoas(int capacidade_pessoas){
		
		this.capacidade_pessoas = capacidade_pessoas;

	}

	public void alterPessoas_abordo(int pessoas_abordo){
		
		this.pessoas_abordo = pessoas_abordo;

	}


	// Classes de retorno 


	public String returnLocal_atual(){
		
		return this.local_atual;

	}

	public int returnQnt_paradas(){
		
		return this.qnt_paradas;

	}

	public int returnCapacidade_pessoas(){
		
		return this.capacidade_pessoas;

	}

	public int returnPessoas_abordo(){
		
		return this.pessoas_abordo;

	}

 	//funçoes

	public void Entra(int qnt_pessoas_entrando){
			
		int calc = this.capacidade_pessoas - qnt_pessoas_entrando;

		if(qnt_pessoas_entrando >= calc ){

			System.out.println("O onibus não suporta tanta gente,AAAAAAAAAAAAAAAAAAAAAAAAH"); 
		}else{

			this.pessoas_abordo = this.pessoas_abordo + qnt_pessoas_entrando; 		
			System.out.println( qnt_pessoas_entrando + " entraram");

		}
			


	}

	public void Sair(int qnt_pessoas_saindo){
	
		this.pessoas_abordo = this.pessoas_abordo - qnt_pessoas_saindo; 	
		System.out.println(qnt_pessoas_saindo + " pessoas sairam");

	}

	void para(){
 
		System.out.println("O onibus está parado na " + local_atual);

	}

	void andar(){

		System.out.println("O onibus está andando");

	}


    public  void parada(){

		int qnt = this.qnt_paradas;

		this.paradas  = new String[qnt]; 

		for(int i = 0; i < paradas.length; i++){

			System.out.println("Digite o nome da "+ (i +1) +"° parada: ");
			this.paradas[i] = sc.nextLine();

		}


	}

	public String retornarParadas(int x){

		return this.paradas[x];
	}


}