
package market2.Classes.Ajustes;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import market2.Classes.DB_userInfo;
import market2.Paneles.Panel_gestion_de_usuarios;

public class ajustes_gestion_usuarios extends Panel_gestion_de_usuarios{
    //ATRIBUTOS
    private ajustes_form_admin dimensiones_form_admin = new ajustes_form_admin();
    private int x_size_panelSet = dimensiones_form_admin.x_panel_contenedor;
    private int y_size_panelSet = 50;

    private int x_size_panelGet = this.x_size_panelSet;
    private int y_size_panelGet = dimensiones_form_admin.y_panel_contenedor - this.y_size_panelSet;
    
    private ajustes_userInfo userinfo;
    private boolean active= false;
       
    //CONSTRUCTOR
    public ajustes_gestion_usuarios(){
        Panel_main();
        panelSet();
        panelGet_original();
        
        acomodado();
          
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
   public void panelGet_original(){
     if(userinfo != null){
     userinfo.show(false);
     }
    // userinfo=null;
     
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

   }
  
   public void initUserInfo(){
    int x_pos = this.Panel_JS.getSize().width;
    int y_pos = 0;
    int x_size = this.panel_get.getSize().width - this.Panel_JS.getSize().width;
    int y_size = this.panel_get.getSize().height ;
    

    userinfo = new ajustes_userInfo(x_pos,y_pos,x_size,y_size);
    this.panel_get.add(userinfo);
    cargando_userInfo();
    active= true;
   
   
   }
   
   public void panelGet_acomodado(){
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
     
     if(active == false){
         initUserInfo();
      }else{
         userinfo.show(true);
     }
     
     original();
    
   }

public void original(){
    MouseListener funcion = new MouseListener(){
    @Override
    public void mouseClicked(MouseEvent e) {
        panelGet_original();
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
   
    this.userinfo.BTO_close.addMouseListener(funcion);
    
}

public void acomodado(){
    MouseListener funcion = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            panelGet_acomodado();


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

    this.MI_userinfo.addMouseListener(funcion);

}

public void cargando_userInfo(){
MouseListener funcion = new MouseListener(){
    @Override
    public void mouseClicked(MouseEvent e) {
     
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        DB_userInfo instancia = new DB_userInfo();
        
        try {
            set_fullname(instancia.get_nombre() + instancia.get_lastname());
            set_ci(instancia.get_ci());
            set_date(instancia.get_date());
            set_direction(instancia.get_direction());
            set_phone(instancia.get_phone());
            set_email(instancia.get_email());
            set_nombreTipo(instancia.get_nombre_tipo());
            
        } catch (SQLException ex) {
            Logger.getLogger(ajustes_gestion_usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
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
this.MI_userinfo.addMouseListener(funcion);
}

public void set_fullname(String texto){
 this.userinfo.LBL_nombre.setText(texto);
}

public void set_ci(String texto){
 this.userinfo.TXT_ci.setText(texto);

}
public void set_date(String texto){
  this.userinfo.TXT_fecha.setText(texto);

}

public void set_direction(String texto){
 this.userinfo.TXT_direction.setText(texto);

}

public void set_phone(String texto){
 this.userinfo.TXT_telefono.setText(texto);

}

public void set_nombreTipo(String texto){
 this.userinfo.TXT_usuario.setText(texto);

}

public void set_email(String texto){
 this.userinfo.TXT_correo.setText(texto);

}

}
