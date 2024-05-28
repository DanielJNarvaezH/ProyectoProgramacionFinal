package co.edu.uniquindio.proyecto.Model;

/**
 * La clase PedidoPendiente implementa el comportamiento de un pedido cuando su estado es "Pendiente".
 * Esta clase es parte del patrón de diseño State, que permite cambiar el comportamiento de un objeto 
 * cuando su estado cambia.
 */
public class PedidoPendiente implements EstadoPedido {

    /**
     * Este método maneja la transición del estado "Pendiente" para el pedido.
     * Retorna un mensaje indicando que el pedido está pendiente de envío.
     * 
     * @param pedido El pedido que está en estado "Pendiente".
     * @return Un mensaje indicando que el pedido está pendiente de envío.
     */
    @Override
    public String pendiente(Pedido pedido) {
        return "El pedido " + pedido.getId() + " está pendiente de envío";
    }

    /**
     * Este método maneja la transición del estado "Entregado" cuando el pedido está pendiente.
     * Dado que el pedido está en el estado "Pendiente", no realiza ninguna acción y devuelve una cadena vacía.
     * 
     * @param pedido El pedido al cual se le intenta cambiar el estado a "Entregado".
     * @return Una cadena vacía indicando que no se puede cambiar a "Entregado" desde "Pendiente".
     */
    @Override
    public String entregado(Pedido pedido) {
        return "";
    }

    /**
     * Este método retorna una cadena que indica el estado actual del pedido.
     * 
     * @return Una cadena que indica que el estado del pedido es "Pendiente".
     */
    @Override
    public String getEstadoPedido() {
        return "Pendiente.";
    }
}
