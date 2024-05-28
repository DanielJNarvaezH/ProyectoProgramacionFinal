package co.edu.uniquindio.proyecto.Model;

/**
 * La clase PrecioSinDescuentoEstrategia implementa la interfaz PrecioEstrategia y define una estrategia 
 * de cálculo de precio que no aplica ningún descuento, retornando el precio tal cual es.
 */
public class PrecioSinDescuentoEstrategia implements PrecioEstrategia {
    
    private double precioPedido;

    /**
     * Constructor de la clase PrecioSinDescuentoEstrategia.
     * 
     * @param precioPedido El precio original del pedido. Este valor se almacena en un atributo de la clase.
     */
    public PrecioSinDescuentoEstrategia(double precioPedido) {
        this.precioPedido = precioPedido;
    }
    
    /**
     * Este método calcula el precio del pedido sin aplicar ningún descuento, retornando el precio tal cual.
     * 
     * @param precio El precio total del pedido.
     * @return El mismo precio recibido como parámetro, sin modificaciones.
     */
    @Override
    public double calcularPrecio(double precio) {
        precioPedido = precio;
        return precioPedido;
    }
}
