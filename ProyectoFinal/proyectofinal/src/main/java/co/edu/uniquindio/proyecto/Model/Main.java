package co.edu.uniquindio.proyecto.Model;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creacion y registro de usuarios
        Tienda tienda1 = Tienda.getInstance();
        Tienda tienda2 = Tienda.getInstance();

        // Imprimir las instancias para verificar que son las mismas
        System.out.println("Instancia 1: " + tienda1);
        System.out.println("Instancia 2: " + tienda2);

        // Verificar si ambas referencias apuntan a la misma instancia Singleton
        if (tienda1 == tienda2) {
            System.out.println("Ambas referencias son iguales. Singleton funciona correctamente.");
        } else {
            System.out.println("Las referencias no son iguales. Singleton NO funciona correctamente.");
        }

        Usuario cliente1 = new Cliente("Willinton Vergara Caraño", "1115358520");
        Usuario cliente2 = new Cliente("Juan Pablo López", "10945827");
        Usuario cliente3 = new Cliente("El Fresa", "10527");
        Usuario cliente4 = new Cliente("Juan Pablo López", "1052733");
        Usuario dueño1 = new Dueño("Raúl Ferchonandez", "1234567890");
       /*registroUsuarios.registrarUsuario(cliente1);
        registroUsuarios.registrarUsuario(cliente2);
        registroUsuarios.registrarUsuario(cliente3);
        registroUsuarios.registrarUsuario(cliente4);
        registroUsuarios.registrarUsuario(dueño1);*/
        
        //Proxy
        RealizacionRegistro registroProxy = new RegistroProxy(new Registro());
        registroProxy.registrarUsuario(dueño1);
        registroProxy.eliminarUsuario(dueño1);

        //Decorator
        RealizacionRegistro registroDecorator = new RegistroDecorator(new Registro());
        registroDecorator.eliminarUsuario(cliente1);
        registroDecorator.registrarUsuario(cliente1);

        //Creacion utilizando Builder y registro de productos y Prototype
        Producto camisa1 = new Camiseta.Builder().setPrecio(2345).setTalla("M").build();
        Producto camisa2 = new Camiseta.Builder().setTalla("S").setPrecio(2500.0).build();
        Producto producto3 = new Camiseta.Builder().setPrecio(234).setTalla("XL").build();
        Producto producto4 = new Hoodie.Builder().setPrecio(50000).setTalla("L").build();
        Producto producto5 = new Hoodie.Builder().setPrecio(50000).setTalla("L").build();
        Producto producto6 = producto5.clone();

        //Registro de pedido
        //Strategy prueba
        Pedido pedido1 = new Pedido("183653985874", new PrecioDescuentoEstrategia(0));
        pedido1.agregarProducto(camisa1);
        pedido1.agregarProducto(camisa2);
        pedido1.agregarProducto(producto3);
        pedido1.agregarProducto(producto4);
        pedido1.agregarProducto(producto5);
        pedido1.agregarProducto(producto6);
        pedido1.buscarProductoPorTalla("L");

        Pedido pedido2 = new Pedido("1323434", new PrecioSinDescuentoEstrategia(0));
        pedido2.agregarProducto(producto6);
        pedido2.agregarProducto(producto4);
        pedido2.agregarProducto(producto5);
        pedido2.buscarProductoPorTalla("S");

        List <Pedido> listaPedidos = new ArrayList<>();

        
        Factura factura1 = new Factura(cliente2, pedido1);
        factura1.recorrerPedido();

        //Strategy
        double precioPedido1 = pedido1.calcularPrecio();
        System.out.println("El valor a pagar con el descuento es $" + precioPedido1);

        
        //Fachada
        OperacionesFachada operacionesUsuario = new OperacionesFachada(dueño1, listaPedidos);
        operacionesUsuario.agregarPedido(pedido2);
        operacionesUsuario.agregarPedido(pedido1);
        operacionesUsuario.buscarPedidoPorId("1323434");
    

    }
}