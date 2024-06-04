package padroesestruturaistest.Bridge;

import org.junit.jupiter.api.Test;
import padroesestruturais.Bridge.MicrosoftTranslator;
import padroesestruturais.Bridge.TraducaoFrances;
import padroesestruturais.Bridge.TraducaoIngles;
import padroesestruturais.Bridge.Tradutor;

import static org.junit.Assert.assertEquals;

public class MicrosftTranslatorTest {
    @Test
    void deveRetornarMicrosoftTraducaoIngles() {
        Tradutor tradutor = new MicrosoftTranslator();
        TraducaoIngles traducaoIngles = new TraducaoIngles(tradutor);
        assertEquals("Traducao Ingles - Microsoft Translator", traducaoIngles.traduzir());
    }

    @Test
    void deveRetornarMicrosoftTraducaoFrances() {
        Tradutor tradutor = new MicrosoftTranslator();
        TraducaoFrances traducaoFrances = new TraducaoFrances(tradutor);
        assertEquals("Traducao Frances - Microsoft Translator", traducaoFrances.traduzir());
    }
}
  