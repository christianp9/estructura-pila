/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controller.Estructur;
import java.awt.HeadlessException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.examen;
import model.examestudiante;

/**
 *
 * @author CHRISTIAN
 */
public final class examenVista extends javax.swing.JFrame {

    /**
     * Creates new form examenVista
     */
    DefaultTableModel modeloEst = new DefaultTableModel();
    DefaultTableModel modeloCalif = new DefaultTableModel();

    public examenVista() {
        initComponents();
        panel.setVisible(false);

        try {

            ObjectInputStream exae = new ObjectInputStream(new FileInputStream("ExaEst.ddr"));
            ObjectInputStream exam = new ObjectInputStream(new FileInputStream("examen.ddr"));
            ObjectInputStream examc = new ObjectInputStream(new FileInputStream("calificado.ddr"));
            Estructur.examen = (ArrayList<examen>) exam.readObject();
            Estructur.listae = (ArrayList<examestudiante>) examc.readObject();
            Estructur.pilaExaEst = (Stack<examestudiante>) exae.readObject();

            listar();
            listarCal();
            if (!Estructur.getExamen().isEmpty()) {
                btn_crear.setEnabled(false);
                txt_Codigoexamen.setEnabled(false);
                txt_numeropreguntas.setEnabled(false);
                txttmm.setText(String.valueOf(Estructur.getExamen().get(0).getNumeropreguntas()));
            }
        } catch (IOException | ClassNotFoundException e) {
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Codigo = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        modeloEst.addColumn("Codigo");
        modeloEst.addColumn("Nombre");
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_preguntasbuenas = new javax.swing.JTextField();
        lbl_codigo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_ok = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        modeloCalif.addColumn("codigo");
        modeloCalif.addColumn("nombre");
        modeloCalif.addColumn("preguntasbuenas");
        modeloCalif.addColumn("nota");
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Codigoexamen = new javax.swing.JTextField();
        txt_numeropreguntas = new javax.swing.JTextField();
        btn_crear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txttmm = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        jPanel1.add(txt_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 11, 84, -1));

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 40, 84, -1));

        btn_aceptar.setText("entregar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 170, 120));

        jTable1.setModel(modeloEst);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 260, 240));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("EXAMEN");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Estdiante:");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 50, -1));

        lbl_nombre.setText("xxxx");
        panel.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel6.setText("Codigo: ");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));
        panel.add(txt_preguntasbuenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 90, -1));

        lbl_codigo.setText("xxxx");
        panel.add(lbl_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel8.setText("Preguntas buenas");
        panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        btn_ok.setText("f");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });
        panel.add(btn_ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jPanel2.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 360, 160));

        jButton1.setText("Calificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        jTable2.setModel(modeloCalif);
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 340, 330));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Codigo");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        jLabel7.setText("nunero de preguntas");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        jPanel4.add(txt_Codigoexamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 11, 84, -1));
        jPanel4.add(txt_numeropreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 84, -1));

        btn_crear.setText("crear");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });
        jPanel4.add(btn_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 170, 120));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("EXAMENES");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jLabel10.setText("Numeri de preguntas:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, 20));

        txttmm.setEditable(false);
        jPanel2.add(txttmm, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 40, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed

        try {

            if (txt_Codigo.getText().length() == 0 || txt_nombre.getText().length() == 0) {

                JOptionPane.showMessageDialog(null, "Rellene los campos ", "Error", 0);

            } else {

                examestudiante e = new examestudiante(txt_nombre.getText(), txt_Codigo.getText(), 0, 0);

                Estructur.añadirExaEst(e);

                listar();

                txt_Codigo.setText("");
                txt_nombre.setText("");

            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            if (Estructur.getPilaExaEst().empty()) {

                JOptionPane.showMessageDialog(null, "No hay examen");

            } else {

                panel.setVisible(true);
                
                lbl_nombre.setText(Estructur.getPilaExaEst().peek().getNombreestudiante());
                lbl_codigo.setText(Estructur.getPilaExaEst().peek().getCodigo());

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            ObjectOutputStream exae = new ObjectOutputStream(new FileOutputStream("ExaEst.ddr"));
            ObjectOutputStream exam = new ObjectOutputStream(new FileOutputStream("examen.ddr"));
            ObjectOutputStream examc = new ObjectOutputStream(new FileOutputStream("calificado.ddr"));
            exae.writeObject(Estructur.pilaExaEst);
            exam.writeObject(Estructur.examen);
            examc.writeObject(Estructur.listae);

            this.dispose();

        } catch (IOException e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed

        try {
            if (txt_Codigoexamen.getText().length() == 0 || txt_numeropreguntas.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Rellene");
            } else {

                examen e = new examen(txt_Codigoexamen.getText(), Integer.parseInt(txt_numeropreguntas.getText()));

                Estructur.añadirexamen(e);

                JOptionPane.showMessageDialog(null, "Examen correcto");

                btn_crear.setEnabled(false);
                txt_Codigoexamen.setEnabled(false);
                txt_numeropreguntas.setEnabled(false);
                
                txttmm.setText(txt_numeropreguntas.getText());
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btn_crearActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed

        try {
            if (Estructur.getExamen().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Ha ocurrido un error");

            } else {

                if(Integer.parseInt(txttmm.getText())<Integer.parseInt(txt_preguntasbuenas.getText())){
                    JOptionPane.showMessageDialog(null, "El examen solo tiene "+Estructur.getExamen().get(0).getNumeropreguntas()+" preguntas");
                } else{
                
                double np = Estructur.getExamen().get(0).getNumeropreguntas();
                int pb = Integer.parseInt(txt_preguntasbuenas.getText());
                double vp = 5 / np;
                double notica = vp * pb;

                examestudiante e = new examestudiante(lbl_nombre.getText(), lbl_codigo.getText(), pb, notica);

                Estructur.acalificados(e);

                listarCal();

                Estructur.getPilaExaEst().pop();

                listar();
                
                lbl_codigo.setText("xxxx");
                lbl_nombre.setText("xxxx");
                txt_preguntasbuenas.setText("");
                
                panel.setVisible(false);
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btn_okActionPerformed

    public void examen() {
    }

    public void listar() {

        modeloEst.setNumRows(0);

        String datos[] = new String[2];

        for (int i = 0; i < Estructur.getPilaExaEst().size(); i++) {

            datos[0] = Estructur.getPila(i).getCodigo();
            datos[1] = Estructur.getPila(i).getNombreestudiante();
            modeloEst.addRow(datos);
        }

    }

    public void listarCal() {

        modeloCalif.setNumRows(0);

        String datos[] = new String[4];

        for (int i = 0; i < Estructur.getListae().size(); i++) {

            datos[0] = Estructur.getListae().get(i).getCodigo();
            datos[1] = Estructur.getListae().get(i).getNombreestudiante();
            datos[2] = Integer.toString(Estructur.getListae().get(i).getPreguntasbuenas());
            datos[3] = Double.toString(Estructur.getListae().get(i).getEstado());

            modeloCalif.addRow(datos);
        }

    }

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
            java.util.logging.Logger.getLogger(examenVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(examenVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(examenVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(examenVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new examenVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_crear;
    private javax.swing.JButton btn_ok;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_Codigoexamen;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numeropreguntas;
    private javax.swing.JTextField txt_preguntasbuenas;
    private javax.swing.JTextField txttmm;
    // End of variables declaration//GEN-END:variables
}
