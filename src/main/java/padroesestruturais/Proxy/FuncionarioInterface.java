package padroesestruturais.Proxy;

import java.util.List;

public interface FuncionarioInterface {
    List<String> obterCpf();
    List<Float> obterSalario(Gerente gerente);
}
