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
public class Interfaz extends javax.swing.JFrame {
 ListaEnlazadaDobleAvion lavion= new ListaEnlazadaDobleAvion();
 NodoAvion avion;   
 /**
     * Creates new form Interfaz
     */
    public static int turno=1;
    public static int desabordaje=0;
    public static int mantenimiento=0;
    public static int pasajero=0;
    public static int Navion;
    public int Nestacion;
    
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
      //  rndr.setVisible(false);
         
    }

    /*
    cuando le de en comenzar solo va a setear el de avion 1 los otros los va a a poner con siguiente mientras el numero sea difertente de 0 
    * if(aviones.gettext!=0){
         aviones.nuevoavion();
         todo el texto en el text area}
    else{
    ya se acabaron los turnos de los aviones}
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        estaciones = new javax.swing.JTextField();
        Inicio = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        aviones = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Aviones");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Estaciones");

        Inicio.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Inicio.setText("Empezar");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });

        Siguiente.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Siguiente.setText("Siguiente");
        Siguiente.setEnabled(false);
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        area.setEditable(false);
        area.setColumns(20);
        area.setRows(5);
        area.setAutoscrolls(false);
        jScrollPane1.setViewportView(area);

        jLabel1.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(32, 32, 32)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(estaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(aviones))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Siguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(aviones, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
      
   //     lav.instertarInicio(, ABORT, ABORT, ICONIFIED, WIDTH);
        if (Navion!=0) {
            
        Navion-=1;  
        ingresaAvion(tomarTamanyo());
lavion.tomarMantenimiento();
lavion.tomarDesabordaje();
        }else{
              System.out.println("fin");
              
        }
        
  area.append(String.valueOf(Navion));
  area.append(System.getProperty("line.separator"));
     System.out.println(Navion);// TODO add your handling code here:
    }//GEN-LAST:event_SiguienteActionPerformed

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
 ListaEnlazadaDobleAvion lave= new ListaEnlazadaDobleAvion();
        if("".equals(aviones.getText()) || "".equals(estaciones.getText())){
            System.out.println("no hay nada");
        }else{
        Navion= Integer.parseInt(aviones.getText());
        Nestacion= Integer.parseInt(estaciones.getText());
        
        aviones.setEnabled(false);
estaciones.setEnabled(false);
Siguiente.setEnabled(true);
Inicio.setEnabled(false);
 ingresaAvion(tomarTamanyo());
 lavion.id(inicioTurno());
        }
        
        //aviones.setEnabled(false);
     //estaciones.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_InicioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
public int tomarTamanyo(){
    int a= (int)(Math.random()*3+1);
jLabel1.setText(String.valueOf(a));
return a;
}
public String ingresaAvion(int a){
    String b= "";
   
    
    switch(a){
        case 1:
            b="peque;o";
            pasajero= (int)(Math.random()*15+1);
            desabordaje=(int)(Math.random()*3+1);
            mantenimiento=(int)(Math.random()*5+1);
          break;
          
        case 2:
            b="mediano";
            pasajero= (int)(Math.random()*15+1);
            desabordaje=(int)(Math.random()*3+1);
            mantenimiento=(int)(Math.random()*5+1);
             break;
          
        case 3: 
            pasajero= (int)(Math.random()*15+1);
            desabordaje=(int)(Math.random()*3+1);
            mantenimiento=(int)(Math.random()*5+1);
            b="grande"; 
      break;
    }
             lavion. insertarFinal(b, pasajero, desabordaje, mantenimiento, turno);
   lavion.recorrer();
    System.out.println(b);
    return b;
}
public int inicioTurno(){
    int b= turno+=1;
    return b;
}

                
                
                
                
           
 
/*public void mostrarAvion(){
    int b=inicioTurno();
    area.append("+++++"+"Turno: "+String.valueOf(b)+"+++++");
            area.append(System.getProperty("line.separator"));
    //area.append("TURNO 1");
    //area.append("El avion 1");
        
    area.append("+++++"+"Fin de Turno: "+String.valueOf(b)+"+++++");
            area.append(System.getProperty("line.separator"));
}*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Inicio;
    private javax.swing.JButton Siguiente;
    public javax.swing.JTextArea area;
    private javax.swing.JTextField aviones;
    private javax.swing.JTextField estaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
