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
public class Mago {
    public int posicion=0;
    public int equipo=0;
    public ImageIcon EquipoAzulM(int tamy){
        
       ImageIcon mazul =new ImageIcon(getClass().getResource("/imagenes/Guerrerab.png"));
       Image imagen= mazul.getImage();
       Image tamimagen=imagen.getScaledInstance(150, tamy, Image.SCALE_SMOOTH);
       mazul= new ImageIcon(tamimagen);
     
       return mazul;
    }
    public ImageIcon EquipoRojoM(int tamy){
        
       ImageIcon mrojo =new ImageIcon(getClass().getResource("/imagenes/Guerrerar.png"));
       Image imagen= mrojo.getImage();
       Image tamimagen=imagen.getScaledInstance(150, tamy, Image.SCALE_SMOOTH);
       mrojo= new ImageIcon(tamimagen);
     
       return mrojo;
    }
}
