package co.edu.uniquindio.proyecto.Model;


public class PrecioSinDescuentoEstrategia implements PrecioEstrategia{
    
    private double precioPedido;

    public PrecioSinDescuentoEstrategia(double precioPedido) {
        this.precioPedido = precioPedido;
    }
    
    @Override
    public double calcularPrecio(double precio){
        precioPedido = precio;
        return precioPedido;
    }
}