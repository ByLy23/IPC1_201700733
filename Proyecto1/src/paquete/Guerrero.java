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
public class Guerrero {
    public int posicion=0;
    public int equipo=0;
    public ImageIcon EquipoAzulG(int tamy){
        
       ImageIcon gueazul =new ImageIcon(getClass().getResource("/imagenes/Guerrerob.png"));
       Image imagen= gueazul.getImage();
       Image tamimagen=imagen.getScaledInstance(150, tamy, Image.SCALE_SMOOTH);
       gueazul= new ImageIcon(tamimagen);
     
       return gueazul;
    }
    public ImageIcon EquipoRojoG(int tamy){
        
       ImageIcon guerojo =new ImageIcon(getClass().getResource("/imagenes/Guerreror.png"));
       Image imagen= guerojo.getImage();
       Image tamimagen=imagen.getScaledInstance(150, tamy, Image.SCALE_SMOOTH);
       guerojo= new ImageIcon(tamimagen);
     
       return guerojo;
    }
}
