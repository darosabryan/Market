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
import market2.Paneles.Panel_gestion_de_usuarios;


public class ajustes_form_admin extends main_form_admin {    
//Medidas del form_admin    
private JPanel foco;    
public int x_form_admin=800;
public int y_form_admin=400;

//Medidas de la barra susperior
int x_barra_superiro = x_form_admin;
public int y_barra_superiro = 25;

//Medidas del boton cerrar
int bto_cerrar = 25;

//Medidas de la barra de tareas
public int x_barra_tareas = 150;
int y_barra_tareas = y_form_admin - y_barra_superiro;

//Medidas del panel contenedor
public int x_panel_contenedor = x_form_admin - x_barra_tareas;
public int y_panel_contenedor = y_form_admin - y_barra_superiro;

//Medidas del panel busqueda usuarios
 int x_panel_form_admin_busquedausu = x_barra_tareas;
 int y_panel_form_admin_busquedausu = 40;
 int x_paneles_barraTareas = x_barra_tareas;
 int y_paneles_barraTareas = 40;


//Medidas del panel horarios usuarios
 int x_panel_form_admin_horariosusu = x_barra_tareas;
 int y_panel_form_admin_horariosusu = 40;
 
//Medidas del boton busqueda usuarios
// int x_bto_form_admin_horariosusu = x_panel_form_admin_horariosusu;
 //int y_bto_form_admin_horariosusu = y_panel_form_admin_horariosusu;

//Medidas del contenedor horarios
 int x_contenedor_horarios = x_panel_contenedor;
 int y_contenedor_horarios = y_panel_contenedor;

//Medidas del contenedor busqueda
 int x_contenedor_busqueda = x_panel_contenedor;
 int y_contenedor_busqueda = y_panel_contenedor;

public JPanel contenedor = new JPanel(); 
int x_size_contenedor_busqueda = x_panel_contenedor;
int y_size_contenedor_busqueda = 100; 

private int cantFuncionalidades=4;

public ajustes_form_admin(){    
this.setLayout(null);
this.setSize(x_form_admin, y_form_admin);
this.setLocationRelativeTo(null); 

this.panel_form_admin_barra_superior.setSize(x_barra_superiro, y_barra_superiro);
this.panel_form_admin_barra_superior.setLocation(0, 0);

this.bto_form_admin_cerrar.setSize(bto_cerrar,bto_cerrar);
this.bto_form_admin_cerrar.setLocation(x_form_admin - bto_cerrar, 0);

this.panel_form_admin_barra_tareas.setLayout(null);
this.panel_form_admin_barra_tareas.setSize(x_barra_tareas, y_barra_tareas);
this.panel_form_admin_barra_tareas.setLocation(0, y_barra_superiro);
  
 
  ajutando_barraTareas(0,0,x_paneles_barraTareas,y_paneles_barraTareas, this.PANEL_perfil, new Color(51,51,51));
  animation_paneles(this.PANEL_perfil,this.BTO_perfil,this);
  
  ajutando_barraTareas(0,y_paneles_barraTareas*1,x_paneles_barraTareas,y_paneles_barraTareas, this.PANEL_gestionUsuarios, new Color(51,51,51));
  animation_paneles(this.PANEL_gestionUsuarios,this.BTO_gestionUsuarios,this);
  
  ajutando_barraTareas(0,y_paneles_barraTareas*2,x_paneles_barraTareas,y_paneles_barraTareas, this.panel_form_admin_horariosusu, new Color(51,51,51));
  animation_paneles(this.panel_form_admin_horariosusu,this.bto_form_admin_horariosusu,this);
 
  ajutando_barraTareas(0,y_paneles_barraTareas*3,x_paneles_barraTareas,y_paneles_barraTareas, this.PANEL_softwareAlmacen, new Color(51,51,51));
  animation_paneles(this.PANEL_softwareAlmacen,this.BTO_softwareAlmacen,this);
 /*
 JPanel[] panel = new JPanel[cantFuncionalidades];
   panel[0] = this.PANEL_perfil;
   panel[1] = this.PANEL_gestionUsuarios;
   panel[2] = this.panel_form_admin_horariosusu;
   panel[3] = this.PANEL_softwareAlmacen;
 
 int contador = 0;   
 

for (int i=0;i<cantFuncionalidades;i++){
contador=y_paneles_barraTareas*i;

ajutando_barraTareas(0,contador,x_paneles_barraTareas,y_paneles_barraTareas,panel[i],new Color(51,51,51));
//animation_paneles(panel[i], panel[i].getComponent(i),this);
}
 // ajutando_barraTareas(0,0,x_panel_form_admin_busquedausu,y_panel_form_admin_busquedausu, this.panel_form_admin_busquedausu, new Color(51,51,51));
  

//  ajutando_barraTareas(0,y_panel_form_admin_busquedausu,x_panel_form_admin_horariosusu,y_panel_form_admin_horariosusu,this.panel_form_admin_horariosusu, new Color(51,51,51));  
  animation_paneles(panel_form_admin_horariosusu,this.bto_form_admin_horariosusu,this);
  
  */

animacion_close();

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


}