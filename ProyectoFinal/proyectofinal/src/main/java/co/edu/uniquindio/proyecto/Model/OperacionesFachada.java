package co.edu.uniquindio.proyecto.Model;

import java.util.List;

public class OperacionesFachada {
    
    private Usuario usuario;
    private List<Pedido> listaPedidos;

    public OperacionesFachada(Usuario usuario, List<Pedido> listaPedidos) {
        this.usuario = usuario;
        this.listaPedidos = listaPedidos;
    }

    public void validarExistenciaPedido(Pedido pedido){
        usuario.validarPedidoExiste(pedido);
    }

    public void buscarPedidoPorId (String id){
        usuario.buscarPedidoPorId(id);
    }

    public void agregarPedido(Pedido pedido){
        usuario.agregarPedido(pedido);
    }
}