import java.util.*;

public class EX_2{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1° Numero ");
		int n1 = sc.nextInt();
		
		System.out.println("Digite o 2° Numero ");
		int n2 = sc.nextInt();
		
		System.out.println("Digite o 3° Numero");
		int n3 = sc.nextInt();
		
		if( n1 > n2 && n1 > n3){
			
			System.out.println("O maior valor eh " + n1);
			
		}else if(n2 > n1 && n2 > n3 ){
			
			System.out.println("O maior valor eh "+ n2 );
			
		}else {
			
			System.out.println("O maior valor eh " + n3);
			
		}	
         		

	}
	
	
}