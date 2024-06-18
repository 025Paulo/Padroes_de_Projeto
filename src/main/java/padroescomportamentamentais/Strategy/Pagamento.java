package padroescomportamentamentais.Strategy;

public class Pagamento {

    private float valor;

    public Pagamento(float valor) {
        this.valor = valor;
    }

    public String realizarPagamento(PagamentoMetodo metodo) {
        return metodo.pagar(valor);
    }
}