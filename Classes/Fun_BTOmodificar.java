
package market2.Classes;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import market2.Classes.Ajustes.ajustes_horarios;

public class Fun_BTOmodificar extends ajustes_horarios{
static private String ci;
static private String columna;
private JTable tabla;
private Point location;

public Fun_BTOmodificar(JTable tabla,Point location){
this.tabla=tabla;
this.location=location;
 
}    

public String getCI(){
 return this.ci;

}

public String getColumna(){
 return this.columna;

}

public void setCI(String ci){
 this.ci = ci;

}

public void setColumna(String columna){
 this.columna = columna;

}

public String capturaCI(JTable tabla){
   DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
  // System.out.println(this.getMousePosition());
   //System.out.println("posicion="+tabla.rowAtPoint(getMousePosition()));
   return String.valueOf(modelo.getValueAt(tabla.rowAtPoint(location),0));
   //return String.valueOf(modelo.getValueAt(tabla.getSelectedRow(),0));

}

public String capturarColumna(JTable tabla){
   DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

   //return tabla.getColumnName(tabla.getSelectedColumn());
   return tabla.getColumnName(tabla.columnAtPoint(location));
  
   
}

public boolean columna_valida(){
 return !((this.columna=="ci") || (this.columna=="Lastname")); 

}

  //Capturar ci
  //Capturar columna de la celda elegida
  //Abrir panel Para modificar
  //Al presionar el boton modificar se realiza un modificacion en la db tal que se modifican los horarios del usuario  
  //Se refresca la tabla para que se vea la modificacion

}
