
public class Elevador {
 
   int  andar_atual = 0;
   int  total_andares;
   int  capacidade;
   int  pessoas_abordo = 0;


   public Elevador(int total_andares ,int capacidade){
 
        this.total_andares  = total_andares;
        this.capacidade     = capacidade;
   }

   public void Entrar(int qnt_pessoas_entrando){

        int calc = this.capacidade - qnt_pessoas_entrando;

        if(qnt_pessoas_entrando > calc){

            System.out.println("ah pasageiros de mais");

        }else{

            this.pessoas_abordo += qnt_pessoas_entrando;
            System.out.println("Quantidade de pessoas abordo: " + pessoas_abordo); 

        }
   }

   public void Sair(int qnt_pessoas_saindo){

        this.pessoas_abordo -= qnt_pessoas_saindo;
        System.out.println("Quantidade de pessoas abordo: " + pessoas_abordo);

   }


    public void ir(int andar){

        if(andar > this.total_andares || andar < 0){

            System.out.println("Esse andar não existe");

        }else if(andar > this.andar_atual){

            System.out.println("Subindo");

        }
        else{

            System.out.println("Descendo");

        }


    }

    public void Subir(int up){

       if(this.andar_atual == this.total_andares || up > this.total_andares){

            System.out.println("Nãe existe andares superiores");        

       }else{

            System.out.println("Subindo");
            this.andar_atual += up;

            System.out.println("Voce esta no "+this.andar_atual+"° andar.");

       }

    }

    public void Descer(int domn){

        if(this.andar_atual == 0 || domn < 0){
 
            System.out.println("Nãe existe andares inferiores");        
 
        }else{
 
            System.out.println("Descendo");
            this.andar_atual -= domn; 
 
            System.out.println("Voce esta no "+this.andar_atual+"° andar.");
        }
 
     }
}
