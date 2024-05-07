package padroesestruturais.Decorator;

public class Capuccino extends CafeDecorator{
    public Capuccino(Cafe cafe) {
        super(cafe);
    }

    public String getCafeTipoComAcucar() {
        return "Sem acucar";
    }

    public String getPrecoCafe() {
        return "5 reais";
    }
}
