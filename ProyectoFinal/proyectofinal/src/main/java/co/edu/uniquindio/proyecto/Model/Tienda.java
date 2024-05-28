package co.edu.uniquindio.proyecto.Model;

import java.util.List;

public class Tienda {
    public String nombre = "YHAZ!";
    private List<Usuario> listaUsuarios;
    private List<Factura> listaFacturas;
    public static Tienda instance;

    public static Tienda getInstance(){  //Aquí se verifica la existencia de instance, en caso de no existir
        if(instance == null){            //se crea uno nuevo
            instance = new Tienda();
        }
        return instance;
    }

    public List <Usuario> getUsuarios (){
        return listaUsuarios;
    }

    public List<Factura> getFacturas(){
        return listaFacturas;
    }

}