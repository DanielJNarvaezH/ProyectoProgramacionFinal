package co.edu.uniquindio.proyecto.Model;

import java.util.List;

/**
 * La clase Tienda representa una tienda en el sistema.
 * Implementa el patrón Singleton para asegurar que solo exista una única instancia de Tienda.
 */
public class Tienda {

    /**
     * Nombre de la tienda.
     */
    public String nombre = "YHAZ!";

    /**
     * Lista de usuarios registrados en la tienda.
     */
    private List<Usuario> listaUsuarios;

    /**
     * Lista de facturas generadas por la tienda.
     */
    private List<Factura> listaFacturas;

    /**
     * Instancia estática única de la tienda.
     */
    private static Tienda instance;

    /**
     * Método estático para obtener la instancia única de la tienda (implementación del patrón Singleton).
     * Si no existe una instancia previa, se crea una nueva.
     * 
     * @return La instancia única de la tienda.
     */
    public static Tienda getInstance() {
        if (instance == null) {
            instance = new Tienda();
        }
        return instance;
    }

    /**
     * Método para obtener la lista de usuarios registrados en la tienda.
     * 
     * @return La lista de usuarios registrados.
     */
    public List<Usuario> getUsuarios() {
        return listaUsuarios;
    }

    /**
     * Método para obtener la lista de facturas generadas por la tienda.
     * 
     * @return La lista de facturas generadas.
     */
    public List<Factura> getFacturas() {
        return listaFacturas;
    }

}
