package padroescomportamentamentais.Visitor;

public class Jornal implements Item {

    private String nome;
    private String data;

    public Jornal(String nome, String data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirJornal(this);
    }
}
