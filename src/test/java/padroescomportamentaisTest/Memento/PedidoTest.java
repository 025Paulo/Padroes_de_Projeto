package padroescomportamentaisTest.Memento;

import org.junit.jupiter.api.Test;
import padroescomportamentamentais.Memento.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


class PedidoTest {

    @Test
    void deveArmazenarEstados() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        pedido.setEstado(PedidoEstadoProcessando.getInstance());
        assertEquals(2, pedido.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        pedido.setEstado(PedidoEstadoProcessando.getInstance());
        pedido.restauraEstado(0);
        assertEquals(PedidoEstadoNovo.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        pedido.setEstado(PedidoEstadoProcessando.getInstance());
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        pedido.restauraEstado(2);
        assertEquals(PedidoEstadoEnviado.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Pedido pedido = new Pedido();
            pedido.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}
