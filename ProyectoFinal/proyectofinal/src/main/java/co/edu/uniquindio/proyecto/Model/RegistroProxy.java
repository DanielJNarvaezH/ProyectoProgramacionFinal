package co.edu.uniquindio.proyecto.Model;

public class RegistroProxy implements RealizacionRegistro {
    private boolean usuarioAutorizado;
    private RealizacionRegistro registroReal; 

    public RegistroProxy(RealizacionRegistro registroReal){
        this.registroReal = registroReal;
    }

    @Override
    public void registrarUsuario(Usuario usuario){
        acceso(usuario);
        if(usuarioAutorizado){
            if(registroReal == null){
                registroReal = new Registro();
                registroReal.registrarUsuario(usuario);
            }
            else{
                registroReal.registrarUsuario(usuario);
            }
        }
        else{
            throw new IllegalArgumentException("Usuario no autorizado");
        }
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        acceso(usuario);
        if(usuarioAutorizado){
            if(registroReal == null){
                registroReal = new Registro();
                registroReal.eliminarUsuario(usuario);
            }
            else{
                registroReal.eliminarUsuario(usuario);
            }
        }
        else{
            throw new IllegalArgumentException("Usuario no autorizado");
        }
    }
    
    private void acceso(Usuario usuario){
        if(usuario instanceof Dueño){
            usuarioAutorizado = true;
        }
        else{
            usuarioAutorizado = false;
        }
    }
}