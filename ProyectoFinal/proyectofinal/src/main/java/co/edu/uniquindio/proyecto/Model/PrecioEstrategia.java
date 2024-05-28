package co.edu.uniquindio.proyecto.Model;

/**
 * La interfaz PrecioEstrategia define el contrato para las estrategias de cálculo de precios.
 * Cualquier clase que implemente esta interfaz debe proporcionar una implementación del método calcularPrecio.
 */
public interface PrecioEstrategia {
    
    /**
     * Calcula el precio final aplicando una estrategia específica sobre el precio base proporcionado.
     *
     * @param precio El precio base sobre el cual se aplicará la estrategia de cálculo de precios.
     * @return El precio final después de aplicar la estrategia.
     */
    public double calcularPrecio(double precio);
}
