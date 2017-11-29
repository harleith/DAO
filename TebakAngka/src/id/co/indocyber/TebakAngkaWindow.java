package id.co.indocyber;

import javax.swing.JOptionPane;

public class TebakAngkaWindow extends javax.swing.JFrame {

       int angkaSoal;
    public TebakAngkaWindow() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AngkaSoal = new javax.swing.JButton();
        Petunjuk = new javax.swing.JLabel();
        inputAngkaUntukUserTextField = new javax.swing.JTextField();
        cekAngkaButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\oh-boy.png")); // NOI18N

        AngkaSoal.setText("Mulai");
        AngkaSoal.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                AngkaSoalAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        AngkaSoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AngkaSoalActionPerformed(evt);
            }
        });

        Petunjuk.setText("Klik Tombol Mulai");

        inputAngkaUntukUserTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAngkaUntukUserTextFieldActionPerformed(evt);
            }
        });

        cekAngkaButton.setText("Are You Sure?");
        cekAngkaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekAngkaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputAngkaUntukUserTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Petunjuk, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cekAngkaButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(AngkaSoal)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AngkaSoal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Petunjuk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputAngkaUntukUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cekAngkaButton)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AngkaSoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AngkaSoalActionPerformed
        // TODO add your handling code here:
        angkaSoal = generateAngka();
        Petunjuk.setText("Masukan angka antara 1 - 100");
    }//GEN-LAST:event_AngkaSoalActionPerformed
    private int generateAngka() {
        double random = Math.random() * 100;
        double ceilValue = Math.ceil(random);
        int generatedAngkaSoal = (int) ceilValue;
        return generatedAngkaSoal;
    }
    private void AngkaSoalAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_AngkaSoalAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_AngkaSoalAncestorAdded

    private void cekAngkaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekAngkaButtonActionPerformed
        // TODO add your handling code here:
       try {
        String tebakanString = inputAngkaUntukUserTextField.getText();
        int tebakan = Integer.parseInt(tebakanString);
        if(tebakan == angkaSoal) {
         Petunjuk.setText("Brilliant!");
        } else {
            String message;
            if(tebakan < angkaSoal)
                message = "Angka anda lebih kecil, Coba lebih besar";
            else
                message = "Angka anda lebih besar, coba lebih kecil";
            Petunjuk.setText(message);
        }
       } catch (Exception e) {
           //Petunjuk.setText("Masukkan Angka!!");
           JOptionPane.showMessageDialog(rootPane,"Masukkan Angka! Ngerti Anggka nggak???"); // untuk bikin pop up
       } 
    }//GEN-LAST:event_cekAngkaButtonActionPerformed

    private void inputAngkaUntukUserTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAngkaUntukUserTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAngkaUntukUserTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(TebakAngkaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TebakAngkaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TebakAngkaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TebakAngkaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TebakAngkaWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AngkaSoal;
    private javax.swing.JLabel Petunjuk;
    private javax.swing.JButton cekAngkaButton;
    private javax.swing.JTextField inputAngkaUntukUserTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
