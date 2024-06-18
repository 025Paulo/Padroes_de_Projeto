package padroescomportamentamentais.Strategy;


public class Cliente {

    private String statusPagamento;

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void pagarComCartaoCredito(float valor) {
        Pagamento pagamento = new Pagamento(valor);
        this.statusPagamento = pagamento.realizarPagamento(new PagamentoCredito());
    }

    public void pagarComPayPal(float valor) {
        Pagamento pagamento = new Pagamento(valor);
        this.statusPagamento = pagamento.realizarPagamento(new PagamentoPayPal());
    }

    public void pagarComPix(float valor) {
        Pagamento pagamento = new Pagamento(valor);
        this.statusPagamento = pagamento.realizarPagamento(new PagamentoPix());
    }
}
