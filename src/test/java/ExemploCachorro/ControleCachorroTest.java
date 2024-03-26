package ExemploCachorro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ControleCachorroTest {

    @Test
    public void deveRetornarRaca() {
        ControleCachorro.getInstance().setRaca("raca");
        Assertions.assertEquals("raca", ControleCachorro.getInstance().getRaca());
    }

    @Test
    public void deveRetornarNome() {
        ControleCachorro.getInstance().setNome("nome");
        Assertions.assertEquals("nome", ControleCachorro.getInstance().getNome());
    }

}