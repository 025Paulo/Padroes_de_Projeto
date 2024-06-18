package padroescomportamentamentais.ChainOfResposability;

public class SolicitacaoIntermediaria implements TipoSolicitacao {

    private static SolicitacaoIntermediaria solicitacaoIntermediaria = new SolicitacaoIntermediaria();

    private SolicitacaoIntermediaria() {};

    public static SolicitacaoIntermediaria getSolicitacaoIntermediaria() {
        return solicitacaoIntermediaria;
    }
}
