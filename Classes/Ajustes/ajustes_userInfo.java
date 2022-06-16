
package market2.Classes.Ajustes;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import market2.Paneles.Panel_userInfo;

public class ajustes_userInfo extends Panel_userInfo{
    private int x_size;
    private int y_size;
    private int x_location;
    private int y_location;
    static int contador_altura=0;

    public ajustes_userInfo(int x_size_tabla,int x_size_contenedor ,int y_size_contenedor){
     this.setLayout(null);
     this.setBounds(x_size_tabla,0,x_size_contenedor - x_size_tabla, y_size_contenedor);
     
     this.PANEL_barrasuperior.setLayout(null);
     this.PANEL_barrasuperior.setBounds(0,0,this.getWidth(),25);
         this.setLayout(null);
         this.BTO_close.setBounds(this.PANEL_barrasuperior.getWidth() - this.PANEL_barrasuperior.getHeight(), 0 , this.PANEL_barrasuperior.getHeight(), this.PANEL_barrasuperior.getHeight());
    
     
     this.PANEL_basicinfo.setLayout(null);
     this.PANEL_basicinfo.setBounds(0,this.PANEL_barrasuperior.getHeight(),this.getWidth(),100);
         this.BTO_foto.setSize(70,70);
         this.BTO_foto.setLocation((this.getWidth() - this.BTO_foto.size().width)/2,5);
         
         this.LBL_nombre.setSize(50,10);
         this.LBL_nombre.setLocation((this.getWidth() - this.LBL_nombre.getSize().width)/2,this.BTO_foto.getLocation().y + this.BTO_foto.getSize().height);
              
    // this.contador_altura=this.PANEL_barrasuperior.getHeight() + this.PANEL_basicinfo.getHeight();
         
     //this.JSPANE_advinfo.setLayout(null);
     this.JSPANE_advinfo.setBounds(0,this.PANEL_basicinfo.getLocation().y + this.PANEL_basicinfo.getHeight(),this.getWidth(),this.getHeight() - (this.PANEL_barrasuperior.getHeight() + this.PANEL_basicinfo.getHeight()));
     
     this.PANEL_advinfo.setLayout(null);
     this.PANEL_advinfo.setBounds(0,0,50,50);
     this.PANEL_advinfo.show(true);
     
 //    this.PANEL_ci.setLayout(null);
   //    this.PANEL_ci.setBounds(0,0,70,25);
     //         this.PANEL_ci.setBackground(Color.red);
  //   acomodando_paneles(this.PANEL_ci,this.BTO_ci,this.TXT_ci);
}
   private void acomodando_paneles(JPanel panel,JButton boton, JTextField text){
       Dimension dms = new Dimension(80,25);
       panel.setLayout(null);
       panel.setBounds(0,0,80,25);
              panel.setBackground(Color.red);
panel.show(true);
       /*
       int centro = (this.getWidth() - dms.width)/2;
       
       panel.setLayout(null);
       panel.setLocation(centro,this.contador_altura);
       panel.setSize(dms);
       panel.setBackground(Color.red);
       this.contador_altura = this.contador_altura + dms.height;
       
       */
       
   }
    
}
