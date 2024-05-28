package co.edu.uniquindio.proyecto.Model;

public class PrecioDescuentoEstrategia implements PrecioEstrategia {

    private double precioPedido;

    public PrecioDescuentoEstrategia(double precioPedido) {
        this.precioPedido = precioPedido;
    }

    @Override
    public double calcularPrecio(double precio) {
        double descuento = precio * (0.2);
        double precioPedido = precio - descuento;
        return precioPedido;
    }
}