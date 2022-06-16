
package market2.Classes.Ajustes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import market2.Paneles.Panel_horarios;

public class ajustes_horarios extends Panel_horarios{
 private ajustes_form_admin dimensiones_form_admin = new ajustes_form_admin();
 private JPanel frame_modificar = new JPanel();
 static private Point mouse_point_JTable;
  
 private int separador=15;
 //PANEL_set
     private int x_panel_set = dimensiones_form_admin.x_panel_contenedor;
     private int y_panel_set = 30; // 50
 
 //LISTA
     private int x_size_CB_list_horarios = 60;
     private int y_size_CB_list_horarios = 25;
     private int x_location_CB_list_horarios =160;
     private int y_location_CB_list_horarios = (y_panel_set / 2) - (y_size_CB_list_horarios / 2);

//TXT
    private int  x_size_TXT_busqueda_horarios = 150;
    private int  y_size_TXT_busqueda_horarios = 25;
    private int  x_location_TXT_busqueda_horarios = x_location_CB_list_horarios + x_size_CB_list_horarios + separador;
    private int  y_location_TXT_busqueda_horarios = y_location_CB_list_horarios;

//BTO_buscar
    private int x_size_BTO_buscar_horarios = 80;
    private int y_size_BTO_buscar_horarios = 25;
    private int x_location_BTO_buscar_horarios = x_location_TXT_busqueda_horarios + x_size_TXT_busqueda_horarios + separador;
    private int y_location_BTO_buscar_horarios = y_location_CB_list_horarios;

//BTO_modificar
    private int x_size_BTO_modificar_horarios = 100;
    private int y_size_BTO_modificar_horarios = 25;
    private int x_location_BTO_modificar_horarios = x_location_BTO_buscar_horarios + x_size_BTO_buscar_horarios + separador;
    private int y_location_BTO_modificar_horarios = y_location_CB_list_horarios;

//PANEL_get
 private int x_size_PANEL_get = this.dimensiones_form_admin.x_contenedor_horarios;
 private int y_size_PANEL_get = dimensiones_form_admin.y_panel_contenedor - this.y_panel_set; 
 private int x_location_PANEL_get = 0;
 private int y_location_PANEL_get = y_panel_set;
         
public ajustes_horarios(){
    this.setLayout(null);
    this.setSize(dimensiones_form_admin.x_panel_contenedor, dimensiones_form_admin.y_panel_contenedor);
       
    panel_set();
    panel_get();


}

private void panel_set(){
    this.PANEL_set.setLayout(null);
    this.PANEL_set.setSize(x_panel_set, y_panel_set);
    this.PANEL_set.setLocation(0, 0);
    this.PANEL_set.setBackground(new Color(40, 55, 122));

    //LISTA
    this.CB_list_horarios.setBounds(x_location_CB_list_horarios,y_location_CB_list_horarios,x_size_CB_list_horarios,y_size_CB_list_horarios);
   
    //TXT
    this.TXT_busqueda_horarios.setBounds(x_location_TXT_busqueda_horarios, y_location_TXT_busqueda_horarios, x_size_TXT_busqueda_horarios, y_size_TXT_busqueda_horarios);
    
    //BTO_buscar
    this.BTO_buscar_horarios.setBounds(x_location_BTO_buscar_horarios,y_location_BTO_buscar_horarios,x_size_BTO_buscar_horarios,y_size_BTO_buscar_horarios);

    //BTO_agregar
    //this.BTO_agregar_horarios.setBounds(x_location_BTO_agregar_horarios,y_location_BTO_agregar_horarios,x_size_BTO_agregar_horarios,y_size_BTO_agregar_horarios);
    
    //BTO_modificar
   // this.BTO_modificar_horarios.setBounds(x_location_BTO_modificar_horarios,y_location_BTO_modificar_horarios,x_size_BTO_modificar_horarios,y_size_BTO_modificar_horarios);
}

//HACIANDO QUE LA COLUMNAS NO PUEDAN SER EDITADAS
private void disabled_columns(){
    DefaultTableModel modelo = new DefaultTableModel(){

        @Override
        public boolean isCellEditable(int filas, int columnas){
            if(columnas==9){
             return true;

            }else{
             return false;

            }

        }
    };
    
    this.JT_horarios.setModel(modelo);
}

private void panel_get(){
    this.PANEL_get.setBounds(x_location_PANEL_get,y_location_PANEL_get,x_size_PANEL_get,y_size_PANEL_get);
    this.PANEL_get.setLayout(null);
    this.PANEL_JS.setBounds(0,0,x_size_PANEL_get,y_size_PANEL_get);
    /*
    JTableHeader th;
    th = this.JT_horarios.getTableHeader();
    Font fuente = new Font("Verdana", Font.ITALIC, 25);
   // th.setFont(fuente);
    th.setBackground(Color.red);*/
}

public void captura_MousePoint_JTable(){
MouseListener ml = new MouseListener(){
    @Override
    public void mouseClicked(MouseEvent e) {
          
        System.out.println(e.getButton());

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

this.JT_horarios.addMouseListener(ml);
    

}



 
  

}


