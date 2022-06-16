
package market2.Classes.Ajustes;

import market2.Classes.Animaciones;
import market2.Forms.LogIN;

public class ajustes_LogIN  extends LogIN{
  
    public ajustes_LogIN(){
     Animaciones look_ventana = new Animaciones();
        look_ventana.Windows_look_and_feel(250,150 , this.PANEL_main, this);
     
    acomodando_componenetes();
    
    }
    
    public void acomodando_componenetes(){
        int interlineado=10;
        
        //SIZE_paneles
        int x_size_paneles=200;
        int y_size_paneles=25;
        
        //LOCATION_paneles
        int x_location_paneles=(this.PANEL_main.getWidth() - x_size_paneles)/2;
        int y_location_paneles=interlineado;
        
        //SIZE_lbl
        int x_size_lbl=30;
        int y_size_lbl=y_size_paneles;
        
        //Size_txt
        int x_size_txt=x_size_paneles - x_size_lbl;
        int y_size_txt=y_size_paneles;
        
            this.PANEL_ci.setLayout(null);
            this.PANEL_ci.setBounds(x_location_paneles, y_location_paneles, x_size_paneles, y_size_paneles);
                
                this.LBL_ci.setLayout(null);
                this.LBL_ci.setBounds(0,0,x_size_lbl,y_size_lbl);
                
                this.TXT_ci.setLayout(null);
                this.TXT_ci.setBounds(x_size_lbl, 0, x_size_txt, y_size_txt);
                
            this.PANEL_pass.setLayout(null);
            this.PANEL_pass.setBounds(x_location_paneles, y_size_paneles + (2*interlineado), x_size_paneles, y_size_paneles);
                
                this.LBL_pass.setLayout(null);
                this.LBL_pass.setBounds(0,0,x_size_lbl,y_size_lbl);
                
                this.TXT_pass.setLayout(null);
                this.TXT_pass.setBounds(x_size_lbl, 0, x_size_txt, y_size_txt);
        
        //BTOaccept
        int BTO_size= 200;                               
            this.BTO_accept.setLayout(null);
            this.BTO_accept.setBounds((this.getWidth() - BTO_size)/2, (2*y_size_paneles) + (3*interlineado),BTO_size, y_size_paneles);
    }    

}
