package padroescomportamentamentais.ChainOfResposability;

public class SolicitacaoSuporte {

    private TipoSolicitacao tipoSolicitacao;

    public SolicitacaoSuporte(TipoSolicitacao tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
    }

    public TipoSolicitacao getTipoSolicitacao() {
        return tipoSolicitacao;
    }

    public void setTipoSolicitacao(TipoSolicitacao tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
    }
}