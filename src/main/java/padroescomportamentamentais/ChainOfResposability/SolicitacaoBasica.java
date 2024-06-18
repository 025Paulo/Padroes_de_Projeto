package padroescomportamentamentais.ChainOfResposability;
public class SolicitacaoBasica implements TipoSolicitacao {

    private static SolicitacaoBasica solicitacaoBasica = new SolicitacaoBasica();

    private SolicitacaoBasica() {};

    public static SolicitacaoBasica getSolicitacaoBasica() {
        return solicitacaoBasica;
    }
}
