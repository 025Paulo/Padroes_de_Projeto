package ExemploAdvocacia;

public class ReciboPJ implements Recibo{
    @Override
    public String emitir() {
        return "Recibo pessoa juridica";
    }
}
