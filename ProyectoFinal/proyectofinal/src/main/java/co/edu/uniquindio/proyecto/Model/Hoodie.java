package co.edu.uniquindio.proyecto.Model;

/**
 * La clase Hoodie es una clase hija de la clase Producto. La clase Hoodie utiliza el patrón de diseño Builder para su construcción.
 */
public class Hoodie extends Producto {

    /**
     * El constructor de la clase Hoodie recibe un objeto de la clase Builder como parámetro y asigna los valores de los atributos talla y precio del objeto Builder a los atributos correspondientes de la clase Hoodie.
     * @param builder El objeto Builder que contiene los valores de los atributos talla y precio.
     */
    private Hoodie(Builder builder) {
        this.talla = builder.talla;
        this.precio = builder.precio;
    }

    /**
     * Este método es una implementación del patrón de diseño Prototype y devuelve una copia del objeto Hoodie.
     * @return Una copia del objeto Hoodie.
     */
    @Override
    public Hoodie clone() {
        return (Hoodie) super.clone();
    }

    /**
     * Este método devuelve una cadena de texto que representa el objeto Hoodie.
     * @return Una cadena de texto que representa el objeto Hoodie.
     */
    @Override
    public String toString() {
        return "Hoodie";
    }

    /**
     * La clase Builder es una clase anidada dentro de la clase Hoodie. La clase Builder se utiliza para construir objetos de la clase Hoodie de manera incremental.
     */
    public static class Builder {
        /**
         * Este atributo es una cadena de texto que representa la talla de la camiseta.
         */
        private String talla;

        /**
         * Este atributo es un número de punto flotante que representa el precio de la camiseta.
         */
        private double precio;

        /**
         * Este método establece el valor del atributo talla y devuelve el objeto Builder.
         * @param talla La cadena de texto que representa la talla de la camiseta.
         * @return El objeto Builder.
         */
        public Builder setTalla(String talla) {
            this.talla = talla;
            return this;
        }

        /**
         * Este método establece el valor del atributo precio y devuelve el objeto Builder.
         * @param precio El número de punto flotante que representa el precio de la camiseta.
         * @return El objeto Builder.
         */
        public Builder setPrecio(double precio) {
            this.precio = precio;
            return this;
        }

        /**
         * Este método construye un objeto de la clase Hoodie utilizando los valores de los atributos talla y precio del objeto Builder y devuelve el objeto Hoodie.
         * @return El objeto Hoodie.
         */
        public Hoodie build() {
            return new Hoodie(this);
        }
    }
}