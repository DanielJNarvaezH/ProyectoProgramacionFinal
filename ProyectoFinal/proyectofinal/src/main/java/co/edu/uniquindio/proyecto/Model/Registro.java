package co.edu.uniquindio.proyecto.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * La clase Registro implementa la interfaz RealizacionRegistro y proporciona las funcionalidades
 * para registrar y eliminar usuarios en el sistema.
 */
public class Registro implements RealizacionRegistro {
    
    /**
     * Lista que almacena los usuarios registrados.
     */
    private List<Usuario> listaUsuarios;

    /**
     * Constructor de la clase Registro.
     * Inicializa la lista de usuarios.
     */
    public Registro() {
        this.listaUsuarios = new ArrayList<>();
    }

    /**
     * Registra un nuevo usuario en el sistema.
     * Antes de agregar el usuario, se valida que no esté ya registrado.
     * 
     * @param usuario El objeto Usuario que se va a registrar.
     * @throws RuntimeException si el usuario ya está registrado.
     */
    @Override
    public void registrarUsuario(Usuario usuario) {
        validarUsuarioExiste(usuario);
        listaUsuarios.add(usuario);
    }

    /**
     * Elimina un usuario del sistema.
     * 
     * @param usuario El objeto Usuario que se va a eliminar.
     */
    @Override
    public void eliminarUsuario(Usuario usuario) {
        listaUsuarios.remove(usuario);
    }

    /**
     * Valida si un usuario ya está registrado en el sistema.
     * 
     * @param usuario El objeto Usuario que se va a validar.
     * @throws RuntimeException si el usuario ya está registrado.
     */
    private void validarUsuarioExiste(Usuario usuario) {
        boolean existeUsuario = buscarUsuarioPorCodigo(usuario.getCodigo()).isPresent();
        if (existeUsuario) {
            throw new RuntimeException("El usuario ya está registrado");
        }
    }

    /**
     * Busca un usuario en el sistema por su código.
     * 
     * @param codigo El código del usuario que se va a buscar.
     * @return Un objeto Optional que contiene el usuario si se encuentra, o un Optional vacío si no se encuentra.
     */
    public Optional<Usuario> buscarUsuarioPorCodigo(String codigo) {
        Predicate<Usuario> condicion = usuario -> usuario.getCodigo().equals(codigo);
        return listaUsuarios.stream().filter(condicion).findAny();
    }
}
