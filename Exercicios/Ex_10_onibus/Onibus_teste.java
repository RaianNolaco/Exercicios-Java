import java.util.*;

public class Onibus_teste {

    public static void main(String [] args){


        Scanner sc =  new Scanner(System.in);

        Onibus onibus1 = new Onibus("Grajau",10,32,13);

        System.out.println("Local atual: "+ onibus1.returnLocal_atual());
        System.out.println("Quanti dade maxima de passageiros suportados é de: "+ onibus1.returnCapacidade_pessoas());
        System.out.println("O onibus possui: "+ onibus1.returnPessoas_abordo() +" pessoas abordo");


        onibus1.parada();

        System.out.println("Qual parada quer saber?");
        int p = sc.nextInt();

        System.out.println(onibus1.retornarParadas(p));
        
        System.out.println("Deseja saber todas as paradas?(1 = sim /2 = não)");
        int n1 = sc.nextInt(); 

        if(n1 == 1 || n1 == 1){
            onibus1.retornarTodasParadas();
        }

        // System.out.println("\nQuantas pesoas sairam?: ");
        // int pessoasSair = sc.nextInt();

        // onibus1.Sair(pessoasSair);


        // System.out.println("\nO onibus possui: "+ onibus1.returnPessoas_abordo() +" pessoas abordo");

        // onibus1.para();

        // System.out.println("\nQuantas pesoas entraram?\n");
        // int pessoasEntrar = sc.nextInt();

        // onibus1.Entra(pessoasEntrar);

        // onibus1.andar();



        sc.close();
    }

    
}
