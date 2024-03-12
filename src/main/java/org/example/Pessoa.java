package org.example;

public class Pessoa {

    private Recibo recibo;
    private Historico historico;

    public Pessoa(Fabrica fabrica) {
        this.recibo = fabrica.createRecibo();
        this.historico = fabrica.createHistorico();
    }

    public String emitirRecibo(){
        return this.recibo.emitir();
    }

    public String emitirHistorico(){
        return this.historico.emitir();
    }

}
