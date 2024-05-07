package padroesestruturais.Decorator;

public class CafeComLeite extends CafeDecorator{
    public CafeComLeite(Cafe cafe) {
        super(cafe);
    }

    public String getCafeTipoComAcucar() {
        return "Sem acucar";
    }

    public String getPrecoCafe() {
        return "4 reais";
    }
}
