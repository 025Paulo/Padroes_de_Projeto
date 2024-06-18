package padroescomportamentamentais.Strategy;

public class PagamentoCredito implements PagamentoMetodo {

    public String pagar(float valor) {
        return "Pagamento de " + valor + " reais efetuado realizado com Cartão de Crédito.";
    }
}