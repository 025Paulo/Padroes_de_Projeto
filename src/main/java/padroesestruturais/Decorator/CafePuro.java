package padroesestruturais.Decorator;

public class CafePuro extends CafeDecorator {
    public CafePuro(Cafe cafe) {
        super(cafe);
    }

    public String getCafeComAcucar() {
        return "Com acucar";
    }

    public String getPrecoCafe() {
        return "2 reais";
    }
}
