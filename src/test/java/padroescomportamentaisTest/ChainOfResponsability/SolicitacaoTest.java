package padroescomportamentaisTest.ChainOfResponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padroescomportamentamentais.ChainOfResposability.*;

import static org.junit.Assert.assertEquals;

class SolicitacaoTest {

    Gerente gerente;
    Supervisor supervisor;
    SuporteTecnico suporteTecnico;

    SolicitacaoInvalida solicitacaoInvalida;

    @BeforeEach
    void setUp() {
        supervisor = new Supervisor(null);
        suporteTecnico = new SuporteTecnico(supervisor);
        gerente = new Gerente(suporteTecnico);
    }

    @Test
    void deveRetornarGerenteParaSolicitacaoBasica() {
        assertEquals("Supervisor", gerente.atenderSolicitacao(new SolicitacaoSuporte(SolicitacaoBasica.getSolicitacaoBasica())));
    }

    @Test
    void deveRetornarSuporteTecnicoParaSolicitacaoIntermediaria() {
        assertEquals("Gerente", gerente.atenderSolicitacao(new SolicitacaoSuporte(SolicitacaoIntermediaria.getSolicitacaoIntermediaria())));
    }

    @Test
    void deveRetornarSupervisorParaSolicitacaoAvancada() {
        assertEquals("Suporte Técnico", gerente.atenderSolicitacao(new SolicitacaoSuporte(SolicitacaoAvancada.getSolicitacaoAvancada())));
    }
    @Test
    void deveRetornarMensagemParaSolicitacaoNaoSuportada() {
        assertEquals("Solicitação não suportada", gerente.atenderSolicitacao(new SolicitacaoSuporte(SolicitacaoInvalida.getSolicitacaoInvalida())));
    }
}
