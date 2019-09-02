package aulas.oo.part04.exemploThis;

public class Motocicleta extends Veiculo {

    private String cilindradas;

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public double calculaImposto() {
        return this.getValorVenal() * 0.03;
    }
}
