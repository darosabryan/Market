/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package market2.Forms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import market2.Classes.Fun_BTOmodificar;

/**
 *
 * @author Raul Games
 */
public class Edit_date extends javax.swing.JFrame {

    /**
     * Creates new form Edit_date
     */
    public Edit_date() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PANEL_contenedor = new javax.swing.JPanel();
        PANEL_horario1 = new javax.swing.JPanel();
        LBL_puntos1 = new javax.swing.JLabel();
        CB_hour1 = new javax.swing.JComboBox<>();
        CB_minuts1 = new javax.swing.JComboBox<>();
        PANEL_horario2 = new javax.swing.JPanel();
        LBL_puntos2 = new javax.swing.JLabel();
        CB_hour2 = new javax.swing.JComboBox<>();
        CB_minuts2 = new javax.swing.JComboBox<>();
        LBL_barra = new javax.swing.JLabel();
        BTO_edit = new javax.swing.JButton();
        PANEL_superior = new javax.swing.JPanel();
        BTO_close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        PANEL_contenedor.setBackground(new java.awt.Color(204, 204, 204));

        LBL_puntos1.setBackground(new java.awt.Color(102, 102, 102));
        LBL_puntos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_puntos1.setText(":");

        CB_hour1.setBorder(null);

        CB_minuts1.setBorder(null);

        javax.swing.GroupLayout PANEL_horario1Layout = new javax.swing.GroupLayout(PANEL_horario1);
        PANEL_horario1.setLayout(PANEL_horario1Layout);
        PANEL_horario1Layout.setHorizontalGroup(
            PANEL_horario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_horario1Layout.createSequentialGroup()
                .addGroup(PANEL_horario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANEL_horario1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(LBL_puntos1))
                    .addGroup(PANEL_horario1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CB_hour1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(CB_minuts1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        PANEL_horario1Layout.setVerticalGroup(
            PANEL_horario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_horario1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANEL_horario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_hour1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_minuts1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(LBL_puntos1))
        );

        LBL_puntos2.setBackground(new java.awt.Color(102, 102, 102));
        LBL_puntos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_puntos2.setText(":");

        CB_hour2.setBorder(null);

        CB_minuts2.setBorder(null);

        javax.swing.GroupLayout PANEL_horario2Layout = new javax.swing.GroupLayout(PANEL_horario2);
        PANEL_horario2.setLayout(PANEL_horario2Layout);
        PANEL_horario2Layout.setHorizontalGroup(
            PANEL_horario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_horario2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PANEL_horario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANEL_horario2Layout.createSequentialGroup()
                        .addComponent(CB_hour2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CB_minuts2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PANEL_horario2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(LBL_puntos2)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        PANEL_horario2Layout.setVerticalGroup(
            PANEL_horario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_horario2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANEL_horario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_hour2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_minuts2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(LBL_puntos2))
        );

        LBL_barra.setBackground(new java.awt.Color(102, 102, 102));
        LBL_barra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_barra.setText("-");
        LBL_barra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BTO_edit.setBackground(new java.awt.Color(204, 204, 204));
        BTO_edit.setText("Modificar");
        BTO_edit.setBorder(null);
        BTO_edit.setFocusPainted(false);
        BTO_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTO_editActionPerformed(evt);
            }
        });

        BTO_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market2/imagenes/window-close.png"))); // NOI18N
        BTO_close.setBorder(null);
        BTO_close.setBorderPainted(false);
        BTO_close.setContentAreaFilled(false);
        BTO_close.setFocusPainted(false);
        BTO_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTO_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANEL_superiorLayout = new javax.swing.GroupLayout(PANEL_superior);
        PANEL_superior.setLayout(PANEL_superiorLayout);
        PANEL_superiorLayout.setHorizontalGroup(
            PANEL_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_superiorLayout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(BTO_close, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        PANEL_superiorLayout.setVerticalGroup(
            PANEL_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_superiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTO_close, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PANEL_contenedorLayout = new javax.swing.GroupLayout(PANEL_contenedor);
        PANEL_contenedor.setLayout(PANEL_contenedorLayout);
        PANEL_contenedorLayout.setHorizontalGroup(
            PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_contenedorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LBL_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(BTO_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_contenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PANEL_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(PANEL_horario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(PANEL_horario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PANEL_contenedorLayout.setVerticalGroup(
            PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PANEL_horario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PANEL_horario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTO_edit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(PANEL_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(PANEL_contenedor);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTO_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTO_editActionPerformed
   Fun_BTOmodificar instancia = new Fun_BTOmodificar(null,null);
   String nuevoHorario = this.CB_hour1.getSelectedItem().toString() + ":" + this.CB_minuts1.getSelectedItem().toString() + " - " + this.CB_hour2.getSelectedItem().toString()  + ":" + this.CB_minuts2.getSelectedItem().toString() ;
   //String update ="update comercio.horarios set " + instancia.getColumna() + "='" + nuevoHorario + "' where ci=" + instancia.getCI();
   String update= "update comercio.horarios as hor join comercio.usuarios as usu on hor.id = usu.id_horario set "+ instancia.getColumna() +"='"+ nuevoHorario +"' where usu.ci = " + instancia.getCI();
 
           System.out.println(update);
   try {
          Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/comercio", "root", "");
          Statement miStatement = miConexion.createStatement();            
          miStatement.execute(update);

        } catch (SQLException ex) {
            Logger.getLogger(Edit_date.class.getName()).log(Level.SEVERE, null, ex);
        }
  //ResultSet consulta = miStatement.executeQuery("select * from usuarios where ci="+ ci+ " and password='"+pass+"'");
    }//GEN-LAST:event_BTO_editActionPerformed

    private void BTO_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTO_closeActionPerformed
    this.dispose();
    }//GEN-LAST:event_BTO_closeActionPerformed

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
            java.util.logging.Logger.getLogger(Edit_date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_date().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTO_close;
    public javax.swing.JButton BTO_edit;
    public javax.swing.JComboBox<String> CB_hour1;
    public javax.swing.JComboBox<String> CB_hour2;
    public javax.swing.JComboBox<String> CB_minuts1;
    public javax.swing.JComboBox<String> CB_minuts2;
    public javax.swing.JLabel LBL_barra;
    public javax.swing.JLabel LBL_puntos1;
    public javax.swing.JLabel LBL_puntos2;
    public javax.swing.JPanel PANEL_contenedor;
    public javax.swing.JPanel PANEL_horario1;
    public javax.swing.JPanel PANEL_horario2;
    public javax.swing.JPanel PANEL_superior;
    // End of variables declaration//GEN-END:variables
}
