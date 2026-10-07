package util;

import java.util.Scanner;

import exception.StockInsuficienteException;
import java.util.InputMismatchException;

public class Validador {
    public static void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }
    }

    public static void validarPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
    }

    public static void validarStock(int stock) {
        if (stock < 0) {
            throw new StockInsuficienteException("El stock no puede ser negativo.");
        }
    }

    public static void validarCategoria(String categoria) {
        if (categoria == null || categoria.isBlank()) {
            throw new IllegalArgumentException("La categoría del producto no puede estar vacía.");
        }
    }

    public static int leerEntero(Scanner sc, String mensaje){
        while(true){
            System.out.print(mensaje);
            try{
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e){
                System.out.println("Debe ingresar un número entero. Vuelva a intentar.");
                sc.nextLine();
            }
        }
    }

    public static double leerDouble(Scanner sc, String mensaje){
        while(true){
            System.out.print(mensaje);
            try{
                double valor = sc.nextDouble();
                sc.nextLine();
                return valor;
            } catch (Exception e){
                System.out.println("Debe ingresar un número decimal. Vuelva a intentar.");
                sc.nextLine();
            }
        }
    }

    public static String leerTexto(Scanner sc, String mensaje){
        System.out.print(mensaje);
        return sc.nextLine();
    }
}
