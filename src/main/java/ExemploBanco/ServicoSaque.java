package ExemploBanco;

public class ServicoSaque implements IServico {

    public String executar() {
        return "Saque efetuado";
    }

    public String cancelar() {
        return "Saque cancelado";
    }
}
