package org.lpz.java.jdbc;

import org.lpz.java.jdbc.models.Categoria;
import org.lpz.java.jdbc.models.Producto;
import org.lpz.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.lpz.java.jdbc.repositorio.Repositorio;
import org.lpz.java.jdbc.util.ConexionBD;
import java.sql.*;

public class EjemploJdbc {
    static void main(String[] args) {

        //String url = "jdbc:mysql://localhost:3306/java_curso?serverTimeZone=UTC";
        //String username = "root";
        //String password = "yoysoloyo";

        /*try (
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
                ResultSet resultado = stmt.executeQuery("SELECT * FROM productos")
                ){

            while(resultado.next()) {
                System.out.print(resultado.getInt("id"));
                System.out.print(" | ");
                System.out.print(resultado.getString("nombre"));
                System.out.print(" | ");
                System.out.print("precio");
                System.out.print(" | ");
                System.out.println(resultado.getDate("fecha_registro"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } */

        /*try (
                Connection conn = ConexionBD.getInstance();
                Statement stmt = conn.createStatement();
                ResultSet resultado = stmt.executeQuery("SELECT * FROM productos")
        ){

            while(resultado.next()) {
                System.out.print(resultado.getInt("id"));
                System.out.print(" | ");
                System.out.print(resultado.getString("nombre"));
                System.out.print(" | ");
                System.out.print("precio");
                System.out.print(" | ");
                System.out.println(resultado.getDate("fecha_registro"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }*/

        try (Connection conn = ConexionBD.getInstance()){

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("========== Listar ==========");

            repositorio.listar().forEach(p -> System.out.println(p));
            System.out.println("========== Obtener por ID ==========");

            System.out.println(repositorio.porId(2l));

            System.out.println("========== Insertar nuevo producto ==========");
            Producto producto = new Producto();
            producto.setNombre("Teclado Razer mecanico");
            producto.setPrecio(550);
            producto.setFechaRegistro(new Date(2026, 01, 30));

            Categoria categoria = new Categoria();
            categoria.setId(3l);
            producto.setCategoria(categoria);

            repositorio.guardar(producto);

            System.out.println("Producto guardado con exito.");
            repositorio.listar().forEach(p -> System.out.println(p));

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
