package padroesestruturais.Bridge;

public class TraducaoFrances extends Traducao {
    public TraducaoFrances(Tradutor tradutor) {
        super(tradutor);
    }

    @Override
    public String traduzir() {
        return ("Traducao Frances - " + tradutor.traduzirTexto());
    }
}
