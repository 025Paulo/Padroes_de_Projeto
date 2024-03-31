package ExemploNBA;

public class Jogador {

    private Contrato contrato;
    private Time time;
    private Time timeselecao;


    public Jogador(Burocracia burocracia) {
        this.contrato = burocracia.createContrato();
        this.time = burocracia.createTime();
        this.timeselecao = burocracia.createTimeSelecao();
    }

    public String emitirContrato() { return this.contrato.emitir(); }
    public String emitirTime() { return this.time.emitir(); }
    public String emitirTimeSelecao() { return this.timeselecao.emitir(); }

}
