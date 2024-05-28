package co.edu.uniquindio.proyecto.Model;

public class RegistroDecorator implements RealizacionRegistro{
    protected RealizacionRegistro registroDecorado;

    public RegistroDecorator(RealizacionRegistro registroDecorado){
        this.registroDecorado = registroDecorado;
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        int numeroAleatorio= (int) Math.random();
        String numeroEnTexto = Integer.toString(numeroAleatorio);
        registroDecorado.registrarUsuario(usuario);
        usuario.setCodigo(numeroEnTexto);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        registroDecorado.eliminarUsuario(usuario);
        usuario.getNombre();
        usuario.getCodigo();
    }
}
