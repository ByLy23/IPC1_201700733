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
public class Bomba {
      public int posicion=0;
    public int equipo=0;
    public ImageIcon Bomba(int tamx,int tamy){
        
       ImageIcon bomba =new ImageIcon(getClass().getResource("/imagenes/bomba.png"));
       Image imagen= bomba.getImage();
       Image tamimagen=imagen.getScaledInstance(tamx, tamy, Image.SCALE_SMOOTH);
       bomba= new ImageIcon(tamimagen);
     
       return bomba;
    }
}
