package padroescomportamentaisTest.Interpreter;

import org.junit.jupiter.api.Test;
import padroescomportamentamentais.Interpreter.Jogador;

import static org.junit.Assert.assertEquals;

public class JogadorTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Jogador jogador = new Jogador();
        jogador.setPontuacao1(2.0);
        jogador.setPontuacao2(5.0);

        assertEquals(9.0, jogador.calcularPontuacao(), 0.0001);
    }

}
