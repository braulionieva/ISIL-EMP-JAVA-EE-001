/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.pagoapp.view;

import java.awt.Font;
import javax.swing.JOptionPane;
import pe.egcc.pagoapp.dto.PagoDto;
import pe.egcc.pagoapp.service.PagoService;

/**
 *
 * @author Alumno-CT
 */
public class PagoView extends javax.swing.JFrame {

    /**
     * Creates new form PagoView
     */
    public PagoView() {
        int LETTER_SIZE = 18;
        String ARIAL = "Arial";
        initComponents();
        this.setTitle("PAGOAPP");
        lblHorasDia.setFont(new Font(ARIAL, Font.PLAIN, LETTER_SIZE));
        lblDias.setFont(new Font(ARIAL, Font.PLAIN, LETTER_SIZE));
        lblPagoHora.setFont(new Font(ARIAL, Font.PLAIN, LETTER_SIZE));
        txtHorasDia.setFont(new Font(ARIAL, Font.PLAIN, LETTER_SIZE));
        txtDias.setFont(new Font(ARIAL, Font.PLAIN, LETTER_SIZE));
        txtPagoHora.setFont(new Font(ARIAL, Font.PLAIN, LETTER_SIZE));
        btnProcesar.setFont(new Font(ARIAL, Font.PLAIN, LETTER_SIZE));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHorasDia = new javax.swing.JLabel();
        lblDias = new javax.swing.JLabel();
        lblPagoHora = new javax.swing.JLabel();
        txtHorasDia = new javax.swing.JTextField();
        txtPagoHora = new javax.swing.JTextField();
        txtDias = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHorasDia.setText("Horas x dia :");

        lblDias.setText("Dias :");

        lblPagoHora.setText("Pago x hora :");

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPagoHora)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHorasDia)
                            .addComponent(lblDias))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPagoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHorasDia, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProcesar))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorasDia)
                    .addComponent(txtHorasDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDias)
                    .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPagoHora)
                    .addComponent(txtPagoHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnProcesar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        //Datos
        if (txtHorasDia.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "INGRESE LAS HORAS POR DIA", "REPORTE", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtDias.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "INGRESE LA CANTIDAD DE DIAS", "REPORTE", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtPagoHora.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "INGRESE EL PAGO POR HORA", "REPORTE", JOptionPane.INFORMATION_MESSAGE);
        } else {
            //Datos
            int horasDia = Integer.parseInt(txtHorasDia.getText());
            int dias = Integer.parseInt(txtDias.getText());
            double pagoHora = Double.parseDouble(txtPagoHora.getText());

            PagoDto dto = new PagoDto(horasDia, dias, pagoHora);

            //Proceso
            PagoService pagoService = new PagoService();
            dto = pagoService.calcularPago(dto);

            //Reporte
            String repo = "";
            //repo += "Ingresos : " + String.format("%.2f", dto.getIngreso()) + "\n";
            //repo += "Renta: " + String.format("%.2f", dto.getRenta()) + "\n";
            //repo += "Neto: " + String.format("%.2f", dto.getNeto()) + "\n";
            repo += "Ingresos : " + dto.getIngreso() + "\n";
            repo += "Renta: " + dto.getRenta() + "\n";
            repo += "Neto: " + dto.getNeto() + "\n";

            JOptionPane.showMessageDialog(rootPane, repo, "REPORTE", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btnProcesarActionPerformed

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
            java.util.logging.Logger.getLogger(PagoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblHorasDia;
    private javax.swing.JLabel lblPagoHora;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtHorasDia;
    private javax.swing.JTextField txtPagoHora;
    // End of variables declaration//GEN-END:variables
}
