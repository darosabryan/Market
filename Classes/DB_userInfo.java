
package market2.Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_userInfo {
   private String ci;
   
   public DB_userInfo(String ci){
   this.ci = ci;
   
   }
   
   
   private String query(){
       return "select usu.ci,usu.name,usu.lastname,t_usu.nombre_tipo,usu.phone,usu.direction, usu.date,usu.email FROM usuarios as usu join tipo_usuario as t_usu WHERE usu.tipo = t_usu.id_tipo and usu.ci =" + this.ci;
   }
    
  
   private ResultSet all_userInfo(){
   ResultSet consulta = null;
    try{
        Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/comercio", "root", "");
        Statement miStatement = miConexion.createStatement();

        consulta = miStatement.executeQuery(query());

        consulta.next();
      
    }catch(Exception e){
        System.out.println("Error al establecer la conexion");

    } 
   return consulta;
   
   } 
   
  public String get_nombre() throws SQLException{
  return all_userInfo().getString("name");
  } 
  public String get_lastname() throws SQLException{
  return all_userInfo().getString("lastname");
  } 
  
  public String get_ci() throws SQLException{
  return all_userInfo().getString("ci");
  } 
  
  public String get_direction() throws SQLException{
  return all_userInfo().getString("direction");
  }
  
  public String get_phone() throws SQLException{
  return all_userInfo().getString("phone");
  }
  
  public String get_email() throws SQLException{
  return all_userInfo().getString("email");
  }
  
  public String get_date() throws SQLException{
  return all_userInfo().getString("date");
  }
  
 public String get_nombre_tipo() throws SQLException{
  return all_userInfo().getString("nombre_tipo");
  } 
}
