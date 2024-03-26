package ExemploBuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorBuilderTest {

    @Test
    void deveRetornarExcecaoNumeroCamisa() {
        try {
            JogadorBuilder jogadorBuilder = new JogadorBuilder();
            Jogador jogador = jogadorBuilder
                    .setNome("Vini jr")
                    .setTime("Real madrid")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoNome() {
        try {
            JogadorBuilder jogadorBuilder = new JogadorBuilder();
            Jogador jogador = jogadorBuilder
                    .setNumeroCamisa(7)
                    .setTime("Real Madrid")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoTime() {
        try {
            JogadorBuilder jogadorBuilder = new JogadorBuilder();
            Jogador jogador = jogadorBuilder
                    .setNumeroCamisa(7)
                    .setNome("Vini Jr")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Time inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoJogadorValido() {
        JogadorBuilder jogadorBuilder = new JogadorBuilder();
        Jogador jogador = jogadorBuilder
                .setNumeroCamisa(7)
                .setNome("Vini Jr")
                .setTime("Real Madrid")
                .build();

        assertNotNull(jogador);
    }
}