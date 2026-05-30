package org.lpz.generics;

import org.lpz.poointerfaces.modelo.Cliente;
import org.lpz.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Ruben", "Lopez"));

        // (Cliente) clientes.get(0); es redundante, si usamos <Cliente>
        Cliente ruben = clientes.get(0); // clientes.iterator().next();

        Cliente[] clientesArreglo = {new Cliente("Luci", "Martinez"),
        new Cliente("Armando", "Luch")};

        Integer[] enterosArreglo = {1, 2, 3};

        List<Cliente> clientesLita = fromArrayTosList(clientesArreglo);
        List<Integer> enterosLista = fromArrayTosList(enterosArreglo);

        clientesLita.forEach(System.out::println);
        enterosLista.forEach(System.out::println);
        List<String> nombres =  fromArrayTosList(new String[]{"Andres", "pepe",
        "Luci", "Bea", "Jhon"}, enterosArreglo);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientePremiumList = fromArrayTosList(
                new ClientePremium[]{new ClientePremium("Paco", "Fernandez")});

        imprimirClientes(clientes);
        imprimirClientes(clientesLita);
        imprimirClientes(clientePremiumList);

        System.out.println("Maximo de 1, 9, 4 es: " + maximo(1, 9, 4));
        System.out.println("Maximo de 3.9, 11.6, 7.78 es: " + maximo(3.9, 11.6, 7.78));
        System.out.println("Maximo de zanahoria, arandanos, manzana es: " + maximo("zanahoria", "arandanos", "manzana"));










    }


    // Metodo generico (parametros genericos)
    public static <T> List<T> fromArrayTosList(T[] c) {
        return Arrays.asList(c);
    }

    // Hereda la clase number (Integer, float, long)
    public static <T extends Number> List<T> fromArrayTosList(T[] c) {
        return Arrays.asList(c);
    }

    // Acepta Cliente y subClases
   public static <T extends Cliente> List<T> fromArrayTosList(T[] c) {
        return Arrays.asList(c);
    }

    // Otra forma de usar cliente con Comparable
    /*public static <T extends Cliente & Comparable<T>> List<T> fromArrayTosList(T[] c) {
        return Arrays.asList(c);
    }*/

    // Convierte arreglos a tipo List y con el parametro g los lista
    public static <T, G> List<T> fromArrayTosList(T[] c, G[] g) {
        for(G elemento: g) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes) {
        clientes.forEach(System.out::println);
    }

    // Calcular el mayor de 3 objetos
    public static <T extends Comparable<T>> T maximo(T a, T b, T c) {
        T max = a;

        if(b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;

    }

}
