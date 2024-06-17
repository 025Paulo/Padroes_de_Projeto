package padroescomportamentaisTest.Mediator;

import org.junit.jupiter.api.Test;
import padroescomportamentamentais.Mediator.Cliente;

import static org.junit.Assert.assertEquals;

public class ReclameAquiTest {

    @Test
    void deveReclamarEmpresa() {
        Cliente cliente = new Cliente();
        assertEquals("O ReclameAqui agradece seu contato.\nA Empresa respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Empresa vai procurar melhorar o serviço da reclamação: Produto entregue com defeito",
                cliente.reclamarEmpresa("Produto entregue com defeito"));
    }

    @Test
    void deveElogiarEmpresa() {
        Cliente cliente = new Cliente();
        assertEquals("O ReclameAqui agradece seu contato.\nA Empresa respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Empresa agradece a mensagem: Atendimento excelente",
                cliente.elogiarEmpresa("Atendimento excelente"));
    }

    @Test
    void deveSugerirEmpresa() {
        Cliente cliente = new Cliente();
        assertEquals("O ReclameAqui agradece seu contato.\nA Empresa respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Empresa vai analisar a sugestão: Implementar chat online no suporte",
                cliente.sugerirEmpresa("Implementar chat online no suporte"));
    }
}
