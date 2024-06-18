package padroescomportamentamentais.ChainOfResposability;

public class Gerente extends Funcionario {

    public Gerente(Funcionario superior) {
        listaSolicitacoes.add(SolicitacaoIntermediaria.getSolicitacaoIntermediaria());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }
}
