package padroesestruturais.Facade;

public class Cliente {

    public boolean quitarDivida() {
        return ClienteFacade.verificarPendenciasDivida(this);
    }
}
