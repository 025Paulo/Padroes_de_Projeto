package padroesestruturais.Facade;

import ExemploClone.Jogador;

public class Cliente implements Cloneable {

    public boolean quitarDivida() {
        return ClienteFacade.verificarPendenciasDivida(this);
    }

    private long cpf;
    private int agencia;
    private int conta;
    private int digito;

    public long getCpf() {
        return cpf;
    }

    public Cliente setCpf(long cpf) {
        this.cpf = cpf;
        return this;
    }

    public int getAgencia() {
        return agencia;
    }

    public Cliente setAgencia(int agencia) {
        this.agencia = agencia;
        return this;
    }

    public int getConta() {
        return conta;
    }

    public Cliente setConta(int conta) {
        this.conta = conta;
        return this;
    }

    public int getDigito() {
        return digito;
    }

    public Cliente setDigito(int digito) {
        this.digito = digito;
        return this;
    }

    public Cliente() {
        this.cpf = 111222333-45;
        this.agencia = 1234;
        this.conta = 12345;
        this.digito = 6;
    }

}
