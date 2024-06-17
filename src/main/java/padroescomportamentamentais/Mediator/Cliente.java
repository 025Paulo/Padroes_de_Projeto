package padroescomportamentamentais.Mediator;

public class Cliente extends Pessoa{

    public String reclamarEmpresa(String mensagem) {
        return ReclameAqui.getInstancia().receberReclamacaoEmpresa(mensagem);
    }

    public String elogiarEmpresa(String mensagem) {
        return ReclameAqui.getInstancia().receberElogioEmpresa(mensagem);
    }

    public String sugerirEmpresa(String mensagem) {
        return ReclameAqui.getInstancia().receberSugestaoEmpresa(mensagem);
    }
}
