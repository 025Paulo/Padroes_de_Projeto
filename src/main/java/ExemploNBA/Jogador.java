package ExemploNBA;

public class Jogador {

    private Contrato contrato;
    private Time time;

    private TimeSelecao Timeselecao;


    public Jogador(Burocracia burocracia) {
        this.contrato = burocracia.createContrato();
        this.time = burocracia.createTime();
        this.time = burocracia.createTimeSelecao();
    }

    public String emitirContrato() { return this.contrato.emitir(); }
    public String emitirTime() { return this.time.emitir(); }

}
