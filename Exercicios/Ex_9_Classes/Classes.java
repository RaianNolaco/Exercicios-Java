 import java.util.*;

class Conta {

    int    numero;
    String titular;
    double saldo;
    int    agencia;
    Date   data_criacao;
    String banco;

    void receberDeposito(double quantidade){
        double novoSaldo = this.saldo + quantidade;
        
    }


}



class formaDeVida {

    Date data_criacao;
    int  expectativa_vida;
    Date date_final;

} 



class Veiculos {

    double  combustivel;
    String  marca;
    String  motor;
    int     preco;
    boolean possui_rodas;
    boolean conduzido;
    double  peso;
    double  velocidade;
    double  velocidade_maxima;
    double  kilometragem;

} 



class Carro extends Veiculos{

   int     qnt_portas;
   String  cor;
   int     qnt_assentos;				 
   boolean manual; 
   String  placa;
   String  freio;
   boolean blindagem;
   String  marca_bateria;
   String  proprietario;
   
}



class Animal {

    String nome_social;
    String nome_cientifico;
    String dieta;
    String filo;
    String classe;
    String ordem;
    String familia;
    String genero;
    String especie;
    String habitat;
    

} 



class Personagem {

    String nome;
    String personalidade;
    String pai;
    String mae;
    String etinia;
    String voz;
    String cor_olhos;
    String cor_pele;
    boolean usa_sapato;
    String sexo;

} 




class Ferramenta {

    float  preco;
    String nome;
    String cor;
    String ultilidade;
    float  tamanho;
    String marca;
    String peso;
    String desgasto;
   

}



class Conversa {

    String assunto;
    int    qnt_participantes; 
    String tempo;
    String idioma;
    String sentimentos;
    String meio;
    

}



class Pensamento {
    
    String motivo;
    String so_sei_que_nada_sei;
    String lingugem;
    boolean consiente;
    


}