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
    void deveRetornarComAcucar() {
        Cafe cafe = new CafeTipo("Cafe com/sem acucar");

        assertEquals("Cafe", cafe.getAcucar());
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
        Cafe cafe = new CafeTipo("Cafe Puro", "Com acucar");

        Cafe cafePuro = new CafePuro(cafe);

        assertEquals("Cafe Puro/2 reais", cafePuro.getPreco());
        assertEquals("Com acucar/Com acucar", cafePuro.getAcucar());
    }


    @Test
    void deveRetornarCafeComLeiteSemAcucar() {
        Cafe cafe = new CafeTipo("Cafe com Leite", "Sem acucar");

        Cafe cafeComLeite = new CafeComLeite(cafe);

        assertEquals("Cafe com Leite/4 reais", cafeComLeite.getPreco());
        assertEquals("Sem acucar/Sem acucar", cafeComLeite.getAcucar());
    }

    @Test
    void deveRetornarCapuccinoSemAcucar() {
        Cafe cafe = new CafeTipo("Capuccino", "Sem acucar");

        Cafe capuccino = new Capuccino(cafe);

        assertEquals("Capuccino/5 reais", capuccino.getPreco());
        assertEquals("Sem acucar/Sem acucar", capuccino.getAcucar());
    }

}
