/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author byron
 */
public class Corazon {
      public int posicion=0;
    public int equipo=0;
    public ImageIcon Corazon(int tamx,int tamy){
        
       ImageIcon coraz =new ImageIcon(getClass().getResource("/imagenes/vida.png"));
       Image imagen= coraz.getImage();
       Image tamimagen=imagen.getScaledInstance(tamx, tamy, Image.SCALE_SMOOTH);
       coraz= new ImageIcon(tamimagen);
     
       return coraz;
    }
}
