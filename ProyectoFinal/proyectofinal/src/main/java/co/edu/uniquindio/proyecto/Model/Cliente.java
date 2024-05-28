package co.edu.uniquindio.proyecto.Model;

/**
 * La clase Cliente es una clase hija de la clase Usuario. La clase Cliente se utiliza para representar a los clientes del sistema.
 */
public class Cliente extends Usuario{

    /**
     * El constructor de la clase Cliente recibe dos parámetros: nombre y codigo. El parámetro nombre es una cadena de texto que representa el nombre del cliente y el parámetro codigo es una cadena de texto que representa la identificación del cliente. El constructor llama al constructor de la clase Usuario pasándole los parámetros nombre y codigo.
     * @param nombre La cadena de texto que representa el nombre del cliente.
     * @param codigo La cadena de texto que representa la identificación del cliente.
     */
    public Cliente(String nombre, String codigo) {
        super(nombre, codigo);
    }
}