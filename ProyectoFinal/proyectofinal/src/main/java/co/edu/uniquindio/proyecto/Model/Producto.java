package co.edu.uniquindio.proyecto.Model;

public abstract class Producto implements Cloneable{
    public String talla;
    public double precio;
    
    public String getTalla(){
        return talla;
    }

    public double getPrecio(){
        return precio;
    }

    
    public void setTalla(String talla){
        this.talla = talla;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }


    @Override
    public Producto clone() {
        try {
            return (Producto) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
        }
}