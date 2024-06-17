package padroescomportamentamentais.Memento;


public class PedidoEstadoProcessando implements PedidoEstado {
    private PedidoEstadoProcessando() {}
    private static PedidoEstadoProcessando instance = new PedidoEstadoProcessando();
    public static PedidoEstadoProcessando getInstance() {
        return instance;
    }

    @Override
    public String getDescricaoEstado() {
        return "Processando informaçoes do pedido";
    }
}
