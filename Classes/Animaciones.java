
package market2.Classes;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Animaciones {
    
public void animacion_btos(JButton BTO){
MouseListener animacion = new MouseListener(){
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
};


}      
    
    
public void animacion_close(JButton BTO_close){    
MouseListener animation = new MouseListener(){
    @Override
    public void mouseClicked(MouseEvent me) {
      System.exit(0);   

    }
    @Override

    public void mousePressed(MouseEvent me) {
       BTO_close.setIcon(new ImageIcon("C:\\Users\\Raul Games\\Documents\\NetBeansProjects\\Market2\\src\\market2\\imagenes\\window-close-final.png"));

    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        BTO_close.setIcon(new ImageIcon("C:\\Users\\Raul Games\\Documents\\NetBeansProjects\\Market2\\src\\market2\\imagenes\\window-close-entrar.png"));
    }

    @Override
    public void mouseExited(MouseEvent me) {
        BTO_close.setIcon(new ImageIcon("C:\\Users\\Raul Games\\Documents\\NetBeansProjects\\Market2\\src\\market2\\imagenes\\window-close.png"));
    }
};
BTO_close.addMouseListener(animation);

}    

public void Windows_look_and_feel(int x,int y,JPanel Panel_main,JFrame frame){
    
    frame.setLayout(null);
    frame.setSize(x,y);
    
    JPanel barra_superior = new JPanel();
     frame.add(barra_superior);
     barra_superior.setLayout(null);
     barra_superior.setBounds(0,0,x,25);
     barra_superior.setBackground(new Color(0,41,57));
     
    JButton BTO_close = new JButton();
     barra_superior.add(BTO_close);
     
     BTO_close.setLayout(null);
     BTO_close.setBounds(barra_superior.getWidth() - 25,0,25,25);
     BTO_close.setContentAreaFilled(false);
     BTO_close.setBorder(new EmptyBorder(0,0,0,0));
     BTO_close.setBorderPainted(false);
     BTO_close.setFocusPainted(false);
     BTO_close.setIcon(new ImageIcon("C:\\Users\\Raul Games\\Documents\\NetBeansProjects\\Market2\\src\\market2\\imagenes\\window-close.png"));
   
     animacion_close(BTO_close);
     
    Panel_main.setLayout(null);
    Panel_main.setBounds(0,barra_superior.getHeight(), frame.getWidth(), frame.getHeight()- barra_superior.getHeight());
   // Panel_main.setBackground(new Color(135, 130, 129));
} 

}
