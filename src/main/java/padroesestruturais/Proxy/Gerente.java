package padroesestruturais.Proxy;

public class Gerente {
    private String nome;
    private boolean admin;

    public Gerente(String nome, boolean admin) {
        this.nome = nome;
        this.admin = admin;
    }

    public String getNome() {
        return nome;
    }

    public Gerente setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
