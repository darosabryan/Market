package market2.Classes.Ajustes;


import market2.Classes.Ajustes.ajustes_gestion_usuarios;
import market2.Classes.Fun_BTOmodificar;


public class ajustes_gestion_usuario_perfil extends ajustes_gestion_usuarios{
    public ajustes_gestion_usuario_perfil(){
    this.panelGet_acomodado();
    
    this.panel_set.setEnabled(false);
    this.JT_usuarios.setEnabled(false);
    this.userinfo.BTO_close.setEnabled(false);
    

    }
}
