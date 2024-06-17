package padroescomportamentamentais.Mediator;

public class ReclameAqui {

    private static ReclameAqui instancia = new ReclameAqui();

    private ReclameAqui() {}

    public static ReclameAqui getInstancia() {
        return instancia;
    }

    public String receberReclamacaoEmpresa(String mensagem) {
        return "O ReclameAqui agradece seu contato.\n"+
                "A Empresa respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Empresa.getInstancia().receberReclamacao(mensagem);
    }

    public String receberElogioEmpresa(String mensagem) {
        return "O ReclameAqui agradece seu contato.\n"+
                "A Empresa respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Empresa.getInstancia().receberElogio(mensagem);
    }

    public String receberSugestaoEmpresa(String mensagem) {
        return "O ReclameAqui agradece seu contato.\n"+
                "A Empresa respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Empresa.getInstancia().receberSugestao(mensagem);
    }

}
