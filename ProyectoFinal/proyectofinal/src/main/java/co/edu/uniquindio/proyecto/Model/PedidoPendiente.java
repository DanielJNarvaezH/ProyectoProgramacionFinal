package co.edu.uniquindio.proyecto.Model;
//Clase con patrón State
public class PedidoPendiente implements EstadoPedido{

    @Override
    public String pendiente(Pedido pedido) {
        return "El pedido " + pedido.getId() + " está pendiente de envío";
    }

    @Override
    public String entregado(Pedido pedido) {
        return "";
    }

    @Override
    public String getEstadoPedido() {
        return "Pendiente.";
    }
}