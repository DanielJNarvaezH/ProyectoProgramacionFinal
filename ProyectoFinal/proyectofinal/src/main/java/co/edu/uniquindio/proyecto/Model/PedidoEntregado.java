package co.edu.uniquindio.proyecto.Model;

/**
 * La clase PedidoEntregado implementa el comportamiento de un pedido cuando su estado es "Entregado".
 * Esta clase es parte del patrón de diseño State, que permite cambiar el comportamiento de un objeto 
 * cuando su estado cambia.
 */
public class PedidoEntregado implements EstadoPedido {

    /**
     * Este método maneja la transición del estado "Pendiente" cuando el pedido ya está entregado.
     * Dado que el pedido ya está en el estado "Entregado", no realiza ninguna acción y devuelve una cadena vacía.
     * 
     * @param pedido El pedido al cual se le intenta cambiar el estado a "Pendiente".
     * @return Una cadena vacía indicando que no se puede cambiar a "Pendiente" desde "Entregado".
     */
    @Override
    public String pendiente(Pedido pedido) {
        return "";
    }

    /**
     * Este método maneja la transición del estado "Entregado" para el pedido.
     * Retorna un mensaje indicando que el pedido ya ha sido entregado.
     * 
     * @param pedido El pedido que ya está en estado "Entregado".
     * @return Un mensaje indicando que el pedido fue entregado.
     */
    @Override
    public String entregado(Pedido pedido) {
        return "El pedido " + pedido.getId() + " fue entregado";
    }

    /**
     * Este método retorna una cadena que indica el estado actual del pedido.
     * 
     * @return Una cadena que indica que el estado del pedido es "Entregado".
     */
    @Override
    public String getEstadoPedido() {
        return "Entregado.";
    }
}
