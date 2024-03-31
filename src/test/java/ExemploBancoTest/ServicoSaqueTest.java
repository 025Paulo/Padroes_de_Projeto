package ExemploBancoTest;

import ExemploBanco.IServico;
import ExemploBanco.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoSaqueTest {

    @Test
    void deveExecutarSaque() {
        IServico servico = ServicoFactory.obterServico("Saque");
        assertEquals("Saque efetuado", servico.executar());
    }

    @Test
    void deveCancelarDeposito() {
        IServico servico = ServicoFactory.obterServico("Saque");
        assertEquals("Saque cancelado", servico.cancelar());
    }
}

