package padroesestruturaistest.FlyWeight;

import org.junit.jupiter.api.Test;
import padroesestruturais.Flyweight.DestinoFactory;
import padroesestruturais.Flyweight.Viagem;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ViagemTest {
    @Test
    void deveRetornarPassageiros() {
        Viagem viagem = new Viagem();
        viagem.marcarViagem("Iago", "Ibitipoca", "MG");
        viagem.marcarViagem("Alvaro", "Belo Horizonte", "MG");
        viagem.marcarViagem("Sarah",  "Chapeco", "SC");
        viagem.marcarViagem("Guilherme", "Sao Paulo", "SP");

        List<String> saida = Arrays.asList(
                "Passageiro{nome='Iago', cidade='Ibitipoca', uf='MG'}",
                "Passageiro{nome='Alvaro', cidade='Belo Horizonte', uf='MG'}",
                "Passageiro{nome='Sarah', cidade='Chapeco', uf='SC'}",
                "Passageiro{nome='Guilherme', cidade='Sao Paulo', uf='SP'}");

        assertEquals(saida, viagem.obterPassageiros());
    }

    @Test
    void deveRetornarTodosDestinos() {
        Viagem viagem = new Viagem();
        viagem.marcarViagem("Iago", "Ibitipoca", "MG");
        viagem.marcarViagem("Paulo", "Juiz de Fora", "MG");
        viagem.marcarViagem("Sarah",  "Chapeco", "SC");
        viagem.marcarViagem("Guilherme", "Sao Paulo", "SP");

        assertEquals(4, DestinoFactory.getTodosDestinos());
    }

}
