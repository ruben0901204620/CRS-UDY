package org.lpz.java.jdbc;

import org.lpz.java.jdbc.models.Producto;
import org.lpz.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.lpz.java.jdbc.repositorio.Repositorio;
import org.lpz.java.jdbc.util.ConexionBD;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbcDelete {
    static void main(String[] args) {

        try (Connection conn = ConexionBD.getInstance()){

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("========== Listar ==========");

            repositorio.listar().forEach(p -> System.out.println(p));
            System.out.println("========== Obtener por ID ==========");

            System.out.println(repositorio.porId(2l));

            System.out.println("========== Eliminar por ID ==========");
            Producto producto = new Producto();
            producto.setId(3l);
            repositorio.eliminar(producto.getId());
            System.out.println("Producto eliminado con exito.");
            repositorio.listar().forEach(p -> System.out.println(p));

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
