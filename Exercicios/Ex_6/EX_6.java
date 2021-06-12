	import java.util.*;

public class EX_6{
    public static void main(String [] args){
		 

		 Scanner sc = new Scanner(System.in);
		 
		 int calc = 0;
		 
		 for(int i = 1; i <=10; i++){
			 
			 
		 	 System.out.println("Informe o " + i + " numero: ");
		     int n1 = sc.nextInt();
		 
			 calc += n1;
			 
		 }

     		 System.out.println("A soma dos 10 numeros e igual a " + calc);
		 	 
			 
		 } 

}