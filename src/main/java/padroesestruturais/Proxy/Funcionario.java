package padroesestruturais.Proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Funcionario implements FuncionarioInterface {
    private String nome;
    private Double cpf;
    private float salario;
    private float ValeTransporte;

    public Funcionario(double cpf) {
        this.cpf = cpf;
        Funcionario objeto = Banco.getFuncionario(cpf);
        this.nome = objeto.nome;
        this.salario = objeto.salario;
        this.ValeTransporte = objeto.ValeTransporte;
    }

    public Funcionario(double cpf, String nome, Float salario, Float ValeTransporte) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
        this.ValeTransporte = ValeTransporte;
    }

    public Double getCpf() {
        return cpf;
    }

    @Override
    public List<String> obterCpf() {
        return Arrays.asList(this.nome);
    }

    @Override
    public List<Float> obterSalario(Gerente gerente) {
        return Arrays.asList(this.salario);
    }
}
