package padroescomportamentamentais.ChainOfResposability;

public class SuporteTecnico extends Funcionario {

    public SuporteTecnico(Funcionario superior) {
        listaSolicitacoes.add(SolicitacaoAvancada.getSolicitacaoAvancada());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Suporte Técnico";
    }
}
