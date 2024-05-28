package co.edu.uniquindio.proyecto.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * La clase Pedido representa un pedido que se realiza en el sistema.
 */
public class Pedido {

    /**
     * Este atributo es una cadena de texto que representa el identificador único del pedido.
     */
    private String id;

    /**
     * Este atributo es una lista de objetos de la clase Producto que representa la lista de productos que se encuentran en el pedido.
     */
    private List<Producto> listaProductos;

    /**
     * Este atributo es un objeto de la clase PrecioEstrategia que representa la estrategia de precios que se utiliza para calcular el precio del pedido.
     */
    private PrecioEstrategia estrategia;

    /**
     * El constructor de la clase Pedido recibe dos parámetros: id y estrategia.
     * Estos parámetros se utilizan para inicializar los atributos id y estrategia de la clase.
     * Además, se inicializa la lista de productos.
     *
     * @param id El identificador único del pedido.
     * @param estrategia La estrategia de precios que se utiliza para calcular el precio del pedido.
     */
    public Pedido(String id, PrecioEstrategia estrategia) {
        this.id = id;
        this.estrategia = estrategia;
        this.listaProductos = new ArrayList<>();
    }

    /**
     * Este método devuelve el precio total del pedido utilizando la estrategia de precios que se encuentra en el atributo estrategia.
     *
     * @return El precio total del pedido.
     */
    public double calcularPrecio() {
        return estrategia.calcularPrecio(getPrecio(listaProductos));
    }

    /**
     * Este método agrega un objeto de la clase Producto a la lista de productos del pedido.
     *
     * @param producto El objeto Producto que se va a agregar a la lista de productos del pedido.
     */
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    /**
     * Este método elimina un objeto de la clase Producto de la lista de productos del pedido.
     *
     * @param producto El objeto Producto que se va a eliminar de la lista de productos del pedido.
     */
    public void eliminarProducto(Producto producto) {
        listaProductos.remove(producto);
    }

    /**
     * Este método busca un objeto de la clase Producto en la lista de productos del pedido
     * utilizando la talla del producto como parámetro de búsqueda.
     *
     * @param tallaProducto La talla del objeto Producto que se va a buscar en la lista de productos del pedido.
     * @return Un objeto Optional que contiene el objeto Producto que se encontró en la lista de productos del pedido
     * o un objeto Optional vacío si no se encontró ningún objeto Producto con la talla especificada.
     */
    public Optional<Producto> buscarProductoPorTalla(String tallaProducto) {
        Predicate<Producto> condicion = producto -> producto.getTalla().equals(tallaProducto);
        return listaProductos.stream().filter(condicion).findAny();
    }

    /**
     * Devuelve la lista de productos del pedido.
     *
     * @return La lista de productos del pedido.
     */
    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    /**
     * Devuelve el identificador único del pedido.
     *
     * @return El identificador único del pedido.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador único del pedido.
     *
     * @param id El nuevo identificador único del pedido.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Calcula el precio total de una lista de productos.
     *
     * @param productos La lista de productos cuyo precio total se va a calcular.
     * @return El precio total de la lista de productos.
     */
    public double getPrecio(List<Producto> productos) {
        double precioTotal = 0;
        // Se usa un bucle for-each, implementando el principio del patrón Iterator
        for (Producto producto : productos) {
            precioTotal += producto.getPrecio();
        }
        return precioTotal;
    }
}
