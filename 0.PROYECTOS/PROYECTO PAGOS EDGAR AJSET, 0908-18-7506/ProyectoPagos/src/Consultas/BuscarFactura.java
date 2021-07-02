/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author ferna
 */
public class BuscarFactura extends javax.swing.JFrame {

    static ResultSet res;
    public static String nombre;
    /**
     * Creates new form BuscarFactura
     */
    public BuscarFactura() {
        this.setSize(new Dimension(800, 700));
        this.setMinimumSize(new Dimension(800, 700));
        initComponents();
        verfactura.setEnabled(false);
        tablafacturas.setEnabled(false);
        vercontrato.setEnabled(false);
    }

    public void cargar(){
        DefaultTableModel modelo = (DefaultTableModel) tablafacturas.getModel();
        modelo.setRowCount(0);
        res=Conexiones.Conexion.Consulta("select cfactura, ccliente, nombre from factura where ccliente='"+ccliente.getText()+"'");
        try{
            while(res.next()){
                Vector v= new Vector();
                v.add(res.getInt(1));
                v.add(res.getInt(2));
                v.add(res.getString(3));
                nombre=res.getString(3);
                modelo.addRow(v);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
    }
    

    public void limpiartabla(){
        DefaultTableModel modelo = (DefaultTableModel) tablafacturas.getModel();
        int a = tablafacturas.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        modelo.removeRow(modelo.getRowCount()-1);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nfactura = new javax.swing.JTextField();
        ccliente = new javax.swing.JTextField();
        regresar = new javax.swing.JButton();
        panelfacturascliente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablafacturas = new javax.swing.JTable();
        buscar = new javax.swing.JButton();
        verfactura = new javax.swing.JButton();
        vercontrato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Codigo Cliente:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(46, 96, 93, 23);

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PARA BUSCAR UNA FACTURA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 23, 629, 30);

        jLabel3.setText("No. Factura: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 450, 93, 24);

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("INGRESAR EL CODIGO DEL CLIENTE PARA VER LAS FACTURAS QUE POSEE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 59, 629, 30);

        nfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nfacturaActionPerformed(evt);
            }
        });
        getContentPane().add(nfactura);
        nfactura.setBounds(300, 450, 90, 30);
        getContentPane().add(ccliente);
        ccliente.setBounds(130, 90, 90, 30);

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar);
        regresar.setBounds(500, 560, 107, 39);

        tablafacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No. FACTURA", "ID CLIENTE", "NOMBRE"
            }
        ));
        jScrollPane1.setViewportView(tablafacturas);

        javax.swing.GroupLayout panelfacturasclienteLayout = new javax.swing.GroupLayout(panelfacturascliente);
        panelfacturascliente.setLayout(panelfacturasclienteLayout);
        panelfacturasclienteLayout.setHorizontalGroup(
            panelfacturasclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelfacturasclienteLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelfacturasclienteLayout.setVerticalGroup(
            panelfacturasclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfacturasclienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(panelfacturascliente);
        panelfacturascliente.setBounds(30, 170, 582, 288);

        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar);
        buscar.setBounds(232, 130, 144, 30);

        verfactura.setText("Ver Factura");
        verfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verfacturaActionPerformed(evt);
            }
        });
        getContentPane().add(verfactura);
        verfactura.setBounds(120, 490, 181, 34);

        vercontrato.setText("Ver Contrato");
        vercontrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vercontratoActionPerformed(evt);
            }
        });
        getContentPane().add(vercontrato);
        vercontrato.setBounds(360, 490, 181, 34);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        nfactura.setText("");
        ccliente.setText("");
        proyectopagos.VPrincipal mostrar = new proyectopagos.VPrincipal();
        mostrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void nfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nfacturaActionPerformed

    }//GEN-LAST:event_nfacturaActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        boolean existe;
        int id=0;
        try{
        if((nfactura.getText().length()==0)&&(ccliente.getText().length()==0))
        {
            JOptionPane.showMessageDialog(null, "INGRESE UN CAMPO PARA BUSCAR FACTURA");
            verfactura.setEnabled(false);
            vercontrato.setEnabled(false);
           tablafacturas.setEnabled(false);
            nfactura.setText("");
            ccliente.setText("");
            ccliente.requestFocus();
            limpiartabla();
        }
        if((ccliente.getText().length()!=0))
        {
           id=Integer.parseInt(ccliente.getText());
           if(proyectopagos.MetodosCliente.ExisteCodigoCliente(id)==true)
           {
                JOptionPane.showMessageDialog(null, "CODIGO DE CLIENTE CORRECTO, SE MOSTRARAN SUS FACTURAS");
                cargar();
                verfactura.setEnabled(false);
                tablafacturas.setEnabled(true);
                verfactura.setEnabled(true);
                vercontrato.setEnabled(true);
           }
           else
           {
               JOptionPane.showMessageDialog(null, "ID DE CLIENTE NO EXISTE");
                verfactura.setEnabled(false);
                vercontrato.setEnabled(false);
           tablafacturas.setEnabled(false);
            nfactura.setText("");
            ccliente.setText("");
            ccliente.requestFocus();
            limpiartabla();
           }
        }
        
        }
        catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null, "ERROR AL INGRESAR DATOS, VERIFIQUE");
            }
    }//GEN-LAST:event_buscarActionPerformed

    private void verfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verfacturaActionPerformed
        boolean coincidencia=false;
        res=Conexiones.Conexion.Consulta("select cfactura, ccliente from factura");
        try{
            while(res.next())
            {
                if(res.getInt(1)==Integer.parseInt(nfactura.getText())){
                  if(res.getInt(2)==Integer.parseInt(ccliente.getText())){
                        VerFactura ob = new VerFactura();
                        ob.setVisible(true);
                        coincidencia=true;
                    }  
                }
            }
            if(coincidencia==false){
              JOptionPane.showMessageDialog(null, "ID CLIENTE O ID FACTURA INCORRECTO\nVERIFIQUE");  
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null, "ERROR AL INGRESAR DATOS, VERIFIQUE");
            }
    }//GEN-LAST:event_verfacturaActionPerformed

    private void vercontratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vercontratoActionPerformed
      boolean coincidencia=false;
        res=Conexiones.Conexion.Consulta("select cfactura, ccliente from factura");
        try{
            while(res.next())
            {
                if(res.getInt(1)==Integer.parseInt(nfactura.getText())){
                  if(res.getInt(2)==Integer.parseInt(ccliente.getText())){
                        VerContrato ob = new VerContrato();
                        ob.setVisible(true);
                        coincidencia=true;
                    }  
                }
            }
            if(coincidencia==false){
              JOptionPane.showMessageDialog(null, "ID CLIENTE O ID FACTURA INCORRECTO\nVERIFIQUE");  
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null, "ERROR AL INGRESAR DATOS, VERIFIQUE");
            }
    }//GEN-LAST:event_vercontratoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField ccliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField nfactura;
    private javax.swing.JPanel panelfacturascliente;
    private javax.swing.JButton regresar;
    private javax.swing.JTable tablafacturas;
    private javax.swing.JButton vercontrato;
    private javax.swing.JButton verfactura;
    // End of variables declaration//GEN-END:variables
}
