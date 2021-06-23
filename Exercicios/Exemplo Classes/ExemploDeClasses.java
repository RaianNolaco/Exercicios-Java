class Conta {
    int numero;
    String titular;
    double saldo;
    int agencia;
    Date data_criacao;
    String banco;

    void sacar(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    void receberDeposito(double quantidade) {
        double novoSaldo = this.saldo + quantidade;
        this.saldo = novoSaldo;
    }  
}

class formaDeVida {
    Date data_criacao;
    int expectativa_vida;
    Date date_final;

    respirar();
    alimentar;
    crescer;
    reproduzir;
    morrer;
} 

class Veiculos {
    double combustivel;
    String marca;
    String motor;
    int preco;
    boolean possui_rodas;
    boolean conduzido;
    double peso;
    double velocidade;
    double velocidade_maxima;
    double kilometragem;

    acelerar;
    reduzir;
    acelerar_para_tras;
    atropelar;
    trocarMarcha;
}

class Carro {
    Date tempo_cricao;
    Date ultimo_reparo;
    Date ultimo_reparo;
    int portas;
    int numero_portas;
    int assentos;
    String proprietario;
    String motor;
    double quantidade_combustivel;
    double limite_combustivel;
    double velocidadeAtual;
    double kilometragem;
    double velocidade_maxima;
    String cor;
    double porta_malas;
    String tipo; //Esportivo? Casual?
    int peso;

    void liga() {
        System.out.println("O carro está ligado");
    }

    void acelera(double quantidade) {
        double velocidadeNova = this.velocidadeAtual + quantidade;
        this.velocidadeAtual = velocidadeNova;
    }

    void reduzir(double quantidade) {
        double velocidadeNova = this.velocidadeAtual - quantidade;
        this.velocidadeAtual = velocidadeNova;
    }

    int trocarMarcha() {
        if (this.velocidadeAtual < 0) {
            return -1;
        }
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
            return 1;
        }
        if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
            return 2;
        }
        return 3;
    }
}

class Animal {
    double locomocao;
    String especie;
    String habitat;
    String bioma;
    boolean pulmao;
    String nome;
    String nome_cientifico;
    boolean vertebra;
    String dieta;
    String cor;
} 

class Personagem {
    // Turma da Mônica
    String nome;
    int altura;
    double peso;
    boolean roupa;
    int forca;
    double inteligencia;
    String classe; //adulto, crianca, anjo, sobrenatural, alien ou animal
    String habitos_linguisticos;
    String voz;
    String cor_pele;
    String cor_cabelo;
    String cor_olhos;
    String cor_roupa;
    int usa_sapato;
    Integer fios_cabelo;

} 


class Ferramenta {
    String marca;
    String cor;
    int desgaste;
    boolean tipo;
    int peso;
    String multi;
    boolean utilidade;
}

class Conversa {
    int participantes; //pessoas
    String linguagem;
    String assunto;
    String sentimentos; 
    String meio;    
    String duracao;
    Date inicio; 
    boolean gostou_da_conversa;  
}

class Pensamento {
    String tempo;
    int duracao; 

    String emocao;

    String ideias;
    String conclusao;
    String motivo;
    String analise;

    double velocidade;

    String intencionalidade;
    int intensidade;
  
    String tema;
    String assunto;
    String imaginacao;
    
    String sentido; //qual sentido 
    String voz;
    String som;

    boolean consciente; // ou inconsciente?
}