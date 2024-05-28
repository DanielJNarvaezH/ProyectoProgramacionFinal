package co.edu.uniquindio.proyecto.Model;

public class Hoodie extends Producto {

    private Hoodie(Builder builder) {
        this.talla = builder.talla;
        this.precio = builder.precio;
    }
    //Builder
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

        public Hoodie build() {
            return new Hoodie(this);
        }
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Hoodie";
    }
}