package padroesestruturaistest.Decorator;

import org.junit.jupiter.api.Test;
import padroesestruturais.Decorator.*;

import static org.junit.Assert.assertEquals;

public class CafeTest {
    @Test
    void deveRetornarPreco() {
        Cafe cafe = new CafeTipo("Cafe");

        assertEquals("Cafe", cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCafePuro() {
        Cafe cafe = new CafePuro(new CafeTipo("Cafe Puro"));

        assertEquals("Cafe Puro/2 reais", cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCapuccino() {
        Cafe cafe = new Capuccino(new CafeTipo("Capuccino"));

        assertEquals("Capuccino/5 reais", cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComLeite() {
        Cafe cafe = new CafeComLeite(new CafeTipo("Cafe com Leite"));

        assertEquals("Cafe com Leite/4 reais", cafe.getPreco());
    }

    @Test
    void deveRetornarCafePuroComAcucar() {
        Cafe cafe = new CafeTipo("Acucar");

        assertEquals("null", cafe.getAcucar());
    }


    @Test
    void deveRetornarCafeComLeiteSemAcucar() {
        Cafe cafe = new CafePuro(new CafeTipo("Cafe Puro"));

        assertEquals("Cafe Puro/Com acucar", cafe.getAcucar());
    }
}
