package ExemploBanco;

public class ServicoDeposito implements IServico {

    public String executar() {
        return "Deposito efetuado";
    }
    public String cancelar(){
        return "Deposito cancelado";
    }
}
