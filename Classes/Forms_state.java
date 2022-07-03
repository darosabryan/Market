
package market2.Classes;

import market2.Forms.main_form_admin;
import market2.Forms.LogIN;
import market2.Classes.Ajustes.ajustes_form_admin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import market2.Classes.Ajustes.ajustes_Edit_date;
import market2.Classes.Ajustes.ajustes_LogIN;
import market2.Classes.Ajustes.ajustes_signIN;

public class Forms_state {
private static ajustes_form_admin main_form = new ajustes_form_admin();
private ajustes_Edit_date modificar = new ajustes_Edit_date();


public void state_main_form(boolean state){
  this.main_form.show(state);
  
  }

public void state_ajustes_Edit_date(boolean state){
 modificar.CB_hour1.setSelectedIndex(0);
 modificar.CB_minuts1.setSelectedIndex(0);
 
 modificar.CB_hour2.setSelectedIndex(0);
 modificar.CB_minuts2.setSelectedIndex(0);
 modificar.BTO_close.setIcon(new ImageIcon("C:\\Users\\Raul Games\\Documents\\NetBeansProjects\\Market2\\src\\market2\\imagenes\\window-close.png"));
 
 modificar.show(state);

}

/*
public void cargar_tipos(){
try{
 Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/comercio", "root", "");

 Statement miStatement = miConexion.createStatement();
 
 ResultSet consulta = miStatement.executeQuery("select nombre_tipo from tipo_usuario");

 while(consulta.next()){
  System.out.println(consulta.getString("nombre_tipo"));
  this.signin.CB_type.addItem(consulta.getString("nombre_tipo"));
 
 }
 
 
 
}
catch(Exception e){
 System.out.println("Error al cargar los tipos de usuario");

}

}
*/

}
