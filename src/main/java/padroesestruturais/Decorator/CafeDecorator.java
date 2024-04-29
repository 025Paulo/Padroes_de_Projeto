package padroesestruturais.Decorator;

public abstract class CafeDecorator implements Cafe {
    private Cafe cafe;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    public abstract String getCafeComAcucar();

    public String getAcucar() {
        return this.cafe.getAcucar() + "/" + this.getCafeComAcucar();
    }

    public abstract String getPrecoCafe();

    public String getPreco() {
        return this.cafe.getPreco() + "/" + this.getPrecoCafe();
    }

}
