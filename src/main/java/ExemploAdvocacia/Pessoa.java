package ExemploAdvocacia;

public class Pessoa {

    private Recibo recibo;
    private Contrato contrato;

    public Pessoa(Fabrica fabrica) {
        this.recibo = fabrica.createRecibo();
        this.contrato = fabrica.createContrato();
    }

    public String emitirRecibo(){
        return this.recibo.emitir();
    }

    public String emitirContrato(){
        return this.contrato.emitir();
    }

}
