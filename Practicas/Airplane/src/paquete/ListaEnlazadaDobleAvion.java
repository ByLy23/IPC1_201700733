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
public class ListaEnlazadaDobleAvion {
    public NodoAvion avion;
    private static int id;
    

    public void insertarInicio(String tipo, int pasajero, int desabordaje, int mantenimiento, int id){
       this.id=id;
       NodoAvion nuevo= new NodoAvion(tipo, pasajero, desabordaje, mantenimiento, id);
        if (avion==null) {
            avion=nuevo;
        }else{
            nuevo.sig=avion;
            avion.ant=nuevo;
            avion=nuevo;
        }
    }
    public void insertarFinal(String tipo, int pasajero, int desabordaje, int mantenimiento, int id ){
        NodoAvion nuevo= new NodoAvion(tipo, pasajero, desabordaje, mantenimiento, id);
        if (avion==null) {
            avion=nuevo;
        }else{
            NodoAvion aux= avion;
            while  (aux.sig!=null){
                aux=aux.sig;
            }
            aux.sig=nuevo;
            nuevo.ant=aux;
        }
    }//subgrafos
 public void recorrer(){
     if (avion==null) {
            System.out.println("ListA vaCia");
        }else
        {
              
            NodoAvion aux= avion;
            System.out.println();
            while(aux!=null){
                System.out.println("-------------------------------");
                System.out.println("Avion"+""+aux.getId() );
                System.out.println("Tipo: "+aux.getTamanyo());
                System.out.println("Pasajeros: "+""+aux.getPasajeros() );
                System.out.println("Turnos desabordaje: "+aux.getDesabordaje() );
                System.out.println("Turnos Mantenimiento: "+aux.getMantenimiento() );
                System.out.println("++++++++++++++++++++++++++++++++++");
                System.out.println("");
                aux=aux.sig;   
            }
            System.out.println("");
        }
    }
public int tomarDesabordaje(){
    NodoAvion aux= avion;
    int a=0;
    if(aux.getDesabordaje()!=0){
        while(aux!=null){
        a= aux.getDesabordaje()-1;
        aux.setDesabordaje(a);
      aux= aux.sig;}
    }
     return a;
}
public int tomarMantenimiento(){
    NodoAvion aux= avion;
    int a=0;
     if(aux.getMantenimiento()!=0){
         while(aux!=null){
        a= aux.getMantenimiento()-1; 
        
     aux.setMantenimiento(a);
     aux=aux.sig;
         }}
     else{ 
         System.out.println("Cambio a mantenimiento");
     }
    return a;
}
public int id(int a){
    return a;
}
}