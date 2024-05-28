package co.edu.uniquindio.proyecto.Model;

/**
 * La clase abstracta Producto define las propiedades y métodos comunes para los productos en el sistema.
 * Implementa la interfaz Cloneable para permitir la clonación de objetos Producto.
 */
public abstract class Producto implements Cloneable {

    /**
     * La talla del producto.
     */
    public String talla;

    /**
     * El precio del producto.
     */
    public double precio;

    /**
     * Devuelve la talla del producto.
     * 
     * @return La talla del producto.
     */
    public String getTalla() {
        return talla;
    }

    /**
     * Devuelve el precio del producto.
     * 
     * @return El precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece la talla del producto.
     * 
     * @param talla La nueva talla del producto.
     */
    public void setTalla(String talla) {
        this.talla = talla;
    }

    /**
     * Establece el precio del producto.
     * 
     * @param precio El nuevo precio del producto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Crea y devuelve una copia del objeto Producto.
     * 
     * @return Una copia del objeto Producto.
     * @throws AssertionError Si ocurre un error durante la clonación.
     */
    @Override
    public Producto clone() {
        try {
            return (Producto) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
