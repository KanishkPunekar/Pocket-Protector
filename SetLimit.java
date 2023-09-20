/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalexpensetracker;

/**
 *
 * @author KANI
 */
public class SetLimit extends javax.swing.JFrame {

    /**
     * Creates new form SetLimit
     */
    public SetLimit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlsetlimitbase = new javax.swing.JPanel();
        lbllimit = new javax.swing.JLabel();
        txtlimit = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblweek = new javax.swing.JLabel();
        txtweek = new javax.swing.JTextField();
        lblmonth = new javax.swing.JLabel();
        txtmonth = new javax.swing.JTextField();
        lblback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlsetlimitbase.setBackground(new java.awt.Color(212, 236, 220));

        lbllimit.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbllimit.setText("Set your daily limit :");

        txtlimit.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtlimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlimitActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setText("Generate");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblweek.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblweek.setText("Your weekly limit is set to :");

        txtweek.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblmonth.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblmonth.setText("Your monthly limit is set to :");

        txtmonth.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblback.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblback.setText("<--");
        lblback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlsetlimitbaseLayout = new javax.swing.GroupLayout(pnlsetlimitbase);
        pnlsetlimitbase.setLayout(pnlsetlimitbaseLayout);
        pnlsetlimitbaseLayout.setHorizontalGroup(
            pnlsetlimitbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlsetlimitbaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlsetlimitbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlsetlimitbaseLayout.createSequentialGroup()
                        .addGroup(pnlsetlimitbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlsetlimitbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblmonth, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                .addComponent(lblweek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lbllimit, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlsetlimitbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtlimit)
                            .addComponent(txtmonth, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(txtweek))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(pnlsetlimitbaseLayout.createSequentialGroup()
                        .addComponent(lblback, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlsetlimitbaseLayout.setVerticalGroup(
            pnlsetlimitbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlsetlimitbaseLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblback)
                .addGap(85, 85, 85)
                .addGroup(pnlsetlimitbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlimit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllimit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(pnlsetlimitbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblweek, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtweek, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(pnlsetlimitbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlsetlimitbase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlsetlimitbase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtlimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlimitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlimitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String  limit;
        limit = txtlimit.getText();
        
        int lw;
        lw = Integer.parseInt(limit);
        lw = lw*7;
        int lm;
        lm = Integer.parseInt(limit);
        lm = lm*31;
        
        String week = String.valueOf(lw);
        String month = String.valueOf(lm);
        txtweek.setText(week);
        txtmonth.setText(month);
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void lblbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbackMouseClicked
        // TODO add your handling code here:
        this.dispose();
        expense ex = new expense();
        ex.setVisible(true);
    }//GEN-LAST:event_lblbackMouseClicked

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
            java.util.logging.Logger.getLogger(SetLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetLimit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblback;
    private javax.swing.JLabel lbllimit;
    private javax.swing.JLabel lblmonth;
    private javax.swing.JLabel lblweek;
    private javax.swing.JPanel pnlsetlimitbase;
    private javax.swing.JTextField txtlimit;
    private javax.swing.JTextField txtmonth;
    private javax.swing.JTextField txtweek;
    // End of variables declaration//GEN-END:variables
}
