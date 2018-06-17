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
public class Princesa {
     public int posicion=0;
    public int equipo=0;
    public ImageIcon EquipoAzulPR(int tamx,int tamy){
        
       ImageIcon prazul =new ImageIcon(getClass().getResource("/imagenes/Guerrerab.png"));
       Image imagen= prazul.getImage();
       Image tamimagen=imagen.getScaledInstance(150, tamy, Image.SCALE_SMOOTH);
       prazul= new ImageIcon(tamimagen);
     
       return prazul;
    }
    public ImageIcon EquipoRojoPR(int tamx,int tamy){
        
       ImageIcon prrojo =new ImageIcon(getClass().getResource("/imagenes/Guerrerar.png"));
       Image imagen= prrojo.getImage();
       Image tamimagen=imagen.getScaledInstance(150, tamy, Image.SCALE_SMOOTH);
       prrojo= new ImageIcon(tamimagen);
     
       return prrojo;
    }
}
