
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brizeth Alvarado
 */
public class Juego extends javax.swing.JFrame {

    /**
     * Creates new form Juego
     */
    funciones f1=new funciones();
    public int m[][]=new int[3][3];
    int f, c,aux1,aux2,mr=9;
    String t="X",num;
    boolean ganar;
    
    public Juego() {
        initComponents();
        puntosx.setOpaque(true);
        puntos_o.setOpaque(true);
    }
public String turno(String t){
        String Respuesta=new String();
        if(t.equals("X")){
             Respuesta="O";
        }
        if(t.equals("O")){
            Respuesta="X";
        }
            return Respuesta;

    }

public void bloqueo(){
    B1.setEnabled(false);
    B2.setEnabled(false);
    B3.setEnabled(false);
    B4.setEnabled(false);
    B5.setEnabled(false);
    B6.setEnabled(false);
    B7.setEnabled(false);
    B8.setEnabled(false);
    B9.setEnabled(false);
}
public void blanco(){
    for(int i=0;i<=2;i++){
        for(int j=0; j<=2; j++){
            m[i][j]=0;
        }
    }
    B1.setEnabled(true);
    B2.setEnabled(true);
    B3.setEnabled(true);
    B4.setEnabled(true);
    B5.setEnabled(true);
    B6.setEnabled(true);
    B7.setEnabled(true);
    B8.setEnabled(true);
    B9.setEnabled(true); 
    
    B1.setText("");
    B2.setText("");
    B3.setText("");
    B4.setText("");
    B5.setText("");
    B6.setText("");
    B7.setText("");
    B8.setText("");
    B9.setText(""); 
    
}

public void empate()
{
    if(mr==0)
    {
            if(ganar!=true){
                JOptionPane.showMessageDialog(null, "EMPATE"); 
        }
    }
}
        
 public void ingreso(int f, int c){
      if(t.equals("X")){
             m[f][c]=20;
        }
        if(t.equals("O")){
            m[f][c]=33;
        }  
    }
 
 public void combinacion(){
     int suma;
     suma=m[0][0]+m[0][1]+m[0][2];  
     if(suma==60){
         JOptionPane.showMessageDialog(null, "Ganaste: X");
         bloqueo();
         ganar=true;
         aux1++;
         num=String.valueOf(aux1);
         puntosx.setText(num);
     }
     if(suma==99){
         JOptionPane.showMessageDialog(null, "Ganaste: O");
         bloqueo();
         ganar=true;
         aux2++;
         num=String.valueOf(aux2);
         puntos_o.setText(num);
     }
     
     suma=m[0][0]+m[1][0]+m[2][0];  
     if(suma==60){
         JOptionPane.showMessageDialog(null, "Ganaste: X");
         bloqueo();
         ganar=true;
         aux1++;
         num=String.valueOf(aux1);
         puntosx.setText(num);
     }
     if(suma==99){
         JOptionPane.showMessageDialog(null, "Ganaste: O");
         bloqueo();
         ganar=true;
         aux2++;
         num=String.valueOf(aux2);
         puntos_o.setText(num);
         
     }
     
     suma=m[0][0]+m[1][1]+m[2][2];  
     if(suma==60){
         JOptionPane.showMessageDialog(null, "Ganaste: X");
         bloqueo();
         ganar=true;
         aux1++;
         num=String.valueOf(aux1);
         puntosx.setText(num);
     }
     if(suma==99){
         JOptionPane.showMessageDialog(null, "Ganaste: O");
         bloqueo();
         ganar=true;
         aux2++;
         num=String.valueOf(aux2);
         puntos_o.setText(num);
     }
     
     suma=m[2][0]+m[2][1]+m[2][2];  
     if(suma==60){
         JOptionPane.showMessageDialog(null, "Ganaste: X");
         bloqueo();
         ganar=true;
         aux1++;
         num=String.valueOf(aux1);
         puntosx.setText(num);
     }
     if(suma==99){
         JOptionPane.showMessageDialog(null, "Ganaste: O");
         bloqueo();
         ganar=true;
         aux2++;
         num=String.valueOf(aux2);
         puntos_o.setText(num);
     }
     
     suma=m[0][2]+m[1][2]+m[2][2];  
     if(suma==60){
         JOptionPane.showMessageDialog(null, "Ganaste: X");
         bloqueo();
         ganar=true;
         aux1++;
         num=String.valueOf(aux1);
         puntosx.setText(num);
     }
     if(suma==99){
         JOptionPane.showMessageDialog(null, "Ganaste: O");
         bloqueo();
         ganar=true;
         aux2++;
         num=String.valueOf(aux2);
         puntos_o.setText(num);
     }
     
     suma=m[0][1]+m[1][1]+m[2][1];  
     if(suma==60){
         JOptionPane.showMessageDialog(null, "Ganaste: X");
         bloqueo();
         ganar=true;
         aux1++;
         num=String.valueOf(aux1);
         puntosx.setText(num);
     }
     if(suma==99){
         JOptionPane.showMessageDialog(null, "Ganaste: O");
         bloqueo();
         ganar=true;
         aux2++;
         num=String.valueOf(aux2);
         puntos_o.setText(num);
     }
     
     suma=m[1][0]+m[1][1]+m[1][2];  
     if(suma==60){
         JOptionPane.showMessageDialog(null, "Ganaste: X");
         bloqueo();
         ganar=true;
         aux1++;
         num=String.valueOf(aux1);
         puntosx.setText(num);
     }
     if(suma==99){
         JOptionPane.showMessageDialog(null, "Ganaste: O");
         bloqueo();
         ganar=true;
         aux2++;
         num=String.valueOf(aux2);
         puntos_o.setText(num);
     }
     
     suma=m[2][0]+m[1][1]+m[0][2];  
     if(suma==60){
         JOptionPane.showMessageDialog(null, "Ganaste: X");
         bloqueo();
         ganar=true;
         aux1++;
         num=String.valueOf(aux1);
         puntosx.setText(num);
     }
     if(suma==99){
         JOptionPane.showMessageDialog(null, "Ganaste: O");
         bloqueo();
         ganar=true;
         aux2++;
         num=String.valueOf(aux2);
         puntos_o.setText(num);
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

        jSeparator1 = new javax.swing.JSeparator();
        B5 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        s_turno = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        puntosx = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        puntos_o = new javax.swing.JLabel();
        reiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        jLabel1.setText("SIGUIENTE TURNO:");

        s_turno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s_turno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("MARCADOR");

        jLabel4.setText("O");

        puntosx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntosx.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("x");

        puntos_o.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos_o.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        reiniciar.setText("Reiniciar");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(s_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addComponent(puntosx, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(puntos_o, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(reiniciar)))
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puntosx, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puntos_o, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(reiniciar)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(s_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
       B1.setText(t);
       B1.setEnabled(false);
       f=0;
       c=0;
       ingreso(f,c);
       combinacion();
       mr--;
       empate();
       t=turno(t);
       s_turno.setText(t);
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        B2.setText(t);
       B2.setEnabled(false);
       f=0;
       c=1;
       ingreso(f,c);
       combinacion();
       mr--;
       empate();
       t=turno(t);
       s_turno.setText(t);
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
        B3.setText(t);
       B3.setEnabled(false);
       f=0;
       c=2;
       ingreso(f,c);
       combinacion();
       mr--;
       empate();
       t=turno(t);
       s_turno.setText(t);
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:
        B4.setText(t);
       B4.setEnabled(false);
       f=1;
       c=0;
       ingreso(f,c);
       combinacion();
       mr--;
       empate();
       t=turno(t);
       s_turno.setText(t);
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:
        B5.setText(t);
       B5.setEnabled(false);
       f=1;
       c=1;
       ingreso(f,c);
       combinacion();
       mr--;
       empate();
       t=turno(t);
       s_turno.setText(t);
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        // TODO add your handling code here:
        B6.setText(t);
       B6.setEnabled(false);
       f=1;
       c=2;
       ingreso(f,c);
       combinacion();
       mr--;
       empate();
       t=turno(t);
       s_turno.setText(t);
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        // TODO add your handling code here:
        B7.setText(t);
       B7.setEnabled(false);
       f=2;
       c=0;
       ingreso(f,c);
       combinacion();
       mr--;
       empate();
       t=turno(t);
       s_turno.setText(t);
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        // TODO add your handling code here:
        B8.setText(t);
       B8.setEnabled(false);
       f=2;
       c=1;
       ingreso(f,c);
       combinacion();
       mr--;
       empate();
       t=turno(t);
       s_turno.setText(t);
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        // TODO add your handling code here:
        B9.setText(t);
       B9.setEnabled(false);
       f=2;
       c=2;
       ingreso(f,c);
       combinacion();
       mr--;
       empate();
       t=turno(t);
       s_turno.setText(t);
    }//GEN-LAST:event_B9ActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        // TODO add your handling code here:
        mr=9;
        ganar=false;
        blanco();
        
    }//GEN-LAST:event_reiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel puntos_o;
    private javax.swing.JLabel puntosx;
    private javax.swing.JButton reiniciar;
    private javax.swing.JLabel s_turno;
    // End of variables declaration//GEN-END:variables
}
