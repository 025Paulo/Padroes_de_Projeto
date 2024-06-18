package padroescomportamentamentais.Strategy;

public class PagamentoPix implements PagamentoMetodo {

    public String pagar(float valor) {
        return "Pix de " + valor + " reais efetuado com Transferência Bancária.";
    }
}
