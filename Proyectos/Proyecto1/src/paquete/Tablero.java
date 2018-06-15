/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author byron
 */
public class Tablero {
    public int tam=0;
    public JPanel fondo=null;
    public int[][] matrizL;
    public Mago mago;
    public JLabel[][] matrizG;
    public int tambx=0;
    public int tamby=0;
    public int rndx=0;
    public int rndy=0;
    public Tablero(int tam, JPanel panel){
        this.tam=tam;
        this.fondo=panel;
        rellenar();
    }
    public void posicionRandom(){
        
    }
    public void colocarVidas(){
        
    }
    public void rellenar(){
        tambx= 600/tam;
        tamby= 450/tam;
        rndx= (int)(Math.random()*tam);
        rndy=(int)(Math.random()*tam);
        matrizL= new int[tam][tam];
        matrizG= new JLabel[tam][tam];
        //1 persona, o casiilas vacias       
        mago= new Mago();
        //mago.posicion=0;
        for (int i = 1; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matrizL[i][j]=0;
                 matrizL[rndx][rndy]=1;
            }
        }
        repintar();
    }
    public void repintar(){
        JLabel casilla= null;
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (matrizL[i][j]==0){
                    casilla= new JLabel();
                }
                else{
                    casilla= new JLabel(this.mago.EquipoRojoM(tambx,tamby));
                }
                casilla.setOpaque(false);
                casilla.setBorder(BorderFactory.createLineBorder(new Color(78,125,0)));
            casilla.setBounds(j*tambx, i*tamby, tambx, tamby);
            matrizG[i][j]= casilla;
            fondo.add(matrizG[i][j],BorderLayout.CENTER);
            fondo.repaint();
            }
            
        }
    }
}
