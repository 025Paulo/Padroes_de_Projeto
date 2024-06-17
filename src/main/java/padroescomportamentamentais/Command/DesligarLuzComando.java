package padroescomportamentamentais.Command;

public class DesligarLuzComando implements Comando {

    private Luz luz;

    public DesligarLuzComando(Luz luz) {
        this.luz = luz;
    }

    public void executar() {
        this.luz.desligar();
    }

    public void cancelar() {
        this.luz.ligar();
    }
}
