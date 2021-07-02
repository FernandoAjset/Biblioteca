/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;

/**
 *
 * @author fernando
 */
public class MetodosCliente {
    
    static void GrabarNuevoCliente(String nombre, String apellido, String direccion, String nit, int cel )
    {
            try
            {
                PreparedStatement ps2 = Conexiones.Conexion.getConexion().prepareStatement("insert into clientes values (null,?,?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS);            
                ps2.setString(1,nombre);
                ps2.setString(2,apellido);
                ps2.setString(3,direccion);
                ps2.setString(4,nit);
                ps2.setInt(5,cel);
                ps2.executeUpdate();
            }   
            catch(Exception e)
            {
                System.out.println(e.toString());
             
            }
    }
    
    static int CodigoUltimo()
    {
        int cnuevo=0;
        ResultSet rs;
        try
        {
            Statement mcodigo = Conexiones.Conexion.getConexion().createStatement();
            rs = mcodigo.executeQuery("select ccliente from clientes");
            while (rs.next()) {
                String ccliente = rs.getString("CCLIENTE");
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
    
    
    public static boolean ExisteCodigoCliente(int id)
    {
        int aux;
        boolean r=false;
        ResultSet rs;
        try
        {
            Statement mcodigo = Conexiones.Conexion.getConexion().createStatement();
            rs = mcodigo.executeQuery("select ccliente from clientes");
            while (rs.next()) 
            {
                String ccliente = rs.getString("CCLIENTE");
                aux=Integer.parseInt(ccliente);
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
    
    static void MostrarCliente(int id, String nombre, String apellido, String direccion, String nit, int celular)
    {
        Statement ps=null;
        ResultSet rs;
        String n=new String();
        String a=new String();
        String d=new String();
        String ni=new String();
        String cel=new String();
        int auxcodigo;
        int auxcel;
        
        try
        {
            ps = Conexiones.Conexion.getConexion().createStatement();
            rs = ps.executeQuery("select ccliente,ncliente,acliente,dcliente,nitcliente,tcliente from clientes");
            while (rs.next()) 
            {
                String ccliente = rs.getString("CCLIENTE");
                auxcodigo=Integer.parseInt(ccliente);
                
                n = rs.getString("NCLIENTE");
                a = rs.getString("ACLIENTE");
                d = rs.getString("DCLIENTE");
                ni = rs.getString("NITCLIENTE");
                cel = rs.getString("TCLIENTE");
                auxcel=Integer.parseInt(cel);
                if(id==auxcodigo)
                {
                    nombre=n;
                    apellido=a;
                    direccion=d;
                    nit=ni;
                    celular=auxcel;
                }
            }
        }
        catch(Exception e)
        {
           System.out.println(e.toString());
             
        }
        
        
    }
    


    
}
