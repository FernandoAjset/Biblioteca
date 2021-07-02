/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import java.sql.*;

/**
 *
 * @author Brizeth_Alvarado
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection conn=null;
        Statement ps=null;
        Statement stmt=null;
        
        ResultSet rs;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","progra");  
            ps = conn.createStatement();
            rs = ps.executeQuery("select job_id, job_title from jobs");
            while (rs.next()) {
                String id_empleo = rs.getString("JOB_ID");
                String titulo_empleo = rs.getString("JOB_TITLE");
                System.out.println(id_empleo + "\t" + titulo_empleo);
            }
            //jTable1 = new javax.swing.JTable(model);
        }
        catch(Exception e)
        {
           System.out.println(e.toString());
            
            
        }
    }
    
}
