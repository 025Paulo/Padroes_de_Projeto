package ExemploAdvocacia;

public class FabricaPJ implements Fabrica {

    @Override
    public Recibo createRecibo() {
        return new ReciboPJ();
    }

    @Override
    public Contrato createContrato() {
        return new ContratoPJ();
    }
}
