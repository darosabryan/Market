package market2.Classes.Ajustes;

import com.mysql.cj.protocol.Resultset;
import market2.Forms.main_form_admin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import market2.Classes.Fun_BTObuscar;
import market2.Classes.Gestor_Paneles;
import market2.Classes.admin_form_dimensiones;
import market2.Paneles.Panel_gestion_de_usuarios;


public class ajustes_form_admin extends main_form_admin {    
//Medidas del form_admin    
private JPanel foco;    
admin_form_dimensiones dimensiones = new admin_form_dimensiones();

public JPanel contenedor = new JPanel(); 

int x_size_contenedor_busqueda = dimensiones.getX_panel_contenedor();
int y_size_contenedor_busqueda = 100; 


public ajustes_form_admin(){    
this.setLayout(null);
this.setSize(dimensiones.getX_form_admin(), dimensiones.getY_form_admin());
this.setLocationRelativeTo(null); 

this.panel_form_admin_barra_superior.setSize(dimensiones.getX_barra_superiro(), dimensiones.getY_barra_superiro());
this.panel_form_admin_barra_superior.setLocation(0, 0);

this.bto_form_admin_cerrar.setSize(dimensiones.getBto_cerrar(),dimensiones.getBto_cerrar());
this.bto_form_admin_cerrar.setLocation(dimensiones.getX_form_admin() - dimensiones.getBto_cerrar(), 0);

this.panel_form_admin_barra_tareas.setLayout(null);
this.panel_form_admin_barra_tareas.setSize(dimensiones.getX_barra_tareas(), dimensiones.getY_barra_tareas());
this.panel_form_admin_barra_tareas.setLocation(0, dimensiones.getY_barra_superiro());
  
 
  ajutando_barraTareas(0,0,dimensiones.getX_paneles_barraTareas(),dimensiones.getY_paneles_barraTareas(), this.PANEL_perfil, new Color(51,51,51));
  animation_paneles(this.PANEL_perfil,this.BTO_perfil,this);
  
  ajutando_barraTareas(0,dimensiones.getY_paneles_barraTareas()*1,dimensiones.getX_paneles_barraTareas(),dimensiones.getY_paneles_barraTareas(), this.PANEL_gestionUsuarios, new Color(51,51,51));
  animation_paneles(this.PANEL_gestionUsuarios,this.BTO_gestionUsuarios,this);
  
  ajutando_barraTareas(0,dimensiones.getY_paneles_barraTareas()*2,dimensiones.getX_paneles_barraTareas(),dimensiones.getY_paneles_barraTareas(), this.panel_form_admin_horariosusu, new Color(51,51,51));
  animation_paneles(this.panel_form_admin_horariosusu,this.bto_form_admin_horariosusu,this);
 
  ajutando_barraTareas(0,dimensiones.getY_paneles_barraTareas()*3,dimensiones.getX_paneles_barraTareas(),dimensiones.getY_paneles_barraTareas(), this.PANEL_softwareAlmacen, new Color(51,51,51));
  animation_paneles(this.PANEL_softwareAlmacen,this.BTO_softwareAlmacen,this);
 
animacion_close();

add_paneles();
}
public void ajutando_barraTareas(int x_loca,int y_loca,int x_size,int y_size,JPanel panel,Color color){
panel.setBounds(x_loca, y_loca, x_size , y_size);
panel.setBackground(color);

}

public void carga_de_usarios(JTable tabla) throws SQLException{
   
}

public void animation_paneles(JPanel panel,JButton boton,ajustes_form_admin compt){
    Color rgb_entrada = new Color(82, 99, 93 );
    Color rgb_salida = new Color(51,51,51);
    Color rgb_foco = new Color(84, 160, 133);

    MouseListener animation = new MouseListener(){
    //JPanel foco;
    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {
             try{
                 compt.foco.setBackground(rgb_salida);
                 compt.foco=panel;
                 compt.foco.setBackground(rgb_foco);
                
             }catch(Exception e){
                 compt.foco=panel;
                 compt.foco.setBackground(rgb_foco);
                
             }
                
              
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if(panel!=compt.foco){
               panel.setBackground(rgb_entrada);
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if(panel!=compt.foco){ 
        panel.setBackground(rgb_salida);
        }
    }
};
panel.addMouseListener(animation);
boton.addMouseListener(animation);
}

public void animacion_close(){    
MouseListener animation = new MouseListener(){
    @Override
    public void mouseClicked(MouseEvent me) {
    
    }
    @Override

    public void mousePressed(MouseEvent me) {
       bto_form_admin_cerrar.setIcon(new ImageIcon("C:\\Users\\Raul Games\\Documents\\NetBeansProjects\\Market2\\src\\market2\\imagenes\\window-close-final.png"));

    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        bto_form_admin_cerrar.setIcon(new ImageIcon("C:\\Users\\Raul Games\\Documents\\NetBeansProjects\\Market2\\src\\market2\\imagenes\\window-close-entrar.png"));
    }

    @Override
    public void mouseExited(MouseEvent me) {
        bto_form_admin_cerrar.setIcon(new ImageIcon("C:\\Users\\Raul Games\\Documents\\NetBeansProjects\\Market2\\src\\market2\\imagenes\\window-close.png"));
    }
};
bto_form_admin_cerrar.addMouseListener(animation);

}

public void add_paneles(){
    Gestor_Paneles instancia = new Gestor_Paneles();

    this.add(instancia.get_GestorUsuarios());
    instancia.get_GestorUsuarios().show(false);

    this.add(instancia.get_GestorHorarios());
    instancia.get_GestorHorarios().show(false);


}

}