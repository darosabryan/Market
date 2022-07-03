
package market2.Classes;

import market2.Classes.Ajustes.ajustes_gestion_usuario_perfil;
import market2.Classes.Ajustes.ajustes_gestion_usuarios;
import market2.Classes.Ajustes.ajustes_horarios;
import market2.Classes.Ajustes.ajustes_signIN;

public class Gestor_Paneles {
 private static ajustes_gestion_usuarios gestion_usuarios = new ajustes_gestion_usuarios();
 private static ajustes_horarios gestion_horarios = new ajustes_horarios();
 private static ajustes_gestion_usuario_perfil usuario_perfil = new ajustes_gestion_usuario_perfil();

     public ajustes_gestion_usuarios get_GestorUsuarios(){
         return this.gestion_usuarios;
     } 

     public ajustes_horarios get_GestorHorarios(){
         return this.gestion_horarios;
     }

    public ajustes_gestion_usuario_perfil getUsuario_perfil() {
        return this.usuario_perfil;
    }

  

 
}
