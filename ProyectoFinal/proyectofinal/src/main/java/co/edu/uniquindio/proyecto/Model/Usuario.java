package co.edu.uniquindio.proyecto.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * La clase abstracta Usuario representa un usuario genérico en el sistema.
 */
public abstract class Usuario {

    /**
     * Nombre del usuario.
     */
    private String nombre;

    /**
     * Código identificador único del usuario.
     */
    private String codigo;

    /**
     * Lista de pedidos asociados al usuario.
     */
    private List<Pedido> listaPedidos;

    /**
     * Constructor de la clase Usuario.
     * 
     * @param nombre El nombre del usuario.
     * @param codigo El código identificador único del usuario.
     */
    public Usuario(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaPedidos = new ArrayList<>();
    }

    /**
     * Obtiene el nombre del usuario.
     * 
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     * 
     * @param nombre El nuevo nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el código identificador único del usuario.
     * 
     * @return El código identificador único del usuario.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece el código identificador único del usuario.
     * 
     * @param codigo El nuevo código identificador único del usuario.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Agrega un nuevo pedido a la lista de pedidos del usuario.
     * Verifica que el pedido no esté ya registrado antes de agregarlo.
     * 
     * @param pedido El objeto Pedido que se va a agregar.
     * @throws RuntimeException si el pedido ya está registrado.
     */
    public void agregarPedido(Pedido pedido) {
        validarPedidoExiste(pedido);
        listaPedidos.add(pedido);
    }

    /**
     * Valida si un pedido ya está registrado en la lista de pedidos del usuario.
     * 
     * @param pedido El objeto Pedido que se va a validar.
     * @throws RuntimeException si el pedido ya está registrado.
     */
    public void validarPedidoExiste(Pedido pedido) {
        boolean existePedido = buscarPedidoPorId(pedido.getId()).isPresent();
        if (existePedido) {
            throw new RuntimeException("El pedido ya está registrado");
        }
    }

    /**
     * Busca un pedido en la lista de pedidos del usuario por su ID.
     * 
     * @param id El ID del pedido que se va a buscar.
     * @return Un objeto Optional que contiene el pedido si se encuentra, o un Optional vacío si no se encuentra.
     */
    public Optional<Pedido> buscarPedidoPorId(String id) {
        Predicate<Pedido> condicion = pedido -> pedido.getId().equals(id);
        return listaPedidos.stream().filter(condicion).findAny();
    }
}
