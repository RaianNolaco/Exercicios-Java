import java.util.*;

public class conta_banco_programa{

    public static void main(String [] args){

        System.out.println("Digite seu nome: ");
        String nome =  sc.nextLine();

        System.out.println();
        System.out.println();
    
        Conta conta1 = new Conta("Raian",1234,"Nubank",3200,"01/07/2021",5);


        System.out.println(conta1.RetornoNome());

        conta1.Sacar(200);

        System.out.println(conta1.RetornoNome());
        System.out.println(conta1.RetornoAgencia());

        conta1.Depositar(300);

        conta1.caclularRendimento(500, 2);

    }

}