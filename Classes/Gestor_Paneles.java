
package market2.Classes;

import market2.Classes.Ajustes.ajustes_gestion_usuarios;
import market2.Classes.Ajustes.ajustes_horarios;

public class Gestor_Paneles {
 private static ajustes_gestion_usuarios gestion_usuarios = new ajustes_gestion_usuarios();
 private static ajustes_horarios gestion_horarios = new ajustes_horarios();
 

 public ajustes_gestion_usuarios get_GestorUsuarios(){
     return this.gestion_usuarios;
 } 
 
 public ajustes_horarios get_GestorHorarios(){
     return this.gestion_horarios;
 }
 
}
