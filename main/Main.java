
package market2.main;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import market2.Forms.LogIN;
import static market2.Classes.Conexion.forms;


public class Main extends LogIN{

    public static void main(String[] args) {
        
    //Cambiando el look & feel de (Nimbus->Windows)
    try{
        for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Windows".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
    }catch(Exception e){
        System.out.println("Error papa");
    
    }
        
    forms.state_LogIN(true);
    }
  
   


}
