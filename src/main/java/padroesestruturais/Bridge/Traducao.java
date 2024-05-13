package padroesestruturais.Bridge;

public abstract class Traducao {
    protected Tradutor tradutor;

    public Traducao(Tradutor tradutor) {
        this.tradutor = tradutor;
    }

    public void setTradutor(Tradutor tradutor) {
        this.tradutor = tradutor;
    }

    public abstract String traduzir();
}