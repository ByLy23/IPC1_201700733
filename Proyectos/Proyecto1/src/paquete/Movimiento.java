/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author byron
 */
public class Movimiento extends Thread {       
    public Movimiento(){
        
    }
}
//Movimiento turno 1
class MovTurn1 extends Thread{
     public int cantidad=0;
    public Tablero tab=null;
    public int posx;
    public int posy;
    public int control=0;
    public MovTurn1(){
        
    }
    public MovTurn1(int cantidad, Tablero tab, int posx, int posy){
        Mago mago= new Mago();
        Princesa princesa= new Princesa();
        Guerrero guerrero= new Guerrero();
        this.cantidad=cantidad;
        this.tab=tab;
        this.posx=posx;
        this.posy=posy;
    }
     public boolean comprobarFin(){
        if (posx>=tab.tam-1 || posy>=tab.tam-1){
            return true;        }else{
        return false;}
    }
       public void moverAbajo(int cantidad) throws InterruptedException{
        if (cantidad<=0) {
            
            return;
        }
       if (comprobarFin()) {
            cantidad=0;
            tab.matrizL[tab.tam-1][posy]=0;
            tab.matrizG[tab.tam-1][posy].setIcon(null);
            if("Mago".equals(Vista.P1J1.getText()) || "Princesa".equals(Vista.P1J1.getText()) || "Guerrero".equals(Vista.P1J1.getText())){
                tab.matrizL[posy][posx]=0;
            }
            tab.repintar();
            return;
        }else{
            //mover una posicion
            if ("Mago".equals(Vista.P1J1.getText())) {
               tab.matrizL[tab.mago.posicion][posy]=0;
            tab.matrizG[tab.mago.posicion][posy].setIcon(null);
           }else if ("Princesa".equals(Vista.P1J1.getText())) {
               tab.matrizL[tab.princesa.posicion][posy]=0;
            tab.matrizG[tab.princesa.posicion][posy].setIcon(null);
           }else if ("Guerrero".equals(Vista.P1J1.getText())) {
               tab.matrizL[tab.guerrero.posicion][posy]=0;
            tab.matrizG[tab.guerrero.posicion][posy].setIcon(null);
           }
            tab.repintar();
             if ("Mago".equals(Vista.P1J1.getText())) {
                tab.mago.posicion+=1;
            tab.matrizL[tab.mago.posicion][posy]=4;
           
           }else if ("Princesa".equals(Vista.P1J1.getText())) {
               
             tab.princesa.posicion+=1;
            tab.matrizL[posy][tab.princesa.posicion]=8;
           }else if ("Guerrero".equals(Vista.P1J1.getText())) {
                tab.princesa.posicion+=1;
            tab.matrizL[posy][tab.princesa.posicion]=6;
           
           }
          
            tab.repintar();
            cantidad--;
            Thread.sleep(500);//solo hace que se detenga la vista del movimiento
            moverAbajo(cantidad);
            
        }
    
}
       public void run(){
         try {
             moverAbajo(cantidad);
         } catch (InterruptedException ex) {
             Logger.getLogger(MovTurn1.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
}//que recorra la variable y si el valor de esta es de 4 8 o 6 que se enfoque en el

 /*
    public boolean comprobarFin(){
        if (tab.guerrero.posicion>=tab.tam-1){
            return true;        }else{
        return false;}
    }
    public boolean comprobarInicio(){
        if (tab.guerrero.posicion<=0) {
            return true;
        }
        return false;
    }
  
    public void moverAbajo(int cantidad) throws InterruptedException{
        if (cantidad<=0) {
            
            return;
        }
    }
    
       if (comprobarFin()) {
            cantidad=0;
            tab.matrizL[][tab.tam-1]=0;
            tab.vecG[tab.tam-1].setIcon(null);
            tab.per.posponer=0;
            tab.vecL[0]=1;
            tab.repintar();
            return;
        }else{
            //mover una posicion
            tab.vecL[tab.per.posponer]=0;
            tab.vecG[tab.per.posponer].setIcon(null);
            tab.repintar();
            tab.per.posponer+=1;
            tab.vecL[tab.per.posponer]=1;
            tab.repintar();
            cantidad--;
            Thread.sleep(500);//solo hace que se detenga la vista del movimiento
            moverAbajo(cantidad);
            
        }
    }
    public void moverArriba(int cantidad) throws InterruptedException{
        if (cantidad<=0) {
            
            System.out.println("soy el final");
            return;
        }
        if (comprobarInicio()) {
            cantidad=0;
            
            tab.vecL[0]=0;
            tab.vecG[0].setIcon(null);
            tab.per.posponer=tab.tam-1;
            tab.vecL[tab.tam-1]=1;
            tab.repintar();
            return;
        }else{
            //mover una posicion
            tab.vecL[tab.per.posponer]=0;
            tab.vecG[tab.per.posponer].setIcon(null);
            tab.repintar();
            tab.per.posponer-=1;
            tab.vecL[tab.per.posponer]=1;
            tab.repintar();
            cantidad--;
            Thread.sleep(500);//solo hace que se detenga la vista del movimiento
            moverArriba(cantidad);
        }
    }
    public void run(){
        try {
            
            switch(control){
                case 0: System.out.println(control); break;
                case 1:
                    moverAbajo(cantidad);
                    break;
                case 2:
                    moverArriba(cantidad);
                    break;
                default:   return;         }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
*/

