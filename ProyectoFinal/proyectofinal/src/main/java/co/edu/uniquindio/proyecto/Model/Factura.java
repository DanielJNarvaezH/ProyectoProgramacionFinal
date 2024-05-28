package co.edu.uniquindio.proyecto.Model;

/**
 * La clase Factura représenta una factura que se le entrega a un cliente después de realizar un pedido.
 */
public class Factura {
    /**
     * Un objeto Usuario que representa al cliente que realizó el pedido.
     */
    private Usuario cliente;

    /**
     * Un objeto Pedido que representa el pedido que se le entrega al cliente.
     */
    private Pedido pedido;

    /**
     * El constructor de la clase Factura recibe dos parámetros: cliente y pedido. Estos parámetros se utilizan para inicializar los atributos cliente y pedido de la clase.
     * @param cliente El objeto Usuario que representa al cliente que realizó el pedido.
     * @param pedido El objeto Pedido que representa el pedido que se le entrega al cliente.
     */
    public Factura(Usuario cliente, Pedido pedido){
        this.cliente = cliente;
        this.pedido = pedido;
    }

    /**
     * Este método itera sobre la lista de productos del pedido y muestra información detallada sobre cada producto, incluyendo su nombre, talla y precio. También calcula el total de la factura y lo muestra al final.
     */
    public void recorrerPedido(){
        double total = 0;
        for(Producto producto : pedido.getListaProductos()){
            System.out.println("Producto " + producto + " con talla " + producto.getTalla() + " de valor " + producto.getPrecio());
            total += producto.getPrecio();
        }
        System.out.println("El total de la factura es $" + total);
    }
}