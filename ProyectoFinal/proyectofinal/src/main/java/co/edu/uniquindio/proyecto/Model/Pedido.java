package co.edu.uniquindio.proyecto.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Pedido{
    private String id;
    private List<Producto> listaProductos;
    private PrecioEstrategia estrategia;

    public Pedido(String id, PrecioEstrategia estrategia){
        this.id = id;
        this.estrategia = estrategia;
        this.listaProductos = new ArrayList<>();
    }
    
    public double calcularPrecio() {
        return estrategia.calcularPrecio(getPrecio(listaProductos));
    }

    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
    }


    public void eliminarProducto(Producto producto){
        listaProductos.remove(producto);
    }

    public Optional<Producto> buscarProductoPorTalla(String tallaProducto){
        Predicate<Producto> condicion = producto -> producto.getTalla().equals(tallaProducto);
        return listaProductos.stream().filter(condicion).findAny();
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecio(List<Producto> productos){
        double precioTotal = 0;
        //Se usa for each, implementando el principio del patrón Iterator
        for (Producto producto : productos) {
            precioTotal += producto.getPrecio();
            
        }
        return precioTotal;
    }

}