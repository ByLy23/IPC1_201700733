/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author byron
 */
public class Dado {
    private int cantidad=0;
    public Dado(){
        
    }
    public int tirarDado(){
        int cant= (int)(Math.random()*6+1);
        return cant;
    }
    
    //Imagenes 
}
