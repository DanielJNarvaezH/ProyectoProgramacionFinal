package co.edu.uniquindio.proyecto.Model;

/**
 * La clase RegistroDecorator implementa la interfaz RealizacionRegistro y actúa como un decorador
 * que agrega funcionalidades adicionales al registro de usuarios.
 */
public class RegistroDecorator implements RealizacionRegistro {

    /**
     * Registro decorado al cual se le agregan las funcionalidades adicionales.
     */
    protected RealizacionRegistro registroDecorado;

    /**
     * Constructor de la clase RegistroDecorator.
     * 
     * @param registroDecorado El registro que se va a decorar con funcionalidades adicionales.
     */
    public RegistroDecorator(RealizacionRegistro registroDecorado) {
        this.registroDecorado = registroDecorado;
    }

    /**
     * Registra un nuevo usuario en el sistema.
     * Agrega una funcionalidad adicional que asigna un código aleatorio al usuario.
     * 
     * @param usuario El objeto Usuario que se va a registrar.
     */
    @Override
    public void registrarUsuario(Usuario usuario) {
        int numeroAleatorio = (int) Math.random();
        String numeroEnTexto = Integer.toString(numeroAleatorio);
        registroDecorado.registrarUsuario(usuario);
        usuario.setCodigo(numeroEnTexto);
    }

    /**
     * Elimina un usuario del sistema.
     * Agrega una funcionalidad adicional que obtiene el nombre y código del usuario eliminado.
     * 
     * @param usuario El objeto Usuario que se va a eliminar.
     */
    @Override
    public void eliminarUsuario(Usuario usuario) {
        registroDecorado.eliminarUsuario(usuario);
        // Se obtienen el nombre y código del usuario eliminado, pero no se hace nada con ellos
        usuario.getNombre();
        usuario.getCodigo();
    }
}
