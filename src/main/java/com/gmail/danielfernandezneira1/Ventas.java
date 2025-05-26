package com.gmail.danielfernandezneira1;
import java.util.ArrayList;

public class Ventas {
    Cliente cliente;
    Articulo articulo;
    ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>();


    public Ventas(Cliente cliente) {
        this.cliente = cliente;
    }
    public boolean IncluirArticulo(Articulo articulo){
        if (articulo.estado.equals("en venta")){
            if (!listaArticulos.contains(articulo)){
                listaArticulos.add(articulo);
                return true;
            }
        }return false;
    }public boolean contieneArticulo(Articulo articulo){
        if (!listaArticulos.contains(articulo)){
            return true;
        }
        return false;
    }
}
