	import java.util.*;

public class EX_5{
    public static void main(String [] args){

		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Informe o primeiro: ");
		 int n1 = sc.nextInt();
		 
		 System.out.println("Informe o segundo: ");
		 int n2 = sc.nextInt();
		 

        if(n1 > 0 && n2 > 0 ){
			
			System.out.println("Verdadeiro");
			
		}else if(n1 == 0 && n2 == 0){
			
			System.out.println("Zero");
			
		}else{
			
			System.out.println("Falso");
			
		}
		 
			 
			
 
    }


}