package padroesestruturaistest.Facade;

import org.junit.jupiter.api.Test;
import padroesestruturais.Facade.Cliente;
import padroesestruturais.Facade.ClienteBuilder;

import static org.junit.Assert.assertEquals;

public class ClienteTest {

    @Test
    public void deveQuitarDivida() {
        Cliente cliente = new ClienteBuilder()
                .setCpf(111222333-55)
                .setAgencia(1234)
                .setConta(12345)
                .setDigito(6)
                .build();

        assertEquals(true, cliente.quitarDivida());
    }
}

