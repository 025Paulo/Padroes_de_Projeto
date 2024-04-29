package padroesestruturais.Flyweight;

public class Destino {
    private String cidade;
    private String estado;

    public Destino(String cidade, String estado) {
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}
