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
public class NodoAvion {
    private String tamanyo;
    private int pasajeros=1;//privisional de clase pasajero
    private int desabordaje=1;
    private int mantenimiento=1;
    public NodoAvion ant;
    public NodoAvion sig;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public NodoAvion(String tam, int pas, int des, int mant,int id){
        this.tamanyo=tam;
        this.pasajeros=pas;
        this.mantenimiento=mant;
        this.id=id;
        this.desabordaje=des;
        this.ant= null;
        this.sig=null;
    }

    public String getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(String tamanyo) {
        this.tamanyo = tamanyo;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getDesabordaje() {
        return desabordaje;
    }

    public void setDesabordaje(int desabordaje) {
        this.desabordaje = desabordaje;
    }

    public int getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(int mantenimiento) {
        this.mantenimiento = mantenimiento;
    }


    
}
