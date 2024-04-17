package padroesestruturais.Facade;

public class ClienteBuilder {

    private Cliente cliente;

    public ClienteBuilder() {
        cliente = new Cliente();
    }

    public ClienteBuilder setCliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    public Cliente build() {
        if (cliente.getCpf() <= 0) {
            throw new IllegalArgumentException("Cpf inválido");
        }
        if (cliente.getAgencia() <= 0) {
            throw new IllegalArgumentException("Agencia inválida");
        }
        if (cliente.getConta() <= 0) {
            throw new IllegalArgumentException("Conta inválida");
        }
        if (cliente.getDigito() < 0) {
            throw new IllegalArgumentException("Digito inválida");
        }
        return cliente;
    }

    public ClienteBuilder setCpf(long cpf) {
        cliente.setCpf(cpf);
        return this;
    }

    public ClienteBuilder setAgencia(int agencia) {
        cliente.setAgencia(agencia) ;
        return this;
    }

    public ClienteBuilder setConta(int conta) {
        cliente.setConta(conta);
        return this;
    }

    public ClienteBuilder setDigito(int digito) {
        cliente.setDigito(digito);
        return this;
    }

}
