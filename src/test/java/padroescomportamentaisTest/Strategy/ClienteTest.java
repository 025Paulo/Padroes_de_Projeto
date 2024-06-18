package padroescomportamentaisTest.Strategy;

import org.junit.jupiter.api.Test;
import padroescomportamentamentais.Strategy.Cliente;

import static org.junit.Assert.assertEquals;

class ClienteTest {

    @Test
    void devePagarComCartaoCredito() {
        Cliente cliente = new Cliente();
        cliente.pagarComCartaoCredito(100.0f);
        assertEquals("Pagamento de 100.0 reais efetuado realizado com Cartão de Crédito.", cliente.getStatusPagamento());
    }

    @Test
    void devePagarComPayPal() {
        Cliente cliente = new Cliente();
        cliente.pagarComPayPal(200.0f);
        assertEquals("Pagamento de 200.0 reais efetuado com PayPal.", cliente.getStatusPagamento());
    }

    @Test
    void devePagarComPix() {
        Cliente cliente = new Cliente();
        cliente.pagarComPix(300.0f);
        assertEquals("Pix de 300.0 reais efetuado com Transferência Bancária.", cliente.getStatusPagamento());
    }
}