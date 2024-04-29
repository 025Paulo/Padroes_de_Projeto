package padroesestruturais.Decorator;

public class Capuccino extends CafeDecorator{
    public Capuccino(Cafe cafe) {
        super(cafe);
    }

    public String getCafeComAcucar() {
        return "Capuccino sem acucar";
    }

    public String getPrecoCafe() {
        return "5 reais";
    }
}
