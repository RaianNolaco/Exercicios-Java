public class Main{
	
	public static void main(String[] args){
		
		System.out.println("Hello, word!");
		
		//Texto em java
		String nome = "Tawane";
		System.out.println(nome);
		
		//Numero em java
		int numero = 24 * 8 * (20 * 20/2) + 12 * 12/55;
		System.out.println(numero);
		
		System.out.println( nome + " possui" + numero + " reais em conta!");
		
		//condicao em java
		if(45>18){
			
			System.out.println("45 é maior que 18");
			
		} else {
			
			System.out.println(" ");
			
		}
		
		
		int dia = 1;
		
		switch(dia){
			
			case 1:
			    System.out.println("Segunda");
			break;

			case 2:
			    System.out.println("Terça");
			break;	

			case 4:
			    System.out.println("Quarta");
			break;	

			case 4:
			    System.out.println("Quinta");
			break;	

			case 5:
			    System.out.println("Sexta");
			break;	
			
			case 6:
			    System.out.println("Sábado");
			break;

			case 7:
			    System.out.println("Domingo");
			break;	
			
			
		}
		
	}
	
}