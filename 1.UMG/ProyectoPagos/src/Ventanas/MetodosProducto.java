/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author fernando
 */
import java.sql.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class MetodosProducto {

    static void ConsultarTodo() {
        Statement ps = null;
        ResultSet rs;
        try {
            ps = Conexiones.Conexion.getConexion().createStatement();
            rs = ps.executeQuery("select cproducto, nproducto, pproducto from producto");
            while (rs.next()) {
                String cproducto = rs.getString("CPRODUCTO");
                String nombre = rs.getString("NPRODUCTO");
                String pproducto = rs.getString("PPRODUCTO");

                System.out.println(cproducto + "\t" + nombre + "\t" + pproducto + "\t");
            }
        } catch (Exception e) {
            System.out.println(e.toString());

        }
    }

    static int CodigoUltimo() {
        int cnuevo = 0;
        ResultSet rs;
        try {
            Statement mcodigo = Conexiones.Conexion.getConexion().createStatement();
            rs = mcodigo.executeQuery("select cproducto from producto");
            while (rs.next()) {
                String cproducto = rs.getString("CPRODUCTO");
                if (Integer.parseInt(cproducto) > cnuevo) {
                    cnuevo = Integer.parseInt(cproducto);
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());

        }
        return cnuevo;
    }

    static int CantidadStock(int id) {
        int cstock = 0;
        ResultSet rs;
        try {
            Statement mcodigo = Conexiones.Conexion.getConexion().createStatement();
            rs = mcodigo.executeQuery("select ID_PRODUCTO, cantidad_stock from stock");
            while (rs.next()) {
                String cproducto = rs.getString("ID_PRODUCTO");
                String stock = rs.getString("CANTIDAD_STOCK");
                if (id == Integer.parseInt(cproducto)) {
                    cstock = Integer.parseInt(stock);
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());

        }
        return cstock;
    }

    static boolean ExisteCodigoStock(int id) {
        int aux;
        boolean r = false;
        ResultSet rs;
        try {
            Statement mcodigo = Conexiones.Conexion.getConexion().createStatement();
            rs = mcodigo.executeQuery("select ID_PRODUCTO from stock");
            while (rs.next()) {
                String cproducto = rs.getString("ID_PRODUCTO");
                aux = Integer.parseInt(cproducto);
                if (id == aux) {
                    r = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());

        }
        return r;
    }

    static String MostrarProducto(int id) {
        Statement ps = null;
        ResultSet rs;
        String Info = new String();
        try {
            ps = Conexiones.Conexion.getConexion().createStatement();
            rs = ps.executeQuery("select cproducto, nproducto from producto");
            while (rs.next()) {
                String cproducto = rs.getString("CPRODUCTO");
                int aux = Integer.parseInt(cproducto);

                String nombre = rs.getString("NPRODUCTO");
                if (id == aux) {
                    return nombre;
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());

        }
        return null;
    }

    static String MostrarPrecioProducto(int id) {
        Statement ps = null;
        ResultSet rs;
        String Info = new String();
        try {
            ps = Conexiones.Conexion.getConexion().createStatement();
            rs = ps.executeQuery("select cproducto, pproducto from producto");
            while (rs.next()) {
                String cproducto = rs.getString("CPRODUCTO");
                int aux = Integer.parseInt(cproducto);
                String precio = new String();//="Q.";
                precio += rs.getString("PPRODUCTO");
                if (id == aux) {
                    return precio;
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());

        }
        return null;
    }

    static void GrabarNuevoProducto(String nombre, double precio) {
        try {
            PreparedStatement ps2 = Conexiones.Conexion.getConexion().prepareStatement("insert into producto values (null,?,?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            //REDONDEAR PRECIO ANTES DE INGRESAR A BD
            DecimalFormat formato = new DecimalFormat("#.00");
            int r = (int) Math.round(precio * 100);
            precio = r / 100.0;

            ps2.setString(1, nombre);
            ps2.setDouble(2, precio);
            ps2.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo grabar datos " + e.getMessage(),
                    "Error de Escritura", JOptionPane.ERROR_MESSAGE);
        }
    }

    static void GrabarStock(int codigo, int stock) {
        try {
            PreparedStatement ps2 = Conexiones.Conexion.getConexion().prepareStatement("insert into stock values (?,?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            ps2.setInt(1, codigo);
            ps2.setDouble(2, stock);
            ps2.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo grabar datos " + e.getMessage(),
                    "Error de Escritura", JOptionPane.ERROR_MESSAGE);
        }
    }

    static void ModificarProducto(int codigo, String nombre, double precio) {
        String modificar="UPDATE producto set nproducto=?, pproducto=?"+"WHERE cproducto=?";
        try {
            PreparedStatement ps2 = Conexiones.Conexion.getConexion().prepareStatement(modificar);
            ps2.setString(1, nombre);
            ps2.setDouble(2, precio);
            ps2.setInt(3, codigo);
            ps2.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo grabar datos " + e.getMessage(),
                    "Error de Escritura", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //grabar();
        System.out.println("****CONSULTA DESPUES DE GRABAR****");
        ConsultarTodo();
        System.out.println(MostrarProducto(5));

    }

}
