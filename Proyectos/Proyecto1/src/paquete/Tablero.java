/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Arrays;
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
    public Corazon corazon;
    public Bomba bomba;
    public JLabel[][] matrizG;
    public int tambx=0;
    public int tamby=0;
    public int rndx=0;
    public int rndy=0;
    public int[] cantVidas;
    public int[] cantBombas;
    public Tablero(int tam, JPanel panel){
        this.tam=tam;
        this.fondo=panel;
        rellenar();
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
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matrizL[i][j]=0;
                 matrizL[rndx][rndy]=1;
                
            }
        }
        agregarCorazones();
        agregarBombas();
        repintar();
    }
    public void repintar(){
        JLabel casilla= null;
        int cantVida= (int)(0.05*tam*tam);
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (matrizL[i][j]==0){
                    casilla= new JLabel();
                }else if(matrizL[i][j]==2){                  
                    casilla= new JLabel(this.corazon.Corazon(tambx, tambx));
                }else if(matrizL[i][j]==3){
                    casilla= new JLabel(this.bomba.Bomba(tambx, tamby));
                }
                else if(matrizL[i][j]==1){
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
    public void agregarCorazones(){
       int cantVida= (int)(0.05*tam*tam);
        rndx= (int)(Math.random()*tam);
     rndy=(int)(Math.random()*tam);
        cantVidas= new int[cantVida];
        for (int i = 0; i < cantVida; i++) {
            corazon= new Corazon();
            matrizL[rndx][rndy]=2;
           // corazon= new Corazon[cantVida];
        }
      /*  for (int i = 0; i < cantVidas; i++) {
            for (int j = 0; j < cantVidas; j++) {
                
            }
        }*/
    }
    public void agregarBombas(){
        int cantBomba= (int)(0.1*tam*tam);
        rndx= (int)(Math.random()*tam);
     rndy=(int)(Math.random()*tam);
        cantBombas= new int[cantBomba];
        for (int i = 0; i < cantBomba; i++) {
            matrizL[rndx][rndy]=3;
            bomba= new Bomba();
        }
    }
}
