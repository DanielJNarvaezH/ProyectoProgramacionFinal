package co.edu.uniquindio.proyecto.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;


public class Registro {
    private List<Usuario> listaUsuarios;

    public Registro(){
        this.listaUsuarios = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario) {
        validarUsuarioExiste(usuario);
        listaUsuarios.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario){
        listaUsuarios.remove(usuario);
    }
    
    private void validarUsuarioExiste (Usuario usuario){
        boolean existeUsuario = buscarUsuarioPorCodigo(usuario.getCodigo()).isPresent();
        if (existeUsuario){
        throw new RuntimeException("El usuario ya esta registrado");
        }
    }

    public Optional<Usuario> buscarUsuarioPorCodigo(String codigo){
        Predicate<Usuario> condicion = usuario ->usuario.getCodigo().equals(codigo);
        return listaUsuarios.stream().filter(condicion).findAny();
    }
    
}