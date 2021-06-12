	import java.util.*;

public class EX_4{
    public static void main(String [] args){

	    Scanner sc = new Scanner(System.in);
					
		 
		   while(res == 1){
		
			System.out.println("Informe o primeiro: ");
			int n1 = sc.nextInt();
		 
			System.out.println("Informe o segundo: ");
			int n2 = sc.nextInt();
		 
			System.out.println("Digit qual operacao deseja fazer om "+ n2 + " e " + n2);
			System.out.println("Soma         (+)= 1 ");
			System.out.println("Subtacao     (-)= 2 ");
			System.out.println("Multiplicaca (*)= 3 ");
			System.out.println("Divisao      (/)= 4 ");
			int n3 = sc.nextInt();
		 
			int calc;
		 
			switch(n3){
				case 1: 
				calc = n1 + n2;
				System.out.println("A soma entre " + n1 + " e " + n2 + " eh " + calc );
			  
				break;
			  			 
				case 2:                    			 
				calc = n1 - n2;
				System.out.println("A subtracao entre " + n1 + " e " + n2 + " e " + calc );	
 			  
				break;
			 
			 
				case 3: 			   
				calc = n1 * n2;
				System.out.println("A multiplicacao entre " + n1 + " e " + n2 + " e " + calc );	

				break;
			 
				case 4: 
				calc = n1 / n2;
				System.out.println("A divisao entre " + n1 + " e " + n2 + " e " + calc );
			  
				break;
			 
				default:
			 
			    System.out.println("valor invalido");
			   
				break;
			 
			 
		 } 
		 
		 System.out.println("Deseja continuar? 1 = sim 2 = nao");
	     res = sc.nextInt();	
 
        }
 
    }


}