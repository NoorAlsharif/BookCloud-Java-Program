/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1bookcloud;

import static pkg1bookcloud.b_Startpage.Login;
import static pkg1bookcloud.b_Startpage.Signup;

/**
 *
 * @author nooralsharif
 */
public class a_Logopage extends javax.swing.JFrame {

    /**
     * Creates new form Logopage
     */
    public a_Logopage() {
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

        pressanywhere = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(375, 830));
        setMinimumSize(new java.awt.Dimension(375, 830));
        setPreferredSize(new java.awt.Dimension(375, 812));
        getContentPane().setLayout(null);

        pressanywhere.setBackground(new java.awt.Color(255, 255, 255));
        pressanywhere.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pressanywhere.setForeground(new java.awt.Color(123, 92, 170));
        pressanywhere.setToolTipText("");
        pressanywhere.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pressanywhere.setBorderPainted(false);
        pressanywhere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressanywhereActionPerformed(evt);
            }
        });
        getContentPane().add(pressanywhere);
        pressanywhere.setBounds(0, 0, 380, 820);
        pressanywhere.setOpaque(false);
        pressanywhere.setContentAreaFilled(false);
        pressanywhere.setBorderPainted(false);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/Book Cloud jpeg/New 1 Logo page.jpg"))); // NOI18N
        background.setSize(new java.awt.Dimension(375, 812));
        getContentPane().add(background);
        background.setBounds(0, 0, 375, 812);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pressanywhereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pressanywhereActionPerformed
        // TODO add your handling code here:
        
        new b_Startpage().setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_pressanywhereActionPerformed

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
            java.util.logging.Logger.getLogger(a_Logopage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(a_Logopage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(a_Logopage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(a_Logopage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new a_Logopage().setVisible(true);
                
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    public static javax.swing.JButton pressanywhere;
    // End of variables declaration//GEN-END:variables
}
