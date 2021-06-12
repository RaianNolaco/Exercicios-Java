import java.util.*;

public class EX_1{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int n1 = sc.nextInt();
		
		if(n1 >0){
			
			System.out.println(n1 + " e positivo");
			
		}else if (n1 == 0){
			
			System.out.println(n1 + " e nulo");
			
		}
		else{
			 
			 System.out.print(n1 + " e negativo");
			
		}
		
	}
	
	
}