package padroescomportamentaisTest.Iterator;

import org.junit.jupiter.api.Test;
import padroescomportamentamentais.Iterator.Carro;
import padroescomportamentamentais.Iterator.Estacionamento;
import padroescomportamentamentais.Iterator.Vaga;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstacionamentoTest {

    @Test
    void deveContarVagasUtilizadas() {
        Vaga vaga = new Vaga(
                new Carro("NRN7F87", true),
                new Carro("FLAZ1C0", true),
                new Carro("BRN8K23", false),
                new Carro("KWQ2S21", false)
        );
        assertEquals(2, Estacionamento.contarVagasUtilizadas(vaga));
    }

    @Test
    void deveContarTotalVagas() {
        Vaga vaga = new Vaga(
                new Carro("NRN7F87", true),
                new Carro("FLAZ1C0", true),
                new Carro("BRN8K23", false),
                new Carro("KWQ2S21", false)
        );
        assertEquals(4, Estacionamento.contarTotalVagas(vaga));
    }

}
