package co.edu.uniquindio.proyecto.Model;

public class Camiseta extends Producto{

//Constructor que recibe un Builder, utilizando una clase anidada
    private Camiseta(Builder builder) {
        this.talla = builder.talla;
        this.precio = builder.precio;
    }
    
    //Implementación del Prototype utilizando librerías de JAVA
    @Override
    public Camiseta clone() {
        return (Camiseta) super.clone();
    }
    
    @Override
    public String toString() {
        return "Camiseta";
    }

    public static class Builder {
            private String talla;
            private double precio;

            public Builder setTalla(String talla) {
                this.talla = talla;
                return this;
            }

            public Builder setPrecio(double precio) {
                this.precio = precio;
                return this;
            }

            //Se definen los pasos de creación y posteriormente se construye devolviendo el buil como parametro del constructor
            public Camiseta build() {
                return new Camiseta(this);
            }
    }
}