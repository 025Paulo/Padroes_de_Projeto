package padroesestruturais.Bridge;

public class TraducaoIngles extends Traducao {
    public TraducaoIngles(Tradutor tradutor) {
        super(tradutor);
    }

    @Override
    public String traduzir() {
        return ("Traducao Ingles - " + tradutor.traduzirTexto());
    }
}
