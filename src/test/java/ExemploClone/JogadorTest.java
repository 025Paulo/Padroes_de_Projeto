package ExemploClone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class JogadorTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Jogador jogador = new Jogador(23, "Michael Jordan", new Time("United Center", "Chicago"), "South Carolina");

        Jogador jogadorClone = jogador.clone();
        jogadorClone.setCamisa(45);
        jogadorClone.setNome("Michael Jordan Clone");
        jogadorClone.getTime().setEstadio("United Center2");

        assertEquals("Jogador{camisa=23, nome='Michael Jordan', time=Time{estadio='United Center', endereco='Chicago'}, faculdade='South Carolina'}"
                , jogador.toString());

        assertEquals("Jogador{camisa=45, nome='Michael Jordan Clone', time=Time{estadio='United Center2', endereco='Chicago'}, faculdade='South Carolina'}"
                , jogadorClone.toString());
    }
}