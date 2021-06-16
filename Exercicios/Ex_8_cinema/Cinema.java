import java.util.*;
import java.lang.*;

public class Cinema
{
  
  public static void main(String [] args)
	{
	
		Scanner sc = new Scanner(System.in);
		
		int fileira;
		int especial;
		int qntEspeciais;
		int qntIngressos;
		int continuar = 1;
		
		
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
		
		//int calcAlpha = alphaF1Es + alphaF1 + alphaF12 + alphaF3 + alphaF4 + alphaF5 + alphaF6;
		
		int betaF1Es = 6;
		int	betaF1   = 18;
		int	betaF2   = 25;
		int	betaF3   = 25;
		int	betaF4   = 25;
		int	betaF5   = 25;
		//int calcBeta = a
		
		while(continuar == 1)
		{
		 
		    System.out.println("---------------------------------------------------------------------");
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
				   			
			  
			switch(escolha)
		    {	 
			
			 case 1:
			
				System.out.println("Boa escolha");
				
				System.out.println("Voce possue alguma nescessidade especial?(1 = Sim/2 = Nao)");
				especial = sc.nextInt(); 	
				
				if(especial ==  1){
					
							
							System.out.println("Possuimos apenas " + alphaF1Es + " assentos especiais na fileira A" +
							"\n\nQuano ingressos especiais ira comprar?");
							qntEspeciais = sc.nextInt();					  
					     
						    while(alphaF1Es <= qntEspeciais ){
								
							     System.out.println("\n\nNao existem lugares disponives para quantidade de ingressos que voce deseja comprar");
								 
								 
								 
								 System.out.println("Possuimos apenas " + alphaF1Es + " assentos especiais na fileira A\n" + "\nDigite uma quantidade menor de ingressos especiais.");
								 qntEspeciais = sc.nextInt();

							} 
					 
					 
                            alphaF1Es -= qntEspeciais;
						  
									
				}else {
						 System.out.println("\n\nQuano ingressos ira comprar?");
						 qntIngressos = sc.nextInt();
						
				         System.out.println("\n\nEm qual fileira deseja?"+ 
				         "\n\n1 = A"+
				         "\n2 = B"+
				         "\n3 = C"+
				         "\n4 = D"+
						 "\n5 = E"+
						 "\n6 = F"); 
						  fileira = sc.nextInt();
						 
						 
						 switch(fileira){
							 
							case 1:
							        
								if(alphaF1 >0){
									
									   alphaF1 -= qntIngressos;
									   
									   System.out.println("Compra realizada com sucesso!");
									   System.out.println("\nVoce comprou:" + qntIngressos+" ingressos na fileira F para o filme As branquelas");
									   System.out.println("\ntenha um bom filme :D, e até a proxima " + nome + ".");
									
								
								}else{
									
									System.out.println("Nao possuem lugares o suficiente na fileira escolhida");
									
								}	
							 
							break;
							 
							case 2:
							      
								if(alphaF2 >0){
									   
									   alphaF2 -= qntIngressos;
									   
									   System.out.println("Compra realizada com sucesso!");
									   System.out.println("\nVoce comprou:" + qntIngressos+ "ingressos na fileira B para o filme As branquelas");
									   System.out.println("\ntenha um bom filme :D, e até a proxima" + nome + ".");
									
								}else{
									
									System.out.println("Nao possuem lugares o suficiente na fileira escolhida");
									
								}	
							 
							break;
							 
							case 3:
							        
								if(alphaF3 >0){
									
									   alphaF3 -= qntIngressos;
									   
									   System.out.println("Compra realizada com sucesso!");
									   System.out.println("\nVoce comprou:" + qntIngressos+"ingressos na fileira C para o filme As branquelas");
									   System.out.println("\ntenha um bom filme :D, e até a proxima" + nome + ".");

								}else{
									
									System.out.println("Nao possuem lugares o suficiente na fileira escolhida");
									
								}	
							 
							break;
							 
							case 4:
							        
								if(alphaF4 >0){
									
									   alphaF4 -= qntIngressos;
									   
									   System.out.println("Compra realizada com sucesso!");
									   System.out.println("\nVoce comprou:" + qntIngressos+"ingressos na fileira D para o filme As branquelas");
									   System.out.println("\ntenha um bom filme :D, e até a proxima" + nome + ".");

								}else{
									
									System.out.println("Nao possuem lugares o suficiente na fileira escolhida");
									
								}	
							 
							break;
							 
							case 5:
							        
								if(alphaF5 >0){
									
									   alphaF5 -= qntIngressos;
									              
									   System.out.println("Compra realizada com sucesso!");
									   System.out.println("\nVoce comprou:" + qntIngressos+"ingressos na fileira E para o filme As branquelas");
									   System.out.println("\ntenha um bom filme :D, e até a proxima" + nome + ".");
									
								}else{
									
									System.out.println("Nao possuem lugares o suficiente na fileira escolhida");
									
								}	
							 
							break;
							 
						    case 6:
							        
							    if(alphaF6 >0){
									
								       alphaF6 -= qntIngressos;
									   
									   System.out.println("Compra realizada com sucesso!");
									   System.out.println("\nVoce comprou:" + qntIngressos +"ingressos na fileira F para o filme As branquelas");
									   System.out.println("\ntenha um bom filme :D, e até a proxima" + nome + ".");

									   
								}else{
									
									System.out.println("Nao possuem lugares o suficiente na fileira escolhida");
									
								}	
							 break;
							 
						 }
					}

	        break;
							
//--------------------------------------------------------------------------------------------------------------------//
		    case 2:
			
				      System.out.println("Boa escolha");
				
					  System.out.println("Voce possue alguma nescessidade especial?(1 = Sim/2 = Nao)");
					  especial = sc.nextInt(); 	
				
					  if(especial ==  1){
					
							
					   System.out.println("Possuimos apenas " + betaF1Es + " assentos especiais na fileira A" +
					   "\n\nQuano ingressos especiais ira comprar?");
					    qntEspeciais = sc.nextInt();					  
					     
						    while(betaF1Es < qntEspeciais ){
								
							     System.out.println("\n\nNao existem lugares disponives para quantidade de ingressos que voce deseja comprar");
								 
								 
								 
								 System.out.println("Possuimos apenas " + betaF1Es + " assentos especiais na fileira A\n" + "\nDigite uma quantidade menor de ingressos especiais.");
								 qntEspeciais = sc.nextInt();

							} 
					 
					 
                            betaF1Es -= qntEspeciais;
						  
									
				}else {
						 System.out.println("\n\nQuano ingressos ira comprar?");
						 qntIngressos = sc.nextInt();
						
				         System.out.println("\n\nEm qual fileira deseja?"+ 
				         "\n\n1 = A"+
				         "\n2 = B"+
				         "\n3 = C"+
				         "\n4 = D"+
						 "\n5 = E"); 
						 fileira = sc.nextInt();
						 
						 
						 switch(fileira){
							 
							 case 1:
							        
								if(betaF1 >0){
									
									   betaF1 -= qntIngressos;
									   
									   System.out.println("Compra realizada com sucesso!");
									   System.out.println("\nVoce comprou:" + qntIngressos+" ingressos na fileira F para o filme A Chegada");
									   System.out.println("\ntenha um bom filme :D, e até a proxima " + nome + ".");
									
								
								}else{
									
									System.out.println("Nao possuem lugares o suficiente na fileira escolhida");
									
								}	
							 
							break;
							 
							case 2:
							      
								if(alphaF2 >0){
									   
									   betaF2 -= qntIngressos;
									   
									   System.out.println("Compra realizada com sucesso!");
									   System.out.println("\nVoce comprou:" + qntIngressos+ "ingressos na fileira B para o filme A Chegada");
									   System.out.println("\ntenha um bom filme :D, e até a proxima" + nome + ".");
									
								}else{
									
									System.out.println("Nao possuem lugares o suficiente na fileira escolhida");
									
								}	
							 
							break;
							 
							case 3:
							        
								if(betaF3 >0){
									
									   betaF3 -= qntIngressos;
									   
									   System.out.println("Compra realizada com sucesso!");
									   System.out.println("\nVoce comprou:" + qntIngressos+"ingressos na fileira C para o filme A Chegada");
									   System.out.println("\ntenha um bom filme :D, e até a proxima" + nome + ".");

								}else{
									
									System.out.println("Nao possuem lugares o suficiente na fileira escolhida");
									
								}	
							 
							break;
							 
							case 4:
							        
								if(betaF4 >0){
									
									   betaF4 -= qntIngressos;
									   
									   System.out.println("Compra realizada com sucesso!");
									   System.out.println("\nVoce comprou:" + qntIngressos+"ingressos na fileira D para o filme A Chegada");
									   System.out.println("\ntenha um bom filme :D, e até a proxima" + nome + ".");

								}else{
									
									System.out.println("	Nao possuem lugares o suficiente na fileira escolhida");
									
								}	
							 
							break;
							 
							case 5:
							        
								if(betaF5 >0){
									
									   betaF5 -= qntIngressos;
									              
									   System.out.println("Compra realizada com sucesso!");
									   System.out.println("\nVoce comprou:" + qntIngressos+"ingressos na fileira E para o filme A Chegada");
									   System.out.println("\ntenha um bom filme :D, e até a proxima" + nome + ".");
									
								}else{
									
									System.out.println("Nao possuem lugares o suficiente na fileira escolhida");
									
								}	
							 
							break; 
								    
					}
			    }								
	   }
	
	
	  System.out.println("\n\nDeseja continuar executando o programa? (1 = sim / 2 = nao)");
       continuar = sc.nextInt(); 
			
	}
  }	
}