
package market2.Classes.Ajustes;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import market2.Classes.Animaciones;
import market2.Classes.admin_form_dimensiones;
import market2.Forms.SignIN;
import market2.Paneles.Panel_SignIN;

public class ajustes_signIN extends SignIN{
    
    
    private admin_form_dimensiones dimensiones = new admin_form_dimensiones();
    private int y_location_contenedor = 60;
    
    public ajustes_signIN(){
    int x_size = 400;
    int y_size = 500;
    /*
    int x_location= (dimensiones.getX_panel_contenedor() - x_size)/2;
    int y_location= 10;
    
    this.setBounds(x_size,y_size,x_location,y_location);
    this.setLayout(null);
        */
    Animaciones look_ventana = new Animaciones();
    look_ventana.Windows_look_and_feel(x_size,y_size,this.PANEL_contenedor,this);
    
    //this.LBL_registrarse.setFont(new Font("Serif", Font.PLAIN, 24));
   // this.LBL_registrarse.setLocation(x_size, y_size);
   
    txt_o_box inst = new txt_o_box();
        
    inst.setTipo("txt");
    inst.setTxt(this.TXT_name);
    cargando_componenetes(this.PANEL_name,this.LBL_name,inst);

    inst.setTxt(this.TXT_lastname);
    cargando_componenetes(this.PANEL_lastname,this.LBL_lastname,inst);
    
    inst.setTxt(this.TXT_ci);
    cargando_componenetes(this.PANEL_ci,this.LBL_ci,inst);
    
    inst.setTxt(this.TXT_email);
    cargando_componenetes(this.PANEL_email,this.LBL_email,inst);
    
    inst.setTipo("box");
    inst.setBox(this.CB_type);
    cargando_componenetes(this.PANEL_type,this.LBL_type,inst);
    
    inst.setTipo("txt");
    inst.setTxt(this.TXT_direction);
    cargando_componenetes(this.PANEL_direccion,this.LBL_direccion,inst);
    
    inst.setTxt(this.TXT_phone);
    cargando_componenetes(this.PANEL_phone,this.LBL_phone,inst);
    
    inst.setTxt(this.TXT_date);
    cargando_componenetes(this.PANEL_date,this.LBL_date,inst);
    
    inst.setTxt(this.TXT_direction);
    cargando_componenetes(this.PANEL_direccion,this.LBL_direccion,inst);
    
    inst.setTxt(this.TXT_password);
    cargando_componenetes(this.PANEL_password,this.LBL_password,inst);
    
    
    this.BTO_aceptar.setLocation(this.PANEL_password.getLocation().x + this.PANEL_password.getWidth() - this.BTO_aceptar.getWidth(),this.PANEL_password.getLocation().y + this.PANEL_password.getHeight()+ 10 );
    }
    
   public void cargando_componenetes(JPanel contenedor,JLabel lbl, txt_o_box comp){
     //contenedores:
     int x_size_contenedor = 300;
     int y_size_contenedor = 25;
     int inter = 10;
     
     int x_location_contenedor = (this.getWidth() - x_size_contenedor)/2;
     y_location_contenedor = y_location_contenedor + inter;
     
     //lbl
     int x_size_lbl = 50;
     int y_size_lbl = y_size_contenedor;
     
     //txt
     int x_size_comp = x_size_contenedor - x_size_lbl;
     int y_size_comp = y_size_contenedor;
     int x_location_comp = x_size_lbl;
     
     contenedor.setLayout(null);
     contenedor.setBounds(x_location_contenedor,y_location_contenedor,x_size_contenedor,y_size_contenedor);
     lbl.setBounds(0,0,x_size_lbl,y_size_lbl);
     
     if(comp.getTipo()=="txt"){
       comp.getTxt().setBounds(x_location_comp,0,x_size_comp,y_size_comp);
     
     }     
     
     if(comp.getTipo()=="box"){
       comp.getBox().setBounds(x_location_comp,0,x_size_comp,y_size_comp);
     
     }
     
     y_location_contenedor = y_location_contenedor + y_size_contenedor;
   }

   
   public class txt_o_box{
    private JTextField txt;
    private JComboBox box;
    private String tipo;

    public JTextField getTxt() {
        return txt;
    }

    public void setTxt(JTextField txt) {
        this.txt = txt;
    }

    public JComboBox getBox() {
        return box;
    }

    public void setBox(JComboBox box) {
        this.box = box;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
}
