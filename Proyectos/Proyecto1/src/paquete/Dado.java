/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.*;

/**
 *
 * @author byron
 */
public class Dado {
  
    private int cantidad=0;
    private JLabel labelG;
    private JPanel panel;
    private int cant;
    public Dado(){
        
    }
    public Dado(JPanel panel){
        this.panel=panel;
    }
    public int tirarDado(){
         cant= (int)(Math.random()*6+1);
        return cant;
    }
    public void pintar(int numero){
        JLabel cantdado;
        switch(numero){
            case 1:
                cantdado= new JLabel(Dado1()); 
                cantdado.setOpaque(false);
                cantdado.setBorder(BorderFactory.createLineBorder(new Color(78,125,0)));
            cantdado.setBounds(0, 0, 150, 150);
            labelG= cantdado;
            panel.add(labelG,BorderLayout.CENTER);
            panel.repaint();
                break;
            case 2:
                 cantdado= new JLabel(Dado2()); 
                cantdado.setOpaque(false);
                cantdado.setBorder(BorderFactory.createLineBorder(new Color(78,125,0)));
            cantdado.setBounds(0, 0, 150, 150);
            labelG= cantdado;
            panel.add(labelG,BorderLayout.CENTER);
            panel.repaint();
            break;
                case 3:
                 cantdado= new JLabel(Dado3()); 
                cantdado.setOpaque(false);
                cantdado.setBorder(BorderFactory.createLineBorder(new Color(78,125,0)));
            cantdado.setBounds(0, 0, 150, 150);
            labelG= cantdado;
            panel.add(labelG,BorderLayout.CENTER);
            panel.repaint();
            break;
            case 4:
                  cantdado= new JLabel(Dado4()); 
                cantdado.setOpaque(false);
                cantdado.setBorder(BorderFactory.createLineBorder(new Color(78,125,0)));
            cantdado.setBounds(0, 0, 150, 150);
            labelG= cantdado;
            panel.add(labelG,BorderLayout.CENTER);
            panel.repaint();
            break;
                case 5:
                 cantdado= new JLabel(Dado5()); 
                cantdado.setOpaque(false);
                cantdado.setBorder(BorderFactory.createLineBorder(new Color(78,125,0)));
            cantdado.setBounds(0, 0, 150, 150);
            labelG= cantdado;
            panel.add(labelG,BorderLayout.CENTER);
            panel.repaint();
            break;
            case 6:
                  cantdado= new JLabel(Dado6()); 
                cantdado.setOpaque(false);
                cantdado.setBorder(BorderFactory.createLineBorder(new Color(78,125,0)));
            cantdado.setBounds(0, 0, 150, 150);
            labelG= cantdado;
            panel.add(labelG,BorderLayout.CENTER);
            panel.repaint();
            break;
            default: break;
                
        }
        
    }
    //Imagenes para cantidad
     public ImageIcon Dado1(){
        
       ImageIcon d1 =new ImageIcon(getClass().getResource("/imagenes/1.png"));
       Image imagen= d1.getImage();
       Image tamimagen=imagen.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
       d1= new ImageIcon(tamimagen);
     
       return d1;
    }
     public ImageIcon Dado2(){
        
       ImageIcon d1 =new ImageIcon(getClass().getResource("/imagenes/2.png"));
       Image imagen= d1.getImage();
       Image tamimagen=imagen.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
       d1= new ImageIcon(tamimagen);
     
       return d1;
    }
     public ImageIcon Dado3(){
        
       ImageIcon d1 =new ImageIcon(getClass().getResource("/imagenes/3.png"));
       Image imagen= d1.getImage();
       Image tamimagen=imagen.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
       d1= new ImageIcon(tamimagen);
     
       return d1;
    }
     public ImageIcon Dado4(){
        
       ImageIcon d1 =new ImageIcon(getClass().getResource("/imagenes/4.png"));
       Image imagen= d1.getImage();
       Image tamimagen=imagen.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
       d1= new ImageIcon(tamimagen);
     
       return d1;
    }
     public ImageIcon Dado5(){
        
       ImageIcon d1 =new ImageIcon(getClass().getResource("/imagenes/5.png"));
       Image imagen= d1.getImage();
       Image tamimagen=imagen.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
       d1= new ImageIcon(tamimagen);
     
       return d1;
    }
     public ImageIcon Dado6(){
        
       ImageIcon d1 =new ImageIcon(getClass().getResource("/imagenes/6.png"));
       Image imagen= d1.getImage();
       Image tamimagen=imagen.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
       d1= new ImageIcon(tamimagen);
     
       return d1;
    }
}
