
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fernando
 */
public class VTotito extends javax.swing.JFrame {

    int jugador;
    int x;
    int cturno=0; 
    int matriz[][]= new int[3][3];
    int maux[][]= new int[3][3];
    String t, nv;
    int n=10, mov=0, aux, aux2; 
    int v, fila, columna;
    int cx=0, co=0;
    int pg=0;
    Pila p1 = new Pila();

    /**
     * Creates new form VTotito
     */
    public VTotito() {
        
        initComponents();
        nvx.setBackground(Color.green);
        nvx.setOpaque(true);
        nvo.setBackground(Color.orange);
        nvo.setOpaque(true);
        
        
        for (int i = 0; i <= 2; i++) {
            for (int k = 0; k <= 2; k++) {
                matriz[i][k]=n;
                maux[i][k]=n;
                n++;
            }
        }
    }

    
    public int cambiarjugador(int x)
    {
        if(x==0)
        {
            x=1;
            t="0";
        }
        else 
        {
            x=0;
            t="X";
        }
        
        return x;
    }
   
    public void ganar()
    {
         if(x==0)
        {
            co++;
            nv=String.valueOf(co);
            nvo.setText(nv);
        }
        else
        {
            cx++;
            nv=String.valueOf(cx);
            nvx.setText(nv);
        }
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            deshacer.setEnabled(false);
    }
    
    
    private void empate() {
        
            if((mov==9)&&(pg==0))
            {
            JOptionPane.showMessageDialog(rootPane, "Ninguno Ganó");
            deshacer.setEnabled(false);
            }
    }
    public void activar()
    {
            b1.setText("");
            b1.setEnabled(true);
            b2.setText("");
            b2.setEnabled(true);
            b3.setText("");
            b3.setEnabled(true);
            b4.setText("");
            b4.setEnabled(true);
            b5.setText("");
            b5.setEnabled(true);
            b6.setText("");
            b6.setEnabled(true);
            b7.setText("");
            b7.setEnabled(true);
            b8.setText("");
            b8.setEnabled(true);
            b9.setText("");
            b9.setEnabled(true);
            
    }
    
    private void Borrar(){
            pg=0;    
            mov=0;
            n=10;
            for (int i = 0; i <= 2; i++) {
            for (int k = 0; k <= 2; k++) {
                matriz[i][k]=n;
                maux[i][k]=n;
                n++;
            }
            activar();
            deshacer.setEnabled(true);
        }
    }
 
    //TENTATIVO
    public void des(){
        
        if(mov>0)
        {    
            for (int i = 2; i >=0; i--) {
            for (int k = 2; k >= 0; k--) {
                maux[i][k]=p1.Cima();
                p1.retirar();
            }
        }
            mov--;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "NO HAY MAS JUGADAS");
        }
    }
    
    public void apilar()
    {
        for (int i = 0; i <= 2; i++) {
            for (int k = 0; k <= 2; k++) {
                p1.Apilar(matriz[i][k]);
                n++;
            }
        }
        
    }
    
    public void comb1()    
    {
        if((matriz[0][0]==matriz[0][1])&&(matriz[0][1]==matriz[0][2]))
        {
            JOptionPane.showMessageDialog(null, "JUGADOR "+turno.getText()+" GANO");
            ganar();
            pg=1;
            
        }
        if((matriz[0][0]==matriz[1][1])&&(matriz[1][1]==matriz[2][2]))
        {
            JOptionPane.showMessageDialog(null, "JUGADOR "+turno.getText()+" GANO");
            ganar();
            pg=1;
        }
        if((matriz[0][0]==matriz[1][0])&&(matriz[1][0]==matriz[2][0]))
        {
            
            JOptionPane.showMessageDialog(null, "JUGADOR "+turno.getText()+" GANO");
            ganar();
            pg=1;
        }
    }
    
    public void comb2()    
    {
        if((matriz[2][0]==matriz[2][1])&&(matriz[2][1]==matriz[2][2]))
        {
            
            JOptionPane.showMessageDialog(null, "JUGADOR "+turno.getText()+" GANO");
            ganar();
            pg=1;
        }
        if((matriz[0][2]==matriz[1][2])&&(matriz[1][2]==matriz[2][2]))
        {
            
            JOptionPane.showMessageDialog(null, "JUGADOR "+turno.getText()+" GANO");
            ganar();
            pg=1;
        }
    }
    
    public void comb3()    
    {
        if((matriz[0][1]==matriz[1][1])&&(matriz[1][1]==matriz[2][1]))
        {
            JOptionPane.showMessageDialog(null, "JUGADOR "+turno.getText()+" GANO");
            ganar();
            pg=1;
        }
        if((matriz[1][0]==matriz[1][1])&&(matriz[1][1]==matriz[1][2]))
        {
           
            JOptionPane.showMessageDialog(null, "JUGADOR "+turno.getText()+" GANO");
            ganar();
            pg=1;
        }
        if((matriz[2][0]==matriz[1][1])&&(matriz[1][1]==matriz[0][2]))
        {
           
            JOptionPane.showMessageDialog(null, "JUGADOR "+turno.getText()+" GANO");
            ganar();
            pg=1;
        }
        
    }  
    
    public void panel()
    {
        //RECORRIENDO MATRIZ          
            for (int i = 0; i <= 2; i++) 
            {
                for (int k = 0; k <= 2; k++) 
                {
                //PARA BOTON 1
                    if((i==0)&&(k==0))
                    {
                        if(matriz[i][k]==1)
                        {
                           b1.setText("0");
                           b1.setEnabled(false);
                        }
                        if(matriz[i][k]==2)
                        {
                           b1.setText("X");
                           b1.setEnabled(false);
                        }
                        if((matriz[i][k]!=1)&&(matriz[i][k]!=2))
                        {
                            b1.setText("");
                            b1.setEnabled(true);
                        }    
                    } 

                //PARA BOTON 2
                    if((i==0)&&(k==1))
                    {
                        if(matriz[i][k]==1)
                        {
                           b2.setText("0");
                           b2.setEnabled(false);
                        }
                        if(matriz[i][k]==2)
                        {
                           b2.setText("X");
                           b2.setEnabled(false);
                        }
                        if((matriz[i][k]!=1)&&(matriz[i][k]!=2))
                        {
                            b2.setText("");
                            b2.setEnabled(true);
                        }    
                    } 
                
                //PARA BOTON 3
                    if((i==0)&&(k==2))
                    {
                        if(matriz[i][k]==1)
                        {
                           b3.setText("0");
                           b3.setEnabled(false);
                        }
                        if(matriz[i][k]==2)
                        {
                           b3.setText("X");
                           b3.setEnabled(false);
                        }
                        if((matriz[i][k]!=1)&&(matriz[i][k]!=2))
                        {
                            b3.setText("");
                            b3.setEnabled(true);
                        }    
                    }
                    
                //PARA BOTON 4
                    if((i==1)&&(k==0))
                    {
                        if(matriz[i][k]==1)
                        {
                           b4.setText("0");
                           b4.setEnabled(false);
                        }
                        if(matriz[i][k]==2)
                        {
                           b4.setText("X");
                           b4.setEnabled(false);
                        }
                        if((matriz[i][k]!=1)&&(matriz[i][k]!=2))
                        {
                            b4.setText("");
                            b4.setEnabled(true);
                        }    
                    }
                    
                //PARA BOTON 5
                    if((i==1)&&(k==1))
                    {
                        if(matriz[i][k]==1)
                        {
                           b5.setText("0");
                           b5.setEnabled(false);
                        }
                        if(matriz[i][k]==2)
                        {
                           b5.setText("X");
                           b5.setEnabled(false);
                        }
                        if((matriz[i][k]!=1)&&(matriz[i][k]!=2))
                        {
                            b5.setText("");
                            b5.setEnabled(true);
                        }    
                    }
                    
                //PARA BOTON 6
                    if((i==1)&&(k==2))
                    {
                        if(matriz[i][k]==1)
                        {
                           b6.setText("0");
                           b6.setEnabled(false);
                        }
                        if(matriz[i][k]==2)
                        {
                           b6.setText("X");
                           b6.setEnabled(false);
                        }
                        if((matriz[i][k]!=1)&&(matriz[i][k]!=2))
                        {
                            b6.setText("");
                            b6.setEnabled(true);
                        }    
                    }   
                    
                //PARA BOTON 7
                    if((i==2)&&(k==0))
                    {
                        if(matriz[i][k]==1)
                        {
                           b7.setText("0");
                           b7.setEnabled(false);
                        }
                        if(matriz[i][k]==2)
                        {
                           b7.setText("X");
                           b7.setEnabled(false);
                        }
                        if((matriz[i][k]!=1)&&(matriz[i][k]!=2))
                        {
                            b7.setText("");
                            b7.setEnabled(true);
                        }    
                    }
                    
                //PARA BOTON 8
                    if((i==2)&&(k==1))
                    {
                        if(matriz[i][k]==1)
                        {
                           b8.setText("0");
                           b8.setEnabled(false);
                        }
                        if(matriz[i][k]==2)
                        {
                           b8.setText("X");
                           b8.setEnabled(false);
                        }
                        if((matriz[i][k]!=1)&&(matriz[i][k]!=2))
                        {
                            b8.setText("");
                            b8.setEnabled(true);
                        }    
                    }  
                
                //PARA BOTON 9
                    if((i==2)&&(k==2))
                    {
                        if(matriz[i][k]==1)
                        {
                           b9.setText("0");
                           b9.setEnabled(false);
                        }
                        if(matriz[i][k]==2)
                        {
                           b9.setText("X");
                           b9.setEnabled(false);
                        }
                        if((matriz[i][k]!=1)&&(matriz[i][k]!=2))
                        {
                            b9.setText("");
                            b9.setEnabled(true);
                        }    
                    }
                    
                }  
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

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        turno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        victoria = new javax.swing.JLabel();
        jnuevo = new javax.swing.JButton();
        vx = new javax.swing.JLabel();
        vo = new javax.swing.JLabel();
        nvo = new javax.swing.JLabel();
        nvx = new javax.swing.JLabel();
        deshacer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        turno.setBackground(new java.awt.Color(255, 102, 51));
        turno.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        turno.setForeground(new java.awt.Color(255, 102, 51));
        turno.setText("X");

        jLabel1.setText("TURNO DEL JUGADOR");

        jnuevo.setText("Nuevo Juego");
        jnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnuevoActionPerformed(evt);
            }
        });

        vx.setText("Victorias \"X\"");

        vo.setText("Victorias \"O\"");

        nvo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nvo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        nvx.setBackground(java.awt.Color.green);
        nvx.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nvx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        deshacer.setText("Deshacer");
        deshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deshacerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(victoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(434, 434, 434))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jnuevo)
                                .addGap(29, 29, 29)
                                .addComponent(deshacer)))
                        .addGap(26, 26, 26)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nvx, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nvo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(turno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(156, 156, 156))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(victoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jnuevo)
                            .addComponent(deshacer))
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(vx)
                                    .addComponent(vo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nvo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nvx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        apilar();
        x=cambiarjugador(cturno);
        if(x==0)
        {
            aux2=1;
            fila=0; columna=0;
            matriz[fila][columna]=aux2;
        }
        else
        {
            aux2=2;
            fila=0; columna=0;
            matriz[fila][columna]=aux2;
        }
        panel();
        comb1();
        comb2();
        comb3();
        mov++;
        empate();
        cturno=x;
        turno.setText(t);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        apilar();
        x=cambiarjugador(cturno);
        if(x==0)
        {
            aux2=1;
            fila=0; columna=1;
            matriz[fila][columna]=aux2;
        }
        else
        {
            aux2=2;
            fila=0; columna=1;
            matriz[fila][columna]=aux2;
        }
        panel();
        comb1();
        comb2();
        comb3();
        mov++;
        empate();
        cturno=x;
        turno.setText(t);
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        apilar();
        x=cambiarjugador(cturno);
        if(x==0)
        {
            aux2=1;
            fila=0; columna=2;
            matriz[fila][columna]=aux2;
        }
        else
        {
            aux2=2;
            fila=0; columna=2;
            matriz[fila][columna]=aux2;
        }
        panel();
        comb1();
        comb2();
        comb3();
        mov++;
        empate();
        cturno=x;
        turno.setText(t);
        
    }//GEN-LAST:event_b3ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
       apilar();
       x=cambiarjugador(cturno);
        if(x==0)
        {
            aux2=1;
            fila=1; columna=2;
            matriz[fila][columna]=aux2;
        }
        else
        {
            aux2=2;
            fila=1; columna=2;
            matriz[fila][columna]=aux2;
        }
        panel();
        comb1();
        comb2();
        comb3();
        mov++;
        empate();
        cturno=x;
        turno.setText(t);
    }//GEN-LAST:event_b6ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        apilar();
        x=cambiarjugador(cturno);
        if(x==0)
        {
            aux2=1;
            fila=1; columna=0;
            matriz[fila][columna]=aux2;
        }
        else
        {
            aux2=2;
            fila=1; columna=0;
            matriz[fila][columna]=aux2;
        }
        panel();
        comb1();
        comb2();
        comb3();
        mov++;
        empate();
        cturno=x;
        turno.setText(t);
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        apilar();
        x=cambiarjugador(cturno);
        if(x==0)
        {
            aux2=1;
            fila=1; columna=1;
            matriz[fila][columna]=aux2;
        }
        else
        {
            aux2=2;
            fila=1; columna=1;
            matriz[fila][columna]=aux2;
        }
        panel();
        comb1();
        comb2();
        comb3();
        mov++;
        empate();
        cturno=x;
        turno.setText(t);
    }//GEN-LAST:event_b5ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        apilar();
        x=cambiarjugador(cturno);
        if(x==0)
        {
            aux2=1;
            fila=2; columna=2;
            matriz[fila][columna]=aux2;
        }
        else
        {
            aux2=2;
            fila=2; columna=2;
            matriz[fila][columna]=aux2;
        }
       panel();
        comb1();
        comb2();
        comb3();
        mov++;
        empate();
        cturno=x;
        turno.setText(t);
    }//GEN-LAST:event_b9ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        apilar();
        x=cambiarjugador(cturno);
        if(x==0)
        {
            aux2=1;
            fila=2; columna=0;
            matriz[fila][columna]=aux2;
        }
        else
        {
            aux2=2;
            fila=2; columna=0;
            matriz[fila][columna]=aux2;
        }
        panel();
        comb1();
        comb2();
        comb3();
        mov++;
        empate();
        cturno=x;
        turno.setText(t);
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        apilar();
        x=cambiarjugador(cturno);
        if(x==0)
        {
            aux2=1;
            fila=2; columna=1;
            matriz[fila][columna]=aux2;
        }
        else
        {
            aux2=2;
            fila=2; columna=1;
            matriz[fila][columna]=aux2;
        }
        panel();
        comb1();
        comb2();
        comb3();
        mov++;
        empate();
        cturno=x;
        turno.setText(t);
    }//GEN-LAST:event_b8ActionPerformed

    private void jnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnuevoActionPerformed
        // TODO add your handling code here:
        Borrar();
    }//GEN-LAST:event_jnuevoActionPerformed

    private void deshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deshacerActionPerformed
        // TODO add your handling code here:     

        //String ver = new String();    
        des();
        /*mm.setText(p1.DarLista());
        
         for (int x=0; x<maux.length; x++){
            for(int y=0; y<maux[x].length; y++){
                ver+=String.valueOf(maux[x][y]+"    ");
            }
            ver+=("\n");
         }
        ma.setText(ver);*/
        
        matriz=maux;
        panel();
    }//GEN-LAST:event_deshacerActionPerformed

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
            java.util.logging.Logger.getLogger(VTotito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VTotito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VTotito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VTotito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VTotito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton deshacer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jnuevo;
    private javax.swing.JLabel nvo;
    private javax.swing.JLabel nvx;
    private javax.swing.JLabel turno;
    private javax.swing.JLabel victoria;
    private javax.swing.JLabel vo;
    private javax.swing.JLabel vx;
    // End of variables declaration//GEN-END:variables
}
