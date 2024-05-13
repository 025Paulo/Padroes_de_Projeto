package padroesestruturais.Proxy;

import java.util.List;

public class FuncionarioProxy implements FuncionarioInterface {
    public Funcionario funcionario;
    private Double cpf;

    public FuncionarioProxy(double cpf) {
        this.cpf = cpf;
    }

    @Override
    public List<String> obterCpf() {
        if (this.funcionario == null ) {
            this.funcionario = new Funcionario(cpf);
        }
        return this.funcionario.obterCpf();
    }

    @Override
    public List<Float> obterSalario(Gerente gerente) {
        if (!gerente.isAdmin()) {
            throw new IllegalArgumentException("Acesso negado");
        }
        if (this.funcionario == null) {
            this.funcionario = new Funcionario(this.cpf);
        }
        return this.funcionario.obterSalario(gerente);
    }

}
