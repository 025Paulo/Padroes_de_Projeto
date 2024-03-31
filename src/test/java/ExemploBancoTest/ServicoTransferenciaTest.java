package ExemploBancoTest;

import ExemploBanco.IServico;
import ExemploBanco.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoTransferenciaTest {
    @Test
    void deveExecutarTransferencia() {
        IServico servico = ServicoFactory.obterServico("Transferencia");
        assertEquals("Transferencia realizada", servico.executar());
    }

    @Test
    void deveCancelarTransferencia() {
        IServico servico = ServicoFactory.obterServico("Transferencia");
        assertEquals("Transferencia cancelada", servico.cancelar());
    }
}
