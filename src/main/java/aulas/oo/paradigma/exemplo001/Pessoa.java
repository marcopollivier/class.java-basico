package aulas.oo.paradigma.exemplo001;

public class Pessoa {

    private String nome = "Marco";

    public String getNome() {
        return nome;
    }

    public String falarMeuProprioNome(){
        return "Olá, meu nome é " + getNome();
    }
}
