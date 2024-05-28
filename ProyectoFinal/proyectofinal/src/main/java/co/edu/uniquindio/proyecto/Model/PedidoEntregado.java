package co.edu.uniquindio.proyecto.Model;
//Clase con patrón state
public class PedidoEntregado implements EstadoPedido{

    @Override
    public String pendiente(Pedido pedido) {
        return "";
    }

    @Override
    public String entregado(Pedido pedido) {
        return "El pedido " + pedido.getId() + " fue entregado";
    }

    @Override
    public String getEstadoPedido() {
        return "Entregado.";
    }
}