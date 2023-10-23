package rentame;
//Aplicamos los principios de POO como: encapsulamiento*, ocultamiento*, polimorfismo*, herencia*, abstracción*, modularidad*. Y realizar el manejo de excepciones/errores*.
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Rentame extends javax.swing.JFrame {

    private DefaultTableModel model;
    
    
    public Rentame() {
        initComponents();
//Creación campos tabla
        model = new DefaultTableModel();
        model.addColumn("ID Tipo");
        model.addColumn("Placa");
        model.addColumn("Dias");
        model.addColumn("Peso Máx");
        model.addColumn("Valor COP");
        model.addColumn("Tipo");
           
        this.tableData.setModel(model);
    }
    //Inicialización variables
    String Item;
    String tvehiculo;
    String dtvehiculo;
    float dias;
    float pma;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtextmatricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtextndias = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        ingresaDatos = new javax.swing.JButton();
        jtextpeso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        boxUno = new javax.swing.JComboBox<String>();
        acercade = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("Rentame►");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        jLabel2.setText("Menú de Vehículos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        jtextmatricula.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        getContentPane().add(jtextmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 169, 50));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        jLabel3.setText("Número de días");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, -1, -1));

        jtextndias.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jtextndias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextndiasActionPerformed(evt);
            }
        });
        getContentPane().add(jtextndias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 262, 161, 47));

        tableData.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableData);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 375, 340, 110));

        ingresaDatos.setText("Ingresar Datos");
        ingresaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresaDatosActionPerformed(evt);
            }
        });
        getContentPane().add(ingresaDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 320, -1, -1));

        jtextpeso.setEditable(false);
        jtextpeso.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jtextpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextpesoActionPerformed(evt);
            }
        });
        getContentPane().add(jtextpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 262, 169, 47));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        jLabel4.setText("Peso Ton (Para furgoneta/camión)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 242, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel5.setText("Por favor completa los datos para generar la factura ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 96, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 11)); // NOI18N
        jLabel7.setText("Datos de Facturación");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 349, -1, -1));

        boxUno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Coche", "Furgoneta", "Microbus", "Camion" }));
        boxUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxUnoActionPerformed(evt);
            }
        });
        getContentPane().add(boxUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 163, -1));

        acercade.setText("Acerca de");
        acercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercadeActionPerformed(evt);
            }
        });
        getContentPane().add(acercade, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 496, 108, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        jLabel6.setText("Matrícula");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, 20));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        jLabel8.setText("Matrícula");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresaDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaDatosActionPerformed
         //Creación y validación de combobox o valores combobox
        Item= boxUno.getSelectedItem() .toString();
        if (null != Item)switch (Item) {
            case "Coche":
                tvehiculo="1";
                dtvehiculo="Coche";
                break;
            case "Microbus":
                tvehiculo="2";
                dtvehiculo="Microbus";
                break;
            case "Furgoneta":
                tvehiculo="3";
                dtvehiculo="Furgoneta";
                break;
            case "Camion":
                tvehiculo="4";
                dtvehiculo="Camion";
                break;
        }
//Ingreso de datos a la tabla temporal
        String []Datos = new String[6];
        Datos[0] = tvehiculo;
        Datos[1] = jtextmatricula.getText(); 
        jtextmatricula.setText(null);
        Datos[2] = jtextndias.getText(); 
        jtextndias.setText(null);
        Datos[3] = jtextpeso.getText(); 
        jtextpeso.setText(null);
        Datos[5] = dtvehiculo;
        dias = Float.parseFloat(Datos[2]);
        //String pmastring=Datos[3];
//Instancia un método de la clase Vehículo según la selección del usuario en el combobox     
        switch (Datos[0]) {
            case "1":
                Vehiculo c = new Vehiculo();
//Envía parámetro o variable Días de la clase padre Rentame a la clase hijo Vehículo, al instanciar el método coche, ahí estamos aplicando "Herencia"                
                c.coche(dias);
                Datos[4]=c.resulstr; //Inserta cálculo o resultado final en el campo de la tabla
                model.addRow(Datos); //Añade una linea adicional al campo de la tabla
                break;

            case "2":
                Vehiculo mi = new Vehiculo();
                mi.microbus(dias);
                Datos[4]=mi.resulstr;
                model.addRow(Datos);
                break;

            case "3":
                Vehiculo f = new Vehiculo(); 
        {
            try {
                f.furgoneta(dias, Datos[3]);
//  Nos trae el error de Java y lo muestra al usuario durante la ejecución, complementando la parte de "Excepción" que se ingresó en el código de la clase Vehículo.              
            } catch (Exception ex) {
               String ms = ex.getMessage( );
               JOptionPane.showMessageDialog( this, ms );
            }
        }
                Datos[4]=f.resulstr;
                model.addRow(Datos);
                break;

            case "4":                 
                Vehiculo ca = new Vehiculo();
        {
            try {
                ca.camion(dias, Datos[3]);
            } catch (Exception ex) {
               String ms = ex.getMessage( );
               JOptionPane.showMessageDialog( this, ms );
            }
        }
                Datos[4]=ca.resulstr;
                model.addRow(Datos);
                break;

            default:
                JOptionPane.showMessageDialog(rootPane, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ingresaDatosActionPerformed

    private void jtextpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextpesoActionPerformed

    private void jtextndiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextndiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextndiasActionPerformed

    private void boxUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxUnoActionPerformed
//Habilita o deshabilita casillas dependiendo de la opción seleccionada de acuerdo a la "EXCEPCIÓN"
                if(boxUno.getSelectedItem()=="Furgoneta"|| boxUno.getSelectedItem()=="Camion"){
                jtextpeso.setEditable(true);
                jtextpeso.setEnabled(true);
                }else if(boxUno.getSelectedItem()=="Coche"|| boxUno.getSelectedItem()=="Microbus"){
                jtextpeso.setEditable(false);
                jtextpeso.setEnabled(false);
            }
    }//GEN-LAST:event_boxUnoActionPerformed

    private void acercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercadeActionPerformed
   Acerca vacerca = new Acerca();
   vacerca.setVisible(true);

    }//GEN-LAST:event_acercadeActionPerformed

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
            java.util.logging.Logger.getLogger(Rentame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rentame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rentame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rentame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rentame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acercade;
    private javax.swing.JComboBox<String> boxUno;
    private javax.swing.JButton ingresaDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jtextmatricula;
    private javax.swing.JTextField jtextndias;
    private javax.swing.JTextField jtextpeso;
    private javax.swing.JTable tableData;
    // End of variables declaration//GEN-END:variables

    private static class txtComboBoxItem {

        public txtComboBoxItem() {
        }
    }
}
