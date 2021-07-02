import java.util.*;

public class conta_banco_programa{

    public static void main(String [] args){

        Conta conta1 = new Conta("Raian",1234,"Nubank",3200,"01/07/2021");

        System.out.println(conta1.RetornoNome());

        conta1.Sacar(200);

        System.out.println(conta1.RetornoNome());
        System.out.println(conta1.RetornoAgencia());

        conta1.Depositar(300);

    }

}