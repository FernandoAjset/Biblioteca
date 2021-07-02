/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author ferna
 */
public class MetodosDocumentos {
    

    
 
    static void GrabarNuevaFactura(int ccliente, String nombre, String direccion, String nit, int cproducto, 
    String nproducto, double pproducto, int cuotas, double mcuotas)
    {
            try
            {      
                PreparedStatement ps2 = Conexiones.Conexion.getConexion().prepareStatement("insert into factura values (null,?,?,?,?,?,?,?,?,?,?)");
                java.util.Date fecha = new Date();
                java.sql.Date fecharegistro = new java.sql.Date(fecha.getTime());
                
                ps2.setDate(1,fecharegistro);
                ps2.setInt(2,ccliente);
                ps2.setString(3,nombre);
                ps2.setString(4,direccion);
                ps2.setString(5,nit);
                ps2.setInt(6,cproducto);
                ps2.setString(7,nproducto);
                ps2.setDouble(8,pproducto);
                ps2.setInt(9,cuotas);
                ps2.setDouble(10,mcuotas);
                ps2.executeUpdate();
            }   
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
    }
    
    static void GrabarFechas(int ccontrato,int cuotas)
    {
            try
            {      
                Calendar fecha = Calendar.getInstance();
                
                if(cuotas==3)
                {
                    PreparedStatement ps2 = Conexiones.Conexion.getConexion().prepareStatement(
                    "insert into fechaspago values (?, ?,?,?,null,null,null,null,null,null,null,null,null)");
                
                    ps2.setInt(1,ccontrato);
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(2,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(3,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(4,new java.sql.Date(fecha.getTimeInMillis()));
                    ps2.executeUpdate();
                }
                if(cuotas==6)
                {
                    PreparedStatement ps2 = Conexiones.Conexion.getConexion().prepareStatement(
                    "insert into fechaspago values (?, ?,?,?,?,?,?,null,null,null,null,null,null)",
                    PreparedStatement.RETURN_GENERATED_KEYS);  
                
                    ps2.setInt(1,ccontrato);
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(2,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(3,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(4,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(5,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(6,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(7,new java.sql.Date(fecha.getTimeInMillis()));
                    
                    ps2.executeUpdate();
                }
                if(cuotas==10)
                {
                    PreparedStatement ps2 = Conexiones.Conexion.getConexion().prepareStatement(
                    "insert into fechaspago values (?, ?,?,?,?,?,?,?,?,?,?,null,null)",
                    PreparedStatement.RETURN_GENERATED_KEYS);  
                
                    ps2.setInt(1,ccontrato);
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(2,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(3,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(4,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(5,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(6,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(7,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(8,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(9,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(10,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(11,new java.sql.Date(fecha.getTimeInMillis()));
                    
                    ps2.executeUpdate();
                }
                if(cuotas==12)
                {
                    PreparedStatement ps2 = Conexiones.Conexion.getConexion().prepareStatement(
                    "insert into fechaspago values (?, ?,?,?,?,?,?,?,?,?,?,?,?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);  
                
                    ps2.setInt(1,ccontrato);
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(2,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(3,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(4,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(5,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(6,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(7,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(8,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(9,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(10,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(11,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(12,new java.sql.Date(fecha.getTimeInMillis()));
                    fecha.add(Calendar.MONTH, 1);
                    ps2.setDate(13,new java.sql.Date(fecha.getTimeInMillis()));
                    
                    ps2.executeUpdate();
                }
                
            }   
            catch(SQLException e){
            JOptionPane.showMessageDialog(null, "La BD tiene problemas: " + e.getMessage(),
            "Error de Base de Datos",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    static void GrabarContrato(int ccliente,int cfactura, int cuotas, double mcuota, double precio)
    {
            try
            {      
                int pagadas=0;
                PreparedStatement ps2 = Conexiones.Conexion.getConexion().prepareStatement("insert into contrato values (null,?,?,?,?,?,?,?,?)");

                java.util.Date fecha = new Date();
                java.sql.Date fecharegistro = new java.sql.Date(fecha.getTime());
                
                ps2.setInt(1,ccliente);
                ps2.setInt(2,cfactura);
                ps2.setDate(3,fecharegistro);
                ps2.setInt(4,cuotas);
                 ps2.setInt(5,pagadas);
                  ps2.setInt(6,cuotas);
                   ps2.setDouble(7,mcuota);
                   ps2.setDouble(8,precio);
                ps2.executeUpdate();
            }   
            catch(SQLException e){
            JOptionPane.showMessageDialog(null, "La BD tiene problemas: " + e.getMessage(),
            "Error de Base de Datos",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    static int CodigoUltimaFactura()
    {
        int cnuevo=0;
        ResultSet rs;
        try
        {
            Statement mcodigo = Conexiones.Conexion.getConexion().createStatement();
            rs = mcodigo.executeQuery("select cfactura from factura");
            while (rs.next()) {
                String ccliente = rs.getString("CFACTURA");
                if(Integer.parseInt(ccliente)>cnuevo)
                {
                    cnuevo=Integer.parseInt(ccliente);
                }
            }
        }
        catch(Exception e)
        {
           System.out.println(e.toString());
             
        }
        return cnuevo;
    }
    
    static int CodigoUltimoContrato()
    {
        int cnuevo=0;
        ResultSet rs;
        try
        {
            Statement mcodigo = Conexiones.Conexion.getConexion().createStatement();
            rs = mcodigo.executeQuery("select ccontrato from contrato");
            while (rs.next()) {
                String ccliente = rs.getString("CCONTRATO");
                if(Integer.parseInt(ccliente)>cnuevo)
                {
                    cnuevo=Integer.parseInt(ccliente);
                }
            }
        }
        catch(Exception e)
        {
           System.out.println(e.toString());
             
        }
        return cnuevo;
    }
    
        public static boolean ExisteFactura(int id)
    {
        int aux;
        boolean r=false;
        ResultSet rs;
        try
        {
            Statement mcodigo = Conexiones.Conexion.getConexion().createStatement();
            rs = mcodigo.executeQuery("select cfactura from factura");
            while (rs.next()) 
            {
                String cfactura = rs.getString("CFACTURA");
                aux=Integer.parseInt(cfactura);
                if(id==aux)
                {
                    r=true;
                }
            }
        }
        catch(Exception e)
        {
           System.out.println(e.toString());
             
        }
        return r;
    }
}
