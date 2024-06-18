package padroescomportamentamentais.ChainOfResposability;

public class SolicitacaoInvalida implements TipoSolicitacao {

    private static SolicitacaoInvalida solicitacaoInvalida = new SolicitacaoInvalida();

    private SolicitacaoInvalida() {}

    public static SolicitacaoInvalida getSolicitacaoInvalida() {
        return solicitacaoInvalida;
    }
    public String getDescricao() {
        return "Solicitação invalida";
    }
}
