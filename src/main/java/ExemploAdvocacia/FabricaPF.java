package ExemploAdvocacia;

public class FabricaPF implements Fabrica {

    @Override
    public Recibo createRecibo() {
        return new ReciboPF();
    }

    @Override
    public Contrato createContrato() {
        return new ContratoPF();
    }
}
