import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

class Conta{

    String nome;
    int    numero;
    String agencia;
    double saldo;
    String criacao;
    double porcentagemPorMes;

    
            
    //class construtora
    public Conta(String nome, int numero, String agencia, double saldo, String criacao,double porcentagemPorMes){

        this.nome     = nome;
        this.numero   = numero;
        this.agencia  = agencia;
        this.saldo    = saldo;
        this.criacao  = criacao;
        this.porcentagemPorMes = porcentagemPorMes;
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


    // Saque
    public void Sacar(double saque){

        this.saldo -=saque;
        
        System.out.println("Você sacou: R$"+ saque +"\nSeu saldo atual é de: R$" + saldo);

    }

    public void Depositar(double deposito){

        this.saldo +=deposito;
        
        System.out.println("Você depositou: R$"+ deposito +"\nSeu saldo atual é de: R$" + saldo);

    }

    public void caclularRendimento(double deposito, int mes){
        
        double rendimentos = ((this.porcentagemPorMes/100)*deposito);

        double rendimentoMes = mes * rendimentos;

        System.out.println("Valor investindo R$" + deposito + "\n Você rendera: R$" + rendimentoMes + " em " + mes + "mêses");

    }    

}
