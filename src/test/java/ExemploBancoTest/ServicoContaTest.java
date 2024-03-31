package ExemploBancoTest;

import ExemploBanco.IServico;
import ExemploBanco.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoContaTest {
    @Test
    void deveExecutarCriacaoConta() {
        IServico servico = ServicoFactory.obterServico("Conta");
        assertEquals("Conta criada", servico.executar());
    }

    @Test
    void deveCancelarCriacaoConta() {
        IServico servico = ServicoFactory.obterServico("Conta");
        assertEquals("Criacao cancelada", servico.cancelar());
    }
}
