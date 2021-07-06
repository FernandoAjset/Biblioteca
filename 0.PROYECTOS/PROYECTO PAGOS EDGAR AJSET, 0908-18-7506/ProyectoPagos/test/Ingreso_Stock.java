/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopagos;

import java.awt.Window;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.FocusManager;
import javax.swing.JOptionPane;

/**
 *
 * @author fernando
 */
public class Ingreso_Stock extends javax.swing.JPanel {

    /**
     * Creates new form Ingreso_Stock
     */
    public Ingreso_Stock() {
        initComponents();
        cantidad.setEnabled(false);
        istock.setEnabled(false);
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
        cbuscar = new javax.swing.JTextField();
        desc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bproducto = new javax.swing.JButton();
        cantidad = new javax.swing.JTextField();
        tdesc = new javax.swing.JLabel();
        istock = new javax.swing.JButton();
        menu = new javax.swing.JButton();

        jLabel1.setText("Codigo de Producto");

        desc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desc.setToolTipText("");
        desc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Cantidad a Ingresar");

        bproducto.setText("Mostrar Producto");
        bproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bproductoActionPerformed(evt);
            }
        });

        tdesc.setText("DESCRIPCION DEL PRODUCTO");

        istock.setText("Ingresar a Stock");
        istock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                istockActionPerformed(evt);
            }
        });

        menu.setText("MENU");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cantidad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bproducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbuscar, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tdesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(desc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(istock)
                .addGap(66, 66, 66)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(tdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(desc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbuscar))
                .addGap(18, 18, 18)
                .addComponent(bproducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(istock)
                    .addComponent(menu))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        Window ventana = FocusManager.getCurrentManager().getActiveWindow();
        ventana.setVisible(false);
        cbuscar.setText("");
        cantidad.setText("");
        desc.setText("");
        
    }//GEN-LAST:event_menuActionPerformed

    private void istockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_istockActionPerformed
        // TODO add your handling code here:
        int Stock;
        int ExistenciaNueva;
        int id=Integer.parseInt(cbuscar.getText());
        try
        {   
            Stock=MetodosProducto.CantidadStock(id);
            ExistenciaNueva=Stock+Integer.parseInt(cantidad.getText());
            PreparedStatement pps=Conexiones.Conexion.getConexion().prepareStatement("update stock set cantidad_stock='"
            +ExistenciaNueva+"' where cproducto='"+cbuscar.getText()+"'");
            pps.executeUpdate();
              
            JOptionPane.showMessageDialog(null, "SE INGRESO A STOCK CON EXITO");
            cbuscar.setText("");
            cantidad.setText("");
            desc.setText("");
            cantidad.setEnabled(false);
            istock.setEnabled(false);
        }
        catch(NumberFormatException ex)
        {
                JOptionPane.showMessageDialog(null, "ERROR AL INGRESAR DATOS, VERIFIQUE");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "La BD tiene problemas" + e.getMessage(),
            "Error de Base de Datos",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_istockActionPerformed

    private void bproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bproductoActionPerformed
        // TODO add your handling code here:
        try
        {
        int id=Integer.parseInt(cbuscar.getText());
        boolean r;
        
        ResultSet rs;
            Statement existetabla = Conexiones.Conexion.getConexion().createStatement();
            rs = existetabla.executeQuery("select cproducto from stock");
        r=MetodosProducto.ExisteCodigoStock(id);
        if(r==true)
        {
            desc.setText(MetodosProducto.MostrarProducto(id));
            cantidad.setEnabled(true);
            istock.setEnabled(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "CODIGO NO ENCONTRADO, VERIFIQUE");
            cbuscar.setText("");
            cantidad.setText("");
            desc.setText("");
            cantidad.setEnabled(false);
            istock.setEnabled(false);
        } 
        }
        catch(NumberFormatException ex)
        {
                JOptionPane.showMessageDialog(null, "ERROR AL INGRESAR DATOS, VERIFIQUE");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "La BD tiene problemas" + e.getMessage(),
            "Error de Base de Datos",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bproductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bproducto;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField cbuscar;
    private javax.swing.JLabel desc;
    private javax.swing.JButton istock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton menu;
    private javax.swing.JLabel tdesc;
    // End of variables declaration//GEN-END:variables
}