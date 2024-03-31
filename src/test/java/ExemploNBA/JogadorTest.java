package ExemploNBA;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class JogadorTest {

    @Test
    void deveEmitirContrato() {
        Burocracia burocracia = new BurocraciasJogador();
        Jogador jogador = new Jogador(burocracia);
        assertEquals("Contrato do jogador", jogador.emitirContrato());
    }

    @Test
    void deveEmitirTime() {
        Burocracia burocracia = new BurocraciasJogador();
        Jogador jogador = new Jogador(burocracia);
        assertEquals("Time NBA", jogador.emitirTime());
    }

    @Test
    void deveEmitirTimeSelecao() {
        Burocracia burocracia = new BurocraciasJogador();
        Jogador jogador = new Jogador(burocracia);
        assertEquals("Selecao", jogador.emitirTimeSelecao());
    }

}
