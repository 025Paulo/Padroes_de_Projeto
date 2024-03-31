package ExemploBancoTest;

import ExemploBanco.IServico;
import ExemploBanco.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoDepositoTest {

    @Test
    void deveExecutarDeposito() {
        IServico servico = ServicoFactory.obterServico("Deposito");
        assertEquals("Deposito efetuado", servico.executar());
    }

    @Test
    void deveCancelarDeposito() {
        IServico servico = ServicoFactory.obterServico("Deposito");
        assertEquals("Deposito cancelado", servico.cancelar());
    }
}
