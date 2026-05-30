package org.lpz.java.jdbc.repositorio;

import org.lpz.java.jdbc.models.Categoria;
import org.lpz.java.jdbc.models.Producto;
import org.lpz.java.jdbc.util.ConexionBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioImpl implements Repositorio<Producto>{

    private Connection getConection() throws SQLException {
        return ConexionBD.getInstance();
    }

    @Override
    public List<Producto> listar() {
        List<Producto> productos = new ArrayList<>();
        /*try(Statement stmt = getConection().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM productos")) {

            while(rs.next()) {
                Producto p = crearProducto(rs);
                productos.add(p);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }*/

        try(Statement stmt = getConection().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT p.*, c.nombre AS categoria FROM productos " +
                    "AS p INNER JOIN categorias AS c ON (p.categoria_id = c.id)")) {

            while(rs.next()) {
                Producto p = crearProducto(rs);
                productos.add(p);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productos;
    }

    @Override
    public Producto porId(long id) {
        Producto producto = null;

        /*try(PreparedStatement stmt = getConection()
                .prepareStatement("SELECT * FROM productos WHERE id = ?")) {
            stmt.setLong(1, id);

            ResultSet rs = stmt.executeQuery();

            if(rs.next()) {
                producto = crearProducto(rs);

            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/

        try(PreparedStatement stmt = getConection()
                .prepareStatement("SELECT p.*, c.nombre AS categoria FROM productos " +
                        "AS p INNER JOIN categorias AS c ON (p.categoria_id = c.id) WHERE p.id = ?")) {
            stmt.setLong(1, id);

            ResultSet rs = stmt.executeQuery();

            if(rs.next()) {
                producto = crearProducto(rs);

            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return producto;
    }

    @Override
    public void guardar(Producto producto) {

        String sql;
        /*if ((producto.getId() != null) && (producto.getId() > 0)) {
            sql = "UPDATE productos SET nombre=?, precio=? WHERE id=?";
        } else {
            sql = "INSERT INTO productos(nombre, precio, fecha_registro) VALUES (?, ?, ?)";
        }

        try(PreparedStatement stmt = getConection().prepareStatement(sql)) {
            stmt.setString(1, producto.getNombre());
            stmt.setLong(2, producto.getPrecio());

            if ((producto.getId() != null) && (producto.getId() > 0)) {
                stmt.setLong(3, producto.getId());
            } else {
                stmt.setDate(3, new Date(producto.getFechaRegistro().getTime()));
            }

            stmt.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/

        if ((producto.getId() != null) && (producto.getId() > 0)) {
            sql = "UPDATE productos SET nombre=?, precio=?, categoria_id=? WHERE id=?";
        } else {
            sql = "INSERT INTO productos(nombre, precio, categoria_id, fecha_registro ) VALUES (?, ?, ?, ?)";
        }

        try(PreparedStatement stmt = getConection().prepareStatement(sql)) {
            stmt.setString(1, producto.getNombre());
            stmt.setLong(2, producto.getPrecio());
            stmt.setLong(3, producto.getCategoria().getId());

            if ((producto.getId() != null) && (producto.getId() > 0)) {
                stmt.setLong(4, producto.getId());
            } else {
                stmt.setDate(4, new Date(producto.getFechaRegistro().getTime()));
            }

            stmt.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void eliminar(Long id) {
        try(PreparedStatement stmt = getConection().prepareStatement("DELETE FROM productos  WHERE id=?")) {
            stmt.setLong(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private static Producto crearProducto(ResultSet rs) throws SQLException {
        Producto p = new Producto();
        p.setId(rs.getLong("id"));
        p.setNombre(rs.getString("nombre"));
        p.setPrecio(rs.getInt("precio"));
        p.setFechaRegistro(rs.getDate("fecha_registro"));
        Categoria categoria = new Categoria();
        categoria.setId(rs.getLong("categoria_id"));
        categoria.setNombre(rs.getString("categoria"));
        p.setCategoria(categoria);

        return p;
    }

}
