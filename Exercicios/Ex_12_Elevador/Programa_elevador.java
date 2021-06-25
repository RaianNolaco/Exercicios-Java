import java.util.*;


public class Programa_elevador{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        Elevador elevador1 = new Elevador(12,18);
         
        System.out.println("botão (1 = subir 2 = Descer)");
        int botao = sc.nextInt();

        while(botao >=3 || botao <= 0){

            System.out.println("Escolha uma opção valida");
            
            System.out.println("botão (1 = subir 2 = Descer)");
            botao = sc.nextInt();
        }

        switch(botao){

            case 1:
            
                System.out.println("quantos andares quer subir?");
                int up = sc.nextInt();

                elevador1.Subir(up);

            break;

            
            case 2:
            
                System.out.println("quantos andares quer descer?");
                int domn = sc.nextInt();

                elevador1.Descer(domn);

            break;



        }


    } 

}
