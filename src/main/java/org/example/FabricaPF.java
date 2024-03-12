package org.example;

public class FabricaPF implements Fabrica {

    @Override
    public Recibo createRecibo() {
        return new ReciboPF();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoReciboPF();
    }
}
