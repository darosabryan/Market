package market2.Classes;
import com.toedter.calendar.JCalendar;
import market2.Classes.Forms_state;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import market2.Classes.Ajustes.ajustes_LogIN;
//Primero hay que instalar la libreria JDBC
////cacacaca                                        
public class Conexion{
public static Forms_state forms = new Forms_state();

public boolean existHOR(String ci){
    boolean result=true;    

 try{
  Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/comercio", "root", "");
  Statement miStatement = miConexion.createStatement();  
  ResultSet consulta = miStatement.executeQuery("select * from horarios where id="+ ci+ "");
  consulta.next();
  
   try{
    consulta.getString("id").isEmpty();
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
   login close= new login();
     /*  Fun_BTOmodificar instancia = new Fun_BTOmodificar(null);
           instancia.setCI(close.getLogIN().TXT_ci.getText().toString());*/
       
       close.getLogIN().show(false);
  //Antes caputraba la ci en login
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

public void action_sigIN(String name,String lastname,String ci, String phone,String tipo,String pass,Calendar date,String direction,String email){
  
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
         miStatement.execute("insert into horarios(id,lun,mar,mie,jue,vie,sab,dom) values("+ ci +",'--','--','--','--','--','--','--')");

        //Agarrar el ultimo id del ultmio horario creado en la tabla horairos y guardarlo en la variable id_horario
       /*
        consulta = miStatement.executeQuery("SELECT count(id) from horarios");
        consulta.next();
        String id_horario =consulta.getString("count(id)");
        */
         
         //Crear condicional que verifique que el horario correspondiente este creado         
         if(existHOR(ci)==true){
             System.out.println("hola");
             //El formato de la fecha tiene que ser a??o-mes-dia
             
             SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            
                     System.out.println("insert into Usuarios(name,lastname,ci,phone,tipo,password,date,direction,email) values('"+name+"','"+lastname+"',"+ci+","+phone+","+id_tipo+",'"+pass+"','"+formato.format(date.getTime())+"','"+direction+"','"+email+"')");
             
             miStatement.execute("insert into Usuarios(name,lastname,ci,phone,tipo,password,date,direction,email) values('"+name+"','"+lastname+"',"+ci+","+phone+","+id_tipo+",'"+pass+"','"+formato.format(date.getTime())+"','"+direction+"','"+email+"')");

         }
         
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
