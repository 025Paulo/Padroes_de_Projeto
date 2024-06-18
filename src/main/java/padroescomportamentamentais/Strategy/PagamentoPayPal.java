package padroescomportamentamentais.Strategy;

public class PagamentoPayPal implements PagamentoMetodo {

    public String pagar(float valor) {
        return "Pagamento de " + valor + " reais efetuado com PayPal.";
    }
}

