package padroesestruturais.Proxy;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private static Map<Double, Funcionario> funcionarios = new HashMap<>();

    public static Funcionario getFuncionario(double cpf) {
        return funcionarios.get(cpf);
    }
    public static void addFuncionario(Funcionario funcionario) {
        funcionarios.put(funcionario.getCpf(), funcionario);
    }
}
