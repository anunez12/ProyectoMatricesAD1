/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SP
 */
public class ProyectoMatrices1 extends javax.swing.JFrame {

    /**
     * Creates new form ProyectoMatrices1
     */
    public ProyectoMatrices1() {
        initComponents();

        JButton botonesHabilitar[] = {cmdCrear, cmdBorrar};
        JButton botonesDesabilitar[] = {cmdManual, cmdAuto, cmdOperacion};

        Helper.habilitarBotones(botonesHabilitar);
        Helper.deshabilitarBotones(botonesDesabilitar);
    }

    /**     
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFilas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtColumnas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmdAuto = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();
        cmbOperacion = new javax.swing.JComboBox();
        Cuc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calisto MT", 2, 18)); // NOI18N
        jLabel1.setText("Proyecto Matrices");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 130, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Iniciales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 204, 51))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Filas");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 34, -1, -1));

        txtFilas.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtFilas.setForeground(new java.awt.Color(255, 153, 153));
        txtFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFilasKeyTyped(evt);
            }
        });
        jPanel2.add(txtFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 50, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 102, 255));
        jLabel3.setText("Columnas");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 70, 60, -1));

        txtColumnas.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtColumnas.setForeground(new java.awt.Color(153, 255, 102));
        txtColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColumnasKeyTyped(evt);
            }
        });
        jPanel2.add(txtColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 50, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, 110));

        jPanel3.setBackground(new java.awt.Color(204, 102, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones Matriz", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 51))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdCrear.setForeground(new java.awt.Color(255, 102, 255));
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, -1));

        cmdManual.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdManual.setForeground(new java.awt.Color(102, 102, 102));
        cmdManual.setText("Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, -1));

        cmdAuto.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdAuto.setForeground(new java.awt.Color(0, 51, 51));
        cmdAuto.setText("Automatico");
        cmdAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, -1));

        cmdOperacion.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdOperacion.setForeground(new java.awt.Color(102, 0, 153));
        cmdOperacion.setText("Operacion");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel3.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, -1));

        cmdBorrar.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdBorrar.setForeground(new java.awt.Color(153, 153, 0));
        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, -1));

        cmdSalir.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdSalir.setForeground(new java.awt.Color(255, 0, 0));
        cmdSalir.setText("Salir");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        jPanel3.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 160, 280));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTablaInicial.setEnabled(false);
        jScrollPane1.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 200));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTablaResultado.setEnabled(false);
        jScrollPane2.setViewportView(tblTablaResultado);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, 270));

        cmbOperacion.setBackground(new java.awt.Color(153, 153, 153));
        cmbOperacion.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmbOperacion.setForeground(new java.awt.Color(153, 0, 255));
        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Diagonal Secundaria", "Triangular Superior ", "Triangular Inferior", "Matriz Traspuesta ", "A", "Z", "T", "V", "E ", "F ", "P", "I ", "N", "Y", "X" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 180, -1));

        Cuc.setBackground(new java.awt.Color(0, 204, 204));
        Cuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/cuc (1).jpg"))); // NOI18N
        Cuc.setText("jLabel5");
        jPanel1.add(Cuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(936, 595));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        int numcolumnas, numfilas;

        numcolumnas = tblTablaInicial.getColumnCount();
        numfilas = tblTablaInicial.getRowCount();
        DefaultTableModel tm, tm2;

        txtFilas.setText("");
        txtColumnas.setText("");
        txtFilas.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);

        Helper.porDefectoTabla(tblTablaInicial);
        Helper.porDefectoTabla(tblTablaResultado);

        JButton botonesHabilitar[] = {cmdCrear, cmdBorrar};
        JButton botonesDesabilitar[] = {cmdAuto, cmdManual, cmdOperacion};

        Helper.habilitarBotones(botonesHabilitar);
        Helper.deshabilitarBotones(botonesDesabilitar);

    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int nf, nc;

        DefaultTableModel tm, tm2;

        nf = Integer.parseInt(txtFilas.getText());
        nc = Integer.parseInt(txtColumnas.getText());

        tm = (DefaultTableModel) tblTablaInicial.getModel();
        tm2 = (DefaultTableModel) tblTablaResultado.getModel();

        tm.setRowCount(nf);
        tm.setColumnCount(nc);

        tm2.setRowCount(nf);
        tm2.setColumnCount(nc);

        JButton botonesH[] = {cmdManual, cmdAuto, cmdBorrar};
        JButton botonesD[] = {cmdCrear, cmdOperacion};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed
        int numfilas, numcolumnas;
        int n;
        int sw, res;

        numcolumnas = tblTablaInicial.getColumnCount();
        numfilas = tblTablaInicial.getRowCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                do {
                    sw = 1;
                    try {
                        n = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el elemento en la posición [" + i + "]" + "[" + j + "]").trim());
                        tblTablaInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        Helper.mensajeMatriz(this, "Digite un número válido", 3);
                        sw = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        if (res == 0) {
                            sw = 1;
                            i = numfilas;
                            j = numcolumnas;

                            Helper.porDefectoTabla(tblTablaInicial);
                            Helper.porDefectoTabla(tblTablaResultado);
                        } else {
                            sw = 0;
                        }
                    }
                } while (sw == 0);
            }
        }
        JButton botonesHabilitar[] = {cmdOperacion, cmdBorrar};
        JButton botonesDesabilitar[] = {cmdCrear, cmdManual, cmdAuto};

        Helper.habilitarBotones(botonesHabilitar);
        Helper.deshabilitarBotones(botonesDesabilitar);


    }//GEN-LAST:event_cmdManualActionPerformed

    private void cmdAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutoActionPerformed
        int nf, nc, n;

        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaInicial.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(n, i, j);
            }
        }
        JButton botonesHabilitar[] = {cmdOperacion, cmdBorrar};
        JButton botonesDesabilitar[] = {cmdCrear, cmdAuto, cmdManual};

        Helper.habilitarBotones(botonesHabilitar);
        Helper.deshabilitarBotones(botonesDesabilitar);
    }//GEN-LAST:event_cmdAutoActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed
        int numfilas, numcolumnas, operacion;

        numfilas = Integer.parseInt(txtFilas.getText());
        numcolumnas = Integer.parseInt(txtColumnas.getText());
        operacion = cmbOperacion.getSelectedIndex();
        Helper.limpiadoTabla(tblTablaResultado);

        switch (operacion) {
            case 0:
                Helper.diagonalSecundaria(tblTablaInicial, tblTablaResultado);
                break;
            case 1:
                Helper.triangularSuperior(tblTablaInicial, tblTablaResultado);
                break;
            case 2:
                Helper.triangularInferior(tblTablaInicial, tblTablaResultado);
                break;
            case 3:
                Helper.transpuesta(tblTablaInicial, tblTablaResultado);
                break;
            case 4:
                Helper.letraA(tblTablaInicial, tblTablaResultado);
                break;
            case 5:
                Helper.letraZ(tblTablaInicial, tblTablaResultado);
                break;
            case 6:
                Helper.letraT(tblTablaInicial, tblTablaResultado);
                break;
            case 7:
                Helper.letraV(tblTablaInicial, tblTablaResultado);
                break;
            case 8:
                Helper.letraE(tblTablaInicial, tblTablaResultado);
                break;
            case 9:
                Helper.letraF(tblTablaInicial, tblTablaResultado);
                break;
            case 10:
                Helper.letraP(tblTablaInicial, tblTablaResultado);
                break;
            case 11:
                Helper.letraI(tblTablaInicial, tblTablaResultado);
                break;
            case 12:
                Helper.letraN(tblTablaInicial, tblTablaResultado);
                break;
            case 13:
                Helper.letraY(tblTablaInicial, tblTablaResultado);
                break;
            case 14:
                Helper.letraX(tblTablaInicial, tblTablaResultado);
                break;
        }
        JButton botonesHabilitar[] = {cmdOperacion, cmdBorrar};
        JButton botonesDesabilitar[] = {cmdAuto, cmdManual};

        Helper.habilitarBotones(botonesHabilitar);
        Helper.deshabilitarBotones(botonesDesabilitar);
   
    }//GEN-LAST:event_cmdOperacionActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        System.exit(0);

    }//GEN-LAST:event_cmdSalirActionPerformed

    private void txtFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilasKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isSpaceChar(c) || !Character.isDigit(c)) {
            getToolkit();
            evt.consume();
        }
    }//GEN-LAST:event_txtFilasKeyTyped

    private void txtColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColumnasKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isSpaceChar(c) || !Character.isDigit(c)) {
            getToolkit();
            evt.consume();
        }
    }//GEN-LAST:event_txtColumnasKeyTyped

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
            java.util.logging.Logger.getLogger(ProyectoMatrices1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectoMatrices1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoMatrices1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectoMatrices1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectoMatrices1().setVisible(true);
            } 
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cuc;
    private javax.swing.JComboBox cmbOperacion;
    private javax.swing.JButton cmdAuto;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    // End of variables declaration//GEN-END:variables
}
