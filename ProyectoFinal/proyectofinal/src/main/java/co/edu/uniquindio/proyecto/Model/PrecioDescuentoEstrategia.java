package co.edu.uniquindio.proyecto.Model;

/**
 * La clase PrecioDescuentoEstrategia implementa la interfaz PrecioEstrategia y define una estrategia 
 * de cálculo de precio que aplica un descuento del 20% sobre el precio total del pedido.
 */
public class PrecioDescuentoEstrategia implements PrecioEstrategia {

    private double precioPedido;

    /**
     * Constructor de la clase PrecioDescuentoEstrategia.
     * 
     * @param precioPedido El precio original del pedido. No se utiliza directamente en esta implementación.
     */
    public PrecioDescuentoEstrategia(double precioPedido) {
        this.precioPedido = precioPedido;
    }

    /**
     * Este método calcula el precio del pedido aplicando un descuento del 20% al precio total.
     * 
     * @param precio El precio total del pedido antes de aplicar el descuento.
     * @return El precio del pedido después de aplicar el descuento.
     */
    @Override
    public double calcularPrecio(double precio) {
        double descuento = precio * (0.2);
        double precioPedido = precio - descuento;
        return precioPedido;
    }
}
