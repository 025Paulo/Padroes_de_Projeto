package padroescomportamentamentais.Memento;

public class PedidoEstadoNovo implements PedidoEstado {
    private PedidoEstadoNovo() {}
    private static PedidoEstadoNovo instance = new PedidoEstadoNovo();
    public static PedidoEstadoNovo getInstance() {
        return instance;
    }

    @Override
    public String getDescricaoEstado() {
        return "Novo pedido";
    }
}
