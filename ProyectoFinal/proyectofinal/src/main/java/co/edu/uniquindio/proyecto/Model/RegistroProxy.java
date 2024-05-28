package co.edu.uniquindio.proyecto.Model;

/**
 * La clase RegistroProxy implementa la interfaz RealizacionRegistro y actúa como un proxy
 * que controla el acceso y delega las operaciones de registro y eliminación de usuarios.
 */
public class RegistroProxy implements RealizacionRegistro {

    /**
     * Indica si el usuario está autorizado para realizar las operaciones.
     */
    private boolean usuarioAutorizado;

    /**
     * Registro real al cual se delegan las operaciones.
     */
    private RealizacionRegistro registroReal;

    /**
     * Constructor de la clase RegistroProxy.
     * 
     * @param registroReal El registro real al cual se delegarán las operaciones.
     */
    public RegistroProxy(RealizacionRegistro registroReal) {
        this.registroReal = registroReal;
    }

    /**
     * Método para registrar un usuario en el sistema.
     * Verifica el acceso del usuario y delega la operación al registro real si está autorizado.
     * 
     * @param usuario El objeto Usuario que se va a registrar.
     * @throws IllegalArgumentException Si el usuario no está autorizado.
     */
    @Override
    public void registrarUsuario(Usuario usuario) {
        acceso(usuario);
        if (usuarioAutorizado) {
            if (registroReal == null) {
                registroReal = new Registro();
            }
            registroReal.registrarUsuario(usuario);
        } else {
            throw new IllegalArgumentException("Usuario no autorizado");
        }
    }

    /**
     * Método para eliminar un usuario del sistema.
     * Verifica el acceso del usuario y delega la operación al registro real si está autorizado.
     * 
     * @param usuario El objeto Usuario que se va a eliminar.
     * @throws IllegalArgumentException Si el usuario no está autorizado.
     */
    @Override
    public void eliminarUsuario(Usuario usuario) {
        acceso(usuario);
        if (usuarioAutorizado) {
            if (registroReal == null) {
                registroReal = new Registro();
            }
            registroReal.eliminarUsuario(usuario);
        } else {
            throw new IllegalArgumentException("Usuario no autorizado");
        }
    }

    /**
     * Método privado que verifica si el usuario es un Dueño para autorizar el acceso.
     * 
     * @param usuario El usuario que se va a verificar.
     */
    private void acceso(Usuario usuario) {
        if (usuario instanceof Dueño) {
            usuarioAutorizado = true;
        } else {
            usuarioAutorizado = false;
        }
    }
}
