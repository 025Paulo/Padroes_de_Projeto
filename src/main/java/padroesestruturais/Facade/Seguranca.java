package padroesestruturais.Facade;

public class Seguranca extends Setor {

    public static Seguranca seguranca = new Seguranca();

    private Seguranca() {
    }

    public static Seguranca getInstancia() {
        return seguranca;
    }
}
