

class Conta{

    String nome;
    int    numero;
    String agencia;
    double saldo;
    String criacao;

    
            
    //class construtora
    public Conta(String nome, int numero, String agencia, double saldo, String criacao){

        this.nome     = nome;
        this.numero   = numero;
        this.agencia  = agencia;
        this.saldo    = saldo;
        this.criacao  = criacao;
    }

    //CLASSES PADRÃO
    public void AlterarNome(){
        this.nome = nome;
    } 

    //Classes de retorno 
    public String RetornoNome(){
        return this.nome = nome;       
    }

    public int RetornoNumero(){
        return this.numero = numero; 
    }

    public String RetornoAgencia(){
        return this.agencia = agencia;       
    }
    
    public double RetornoSaldo(){
        return this.saldo = saldo;
    }
    
    public String RetornoCriacao(){
        return this.criacao = criacao;
    }


    // //Saque
    // public void Sacar(double saque){

    //     this.saldo -=saque;
        
    //     System.out.println("Você sacou: "+ saque +"R$ \nSeu saldo atual é de: " + saldo +"R$");

    // }


}
