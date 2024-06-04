package padroescomportamentamentais.Observer;

import java.util.Observable;
import java.util.Observer;

public class Pessoa implements Observer {
    private String nome;
    private String notificacaoPix;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNotificacaoPix() {
        return this.notificacaoPix;
    }

    public void gerarChavePix(Nubank nubank) {
        nubank.addObserver(this);
    }

    public void update(Observable nubank, Object arg1) {
        this.notificacaoPix = this.nome + ", você recebeu um pix na " + nubank.toString  ();
    }
}
