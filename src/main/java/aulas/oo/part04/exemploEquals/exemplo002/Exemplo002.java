package aulas.oo.part04.exemploEquals.exemplo002;

public class Exemplo002 {

    public static void main(String[] args) {

        Veiculo carro1 = new Carro("Palio", "Fiat", 20000.0);
        Veiculo carro2 = new Carro("Palio", "Fiat", 20000.0);

        System.out.println(carro1.equals(carro2)); //false

    }

}
