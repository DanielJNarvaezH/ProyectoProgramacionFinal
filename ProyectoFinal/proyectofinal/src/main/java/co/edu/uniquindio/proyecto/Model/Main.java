package co.edu.uniquindio.proyecto.Model;

public class Main {
    public static void main(String[] args) {
        // Creacion y registro de usuarios
        Tienda tienda1 = Tienda.getInstance();
        Tienda tienda2 = Tienda.getInstance();

        // Imprimir las instancias para verificar que son las mismas
        System.out.println("Instancia 1: " + tienda1);
        System.out.println("Instancia 2: " + tienda2);

        // Verificar si ambas referencias apuntan a la misma instancia
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
        Registro registroUsuarios = new Registro();
        registroUsuarios.registrarUsuario(cliente1);
        registroUsuarios.registrarUsuario(cliente2);
        registroUsuarios.registrarUsuario(cliente3);
        registroUsuarios.registrarUsuario(cliente4);
        registroUsuarios.registrarUsuario(dueño1);

        //Creacion utilizando Builder y registro de productos
        Producto camisa1 = new Camiseta.Builder().setPrecio(2345).setTalla("M").build();
        Producto camisa2 = new Camiseta.Builder().setTalla("S").setPrecio(2500.0).build();
        Producto producto3 = new Camiseta.Builder().setPrecio(234).setTalla("XL").build();
        Producto producto4 = new Hoodie.Builder().setPrecio(50000).setTalla("L").build();
        Producto producto5 = new Hoodie.Builder().setPrecio(50000).setTalla("L").build();
        Producto producto6 = producto5.clone();

        //Registro de pedido
        //Strategy prueba
        Pedido pedido1 = new Pedido("Hola, aca debe ir un ID", new PrecioDescuentoEstrategia(0));
        pedido1.agregarProducto(camisa1);
        pedido1.agregarProducto(camisa2);
        pedido1.agregarProducto(producto3);
        pedido1.agregarProducto(producto4);
        pedido1.agregarProducto(producto5);
        pedido1.agregarProducto(producto6);
        pedido1.buscarProductoPorTalla("L");
        
        Factura factura1 = new Factura(cliente2, pedido1);
        factura1.recorrerPedido();

        double precioPedido1 = pedido1.calcularPrecio();
        System.out.println("El valor a pagar con el descuento es $" + precioPedido1);
    }
}