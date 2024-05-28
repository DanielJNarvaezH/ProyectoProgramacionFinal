package co.edu.uniquindio.proyecto.Model;

import java.util.List;

/**
 * La clase OperacionesFachada es una clase que se utiliza para realizar operaciones relacionadas con los pedidos de un usuario.
 */
public class OperacionesFachada {
    
    /**
     * Este atributo es un objeto de la clase Usuario que representa al usuario que está realizando las operaciones.
     */
    private Usuario usuario;

    /**
     * Este atributo es una lista de objetos de la clase Pedido que representa la lista de pedidos del usuario.
     */
    private List<Pedido> listaPedidos;

    /**
     * El constructor de la clase OperacionesFachada recibe dos parámetros: usuario y listaPedidos. Estos parámetros se utilizan para inicializar los atributos usuario y listaPedidos de la clase.
     * @param usuario El objeto Usuario que representa al usuario que está realizando las operaciones.
     * @param listaPedidos La lista de objetos Pedido que representa la lista de pedidos del usuario.
     */
    public OperacionesFachada(Usuario usuario, List<Pedido> listaPedidos) {
        this.usuario = usuario;
        this.listaPedidos = listaPedidos;
    }

    /**
     * Este método recibe un objeto de la clase Pedido como parámetro y llama al método validarPedidoExiste del objeto Usuario pasándole el objeto Pedido como parámetro.
     * @param pedido El objeto Pedido que se va a validar.
     */
    public void validarExistenciaPedido(Pedido pedido){
        usuario.validarPedidoExiste(pedido);
    }

    /**
     * Este método recibe un objeto de la clase String como parámetro y llama al método buscarPedidoPorId del objeto Usuario pasándole el objeto String como parámetro.
     * @param id El objeto String que representa el id del pedido que se va a buscar.
     */
    public void buscarPedidoPorId (String id){
        usuario.buscarPedidoPorId(id);
    }

    /**
     * Este método recibe un objeto de la clase Pedido como parámetro y llama al método agregarPedido del objeto Usuario pasándole el objeto Pedido como parámetro.
     * @param pedido El objeto Pedido que se va a agregar.
     */
    public void agregarPedido(Pedido pedido){
        usuario.agregarPedido(pedido);
    }
}