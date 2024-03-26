package ExemploBancoTest;

import ExemploBanco.IServico;
import ExemploBanco.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoDeposito {

    @Test
    void deveExecutarDeposito() {
        IServico servico = ServicoFactory.obterServico("Deposito");
        assertEquals("Deposito efetuado", servico.cancelar());
    }

    @Test
    void deveCancelarDeposito() {
        IServico servico = ServicoFactory.obterServico("Deposito");
        assertEquals("Deposito cancelada", servico.cancelar());
    }
}
