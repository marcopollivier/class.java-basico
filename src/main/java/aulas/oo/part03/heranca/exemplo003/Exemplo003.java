package aulas.oo.part03.heranca.exemplo003;

public class Exemplo003 {

    public static void main(String[] args) {

        Veiculo generico = new Veiculo();
        generico.setValorVenal(1000.0);
        System.out.println(generico.calculaImposto()); //10.0

        Veiculo carro = new Carro();
        carro.setValorVenal(1000.0);
        System.out.println(carro.calculaImposto()); //70.0

        Veiculo moto = new Motocicleta();
        moto.setValorVenal(1000.0);
        System.out.println(moto.calculaImposto()); //30.0

    }

}
