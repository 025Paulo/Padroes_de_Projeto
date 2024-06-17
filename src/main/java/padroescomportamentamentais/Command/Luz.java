package padroescomportamentamentais.Command;

public class Luz {

    private String localizacao;

    public Luz(String localizacao) {
        this.localizacao = localizacao;
    }

    public void ligar() {
        System.out.println(this.localizacao + " luz ligada");
    }

    public void desligar() {
        System.out.println(this.localizacao + " luz desligada");
    }
}
