package ExemploBancoTest;

import ExemploBanco.IServico;
import ExemploBanco.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ServicoFactoryTest {

    @Test
    void deveRetornarErroServicoInexistente() {
        try {
            IServico servico = ServicoFactory.obterServico("Sair");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Servico inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarErroServicoInvalido() {
        try {
            IServico servico = ServicoFactory.obterServico("Conta fechada");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Servico inválido", e.getMessage());
        }
    }
}
