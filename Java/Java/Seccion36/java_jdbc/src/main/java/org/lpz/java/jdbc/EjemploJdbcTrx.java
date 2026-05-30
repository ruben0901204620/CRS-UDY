package org.lpz.java.jdbc;

import org.lpz.java.jdbc.models.Categoria;
import org.lpz.java.jdbc.models.Producto;
import org.lpz.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.lpz.java.jdbc.repositorio.Repositorio;
import org.lpz.java.jdbc.util.ConexionBD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

public class EjemploJdbcTrx {
    static void main(String[] args) throws SQLException {

        try (Connection conn = ConexionBD.getInstance()){

            if(conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }

            try{
                Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
                System.out.println("========== Listar ==========");

                repositorio.listar().forEach(p -> System.out.println(p));
                System.out.println("========== Obtener por ID ==========");

                System.out.println(repositorio.porId(2l));

                System.out.println("========== Insertar nuevo producto ==========");
                Producto producto = new Producto();
                producto.setNombre("Teclado IBM mecanico");
                producto.setPrecio(1550);
                producto.setFechaRegistro(new Date(2026, 01, 30));

                Categoria categoria = new Categoria();
                categoria.setId(3l);
                producto.setCategoria(categoria);
                producto.setSku("abcdefg456");
                repositorio.guardar(producto);

                System.out.println("Producto guardado con exito.");
                System.out.println("========== Editar nuevo producto ==========");
                producto = new Producto();
                producto.setId(5l);
                producto.setNombre("Teclado Corsair K95 mecanico");
                producto.setPrecio(1000);
                producto.setSku("abcdef1234");

                categoria = new Categoria();
                categoria.setId(2l);
                producto.setCategoria(categoria);

                repositorio.guardar(producto);
                System.out.println("Producto editado con exito.");
                repositorio.listar().forEach(p -> System.out.println(p));

                conn.commit();

            } catch (SQLException e) {
                conn.rollback();
                e.printStackTrace();
            }

        }

    }
}
