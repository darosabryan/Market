
package market2.Classes.Ajustes;

import market2.Paneles.Panel_userInfo;


public class ajustes_userInfo extends Panel_userInfo{
    
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

                this.LBL_nombre.setSize(50,10);
                this.LBL_nombre.setLocation((this.getWidth() - this.LBL_nombre.getSize().width)/2,this.BTO_foto.getLocation().y + this.BTO_foto.getSize().height);


        } 

        public void panelAdvanceInfo(){


        }
}
