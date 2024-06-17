package padroescomportamentamentais.Command;

public class LigarLuzComando implements Comando {

    private Luz luz;

    public LigarLuzComando(Luz luz) {
        this.luz = luz;
    }

    public void executar() {
        this.luz.ligar();
    }

    public void cancelar() {
        this.luz.desligar();
    }
}
