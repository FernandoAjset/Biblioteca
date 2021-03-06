/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import arbol.ArbolBinario;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import tablahash.HashCerrada;

/**
 *
 * @author ferna
 */
public class AppBiblioteca extends javax.swing.JFrame {

    /**
     * Creates new form AppBiblioteca
     */
    public AppBiblioteca() {
        initComponents();
        nLibro.setText("");
        pClaves.setText("");
        setLocationRelativeTo(null);
    }

    public ArbolBinario arbol = new ArbolBinario();
    public HashCerrada tablaHash = new HashCerrada(10);

    public void ingresarLibro(String nombreLibro, String claves) {
        if (tablaHash.BuscarLibro(nombreLibro) != null) {
            JOptionPane.showMessageDialog(null, "Libro '" + nombreLibro + "' ya existe");
        } else {
            tablaHash.IngresarLibro(nombreLibro, claves);
            nLibro.setText("");
            pClaves.setText("");
            JOptionPane.showMessageDialog(null, "Libro '" + nombreLibro + "' guardado con exito");

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

        nLibro = new javax.swing.JTextField();
        pClaves = new javax.swing.JTextField();
        iLibro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonBuscarLibro = new javax.swing.JButton();
        bLibro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        blibroxclaves = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mNombre = new javax.swing.JLabel();
        mClaves = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bxclaves = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        rbxclaves = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(544, 668));
        getContentPane().setLayout(null);
        getContentPane().add(nLibro);
        nLibro.setBounds(212, 19, 280, 32);

        pClaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pClavesActionPerformed(evt);
            }
        });
        getContentPane().add(pClaves);
        pClaves.setBounds(212, 69, 280, 32);

        iLibro.setText("Ingresar Libro");
        iLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iLibroActionPerformed(evt);
            }
        });
        getContentPane().add(iLibro);
        iLibro.setBounds(48, 107, 123, 35);

        jLabel1.setText("Ingrese el Nombre del Libro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(38, 28, 170, 14);

        jLabel2.setText("Ingrese las palabras clave");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(38, 78, 160, 14);

        jButtonBuscarLibro.setText("Buscar Libro");
        jButtonBuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarLibroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarLibro);
        jButtonBuscarLibro.setBounds(48, 240, 116, 31);
        getContentPane().add(bLibro);
        bLibro.setBounds(197, 207, 260, 27);

        jLabel3.setText("BUSQUEDA DE LIBRO USANDO NOMBRE DEL TITULO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 170, 320, 14);

        jLabel4.setText("BUSQUEDA DE LIBROS QUE CONTIENEN LA(S) PALABRA(S) CLAVE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(122, 350, 400, 14);

        blibroxclaves.setText("Buscar Libros");
        blibroxclaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blibroxclavesActionPerformed(evt);
            }
        });
        getContentPane().add(blibroxclaves);
        blibroxclaves.setBounds(48, 433, 105, 30);

        jLabel5.setText("Resultado de la Busqueda");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 470, 190, 14);

        jLabel6.setText("Ingrese el nombre del titulo a buscar");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 190, 300, 14);
        getContentPane().add(mNombre);
        mNombre.setBounds(48, 289, 470, 21);
        getContentPane().add(mClaves);
        mClaves.setBounds(48, 316, 460, 28);

        jLabel7.setText("Ingrese La(s) palabra(s) clave");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(220, 370, 220, 14);

        bxclaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxclavesActionPerformed(evt);
            }
        });
        getContentPane().add(bxclaves);
        bxclaves.setBounds(151, 390, 319, 32);

        rbxclaves.setColumns(20);
        rbxclaves.setRows(5);
        jScrollPane1.setViewportView(rbxclaves);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(46, 490, 470, 130);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iLibroActionPerformed
        String cadenaLibro = new String();
        String claves = pClaves.getText().replaceAll("\\s+", "");
        ArbolBinario arbolClave = new ArbolBinario();

        cadenaLibro = nLibro.getText();
        if (cadenaLibro.isEmpty() || claves.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nombre del Libro o Claves no puede estar vacio, verifique");
        } else {
            if (tablaHash.existeLibro(cadenaLibro) != false) {
                JOptionPane.showMessageDialog(null, "Libro '" + cadenaLibro + "' Ya Existe");
                nLibro.setText("");
                pClaves.setText("");
            } else {
                tablaHash.IngresarLibro(cadenaLibro, claves);
                nLibro.setText("");
                pClaves.setText("");
                JOptionPane.showMessageDialog(null, "Libro '" + cadenaLibro + "' guardado con exito");
            }
        }
    }//GEN-LAST:event_iLibroActionPerformed

    private void jButtonBuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarLibroActionPerformed
        String buscar = String.valueOf(bLibro.getText());
        mNombre.setText("");
        mClaves.setText("");
        if (tablaHash.BuscarLibro(buscar) != null) {
            JOptionPane.showMessageDialog(null, "Mostrando resultados");
            mNombre.setText("Nombre del Libro: " + tablaHash.BuscarLibro(buscar).DarNombre());
            mClaves.setText("Palabras clave: " + tablaHash.BuscarLibro(buscar).DarClaves().Preorden());
        } else {
            if (bLibro.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "El nombre del libro, no puede estar vacio");
            } else {
                JOptionPane.showMessageDialog(null, "NO existen coincidencias para '" + buscar + "'");
                bLibro.setText("");
            }
        }
    }//GEN-LAST:event_jButtonBuscarLibroActionPerformed

    private void blibroxclavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blibroxclavesActionPerformed
        String buscar = new String();
        String rlibros = new String();
        String aux = new String();
        buscar = bxclaves.getText().replaceAll("\\s+", "");
        if (buscar.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingreso de palabras clave, no puede estar vacio");
        } else {
            String arregloClaves[] = buscar.split(",");
            for (int i = 0; i < arregloClaves.length; i++) {
                aux = tablaHash.BuscarPorClaves(arregloClaves[i]);
                if (aux.isEmpty() != true) {
                    rlibros += arregloClaves[i].toUpperCase() + " se encuentra en: " + "\n" + aux;
                }
            }
            if (rlibros.isEmpty()) {
                JOptionPane.showMessageDialog(null, "NO EXISTEN LIBROS QUE CONTENGAN LA(S) PALABRA(S) CLAVE");
                rbxclaves.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Mostrando resultados");
                rbxclaves.setText(rlibros);
            }
        }
    }//GEN-LAST:event_blibroxclavesActionPerformed

    private void pClavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pClavesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pClavesActionPerformed

    private void bxclavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxclavesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bxclavesActionPerformed

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
            java.util.logging.Logger.getLogger(AppBiblioteca.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppBiblioteca.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppBiblioteca.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppBiblioteca.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppBiblioteca().setVisible(true);
            }
        });
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("recursos/iconbiblio.png"));

        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bLibro;
    private javax.swing.JButton blibroxclaves;
    private javax.swing.JTextField bxclaves;
    private javax.swing.JButton iLibro;
    private javax.swing.JButton jButtonBuscarLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mClaves;
    private javax.swing.JLabel mNombre;
    private javax.swing.JTextField nLibro;
    private javax.swing.JTextField pClaves;
    private javax.swing.JTextArea rbxclaves;
    // End of variables declaration//GEN-END:variables
}
