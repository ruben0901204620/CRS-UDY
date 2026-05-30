package org.lpz.java.jdbc;

import org.lpz.java.jdbc.models.Categoria;
import org.lpz.java.jdbc.models.Producto;
import org.lpz.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.lpz.java.jdbc.repositorio.Repositorio;
import org.lpz.java.jdbc.util.ConexionBD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

public class EjemploJdbcUpdate {
    static void main(String[] args) {

        try (Connection conn = ConexionBD.getInstance()){

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("========== Listar ==========");

            repositorio.listar().forEach(p -> System.out.println(p));
            System.out.println("========== Obtener por ID ==========");

            System.out.println(repositorio.porId(2l));

            System.out.println("========== Editar nuevo producto ==========");
            Producto producto = new Producto();
            producto.setId(5l);
            producto.setNombre("Teclado Corsair K95 mecanico");
            producto.setPrecio(700);

            Categoria categoria = new Categoria();
            categoria.setId(2l);
            producto.setCategoria(categoria);

            repositorio.guardar(producto);
            System.out.println("Producto editado con exito.");
            repositorio.listar().forEach(p -> System.out.println(p));

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
