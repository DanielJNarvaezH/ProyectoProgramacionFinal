package co.edu.uniquindio.proyecto.Model;

/**
 * La clase Dueño es una clase hija de la clase Usuario. La clase Dueño se utiliza para representar a los dueños del sistema.
 */
public class Dueño extends Usuario{

    /**
     * El constructor de la clase Dueño recibe dos parámetros: nombre y codigo. El parámetro nombre es una cadena de texto que representa el nombre del dueño y el parámetro codigo es una cadena de texto que representa la identificacion del dueño. El constructor llama al constructor de la clase Usuario pasándole los parámetros nombre y codigo.
     * @param nombre La cadena de texto que representa el nombre del dueño.
     * @param codigo La cadena de texto que representa la identificación del dueño.
     */
    public Dueño(String nombre, String codigo ) {
        super(nombre, codigo);
    }
}