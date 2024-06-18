package padroescomportamentamentais.ChainOfResposability;

public class SolicitacaoAvancada implements TipoSolicitacao {

    private static SolicitacaoAvancada solicitacaoAvancada = new SolicitacaoAvancada();

    private SolicitacaoAvancada() {};

    public static SolicitacaoAvancada getSolicitacaoAvancada() {
        return solicitacaoAvancada;
    }
}
