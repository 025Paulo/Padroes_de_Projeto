package ExemploAdvocacia;

public class ReciboPF implements Recibo {

    @Override
    public String emitir() {
        return "Recibo Pessoa Fisica";
    }
}
