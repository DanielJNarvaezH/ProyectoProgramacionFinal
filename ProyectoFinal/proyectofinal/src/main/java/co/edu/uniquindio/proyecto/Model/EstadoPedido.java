package co.edu.uniquindio.proyecto.Model;

public interface EstadoPedido {
    public String pendiente(Pedido pedido);
    public String entregado(Pedido pedido);
    String getEstadoPedido();
}