/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package market2.Paneles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import market2.Classes.Ajustes.ajustes_signIN;

import market2.Classes.Fun_BTObuscar;
import market2.Classes.Fun_BTOmodificar;
import market2.Classes.Gestor_Paneles;

/**
 *
 * @author Usuario
 */
public class Panel_gestion_de_usuarios extends javax.swing.JPanel {

    /**
     * Creates new form Panel_busqueda
     */
    public Panel_gestion_de_usuarios() {
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

        PM_userInfo = new javax.swing.JPopupMenu();
        MI_userinfo = new javax.swing.JMenuItem();
        panel_set = new javax.swing.JPanel();
        txt_buscar = new javax.swing.JTextField();
        CB_lista = new javax.swing.JComboBox<>();
        bto_buscar = new javax.swing.JButton();
        BTO_delete = new javax.swing.JButton();
        BTO_register = new javax.swing.JButton();
        panel_get = new javax.swing.JPanel();
        Panel_JS = new javax.swing.JScrollPane();
        JT_usuarios = new javax.swing.JTable();

        PM_userInfo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                PM_userInfoPopupMenuWillBecomeVisible(evt);
            }
        });

        MI_userinfo.setText("Info");
        MI_userinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI_userinfoMouseClicked(evt);
            }
        });
        MI_userinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_userinfoActionPerformed(evt);
            }
        });
        PM_userInfo.add(MI_userinfo);

        setBackground(new java.awt.Color(255, 255, 255));

        panel_set.setBackground(new java.awt.Color(51, 51, 51));
        panel_set.setForeground(new java.awt.Color(102, 102, 102));

        txt_buscar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });

        CB_lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Lastname", "ci", "Tipo" }));

        bto_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market2/imagenes/search-alt-2-regular-24 (1).png"))); // NOI18N
        bto_buscar.setBorder(null);
        bto_buscar.setContentAreaFilled(false);
        bto_buscar.setFocusPainted(false);
        bto_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_buscarActionPerformed(evt);
            }
        });

        BTO_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market2/imagenes/trash-solid-24 (1).png"))); // NOI18N
        BTO_delete.setBorder(null);
        BTO_delete.setContentAreaFilled(false);
        BTO_delete.setFocusPainted(false);

        BTO_register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market2/imagenes/registered-solid-1.png"))); // NOI18N
        BTO_register.setBorder(null);
        BTO_register.setContentAreaFilled(false);
        BTO_register.setFocusPainted(false);
        BTO_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTO_registerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_setLayout = new javax.swing.GroupLayout(panel_set);
        panel_set.setLayout(panel_setLayout);
        panel_setLayout.setHorizontalGroup(
            panel_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_setLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(CB_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(bto_buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTO_delete)
                .addGap(18, 18, 18)
                .addComponent(BTO_register)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_setLayout.setVerticalGroup(
            panel_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_setLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(panel_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BTO_register)
                        .addComponent(BTO_delete)
                        .addComponent(bto_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CB_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        JT_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "CI", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JT_usuarios.setComponentPopupMenu(PM_userInfo);
        JT_usuarios.setEnabled(false);
        Panel_JS.setViewportView(JT_usuarios);

        javax.swing.GroupLayout panel_getLayout = new javax.swing.GroupLayout(panel_get);
        panel_get.setLayout(panel_getLayout);
        panel_getLayout.setHorizontalGroup(
            panel_getLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_getLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_JS, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        panel_getLayout.setVerticalGroup(
            panel_getLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_getLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Panel_JS, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_get, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_set, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_set, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_get, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(217, 217, 217))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void bto_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_buscarActionPerformed
       Fun_BTObuscar instancia = new Fun_BTObuscar(this.JT_usuarios,this.txt_buscar.getText(),this.CB_lista.getSelectedItem().toString());
    
       try {
            instancia.additemtotable_busqueda(0,instancia.filtrar(instancia.consulta_panel_busqueda()));
       } catch (SQLException ex) {
            Logger.getLogger(Panel_gestion_de_usuarios.class.getName()).log(Level.SEVERE, null, ex);
       }
        
       repaint();    
    }//GEN-LAST:event_bto_buscarActionPerformed

    private void PM_userInfoPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_PM_userInfoPopupMenuWillBecomeVisible

        Fun_BTOmodificar instancia = new Fun_BTOmodificar(/*this.JT_usuarios,*/this.JT_usuarios.getMousePosition());
            instancia.setCI(instancia.capturaCI(this.JT_usuarios));    }//GEN-LAST:event_PM_userInfoPopupMenuWillBecomeVisible

    private void MI_userinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_userinfoActionPerformed
    
    }//GEN-LAST:event_MI_userinfoActionPerformed

    private void MI_userinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_userinfoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MI_userinfoMouseClicked

    private void BTO_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTO_registerActionPerformed
    /*Gestor_Paneles instancia = new Gestor_Paneles();
    instancia.get_GestorUsuarios().show(false);
    instancia.getSigIN().show(true);*/
    
     ajustes_signIN signIN = new ajustes_signIN(); 
      signIN.show(true);
    }//GEN-LAST:event_BTO_registerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTO_delete;
    public javax.swing.JButton BTO_register;
    public javax.swing.JComboBox<String> CB_lista;
    public javax.swing.JTable JT_usuarios;
    public javax.swing.JMenuItem MI_userinfo;
    public javax.swing.JPopupMenu PM_userInfo;
    public javax.swing.JScrollPane Panel_JS;
    public javax.swing.JButton bto_buscar;
    public javax.swing.JPanel panel_get;
    public javax.swing.JPanel panel_set;
    public javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
