package padroesestruturais.Flyweight;

public class Passageiro {
    private String nome;
    private Destino destinoFinal;

    public Passageiro(String nome, Destino destinoFinal) {
        this.nome = nome;
        this.destinoFinal = destinoFinal;
    }

    public String obterPassageiro() {
        return "Passageiro{" +
                "nome='" + this.nome + '\'' +
                ", cidade='" + destinoFinal.getCidade() + '\'' +
                ", uf='" + destinoFinal.getEstado() + '\'' +
                '}';
    }
}
