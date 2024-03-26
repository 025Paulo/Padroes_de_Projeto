package ExemploBanco;

public class ServicoFactory {

    public static IServico obterServico(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroescricao.factorymethod.Servico" + servico);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Servico inexistente");
        }
        if (!(objeto instanceof IServico)) {
            throw new IllegalArgumentException("Servico inválido");
        }
        return (IServico) objeto;
    }
}
