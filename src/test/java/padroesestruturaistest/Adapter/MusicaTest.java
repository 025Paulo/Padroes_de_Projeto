package padroesestruturaistest.Adapter;

import org.junit.jupiter.api.Test;
import padroesestruturais.Adapter.Musica;

import static org.junit.jupiter.api.Assertions.*;

class MusicaTest {

    @Test
    void deveRetornarNotaMusica() {
        Musica musica = new Musica();
        musica.setNota("5 Estrelas");

        assertEquals("5 Estrelas", musica.getNota());
    }

    @Test
    void deveRetornarEstrelasMusica() {
        Musica musica = new Musica();
        musica.setNota("5 Estrelas");

        assertEquals(9.0f, musica.getEstrelas());
    }

}