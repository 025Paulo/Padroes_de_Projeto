package ExemploNBA;

public class BurocraciasJogador implements Burocracia {

    @Override
    public Contrato createContrato() {
        return new ContratoJogador();
    }

    @Override
    public Time createTime() {
        return new TimeBasquete();
    }

    @Override
    public Time createTimeSelecao() {
        return new TimeSelecao();
    }

}
