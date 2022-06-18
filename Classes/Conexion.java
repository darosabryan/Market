package market2.Classes;
import market2.Classes.Forms_state;
import java.sql.*;
import javax.swing.JOptionPane;
//Primero hay que instalar la libreria JDBC
////cacacaca                                        
public class Conexion {
public static Forms_state forms = new Forms_state();

public static boolean existUSU(String ci,String pass){
boolean result=true;    

 try{
  Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/comercio", "root", "");
  Statement miStatement = miConexion.createStatement();  
  ResultSet consulta = miStatement.executeQuery("select * from usuarios where ci="+ ci+ " and password='"+pass+"'");
  consulta.next();
  
   try{
    consulta.getString("ci").isEmpty();
    result=true;
    miConexion.close();
  
   }catch(Exception e){
    result=false;
    miConexion.close();

   }
  
 }
 catch(Exception e){
 System.out.println("Error al establecer la conexion");
 
 }
    return result;
    

}

public static String tipoUSU(String ci){
  String tipo="";
  
  try{  
  Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/comercio", "root", "");
  Statement miStatement = miConexion.createStatement();  
  ResultSet consulta = miStatement.executeQuery("select tu.id_tipo from usuarios as u join tipo_usuario as tu on u.tipo = tu.id_tipo where u.ci =" +ci);
  consulta.next();
  
  return tipo = consulta.getString("id_tipo");
    
  
  }catch(Exception e){
   System.out.println("Error de usuario");
      
  }
  
 return tipo; 
}

public void action_LogIN(String ci,String pass){
    
  try{
  if (existUSU(ci,pass)== true){
  forms.state_LogIN(false);

  switch(tipoUSU(ci)){
      case "1":
          forms.state_main_form(true);
          break;
      
      case "2":
          System.out.println("Caso no creado");
          break;
      
      case "3":
          System.out.println("Caso no creado");
          break;
     
      case "4":
          System.out.println("Caso no creado");
          break;
      
      case "5":
          System.out.println("Caso no creado");
          break;
          
  
  }
  
  
  System.out.println("Has iniciado sesion correctamente");

  }else
  {
   System.out.println("Usuario o password incorrectos");
  }    
  
  }catch(Exception e){
   System.out.println("Error al inicar sesion");

    }

}

public void action_sigIN(String name,String lastname,String ci, String phone,String tipo,String pass,String date,String direction,String email){
  
try{
    //1 Crear conexion
                                                        //Es la manera de dar la informacion del servidor
    Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/comercio", "root", "");

    //2 Crear objeto Statement
    Statement miStatement = miConexion.createStatement();
    
    ResultSet consulta = miStatement.executeQuery("SELECT id_tipo FROM tipo_usuario where nombre_tipo='"+tipo+"'");
    consulta.next();
    String id_tipo = consulta.getString("id_tipo");
    
    
      

    if (existUSU(ci,pass)==false){
    miStatement.execute("insert into horarios(lun,mar,mie,jue,vie,sab,dom) values('--','--','--','--','--','--','--')");

    //Agarrar el ultimo id del ultmio horario creado en la tabla horairos y guardarlo en la variable id_horario
    consulta = miStatement.executeQuery("SELECT count(id) from horarios");
    consulta.next();
    String id_horario =consulta.getString("count(id)");
      
    miStatement.execute("insert into Usuarios(name,lastname,ci,phone,tipo,id_horario,password,date,direction,email) values('"+name+"','"+lastname+"',"+ci+","+phone+","+id_tipo+","+id_horario+",'"+pass+"',"+date+",'"+direction+"','"+email+"')");

     if (existUSU(ci,pass)==true){
     System.out.println("Tu usuario fue creado correctamente");
     }
    
    }else{
    System.out.println("Este usuario ya existe");
    
    }
    miConexion.close();
    
}catch(Exception e){
    System.out.println("Error al querer registar a este usuario");

    
    }
    
}
    
   
}
