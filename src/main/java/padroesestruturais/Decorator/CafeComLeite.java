package padroesestruturais.Decorator;

public class CafeComLeite extends CafeDecorator{
    public CafeComLeite(Cafe cafe) {
        super(cafe);
    }

    public String getCafeComAcucar() {
        return "Sem acucar";
    }

    public String getPrecoCafe() {
        return "4 reais";
    }
}
