
package market2.Classes.Ajustes;

import java.awt.Color;
import java.util.Set;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import market2.Classes.Animaciones;
import market2.Forms.Edit_date;
public class ajustes_Edit_date extends Edit_date {
  private int x=200;
  private int y=115;
  private Animaciones animaciones = new Animaciones();
   
  public ajustes_Edit_date(){
 // this.setLayout(null);
  this.setSize(x,y);
  this.PANEL_contenedor.setLayout(null);
  this.PANEL_contenedor.setBackground(new Color(0,41,57));

  
  PANEL_superior();
  BTO_close();
  PANEL_horarios1();
  LBL_barra();
  PANEL_horarios2();
  BTO_edit();
  cargando_ComboBox();
  
  componentes_horarios1(PANEL_horario1,CB_hour1,CB_minuts1,LBL_puntos1);
  componentes_horarios1(PANEL_horario2,CB_hour2,CB_minuts2,LBL_puntos2);
 
  animaciones.animacion_close(BTO_close);
  
  }
  private void PANEL_superior(){
   int x_size=this.x;
   int y_size=25;
   int x_location=0;
   int y_location=0;
   
   this.PANEL_superior.setLayout(null);
   this.PANEL_superior.setBounds(x_location,y_location,x_size,y_size);
   this.PANEL_superior.setLocation(0, 0);
   this.PANEL_superior.setBackground(new Color(0,41,57));
   
  }        
 private void BTO_close(){
 int x_size=this.PANEL_superior.getSize().height;
 int y_size=x_size;
 int x_location=this.PANEL_superior.getSize().width - x_size;
 int y_location=0;
 
 this.BTO_close.setLayout(null);
 this.BTO_close.setBounds(x_location,y_location,x_size,y_size);
 
 }
 
private void PANEL_horarios1(){
int x_size= 85;
int y_size=30;

int x_location=10;
int y_location=PANEL_superior.getSize().height + 10;

PANEL_horario1.setLayout(null);
PANEL_horario1.setBounds(x_location, y_location,x_size, y_size);

}

  private void componentes_horarios1(JPanel panel,JComboBox hora,JComboBox minutos,JLabel puntos){
   //Size   
   int x_size_CBhora=(panel.getSize().width - 11)/2;
   int y_size_CBhora=panel.getSize().height;
      
   int x_size_LBLpuntos=11;
   int y_size_LBLpuntos=panel.getSize().height;   
      
   int x_size_CBminutos=x_size_CBhora;       
   int y_size_CBminutos=panel.getSize().height;   
   
   //Location  
   int x_location_CBhora=0;
   int y_location_CBhora=0;
   
   int x_location_LBLpuntos=x_size_CBhora;
   int y_location_LBLpuntos=0;  
   
   int x_location_CBminutos=x_location_LBLpuntos + x_size_LBLpuntos;       
   int y_location_CBminutos=0;   

   hora.setBounds(x_location_CBhora,y_location_CBhora,x_size_CBhora,y_size_CBhora);
   puntos.setBounds(x_location_LBLpuntos,y_location_LBLpuntos,x_size_LBLpuntos,y_size_LBLpuntos);
   minutos.setBounds(x_location_CBminutos,y_location_CBminutos,x_size_CBminutos,y_size_CBminutos);
  }

private void LBL_barra(){
int x_size=10;
int y_size=30;
int x_location=PANEL_horario1.getLocation().x + PANEL_horario1.getSize().width;
int y_location=PANEL_superior.getSize().height + 10;

LBL_barra.setLayout(null);
LBL_barra.setBounds(x_location,y_location,x_size,y_size);
}

private void PANEL_horarios2(){
int x_size= 85;
int y_size=30;

int x_location=LBL_barra.getLocation().x + LBL_barra.getSize().width;
int y_location=PANEL_superior.getSize().height + 10;

PANEL_horario2.setLayout(null);
PANEL_horario2.setBounds(x_location, y_location,x_size, y_size);

}

private void BTO_edit(){
int x_size=60;
int y_size=20;
int x_location=this.getSize().width - x_size - 10;
int y_location=PANEL_horario1.getLocation().y + PANEL_horario1.getSize().height + 10;
BTO_edit.setLayout(null);
BTO_edit.setBounds(x_location,y_location,x_size,y_size);
}

public void cargando_ComboBox(){
    for(int i=0; i<=9; i++){
     CB_hour1.addItem("0"+i);
     CB_hour2.addItem("0"+i);
     
     CB_minuts1.addItem("0"+i);
     CB_minuts2.addItem("0"+i);

    }
    
    for(int i=10; i<=23;i++){
     CB_hour1.addItem(""+i);
     CB_hour2.addItem(""+i);
        
    }
    
    for(int i=10; i<=59;i++){
     CB_minuts1.addItem(""+i);
     CB_minuts2.addItem(""+i);
        
    }
    
}


}
