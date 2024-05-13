package padroesestruturaistest.Bridge;

import org.junit.jupiter.api.Test;
import padroesestruturais.Bridge.GoogleTradutor;
import padroesestruturais.Bridge.TraducaoFrances;
import padroesestruturais.Bridge.TraducaoIngles;
import padroesestruturais.Bridge.Tradutor;

import static org.junit.Assert.assertEquals;

public class GoogleTranslateTest {

    @Test
    void deveRetornarTraducaoIngles() {
        Tradutor tradutor = new GoogleTradutor();
        TraducaoIngles traducaoIngles = new TraducaoIngles(tradutor);
        assertEquals("Traducao Ingles - Google Translate", traducaoIngles.traduzir());

    }

    @Test
    void deveRetornarTraducaoFrances() {
        Tradutor tradutor = new GoogleTradutor();
        TraducaoFrances traducaoFrances = new TraducaoFrances(tradutor);
        assertEquals("Traducao Frances - Google Translate", traducaoFrances.traduzir());
    }
}
