
package market2.Forms;

import com.toedter.calendar.JCalendar;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import market2.Classes.Conexion;
import market2.Classes.Crypto;
import static market2.Classes.Crypto.ecnodeMD5;

/**
 *
 * @author Raul Games
 */
public class SignIN extends javax.swing.JFrame {

    /**
     * Creates new form SignIN
     */
    public SignIN() {
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

        PANEL_contenedor = new javax.swing.JLayeredPane();
        LBL_registro = new javax.swing.JLabel();
        JCAL_date = new com.toedter.calendar.JCalendar();
        BTO_aceptar = new javax.swing.JButton();
        PANEL_lastname = new javax.swing.JPanel();
        LBL_lastname = new javax.swing.JLabel();
        TXT_lastname = new javax.swing.JTextField();
        PANEL_direccion = new javax.swing.JPanel();
        LBL_direccion = new javax.swing.JLabel();
        TXT_direction = new javax.swing.JTextField();
        PANEL_type = new javax.swing.JPanel();
        CB_type = new javax.swing.JComboBox<>();
        LBL_type = new javax.swing.JLabel();
        PANEL_date = new javax.swing.JPanel();
        TXT_date = new javax.swing.JTextField();
        BTO_calendar = new javax.swing.JButton();
        LBL_date = new javax.swing.JLabel();
        PANEL_name = new javax.swing.JPanel();
        LBL_name = new javax.swing.JLabel();
        TXT_name = new javax.swing.JTextField();
        PANEL_phone = new javax.swing.JPanel();
        LBL_phone = new javax.swing.JLabel();
        TXT_phone = new javax.swing.JTextField();
        PANEL_email = new javax.swing.JPanel();
        LBL_email = new javax.swing.JLabel();
        TXT_email = new javax.swing.JTextField();
        PANEL_ci = new javax.swing.JPanel();
        TXT_ci = new javax.swing.JTextField();
        LBL_ci = new javax.swing.JLabel();
        PANEL_password = new javax.swing.JPanel();
        LBL_password = new javax.swing.JLabel();
        TXT_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        LBL_registro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LBL_registro.setText("Registrarse");

        JCAL_date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                JCAL_datePropertyChange(evt);
            }
        });

        BTO_aceptar.setText("Accept");
        BTO_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTO_aceptarActionPerformed(evt);
            }
        });

        LBL_lastname.setText("LastName");

        TXT_lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_lastnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANEL_lastnameLayout = new javax.swing.GroupLayout(PANEL_lastname);
        PANEL_lastname.setLayout(PANEL_lastnameLayout);
        PANEL_lastnameLayout.setHorizontalGroup(
            PANEL_lastnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_lastnameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBL_lastname)
                .addGap(29, 29, 29)
                .addComponent(TXT_lastname, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
        );
        PANEL_lastnameLayout.setVerticalGroup(
            PANEL_lastnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_lastnameLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PANEL_lastnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_lastname)
                    .addComponent(TXT_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LBL_direccion.setText("Direction");

        TXT_direction.setToolTipText("");

        javax.swing.GroupLayout PANEL_direccionLayout = new javax.swing.GroupLayout(PANEL_direccion);
        PANEL_direccion.setLayout(PANEL_direccionLayout);
        PANEL_direccionLayout.setHorizontalGroup(
            PANEL_direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_direccionLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LBL_direccion)
                .addGap(31, 31, 31)
                .addComponent(TXT_direction, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        PANEL_direccionLayout.setVerticalGroup(
            PANEL_direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_direccionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PANEL_direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_direccion)
                    .addComponent(TXT_direction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        CB_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_typeActionPerformed(evt);
            }
        });

        LBL_type.setText("Type");

        javax.swing.GroupLayout PANEL_typeLayout = new javax.swing.GroupLayout(PANEL_type);
        PANEL_type.setLayout(PANEL_typeLayout);
        PANEL_typeLayout.setHorizontalGroup(
            PANEL_typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_typeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LBL_type, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CB_type, 0, 351, Short.MAX_VALUE)
                .addContainerGap())
        );
        PANEL_typeLayout.setVerticalGroup(
            PANEL_typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_typeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PANEL_typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_type)
                    .addComponent(CB_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        TXT_date.setEditable(false);
        TXT_date.setForeground(new java.awt.Color(153, 153, 153));
        TXT_date.setText("dd/mm/yyyy");

        BTO_calendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/market2/imagenes/calendar-solid-24 (1).png"))); // NOI18N
        BTO_calendar.setBorder(null);
        BTO_calendar.setContentAreaFilled(false);
        BTO_calendar.setFocusable(false);
        BTO_calendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTO_calendarActionPerformed(evt);
            }
        });

        LBL_date.setText("Date");

        javax.swing.GroupLayout PANEL_dateLayout = new javax.swing.GroupLayout(PANEL_date);
        PANEL_date.setLayout(PANEL_dateLayout);
        PANEL_dateLayout.setHorizontalGroup(
            PANEL_dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
            .addGroup(PANEL_dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_dateLayout.createSequentialGroup()
                    .addGap(212, 212, 212)
                    .addComponent(TXT_date, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(213, Short.MAX_VALUE)))
            .addGroup(PANEL_dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_dateLayout.createSequentialGroup()
                    .addGap(256, 256, 256)
                    .addComponent(BTO_calendar)
                    .addContainerGap(256, Short.MAX_VALUE)))
            .addGroup(PANEL_dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_dateLayout.createSequentialGroup()
                    .addGap(256, 256, 256)
                    .addComponent(LBL_date)
                    .addContainerGap(256, Short.MAX_VALUE)))
        );
        PANEL_dateLayout.setVerticalGroup(
            PANEL_dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
            .addGroup(PANEL_dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_dateLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(TXT_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE)))
            .addGroup(PANEL_dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_dateLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(BTO_calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE)))
            .addGroup(PANEL_dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_dateLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(LBL_date)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        LBL_name.setText("Name");
        LBL_name.setToolTipText("");

        TXT_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANEL_nameLayout = new javax.swing.GroupLayout(PANEL_name);
        PANEL_name.setLayout(PANEL_nameLayout);
        PANEL_nameLayout.setHorizontalGroup(
            PANEL_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
            .addGroup(PANEL_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_nameLayout.createSequentialGroup()
                    .addGap(245, 245, 245)
                    .addComponent(LBL_name, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(245, Short.MAX_VALUE)))
            .addGroup(PANEL_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_nameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(TXT_name, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PANEL_nameLayout.setVerticalGroup(
            PANEL_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
            .addGroup(PANEL_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_nameLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(LBL_name)
                    .addContainerGap(19, Short.MAX_VALUE)))
            .addGroup(PANEL_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_nameLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(TXT_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );

        LBL_phone.setText("Phone");

        javax.swing.GroupLayout PANEL_phoneLayout = new javax.swing.GroupLayout(PANEL_phone);
        PANEL_phone.setLayout(PANEL_phoneLayout);
        PANEL_phoneLayout.setHorizontalGroup(
            PANEL_phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_phoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBL_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXT_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        PANEL_phoneLayout.setVerticalGroup(
            PANEL_phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_phoneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PANEL_phoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_phone)
                    .addComponent(TXT_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        LBL_email.setText("Email");

        javax.swing.GroupLayout PANEL_emailLayout = new javax.swing.GroupLayout(PANEL_email);
        PANEL_email.setLayout(PANEL_emailLayout);
        PANEL_emailLayout.setHorizontalGroup(
            PANEL_emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_emailLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(LBL_email)
                .addGap(46, 46, 46)
                .addComponent(TXT_email, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        PANEL_emailLayout.setVerticalGroup(
            PANEL_emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_emailLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PANEL_emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_email)
                    .addComponent(TXT_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LBL_ci.setText("CI");

        javax.swing.GroupLayout PANEL_ciLayout = new javax.swing.GroupLayout(PANEL_ci);
        PANEL_ci.setLayout(PANEL_ciLayout);
        PANEL_ciLayout.setHorizontalGroup(
            PANEL_ciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_ciLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBL_ci, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TXT_ci, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
        PANEL_ciLayout.setVerticalGroup(
            PANEL_ciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_ciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANEL_ciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_ci, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LBL_password.setText("Password");

        TXT_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANEL_passwordLayout = new javax.swing.GroupLayout(PANEL_password);
        PANEL_password.setLayout(PANEL_passwordLayout);
        PANEL_passwordLayout.setHorizontalGroup(
            PANEL_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_passwordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBL_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXT_password, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        PANEL_passwordLayout.setVerticalGroup(
            PANEL_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_passwordLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PANEL_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBL_password)
                    .addComponent(TXT_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        PANEL_contenedor.setLayer(LBL_registro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PANEL_contenedor.setLayer(JCAL_date, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PANEL_contenedor.setLayer(BTO_aceptar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PANEL_contenedor.setLayer(PANEL_lastname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PANEL_contenedor.setLayer(PANEL_direccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PANEL_contenedor.setLayer(PANEL_type, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PANEL_contenedor.setLayer(PANEL_date, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PANEL_contenedor.setLayer(PANEL_name, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PANEL_contenedor.setLayer(PANEL_phone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PANEL_contenedor.setLayer(PANEL_email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PANEL_contenedor.setLayer(PANEL_ci, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PANEL_contenedor.setLayer(PANEL_password, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PANEL_contenedorLayout = new javax.swing.GroupLayout(PANEL_contenedor);
        PANEL_contenedor.setLayout(PANEL_contenedorLayout);
        PANEL_contenedorLayout.setHorizontalGroup(
            PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LBL_registro)
                .addContainerGap(410, Short.MAX_VALUE))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addGap(0, 119, Short.MAX_VALUE)
                    .addComponent(JCAL_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 120, Short.MAX_VALUE)))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addGap(0, 188, Short.MAX_VALUE)
                    .addComponent(BTO_aceptar)
                    .addGap(0, 189, Short.MAX_VALUE)))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addGap(0, 107, Short.MAX_VALUE)
                    .addComponent(PANEL_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 107, Short.MAX_VALUE)))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addGap(0, 106, Short.MAX_VALUE)
                    .addComponent(PANEL_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 106, Short.MAX_VALUE)))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PANEL_type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PANEL_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PANEL_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PANEL_phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PANEL_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PANEL_ci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PANEL_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PANEL_contenedorLayout.setVerticalGroup(
            PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(LBL_registro)
                .addContainerGap(530, Short.MAX_VALUE))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JCAL_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BTO_aceptar)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PANEL_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PANEL_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PANEL_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PANEL_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PANEL_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PANEL_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PANEL_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PANEL_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(PANEL_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_contenedorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PANEL_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(PANEL_contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(PANEL_contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTO_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTO_aceptarActionPerformed
        Conexion enviar  = new Conexion();
        Crypto.setCifrado(this.TXT_password.getText());

          //byte[] clave_segura = Crypto.getCifrado()

        String secretKey = "SomosProgramadores";

        String cadenaEncriptada = ecnodeMD5(secretKey, TXT_password.getText());            
        
        enviar.action_sigIN(TXT_name.getText(),TXT_lastname.getText(),TXT_ci.getText(),TXT_phone.getText(),CB_type.getSelectedItem().toString(),cadenaEncriptada,this.JCAL_date.getCalendar(),TXT_direction.getText(),TXT_email.getText());
       
    }//GEN-LAST:event_BTO_aceptarActionPerformed

    private void TXT_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_lastnameActionPerformed

    private void CB_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_typeActionPerformed

    private void TXT_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_nameActionPerformed

    private void TXT_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_passwordActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{
          Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/comercio", "root", "");
          Statement miStatement = miConexion.createStatement();  
          ResultSet consulta = miStatement.executeQuery("SELECT nombre_tipo FROM tipo_usuario");
          consulta.next();
          
          while(consulta.isLast()==false){
           this.CB_type.addItem(consulta.getString("nombre_tipo"));
           consulta.next();
           
          }
          miConexion.close();
          
          }
        catch(Exception e){
          System.out.println("Error al establecer la conexion");

            }

    
    }//GEN-LAST:event_formWindowOpened

    private void BTO_calendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTO_calendarActionPerformed
        if(this.JCAL_date.isShowing()==false){
            this.JCAL_date.show(true);

        }else{
            this.JCAL_date.show(false);
            this.TXT_date.setForeground(Color.black);
            

        }
    
    }//GEN-LAST:event_BTO_calendarActionPerformed

    private void JCAL_datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_JCAL_datePropertyChange
        if(evt.getOldValue() != null){
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            this.TXT_date.setText(formato.format(this.JCAL_date.getCalendar().getTime()));
        }

    }//GEN-LAST:event_JCAL_datePropertyChange

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
            java.util.logging.Logger.getLogger(SignIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTO_aceptar;
    public javax.swing.JButton BTO_calendar;
    public javax.swing.JComboBox<String> CB_type;
    public com.toedter.calendar.JCalendar JCAL_date;
    public javax.swing.JLabel LBL_ci;
    public javax.swing.JLabel LBL_date;
    public javax.swing.JLabel LBL_direccion;
    public javax.swing.JLabel LBL_email;
    public javax.swing.JLabel LBL_lastname;
    public javax.swing.JLabel LBL_name;
    public javax.swing.JLabel LBL_password;
    public javax.swing.JLabel LBL_phone;
    public javax.swing.JLabel LBL_registro;
    public javax.swing.JLabel LBL_type;
    public javax.swing.JPanel PANEL_ci;
    public javax.swing.JLayeredPane PANEL_contenedor;
    public javax.swing.JPanel PANEL_date;
    public javax.swing.JPanel PANEL_direccion;
    public javax.swing.JPanel PANEL_email;
    public javax.swing.JPanel PANEL_lastname;
    public javax.swing.JPanel PANEL_name;
    public javax.swing.JPanel PANEL_password;
    public javax.swing.JPanel PANEL_phone;
    public javax.swing.JPanel PANEL_type;
    public javax.swing.JTextField TXT_ci;
    public javax.swing.JTextField TXT_date;
    public javax.swing.JTextField TXT_direction;
    public javax.swing.JTextField TXT_email;
    public javax.swing.JTextField TXT_lastname;
    public javax.swing.JTextField TXT_name;
    public javax.swing.JPasswordField TXT_password;
    public javax.swing.JTextField TXT_phone;
    // End of variables declaration//GEN-END:variables
}
