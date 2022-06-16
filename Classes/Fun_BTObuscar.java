package market2.Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import market2.Paneles.Panel_gestion_de_usuarios;

public class Fun_BTObuscar {
    static private String filtro;
    static private String busqueda;
    static private JTable tabla;
    
public Fun_BTObuscar(JTable tabla,String busqueda, String filtro){
    this.tabla = tabla;
    this.busqueda =busqueda;
    this.filtro = filtro;
}
public String carga_usuarios_busqueda(){
return "select usu.name,usu.lastname,usu.ci,t_usu.nombre_tipo FROM usuarios as usu join tipo_usuario as t_usu WHERE usu.tipo = t_usu.id_tipo";

}
//tengo que obtener la cedula dependiendo de la id_horarios que le corresponda a cada usuario
public String carga_usuarios_horarios(){
return  "select usu.ci, usu.lastname, hor.lun, hor.mar, hor.mie, hor.jue, hor.vie, hor.sab, hor.dom from usuarios as usu join horarios as hor where usu.id_horario=hor.id";

}

public String consulta_panel_busqueda(){
return "select usu.name,usu.lastname,usu.ci,t_usu.nombre_tipo FROM usuarios as usu join tipo_usuario as t_usu WHERE usu.tipo = t_usu.id_tipo and usu."+this.filtro+ "='"+this.busqueda+"'";

}

//tengo que obtener la cedula dependiendo de la id_horarios que le corresponda a cada usuario 
public String consulta_panel_horarios(){
return  "select usu.ci, usu.lastname, hor.lun, hor.mar, hor.mie, hor.jue, hor.vie, hor.sab, hor.dom from usuarios as usu join horarios as hor where usu.id_horario=hor.id and usu." +this.filtro + "='"+ this.busqueda+"'";

}

public Object[] datos_modelo_busqueda(ResultSet consulta) throws SQLException{
return new Object[]{consulta.getString("name"), consulta.getString("lastname"),consulta.getString("ci"),consulta.getString("nombre_tipo")};
                       
}

public Object[] datos_modelo_horarios(ResultSet consulta) throws SQLException{
return new Object[]{consulta.getString("ci"), consulta.getString("lastname"),consulta.getString("lun"),consulta.getString("mar"),consulta.getString("mie"),consulta.getString("jue"),consulta.getString("vie"),consulta.getString("sab"),consulta.getString("dom")};
                  
}

public Object[] control_modelos(int id_modelo,ResultSet consulta) throws SQLException{
Object[] result = null;    
switch(id_modelo){
    case 0:result = datos_modelo_busqueda(consulta);
    break;
    
    case 1:result =datos_modelo_horarios(consulta);   
    break;
    
    default:System.out.println("id No valido");
    break;

}

return result;
}

public ResultSet filtrar(String query){
ResultSet consulta = null;
    try{
        Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/comercio", "root", "");
        Statement miStatement = miConexion.createStatement();

        consulta = miStatement.executeQuery(query);

      //  consulta.next();
      
    }catch(Exception e){
        System.out.println("Error al establecer la conexion");

    } 
   return consulta;
}

public void additemtotable_busqueda(int id_modelo,ResultSet consulta) throws SQLException{
    DefaultTableModel modelo = (DefaultTableModel) this.tabla.getModel();
    int filas = modelo.getRowCount();
    for (int i = filas - 1; i>=0; i--){
        modelo.removeRow(i);
    }

    while(consulta.next()){  //SI EL RECRODSET ESTA VACIO NO ENTRA AL WHILE 
        modelo.addRow(control_modelos(id_modelo,consulta));  
    }
    
    consulta.close();
    
}

}