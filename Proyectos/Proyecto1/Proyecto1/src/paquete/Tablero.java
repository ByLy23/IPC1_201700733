/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

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
    public Tablero(int tam, JPanel panel){
        this.tam=tam;
        this.fondo=panel;
        rellenar();
    }
    public void rellenar(){
        
    }
}
