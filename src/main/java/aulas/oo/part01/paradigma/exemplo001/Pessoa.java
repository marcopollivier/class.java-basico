package aulas.oo.part01.paradigma.exemplo001;

public class Pessoa {

    private String nome = "Marco";

    public String getNome() {
        return nome;
    }

    public String falarMeuProprioNome(){
        return "Olá, meu nome é " + getNome();
    }

    public String andar() {
        return "Andando...";
    }
}
