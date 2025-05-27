package com.gmail.danielfernandezneira1;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Tienda miTienda = new Tienda();
        int opcion=pantalladeInicio();
        switch(opcion){
            case 1:
            registarNuevoArticulo();
            case 2:
            registrarNuevoCliente();
            case 3:
            gestionarContrato();
            case 4:
            registrarVenta();
            case 5:
            gastosIngresosGanancias();
            case 6:
            buscadorMain();
            case 7:
            salir();
        }


    }
}

    public static Integer pantalladeInicio(){
        System.out.println("******************** TIENDA DE ANTGÜEDADES ********************");
        System.out.println("********************          MENÚ         ********************");
        System.out.println("1. Registrar nuevo artículo");
        System.out.println("2. Registrar nuevo cliente");
        System.out.println("3. Gestionar cambios de contrato");
        System.out.println("4. Registrar venta");
        System.out.println("5. Gastos, ingresos y ganancias");
        System.out.println("6. Buscador");
        System.out.println("7. Salir");
        System.out.print("Elige una opción del menú: ");
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        try {
            System.out.print("Introduce un número entero: ");
            numero = sc.nextInt();
            System.out.println("Has introducido: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes introducir un número entero.");
        }

        return numero;
    }
    public  void registarNuevoArticulo(){
        Scanner s = new Scanner(System.in);

        System.out.println("Descripcion:");
        String descripcion = s.nextLine();

        System.out.println("Año de origen :");
        Integer origen= s.nextInt();

        System.out.println("Precio de compra:");
        Integer precio= s.nextInt();

        System.out.println(" fecha de compra(dd/mm/aa):");
        LocalDate fecha = LocalDate.parse(s.nextLine());
        System.out.println("Tipo de artículo (MENUDENCIA/OBRA_ARTE/VOLUMINOSO)");
        String tipo = s.nextLine();
        
        Articulo articulo1 = new Articulo(descripcion, origen, precio, fecha, null)
    }


