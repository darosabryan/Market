
package market2.Forms;

import market2.Classes.Conexion;
import static market2.Classes.Conexion.forms;
import market2.Classes.Crypto;
import market2.Classes.Fun_BTOmodificar;

public class LogIN extends javax.swing.JFrame {

    /**
     * Creates new form LogIN
     */
    public LogIN() {
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

        PANEL_main = new javax.swing.JLayeredPane();
        PANEL_ci = new javax.swing.JPanel();
        LBL_ci = new javax.swing.JLabel();
        TXT_ci = new javax.swing.JTextField();
        PANEL_pass = new javax.swing.JPanel();
        LBL_pass = new javax.swing.JLabel();
        TXT_pass = new javax.swing.JPasswordField();
        BTO_accept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        LBL_ci.setText("ci");
        LBL_ci.setToolTipText("");

        javax.swing.GroupLayout PANEL_ciLayout = new javax.swing.GroupLayout(PANEL_ci);
        PANEL_ci.setLayout(PANEL_ciLayout);
        PANEL_ciLayout.setHorizontalGroup(
            PANEL_ciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_ciLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LBL_ci)
                .addGap(55, 55, 55)
                .addComponent(TXT_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        PANEL_ciLayout.setVerticalGroup(
            PANEL_ciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_ciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANEL_ciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_ci)
                    .addComponent(TXT_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        LBL_pass.setText("Pass");

        javax.swing.GroupLayout PANEL_passLayout = new javax.swing.GroupLayout(PANEL_pass);
        PANEL_pass.setLayout(PANEL_passLayout);
        PANEL_passLayout.setHorizontalGroup(
            PANEL_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_passLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(LBL_pass)
                .addGap(55, 55, 55)
                .addComponent(TXT_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        PANEL_passLayout.setVerticalGroup(
            PANEL_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_passLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PANEL_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_pass)
                    .addComponent(TXT_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        BTO_accept.setText("Accept");
        BTO_accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTO_acceptActionPerformed(evt);
            }
        });

        PANEL_main.setLayer(PANEL_ci, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PANEL_main.setLayer(PANEL_pass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PANEL_main.setLayer(BTO_accept, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PANEL_mainLayout = new javax.swing.GroupLayout(PANEL_main);
        PANEL_main.setLayout(PANEL_mainLayout);
        PANEL_mainLayout.setHorizontalGroup(
            PANEL_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_mainLayout.createSequentialGroup()
                .addGroup(PANEL_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANEL_mainLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(PANEL_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PANEL_mainLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(PANEL_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PANEL_mainLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(BTO_accept)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PANEL_mainLayout.setVerticalGroup(
            PANEL_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_mainLayout.createSequentialGroup()
                .addComponent(PANEL_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PANEL_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTO_accept)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(PANEL_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PANEL_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTO_acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTO_acceptActionPerformed
    Fun_BTOmodificar instancia = new Fun_BTOmodificar(null);
           instancia.setCI(this.TXT_ci.getText().toString());
           instancia.setCi_login(this.TXT_ci.getText().toString());

     Conexion connection = new Conexion();
     Crypto code = new  Crypto();
     
     String encode= code.ecnodeMD5("SomosProgramadores",this.TXT_pass.getText());
     connection.action_LogIN(this.TXT_ci.getText(), encode);   
     
    
    }//GEN-LAST:event_BTO_acceptActionPerformed

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
            java.util.logging.Logger.getLogger(LogIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTO_accept;
    public javax.swing.JLabel LBL_ci;
    public javax.swing.JLabel LBL_pass;
    public javax.swing.JPanel PANEL_ci;
    public javax.swing.JLayeredPane PANEL_main;
    public javax.swing.JPanel PANEL_pass;
    public javax.swing.JTextField TXT_ci;
    public javax.swing.JPasswordField TXT_pass;
    // End of variables declaration//GEN-END:variables
}
