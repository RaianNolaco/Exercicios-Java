public class Programa {
    public static void main(String[] args) {    
        
        Carro Carro1 = new Carro("Fiat", "Ferrari", "V12", 4, 1987, 0, "Branco");
        Carro Carro2 = new Carro("Fiat", "Ferrari", "Mitsubishi", 4, 1987, 0, "Vermelho");
        Carro Carro3 = new Carro("Ford", "Michelin", "Uno", 4, 1987, 0, "Branco" );
        Carro Carro4 = new Carro("Ford", "Ferrari",  "Fusca", 4, 1987, 0, "Branco");

        Carro1.liga();
        Carro2.definirCor("Roxo");
        Carro4.definirMarca("Red Bull");

        System.out.println("Esse carro é um " + Carro1.returnMarca() + ", com motor " + Carro1.returnMotor() + ", feito em " + Carro1.returnAno());
        System.out.println("Esse carro é da " + Carro2.returnMarca() + ", com motor " + Carro2.returnMotor() + ", feito em " + Carro2.returnAno() + "e tem a cor" + Carro4.returnCor());
        System.out.println("Esse carro é da " + Carro3.returnMarca() + ", com motor " + Carro3.returnMotor() + ", feito em " + Carro3.returnAno());
        System.out.println("Esse carro é da " + Carro4.returnMarca() + ", com motor " + Carro4.returnMotor() + ", feito em " + Carro4.returnAno() + "e tem a cor" + Carro4.returnCor());
    
        System.out.println("O nome do meu carro é " + Carro2.returnNome());
        Carro2.definirNome("Palio do Clebinho");
        System.out.println("O nome do meu carro é " + Carro2.returnNome());

   }
}