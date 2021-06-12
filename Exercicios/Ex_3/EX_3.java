import java.util.*;

public class EX_3{
    public static void main(String [] args){

       Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Digite o 1° Numero ");
	   int n1 = sc.nextInt();
		
	   System.out.println("Digite o 2° Numero ");
	   int n2 = sc.nextInt();
		
	   System.out.println("Digite o 3° Numero");
	   int n3 = sc.nextInt();


       if(n1 > n2 && n3 > n2 ){
		   
		  int soma = n1 + n3;
		  System.out.println(soma);

		   
	   }else if(n2 > n1 && n3 > n1){
		   
		   int soma = n2 + n3;
           System.out.println(soma);
   		   
	   }
	   else{
		   
		   int soma = n1 + n2;
		   System.out.println(soma);
	   }
	   
    
      sc.close();    
	
    }


}