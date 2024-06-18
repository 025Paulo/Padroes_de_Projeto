package padroescomportamentamentais.ChainOfResposability;


import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList<TipoSolicitacao> listaSolicitacoes = new ArrayList<>();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String atenderSolicitacao(SolicitacaoSuporte solicitacao) {
        if (listaSolicitacoes.contains(solicitacao.getTipoSolicitacao())) {
            return getDescricaoCargo();
        } else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.atenderSolicitacao(solicitacao);
            } else {
                return "Solicitação não suportada";
            }
        }
    }
}
