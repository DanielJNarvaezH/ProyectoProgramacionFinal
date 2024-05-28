package co.edu.uniquindio.proyecto.Model;

/**
 * La interfaz EstadoPedido define los métodos que deben ser implementados por las clases que representan los estados de un pedido.
 */
public interface EstadoPedido {

    /**
     * Este método devuelve una cadena de texto que indica que el pedido está pendiente.
     * @param pedido El objeto Pedido que se encuentra en estado pendiente.
     * @return Una cadena de texto que indica que el pedido está pendiente.
     */
    public String pendiente(Pedido pedido);

    /**
     * Este método devuelve una cadena de texto que indica que el pedido ha sido entregado.
     * @param pedido El objeto Pedido que ha sido entregado.
     * @return Una cadena de texto que indica que el pedido ha sido entregado.
     */
    public String entregado(Pedido pedido);

    /**
     * Este método devuelve una cadena de texto que representa el estado actual del pedido.
     * @return Una cadena de texto que representa el estado actual del pedido.
     */
    String getEstadoPedido();
}