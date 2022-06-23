/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package market2.Paneles;

/**
 *
 * @author Raul Games
 */
public class Panel_userInfo extends javax.swing.JPanel {

    /**
     * Creates new form VistaUsuario
     */
    public Panel_userInfo() {
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

        PANEL_basicinfo = new javax.swing.JPanel();
        BTO_foto = new javax.swing.JButton();
        LBL_nombre = new javax.swing.JLabel();
        PANEL_barrasuperior = new javax.swing.JPanel();
        BTO_close = new javax.swing.JButton();
        JSPANE_advinfo = new javax.swing.JScrollPane();
        PANEL_contenedor = new javax.swing.JPanel();
        PANEL_ci = new javax.swing.JPanel();
        TXT_ci = new javax.swing.JTextField();
        BTO_ci = new javax.swing.JButton();
        PANEL_direccion = new javax.swing.JPanel();
        TXT_direction = new javax.swing.JTextField();
        BTO_direccion = new javax.swing.JButton();
        PANEL_telefono = new javax.swing.JPanel();
        TXT_telefono = new javax.swing.JTextField();
        BTO_telefono = new javax.swing.JButton();
        PANEL_correo = new javax.swing.JPanel();
        TXT_correo = new javax.swing.JTextField();
        BTO_correo = new javax.swing.JButton();
        PANEL_usuario = new javax.swing.JPanel();
        TXT_usuario = new javax.swing.JTextField();
        BTO_usuario = new javax.swing.JButton();
        PANEL_fecha = new javax.swing.JPanel();
        TXT_fecha = new javax.swing.JTextField();
        BTO_fecha = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        PANEL_basicinfo.setBackground(new java.awt.Color(255, 255, 255));

        BTO_foto.setText("Foto");
        BTO_foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTO_fotoActionPerformed(evt);
            }
        });

        LBL_nombre.setText("Nombre");

        javax.swing.GroupLayout PANEL_basicinfoLayout = new javax.swing.GroupLayout(PANEL_basicinfo);
        PANEL_basicinfo.setLayout(PANEL_basicinfoLayout);
        PANEL_basicinfoLayout.setHorizontalGroup(
            PANEL_basicinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_basicinfoLayout.createSequentialGroup()
                .addGroup(PANEL_basicinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANEL_basicinfoLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(LBL_nombre))
                    .addGroup(PANEL_basicinfoLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(BTO_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PANEL_basicinfoLayout.setVerticalGroup(
            PANEL_basicinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_basicinfoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BTO_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LBL_nombre)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        PANEL_barrasuperior.setBackground(new java.awt.Color(255, 255, 255));

        BTO_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market2/imagenes/x-regular-24.png"))); // NOI18N
        BTO_close.setBorder(null);
        BTO_close.setBorderPainted(false);
        BTO_close.setContentAreaFilled(false);
        BTO_close.setFocusPainted(false);

        javax.swing.GroupLayout PANEL_barrasuperiorLayout = new javax.swing.GroupLayout(PANEL_barrasuperior);
        PANEL_barrasuperior.setLayout(PANEL_barrasuperiorLayout);
        PANEL_barrasuperiorLayout.setHorizontalGroup(
            PANEL_barrasuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_barrasuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTO_close, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        PANEL_barrasuperiorLayout.setVerticalGroup(
            PANEL_barrasuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_barrasuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTO_close, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        JSPANE_advinfo.setBackground(new java.awt.Color(255, 255, 255));

        PANEL_contenedor.setBackground(new java.awt.Color(255, 255, 255));

        TXT_ci.setBackground(new java.awt.Color(255, 255, 255));
        TXT_ci.setBorder(null);
        TXT_ci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_ciActionPerformed(evt);
            }
        });

        BTO_ci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market2/imagenes/id-card-regular-24.png"))); // NOI18N
        BTO_ci.setBorder(null);
        BTO_ci.setContentAreaFilled(false);
        BTO_ci.setFocusPainted(false);
        BTO_ci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTO_ciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANEL_ciLayout = new javax.swing.GroupLayout(PANEL_ci);
        PANEL_ci.setLayout(PANEL_ciLayout);
        PANEL_ciLayout.setHorizontalGroup(
            PANEL_ciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_ciLayout.createSequentialGroup()
                .addComponent(BTO_ci, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(TXT_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        PANEL_ciLayout.setVerticalGroup(
            PANEL_ciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_ciLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PANEL_ciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTO_ci))
                .addContainerGap())
        );

        TXT_direction.setBorder(null);

        BTO_direccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market2/imagenes/home-regular-24.png"))); // NOI18N
        BTO_direccion.setBorder(null);
        BTO_direccion.setBorderPainted(false);
        BTO_direccion.setContentAreaFilled(false);

        javax.swing.GroupLayout PANEL_direccionLayout = new javax.swing.GroupLayout(PANEL_direccion);
        PANEL_direccion.setLayout(PANEL_direccionLayout);
        PANEL_direccionLayout.setHorizontalGroup(
            PANEL_direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_direccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTO_direccion)
                .addGap(21, 21, 21)
                .addComponent(TXT_direction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        PANEL_direccionLayout.setVerticalGroup(
            PANEL_direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_direccionLayout.createSequentialGroup()
                .addGroup(PANEL_direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_direction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTO_direccion))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        TXT_telefono.setBorder(null);

        BTO_telefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market2/imagenes/phone-call-solid-24.png"))); // NOI18N
        BTO_telefono.setBorder(null);
        BTO_telefono.setBorderPainted(false);
        BTO_telefono.setContentAreaFilled(false);
        BTO_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTO_telefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANEL_telefonoLayout = new javax.swing.GroupLayout(PANEL_telefono);
        PANEL_telefono.setLayout(PANEL_telefonoLayout);
        PANEL_telefonoLayout.setHorizontalGroup(
            PANEL_telefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_telefonoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(BTO_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TXT_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        PANEL_telefonoLayout.setVerticalGroup(
            PANEL_telefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_telefonoLayout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addGroup(PANEL_telefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTO_telefono)))
        );

        TXT_correo.setBorder(null);

        BTO_correo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market2/imagenes/envelope-regular-24.png"))); // NOI18N
        BTO_correo.setBorder(null);
        BTO_correo.setBorderPainted(false);
        BTO_correo.setContentAreaFilled(false);

        javax.swing.GroupLayout PANEL_correoLayout = new javax.swing.GroupLayout(PANEL_correo);
        PANEL_correo.setLayout(PANEL_correoLayout);
        PANEL_correoLayout.setHorizontalGroup(
            PANEL_correoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_correoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTO_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(TXT_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        PANEL_correoLayout.setVerticalGroup(
            PANEL_correoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_correoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PANEL_correoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTO_correo))
                .addContainerGap())
        );

        TXT_usuario.setBorder(null);

        BTO_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market2/imagenes/user-solid-24.png"))); // NOI18N
        BTO_usuario.setBorder(null);
        BTO_usuario.setBorderPainted(false);
        BTO_usuario.setContentAreaFilled(false);

        javax.swing.GroupLayout PANEL_usuarioLayout = new javax.swing.GroupLayout(PANEL_usuario);
        PANEL_usuario.setLayout(PANEL_usuarioLayout);
        PANEL_usuarioLayout.setHorizontalGroup(
            PANEL_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTO_usuario)
                .addGap(19, 19, 19)
                .addComponent(TXT_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        PANEL_usuarioLayout.setVerticalGroup(
            PANEL_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_usuarioLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(PANEL_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTO_usuario))
                .addContainerGap())
        );

        TXT_fecha.setBorder(null);

        BTO_fecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market2/imagenes/calendar-regular-24.png"))); // NOI18N
        BTO_fecha.setBorder(null);
        BTO_fecha.setBorderPainted(false);
        BTO_fecha.setContentAreaFilled(false);

        javax.swing.GroupLayout PANEL_fechaLayout = new javax.swing.GroupLayout(PANEL_fecha);
        PANEL_fecha.setLayout(PANEL_fechaLayout);
        PANEL_fechaLayout.setHorizontalGroup(
            PANEL_fechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_fechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTO_fecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TXT_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        PANEL_fechaLayout.setVerticalGroup(
            PANEL_fechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_fechaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANEL_fechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTO_fecha))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PANEL_contenedorLayout = new javax.swing.GroupLayout(PANEL_contenedor);
        PANEL_contenedor.setLayout(PANEL_contenedorLayout);
        PANEL_contenedorLayout.setHorizontalGroup(
            PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(PANEL_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(PANEL_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(PANEL_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(PANEL_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(PANEL_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PANEL_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        PANEL_contenedorLayout.setVerticalGroup(
            PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_contenedorLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(PANEL_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PANEL_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PANEL_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(PANEL_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(PANEL_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PANEL_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        JSPANE_advinfo.setViewportView(PANEL_contenedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(PANEL_barrasuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(PANEL_basicinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 258, Short.MAX_VALUE)
                .addComponent(JSPANE_advinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PANEL_barrasuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(PANEL_basicinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JSPANE_advinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BTO_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTO_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTO_telefonoActionPerformed

    private void BTO_ciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTO_ciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTO_ciActionPerformed

    private void BTO_fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTO_fotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTO_fotoActionPerformed

    private void TXT_ciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_ciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_ciActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTO_ci;
    public javax.swing.JButton BTO_close;
    public javax.swing.JButton BTO_correo;
    public javax.swing.JButton BTO_direccion;
    public javax.swing.JButton BTO_fecha;
    public javax.swing.JButton BTO_foto;
    public javax.swing.JButton BTO_telefono;
    public javax.swing.JButton BTO_usuario;
    public javax.swing.JScrollPane JSPANE_advinfo;
    public javax.swing.JLabel LBL_nombre;
    public javax.swing.JPanel PANEL_barrasuperior;
    public javax.swing.JPanel PANEL_basicinfo;
    public javax.swing.JPanel PANEL_ci;
    public javax.swing.JPanel PANEL_contenedor;
    public javax.swing.JPanel PANEL_correo;
    public javax.swing.JPanel PANEL_direccion;
    public javax.swing.JPanel PANEL_fecha;
    public javax.swing.JPanel PANEL_telefono;
    public javax.swing.JPanel PANEL_usuario;
    public javax.swing.JTextField TXT_ci;
    public javax.swing.JTextField TXT_correo;
    public javax.swing.JTextField TXT_direction;
    public javax.swing.JTextField TXT_fecha;
    public javax.swing.JTextField TXT_telefono;
    public javax.swing.JTextField TXT_usuario;
    // End of variables declaration//GEN-END:variables
}
