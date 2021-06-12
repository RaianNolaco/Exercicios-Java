import java.util.*;
import java.lang.*;

public class Cinema{
	public static void main(String [] args){
		
				
		Scanner sc = new Scanner(System.in);
		
		
		/*Variaveis dos assentos
		F1Es = fileira A assento Especial
		F1   = fileira A
		F2   = fileira B
		F3   = fileira C
		F4   = fileira D
		F5   = fileira E
		F6   = fileira F
		*/
		
		int alphaF1Es = 12;
        int	alphaF1   = 10;
    	int	alphaF2   = 26;
        int	alphaF3   = 26;
        int	alphaF4   = 26;		
		int	alphaF5   = 26;
		int	alphaF6   = 26;
		
		int betaF1Es = 6;
		int	betaF1   = 18;
		int	betaF2   = 25;
		int	betaF3   = 25;
		int	betaF4   = 25;
		int	betaF5   = 25;
		
      	System.out.println("\nOla seja bem vindo ao cinema Olympus");
 
		System.out.println("\nQual e seu nome?");
		String nome = sc.nextLine();	

		System.out.println("\n\nEntao " + nome + " temos 2 filmes em exibicao no momento"+
		"\n\nAs branquelas sendo exibido na sala Alpha"+
        "\nA chegada sendo exibido na sala Beta"+
		"\n\nQual filme voce ira querer assistir?"+
		"\nDigite:"+
		"\n1 = As branquelas"+
		"\n2 = A chegada");
		int escolha = sc.nextInt();
		
		Runtime.getRuntime().exec("cls");
		
		switch(escolha){
			
			case 1:
			
				System.out.println("Boa escolha");
				
				System.out.println("Voce possue alguma nescessidade especial?(1 = Sim/2 = Nao)");
				int especial = sc.nextInt(); 	
				
				if(alphaF1Es > 0){
				
				
				    switch(especial){
					
					
						case 1: 
					
							
							System.out.println("Possuimos apenas " + alphaF1Es + " assentos especiais na fileira A" +
							"\n\nQuano ingressos especiais ira comprar?");
							int qntEspeciais = sc.nextInt();					  
					     
						    while(alphaF1Es < qntEspeciais ){
								
							     System.out.println("\n\nNão existem lugares disponives para quantidade de ingressos que voce deseja comprar");
								 
								 
								 
								 System.out.println("Possuimos apenas " + alphaF1Es + " assentos especiais na fileira A\n" + "\nDigite uma quantidade menor de ingressos especiais.");
								 qntEspeciais = sc.nextInt();

							} 
					 
					 
                            alphaF1Es -= qntEspeciais;
						  
						break;

					 } 
					
				}else {
						 System.out.println("Ola " + nome +" nao existem lugares disponives no momento"+
						 "tente novamente em outro dia"); 
				    }
				
					
			break;
			
		}
	}
	
}