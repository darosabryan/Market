
package market2.Classes.Ajustes;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import market2.Paneles.Panel_userInfo;


public class ajustes_userInfo extends Panel_userInfo{
    private int panel_pos_y=0;
    
    public ajustes_userInfo(int x_pos,int y_pos,int x_size, int y_size){
     
        this.setLayout(null);
        this.setBounds(x_pos,y_pos,x_size,y_size);

        barraSuperior();
        panelBasicInfo();
        panelAdvanceInfo();
    }
    
         public void barraSuperior(){
             this.PANEL_barrasuperior.setLayout(null);
             this.PANEL_barrasuperior.setBounds(0,0,this.getWidth(),25);
                 this.BTO_close.setBounds(this.PANEL_barrasuperior.getWidth() - this.PANEL_barrasuperior.getHeight(), 0 , this.PANEL_barrasuperior.getHeight(), this.PANEL_barrasuperior.getHeight());

         }   

        public void panelBasicInfo(){
            this.PANEL_basicinfo.setLayout(null);
            this.PANEL_basicinfo.setBounds(0,this.PANEL_barrasuperior.getHeight(),this.getWidth(),100);
                this.BTO_foto.setSize(70,70);
                this.BTO_foto.setLocation((this.getWidth() - this.BTO_foto.size().width)/2,5);

                this.TXT_nombre.setSize(this.getWidth(),25);
                this.TXT_nombre.setLocation(0,this.BTO_foto.getLocation().y + this.BTO_foto.getSize().height);


        } 

        public void panelAdvanceInfo(){
            this.JSPANE_advinfo.setBounds(0, this.PANEL_barrasuperior.getHeight() + this.PANEL_basicinfo.getHeight(), this.getWidth(), this.getHeight() - (this.PANEL_barrasuperior.getHeight() + this.PANEL_basicinfo.getHeight()));
                  
            this.PANEL_contenedor.setLayout(null);
            this.PANEL_contenedor.setSize(this.JSPANE_advinfo.getSize());
            this.PANEL_contenedor.setLocation(0, 0);    
            this.PANEL_contenedor.show(true);
            
            acomodandoPanelesAdvanceInfo(this.PANEL_ci,this.BTO_ci,this.TXT_ci);
            acomodandoPanelesAdvanceInfo(this.PANEL_direccion,this.BTO_direccion,this.TXT_direction);
            acomodandoPanelesAdvanceInfo(this.PANEL_correo,this.BTO_correo,this.TXT_correo);
            acomodandoPanelesAdvanceInfo(this.PANEL_telefono,this.BTO_telefono,this.TXT_telefono);
            acomodandoPanelesAdvanceInfo(this.PANEL_usuario,this.BTO_usuario,this.TXT_usuario);
            acomodandoPanelesAdvanceInfo(this.PANEL_fecha,this.BTO_fecha,this.TXT_fecha);
            
        }
        
        public void acomodandoPanelesAdvanceInfo(JPanel panel,JButton boton,JTextField txt){
         int panel_size_x = this.getWidth();
         int panel_size_y = 25;
         int inter = 10;
         int panel_pos_x = 0;
         panel_pos_y = inter + panel_pos_y; 
         
             int boton_size_x = panel_size_y;
             int boton_size_y = panel_size_y;
             int boton_pos_x = 0;
             int boton_pos_y = 0;
             
             int txt_size_x = panel_size_x - boton_size_x;
             int txt_size_y = panel_size_y;
             int txt_pos_x = boton_size_x;
             int txt_pos_y = 0;
             
            panel.setLayout(null);
            panel.setBounds(panel_pos_x,panel_pos_y,panel_size_x,panel_size_y);
            boton.setBounds(boton_pos_x,boton_pos_y,boton_size_x,boton_size_y);
            txt.setBounds(txt_pos_x,txt_pos_y,txt_size_x,txt_size_y);
            txt.show(true);
            
            panel_pos_y=panel_pos_y + panel_size_y;
        }
        
}
