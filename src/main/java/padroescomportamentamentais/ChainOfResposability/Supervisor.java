package padroescomportamentamentais.ChainOfResposability;

public class Supervisor extends Funcionario {

    public Supervisor(Funcionario superior) {
        listaSolicitacoes.add(SolicitacaoBasica.getSolicitacaoBasica());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Supervisor";
    }
}
