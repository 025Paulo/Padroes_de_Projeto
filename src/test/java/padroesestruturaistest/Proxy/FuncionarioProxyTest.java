package padroesestruturaistest.Proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padroesestruturais.Proxy.Banco;
import padroesestruturais.Proxy.Funcionario;
import padroesestruturais.Proxy.FuncionarioProxy;
import padroesestruturais.Proxy.Gerente;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FuncionarioProxyTest {

    @BeforeEach
    void setUp() {
        Banco.addFuncionario(new Funcionario(111123123-25, "Paulo", 1450f, 300f));
        Banco.addFuncionario(new Funcionario(123456789-00, "Iandra", 2250f, 300f));
    }

    @Test
    void deveRetornarCpfFuncionario() {
        FuncionarioProxy funcionario = new FuncionarioProxy(111123123-25);

        assertEquals(Arrays.asList("Paulo"), funcionario.obterCpf());
    }
    @Test
    void deveRetonarNotasAluno() {
        Gerente gerente = new Gerente("Lucas", true);
        FuncionarioProxy funcionario = new FuncionarioProxy(123456789-00);

        assertEquals(Arrays.asList(2250.0f), funcionario.obterSalario(gerente));
    }

    @Test
    void deveRetonarExcecaoUsuarioNaoAutorizadoConsultarNotasAluno() {
        try {
            Gerente gerente = new Gerente("Marcos", false);
            FuncionarioProxy funcionario = new FuncionarioProxy(1232134232-25);

            funcionario.obterSalario(gerente);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Acesso negado", e.getMessage());
        }
    }
}
