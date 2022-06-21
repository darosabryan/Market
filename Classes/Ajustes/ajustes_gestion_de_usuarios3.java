package market2.Classes.Ajustes;

import java.awt.Color;
import java.awt.MenuItem;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import market2.Classes.Ajustes.ajustes_form_admin;
import market2.Classes.Fun_BTOmodificar;
import market2.Forms.main_form_admin;
import market2.Paneles.Panel_gestion_de_usuarios;
import market2.Paneles.Panel_userInfo;

public class ajustes_gestion_de_usuarios3 extends Panel_gestion_de_usuarios{
 private ajustes_form_admin dimensiones_form_admin = new ajustes_form_admin();
 ajustes_userInfo3 userinfo;
 String tipo;
 
 
 private int x_size_panelSet = dimensiones_form_admin.x_panel_contenedor;
 private int y_size_panelSet = 50;
 
 private int x_size_panelGet = this.x_size_panelSet;
 private int y_size_panelGet = dimensiones_form_admin.y_panel_contenedor - this.y_size_panelSet;
 
 public ajustes_gestion_de_usuarios3(){
 Panel_main();
 panelSet();
 panelGet("Acomodado");

 panelGet("Original");
 size_original();
 size_acomodado(this.MI_userinfo);
 }

public void Panel_main(){
 this.setLayout(null);
 this.setSize(dimensiones_form_admin.x_panel_contenedor, dimensiones_form_admin.y_panel_contenedor);
}    

public void panelSet(){
 this.panel_set.setLayout(null);
 this.panel_set.setSize(x_size_panelSet,y_size_panelSet);
 this.panel_set.setLocation(0,0);
 this.panel_set.show(true);
 
//Label
 int x_size_label = 60;
 int y_size_label = 25;

 int x_location_label = 20;
 int y_location_label = (y_size_panelSet / 2) - (y_size_label / 2);

 
 //Lista
  int x_size_lista = 100;
  int y_size_lista = y_size_label;
          
  int x_location_lista = x_location_label + x_size_label + 20;
  int y_location_lista = y_location_label;     
         
  this.CB_lista.setSize(x_size_lista, y_size_lista);
  this.CB_lista.setLocation(x_location_lista, y_location_lista);

//JText  
  int x_size_texto = 120;
  int y_size_texto = y_size_label;
          
  int x_location_texto = x_location_lista + x_size_lista + 20;     
  int y_location_texto = y_location_label;
  
  this.txt_buscar.setSize(x_size_texto, y_size_texto);
  this.txt_buscar.setLocation(x_location_texto,y_location_texto);

//Boton buscar
 int x_size_boton = 50;
 int y_size_boton = y_size_label;       
 
 int x_location_boton = x_location_texto + x_size_texto + 20;
 int y_location_boton = y_location_label;
 
 int inter= 10;
 
 this.bto_buscar.setSize(x_size_boton, y_size_boton);
 this.bto_buscar.setLocation(x_location_boton, y_location_boton); 
 
//Boton delete
 this.BTO_delete.setBounds(this.bto_buscar.getLocation().x + x_size_boton + inter,y_location_boton ,x_size_boton,y_size_boton);


//Boton register
 this.BTO_register.setBounds(this.BTO_delete.getLocation().x + x_size_boton + inter,y_location_boton ,x_size_boton,y_size_boton);

}

public void panelGet(String tipo){
this.tipo = tipo;    

 if(tipo=="Original"){
 //Panel_get
 int x_location = 0; 
 int y_location = this.y_size_panelSet;
 
 this.panel_get.setLayout(null);
 this.panel_get.setSize(x_size_panelGet,y_size_panelGet);
 this.panel_get.setLocation(x_location, y_location);

//Tabla
 this.Panel_JS.setSize(this.panel_get.getWidth(), this.panel_get.getHeight());
 this.Panel_JS.setLocation(0, 0);
 this.Panel_JS.show(true);
 
 this.JT_usuarios.setSize(this.panel_get.getWidth(), this.panel_get.getHeight());
 this.JT_usuarios.setLocation(0, 0);
 this.JT_usuarios.show(true);
 this.repaint();
 }
 
 if(tipo=="Acomodado"){
 int x_size = this.x_size_panelSet;
 int y_size = dimensiones_form_admin.y_panel_contenedor - this.y_size_panelSet;
 
 int x_location = 0; 
 int y_location = this.y_size_panelSet;
 
 this.panel_get.setLayout(null);
 this.panel_get.setSize(x_size,y_size);
 this.panel_get.setLocation(x_location, y_location);

//Tabla
 this.Panel_JS.setSize((x_size*70)/100, y_size);
 this.Panel_JS.setLocation(0, 0);
 this.JT_usuarios.setSize((x_size*70)/100, y_size);
 this.JT_usuarios.setLocation(0, 0);

 this.Panel_JS.show(true);
 
 userinfo = new ajustes_userInfo3(this.Panel_JS.getSize().width,this.panel_get.getSize().width,this.panel_get.getSize().height);
 this.panel_get.add(userinfo);

 }

 
}

public void size_original(){

MouseListener funcion = new MouseListener(){
    @Override
    public void mouseClicked(MouseEvent e) {
        panelGet("Original");
       

    }

    @Override
    public void mousePressed(MouseEvent e) {
      

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
};
// if(tipo=="Acomodado"){   

this.userinfo.BTO_close.addMouseListener(funcion);

 //}
}


public void size_acomodado(JMenuItem menuitem){
MouseListener funcion = new MouseListener(){
    @Override
    public void mouseClicked(MouseEvent e) {
  
    }

    @Override
    public void mousePressed(MouseEvent e) {

        panelGet("Acomodado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
};

menuitem.addMouseListener(funcion);
}


}

