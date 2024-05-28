package co.edu.uniquindio.proyecto.Model;

/**
 * La interfaz RealizacionRegistro define los métodos necesarios para registrar y eliminar usuarios.
 * Cualquier clase que implemente esta interfaz debe proporcionar las implementaciones de estos métodos.
 */
public interface RealizacionRegistro {

    /**
     * Registra un nuevo usuario en el sistema.
     * 
     * @param usuario El objeto Usuario que se va a registrar.
     */
    void registrarUsuario(Usuario usuario);

    /**
     * Elimina un usuario del sistema.
     * 
     * @param usuario El objeto Usuario que se va a eliminar.
     */
    void eliminarUsuario(Usuario usuario);
}
