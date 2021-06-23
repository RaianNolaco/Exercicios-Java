class Carro {
    String marca;
    String motor;
    String modelo;
    String tempo_cricao;
    String ultimo_reparo;
    int portas;
    int numero_portas;
    int assentos;
    String proprietario;
    String preco;
    int ano;
    double quantidade_combustivel;
    double limite_combustivel;
    double velocidadeAtual;
    double kilometragem;
    double velocidade_maxima;
    String cor;
    double porta_malas;
    String tipo; //Esportivo? Casual?
    int peso;

    //Método construtor
    public Carro(String marca, String modelo, String motor, int portas, int ano, double kilometragem, String cor) {
        this.portas = portas;
        this.ano = ano;
        this.kilometragem = kilometragem;
        this.cor = cor;   
        this.marca = marca; 
        this.motor = motor; 
        this.modelo = modelo;
    }

    public int returnAno()  {
        return ano;
    }

    public String returnMarca()  {
        return this.marca;
    }

    public String returnMotor() {
        return this.motor;
    }

    public String returnNome() {
        return this.modelo;
    }    

    public void definirNome(String modelo) {
        this.modelo = modelo;
    }

    public void definirCombustivel(double quantidade) {
        this.quantidade_combustivel =  this.quantidade_combustivel- quantidade;
    }    

    public void definirCor(String cor) {
        this.cor = cor;
    }

    public void  definirMarca(String marca){
        this.marca = marca;
    }

    void liga() {
        System.out.println("O carro está ligado");
    }
}