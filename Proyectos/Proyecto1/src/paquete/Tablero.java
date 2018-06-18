
package paquete;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class Tablero {
    public int tam=0;
    public JPanel fondo=null;
    public int[][] matrizL;
    public Mago mago;
    public Guerrero guerrero;
    public Princesa princesa;
    public Corazon corazon;
    public Bomba bomba;
    public JLabel[][] matrizG;
    public int tambx=0;
    public int tamby=0;
    public int rndx=0;
    public int rndy=0;
    public int vlx=0;
    public int vly=0;
    public int turno=1;
    public int[] cantVidas;
    public int[] cantBombas;
    MovTurn1 mov= new MovTurn1();
    public Tablero(int tam, JPanel panel){
        this.tam=tam;
        this.fondo=panel;
        rellenar();
    }
    public int rndx(){
        
        rndx= (int)(Math.random()*tam);
        return rndx;
    }
    public int rndy(){
     rndy=(int)(Math.random()*tam);
     return rndy;
    }
    public void rellenar(){
        tambx= 600/tam;
        tamby= 450/tam;
        matrizL= new int[tam][tam];
        matrizG= new JLabel[tam][tam];
        //1 persona, o casiilas vacias       
        mago= new Mago();
        guerrero= new Guerrero();
        princesa= new Princesa();
        //mago.posicion=0;
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matrizL[i][j]=0;
         
            }
        }
        
       agregarBombas();
        agregarVidas();
        agregarPersonajes();
        repintar();
    }
    public void repintar(){
        JLabel casilla= null;
        
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (matrizL[i][j]==0){
                    casilla= new JLabel();
                }
                else if(matrizL[i][j]==1){                  
                    casilla= new JLabel(this.corazon.Corazon(tambx, tambx));
                }else if(matrizL[i][j]==2){
                    casilla= new JLabel(this.bomba.Bomba(tambx, tamby));
                }
                else if(matrizL[i][j]==3){
                    casilla= new JLabel(this.mago.EquipoRojoM(tambx,tamby));
                }
                else if(matrizL[i][j]==4){
                    casilla= new JLabel(this.mago.EquipoAzulM(tambx,tamby));
                }
                else if(matrizL[i][j]==5){
                    casilla= new JLabel(this.guerrero.EquipoRojoG(tambx,tamby));
                }
                else if(matrizL[i][j]==6){
                    casilla= new JLabel(this.guerrero.EquipoAzulG(tambx,tamby));
                }else if(matrizL[i][j]==7){
                    casilla= new JLabel(this.princesa.EquipoRojoPR(tambx,tamby));
                }else if(matrizL[i][j]==8){
                    casilla= new JLabel(this.princesa.EquipoAzulPR(tambx,tamby));
                }
                casilla.setOpaque(false);
                casilla.setBorder(BorderFactory.createLineBorder(new Color(0,43,113)));
            casilla.setBounds(j*tambx, i*tamby, tambx, tamby);
            matrizG[i][j]= casilla;
            fondo.add(matrizG[i][j],BorderLayout.CENTER);
            fondo.repaint();
            }
            
        }
    }

    public void agregarPersonajes(){//pares para personaje 1, impares para personaje 2
        //solo para p1
        if("Mago".equals(Vista.P1J1.getText())){
            
          matrizL[rndx()][rndy()]= 4;
            vlx= psxT1P1(rndx);
            vly= psyT1P1(rndy);
            System.out.println(rndx+","+rndy);
          turno=1;
      }else if("Princesa".equals(Vista.P1J1.getText())){
          
          matrizL[rndx()][rndy()]= 8;
          turno=1;
            System.out.println(rndx+","+rndy);
            psxT1P2(rndx);
            psyT1P2(rndy);
      }else if("Guerrero".equals(Vista.P1J1.getText())){
          
          matrizL[rndx()][rndy()]= 6;
          turno=1;
            System.out.println(rndx+","+rndy);
            psxT1P3(rndx);
            psyT1P3(rndy);
      }
      //solo para p2
      if("Mago".equals(Vista.P2J1.getText())){
          
          matrizL[rndx()][rndy()]= 4;
            System.out.println(rndx+","+rndy);
          turno=3;
      }else if("Princesa".equals(Vista.P2J1.getText())){
          matrizL[rndx()][rndy()]= 8;
            System.out.println(rndx+","+rndy);
          turno=3;
      }else if("Guerrero".equals(Vista.P2J1.getText())){
          matrizL[rndx()][rndy()]= 6;
            System.out.println(rndx+","+rndy);
          turno=3;
      }//solo para p3
       if("Mago".equals(Vista.P3J1.getText())){
          matrizL[rndx()][rndy()]= 4;
            System.out.println(rndx+","+rndy);
          turno=5;
      }else if("Princesa".equals(Vista.P3J1.getText())){
          matrizL[rndx()][rndy()]= 8;
            System.out.println(rndx+","+rndy);
          turno=5;
      }else if("Guerrero".equals(Vista.P3J1.getText())){
          matrizL[rndx()][rndy()]= 6;
            System.out.println(rndx+","+rndy);
          turno=5;
      }
       //para J2
        //solo para p1
        if("Mago".equals(Vista.P1J2.getText())){
          matrizL[rndx()][rndy()]= 3;
            System.out.println(rndx+","+rndy);
          turno= 2;
      }else if("Princesa".equals(Vista.P1J2.getText())){
          matrizL[rndx()][rndy()]= 7;
          turno= 2;
      }else if("Guerrero".equals(Vista.P1J2.getText())){
          matrizL[rndx()][rndy()]= 5;
          turno= 2;
      }
      //solo para p2
      if("Mago".equals(Vista.P2J2.getText())){
          matrizL[rndx()][rndy()]= 3;
            System.out.println(rndx+","+rndy);
          turno= 4;
      }else if("Princesa".equals(Vista.P2J2.getText())){
          matrizL[rndx()][rndy()]= 7;
          turno= 4;
      }else if("Guerrero".equals(Vista.P2J2.getText())){
          matrizL[rndx()][rndy()]= 5;
          turno= 4;
      }//solo para p3
       if("Mago".equals(Vista.P3J2.getText())){
          matrizL[rndx()][rndy()]= 3;
            System.out.println(rndx+","+rndy);
          turno= 6;
      }else if("Princesa".equals(Vista.P3J2.getText())){
          matrizL[rndx()][rndy()]= 7;
          turno= 6;
      }else if("Guerrero".equals(Vista.P3J2.getText())){
          matrizL[rndx()][rndy()]= 5;
          turno= 6;
      }
      
    }
    public void agregarVidas(){
        int cantVida= (int)(0.05*tam*tam);
        corazon= new Corazon();
        cantVidas= new int[cantVida];
                for (int k = 0; k < cantVida; k++) {
            matrizL[rndx()][rndy()]=1;
           
        }
    }
    public void agregarBombas(){
        int cantBomba= (int)(0.1*tam*tam);
        cantBombas= new int[cantBomba];
            bomba= new Bomba();
        for (int i = 0; i < cantBomba; i++) {   
            matrizL[rndx()][rndy()]=2;          
            }
            
    }
     public int psxT1P1(int a){
     return a;
 }
 public int psyT1P1(int a){
     return a;
 }
 public int psxT1P2(int a){
     return a;
 }
 public int psyT1P2(int a){
     return a;
 }
 public int psxT1P3(int a){
     return a;
 }
 public int psyT1P3(int a){
     return a;
 }
}
