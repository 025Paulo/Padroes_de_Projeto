package padroescomportamentaisTest.State;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padroescomportamentamentais.State.*;

public class PacienteTest {

    private Paciente paciente;

    @BeforeEach
    public void setUp() {
        paciente = new Paciente();
    }

    @Test
    public void naoDeveDarAltaPacienteQueJaEstaAlta() {
        paciente.setEstado(PacienteEstadoAlta.getInstance());
        assertFalse(paciente.alta());
    }

    @Test
    public void deveInternarPacienteNoCTIDepoisDeObservacao() {
        paciente.setEstado(PacienteEstadoObservacao.getInstance());
        assertTrue(paciente.internarCTI());
        assertEquals(PacienteEstadoCTI.getInstance(), paciente.getEstado());
    }

    @Test
    public void deveInternarPacienteNoCTIDepoisDeInternado() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertTrue(paciente.internarCTI());
        assertEquals(PacienteEstadoCTI.getInstance(), paciente.getEstado());
    }

    @Test
    public void deveInternarPacienteNaUTIDepoisDeInternado() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertTrue(paciente.internarUTI());
        assertEquals(PacienteEstadoUTI.getInstance(), paciente.getEstado());
    }

    @Test
    public void deveDarAltaPacienteDepoisDeInternado() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertTrue(paciente.alta());
        assertEquals(PacienteEstadoAlta.getInstance(), paciente.getEstado());
    }

    @Test
    public void deveInternarPacienteEmObservacaoDepoisDeInternado() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertTrue(paciente.observacao());
        assertEquals(PacienteEstadoObservacao.getInstance(), paciente.getEstado());
    }

    @Test
    public void deveLevarPacienteParaCirurgiaDepoisDeInternado() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertTrue(paciente.cirurgia());
        assertEquals(PacienteEstadoCirurgia.getInstance(), paciente.getEstado());
    }

    @Test
    public void deveColocarPacienteEmObservacaoDepoisDaUTI() {
        paciente.setEstado(PacienteEstadoUTI.getInstance());
        assertTrue(paciente.observacao());
        assertEquals(PacienteEstadoObservacao.getInstance(), paciente.getEstado());
    }

    @Test
    public void deveTratarPacienteDepoisDeInternado() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertTrue(paciente.tratamento());
        assertEquals(PacienteEstadoTratamento.getInstance(), paciente.getEstado());
    }

}
