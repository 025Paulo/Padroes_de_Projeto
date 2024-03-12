package org.example;

public class FabricaPJ implements Fabrica {

    @Override
    public Recibo createRecibo() {
        return new ReciboPJ();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoReciboPJ();
    }
}
