	import java.util.*;

public class EX_7{
    public static void main(String [] args){

		 Scanner sc = new Scanner(System.in);
		 Thread t;		
		 
		  int calc = 0;
		  
		  for(int i = 1;i <= 10; ++i){
			  
		 	 System.out.println("Informe o " + i + " numero: ");
		     int n1 = sc.nextInt();
             
             if(n1 < 40){
				 
				  calc += n1;
			 }			 
			  
		  }
		  
		  System.out.println("A soma de todos os numemros menores que 40 eh " + calc);
 
    }


}