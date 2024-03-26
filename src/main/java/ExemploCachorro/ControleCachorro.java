package ExemploCachorro;

public class ControleCachorro {
    private ControleCachorro () {};
    private static ControleCachorro instance = new ControleCachorro();
    public static ControleCachorro getInstance() {
        return instance;
    }
    private String raca;
    private String nome;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}