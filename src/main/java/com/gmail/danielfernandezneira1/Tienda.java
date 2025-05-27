package com.gmail.danielfernandezneira1;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Articulo> listaArticuloTienda = new ArrayList<Articulo>(); 
    private ArrayList<Ventas> listaVentas = new ArrayList<Ventas>(); 
    private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();



    public Tienda(){
        this.listaArticuloTienda = new ArrayList<>();
        this.listaVentas = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
    } 
    public boolean registrarArticulo(Articulo articulo){
            if (!listaArticuloTienda.contains(articulo)){
                listaArticuloTienda.add(articulo);
                return true;
        }return false;
    }
    public void registrarVenta(Ventas venta){
            listaVentas.add(venta);
    }
        public boolean registrarCliente(Cliente cliente){
            if (!listaClientes.contains(cliente)){
                listaClientes.add(cliente);
                return true;
        }return false;
    }
    public boolean articuloRegistrado(Articulo articulo){
        if (listaArticuloTienda.contains(articulo)){
            return true;
    }return false;}
    public boolean clienteRegistrado(Cliente cliente){
        if (listaClientes.contains(cliente)){
            return true;}
            return false;
    }
    public Articulo buscarArticuloPorId(String id) {
    for (Articulo articulo : listaArticuloTienda) {
        if (articulo.getID().equals(id)) {
            return articulo;
        }
    }
    return null;
}

public Articulo buscarArticuloPorDescripcion(String descripcion) {
    for (Articulo articulo : listaArticuloTienda) {
        if (articulo.getDescripcion().equalsIgnoreCase(descripcion)) {
            return articulo;
        }
    }
    return null;
}

public Cliente buscarClientePorDni(String dni) {
    try {
        int dniInt = Integer.parseInt(dni);
        for (Cliente cliente : listaClientes) {
            if (cliente.getDni() == dniInt) {
                return cliente;
            }
        }
    } catch (NumberFormatException e) {
        System.out.println("DNI inválido: " + dni);
    }
    return null;
}

public void mostrarArticulosPorTipoYEstado(TipoArticulo tipo, String estado) {
    for (Articulo articulo : listaArticuloTienda) {
        if (articulo.getTipo().equals(tipo) && articulo.getEstado().equalsIgnoreCase(estado)) {
            System.out.println(articulo);
        }
    }
}

public void mostrarArticulosPorTipo(TipoArticulo tipo) {
    for (Articulo articulo : listaArticuloTienda) {
        if (articulo.getTipo().equals(tipo)) {
            System.out.println(articulo);
        }
    }
}

public void mostrarArticulosPorEstado(String estado) {
    for (Articulo articulo : listaArticuloTienda) {
        if (articulo.getEstado().equalsIgnoreCase(estado)) {
            System.out.println(articulo);
        }
    }
}
public void mostrarTodosLosArticulos() {
    for (Articulo articulo : listaArticuloTienda) {
        System.out.println(articulo);
    }
}

public void mostrarTodosLosClientes() {
    for (Cliente cliente : listaClientes) {
        System.out.println(cliente);
    }
}

public void mostrarTodosLasVentas() {
    for (Ventas venta : listaVentas) {
        System.out.println(venta);
    }
}


}
