/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1bookcloud;

import javax.swing.JOptionPane;
import static pkg1bookcloud.d_Homepage.*;

/**
 *
 * @author nooralsharif
 */
public class c2_Signup extends javax.swing.JFrame {

    /**
     * Creates new form c2_Signup
     */
    public c2_Signup() {
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

        darksignup1 = new javax.swing.JLabel();
        next1 = new javax.swing.JButton();
        error7 = new javax.swing.JLabel();
        error6 = new javax.swing.JLabel();
        error5 = new javax.swing.JLabel();
        error4 = new javax.swing.JLabel();
        error3 = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        darksignup = new javax.swing.JLabel();
        cvv = new javax.swing.JTextField();
        exp = new javax.swing.JTextField();
        card = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        next = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(375, 830));
        setSize(new java.awt.Dimension(375, 830));
        getContentPane().setLayout(null);

        darksignup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/book group/New 4 signup ??? 3.png"))); // NOI18N
        getContentPane().add(darksignup1);
        darksignup1.setBounds(80, 720, 220, 70);
        darksignup1.setVisible(false);

        next1.setBackground(new java.awt.Color(255, 255, 255));
        next1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        next1.setForeground(new java.awt.Color(123, 92, 170));
        next1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/book group/New 4 signup ??? 4.png"))); // NOI18N
        next1.setToolTipText("");
        next1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        next1.setBorderPainted(false);
        next1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                next1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                next1MouseEntered(evt);
            }
        });
        next1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next1ActionPerformed(evt);
            }
        });
        getContentPane().add(next1);
        next1.setBounds(80, 720, 210, 70);
        next1.setOpaque(false);
        next1.setContentAreaFilled(false);
        next1.setBorderPainted(false);

        error7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        error7.setForeground(new java.awt.Color(255, 51, 51));
        error7.setText("*Username already exists");
        getContentPane().add(error7);
        error7.setBounds(130, 190, 220, 20);
        error7.setVisible(false);

        error6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        error6.setForeground(new java.awt.Color(255, 51, 51));
        error6.setText("* CVV 3 digits");
        getContentPane().add(error6);
        error6.setBounds(240, 530, 120, 20);
        error6.setVisible(false);

        error5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        error5.setForeground(new java.awt.Color(255, 51, 51));
        error5.setText("* Expired card");
        getContentPane().add(error5);
        error5.setBounds(100, 530, 130, 20);
        error5.setVisible(false);

        error4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        error4.setForeground(new java.awt.Color(255, 51, 51));
        error4.setText("* Card should have 16 digits");
        getContentPane().add(error4);
        error4.setBounds(100, 460, 250, 20);
        error4.setVisible(false);

        error3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        error3.setForeground(new java.awt.Color(255, 51, 51));
        error3.setText("* incorrect age");
        getContentPane().add(error3);
        error3.setBounds(100, 400, 230, 20);
        error3.setVisible(false);

        error2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        error2.setForeground(new java.awt.Color(255, 51, 51));
        error2.setText("* Email already exists");
        getContentPane().add(error2);
        error2.setBounds(100, 330, 210, 20);
        error2.setVisible(false);

        error1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        error1.setForeground(new java.awt.Color(255, 51, 51));
        error1.setText("* should be more than 7 characters");
        getContentPane().add(error1);
        error1.setBounds(60, 260, 300, 20);
        error1.setVisible(false);

        error.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        error.setForeground(new java.awt.Color(255, 51, 51));
        error.setText("* should be more than 5 characters");
        getContentPane().add(error);
        error.setBounds(60, 190, 290, 20);
        error.setVisible(false);

        darksignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/Book Cloud jpeg/New 4 signup ??? 2.png"))); // NOI18N
        getContentPane().add(darksignup);
        darksignup.setBounds(83, 642, 220, 70);
        darksignup.setVisible(false);

        cvv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cvvKeyReleased(evt);
            }
        });
        getContentPane().add(cvv);
        cvv.setBounds(277, 545, 80, 50);

        exp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                expKeyReleased(evt);
            }
        });
        getContentPane().add(exp);
        exp.setBounds(96, 550, 110, 50);

        card.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cardKeyReleased(evt);
            }
        });
        getContentPane().add(card);
        card.setBounds(96, 475, 260, 50);

        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageKeyReleased(evt);
            }
        });
        getContentPane().add(age);
        age.setBounds(96, 415, 120, 50);

        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                message3(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        getContentPane().add(email);
        email.setBounds(96, 350, 260, 50);

        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                message2(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(137, 280, 220, 50);

        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                message1(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(137, 209, 220, 50);

        next.setBackground(new java.awt.Color(255, 255, 255));
        next.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        next.setForeground(new java.awt.Color(123, 92, 170));
        next.setToolTipText("");
        next.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        next.setBorderPainted(false);
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextMouseEntered(evt);
            }
        });
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next);
        next.setBounds(90, 643, 200, 60);
        next.setOpaque(false);
        next.setContentAreaFilled(false);
        next.setBorderPainted(false);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/Book Cloud jpeg/New 4 signup ??? 1.jpg"))); // NOI18N
        background.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        background.setMaximumSize(new java.awt.Dimension(375, 830));
        background.setMinimumSize(new java.awt.Dimension(375, 830));
        background.setPreferredSize(new java.awt.Dimension(375, 830));
        background.setSize(new java.awt.Dimension(375, 830));
        background.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(background);
        background.setBounds(0, 0, 375, 830);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        String text = username.getText();
        
        if(text.equals("noor98") || text.isEmpty()){
           //Username.setText(text);
           error7.setVisible(true);
           next.setVisible(false);
        }
        else{
            error7.setVisible(false);
            new d_Homepage().setVisible(true);
            this.dispose();
            JOptionPane.showMessageDialog(null, "please confirm  your email", "Confirm", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_nextActionPerformed

    private void message1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_message1
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Username already exist, please use another username", "Error", JOptionPane.ERROR_MESSAGE);
        
        //JOptionPane.showMessageDialog(null, "Username should be more than 4 characters", "Error", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_message1

    private void message2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_message2
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Password should be more than 5 characters", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_message2

    private void message3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_message3
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "This email already exists", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_message3

    private void nextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseEntered
        // TODO add your handling code here:
        darksignup.setVisible(true);
    }//GEN-LAST:event_nextMouseEntered

    private void nextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseExited
        // TODO add your handling code here:
        darksignup.setVisible(false);
    }//GEN-LAST:event_nextMouseExited

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_usernameActionPerformed

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
        // TODO add your handling code here:
        String text = username.getText();
        
        if(text.length()<= 5 || text.isEmpty()){
           //Username.setText(text);
           error.setVisible(true);
           next.setVisible(false);
        }
        else{
            error.setVisible(false);
            next.setVisible(true);
        }
        
    }//GEN-LAST:event_usernameKeyReleased

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        // TODO add your handling code here:
        String text = password.getText();
        
        if(text.length()<= 7 || text.isEmpty()){
           //Username.setText(text);
           error1.setVisible(true);
           next.setVisible(false);
        }
        else{
            error1.setVisible(false);
            next.setVisible(true);
        }
    }//GEN-LAST:event_passwordKeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        // TODO add your handling code here:
        String text = email.getText();
        
        if(text.equals("nalsharif@gmail.com") || (!text.contains("gmail.com")) || text.isEmpty()){
           //Username.setText(text);
           error2.setVisible(true);
           next.setVisible(false);
        }
        else{
            error2.setVisible(false);
            next.setVisible(true);
        }
    }//GEN-LAST:event_emailKeyReleased

    private void ageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyReleased
        // TODO add your handling code here:
        String text = age.getText();
        
        if (text.length() > 2 || text.isEmpty()) {
            error3.setVisible(true);
            next.setVisible(false);
        }
        else{
            error3.setVisible(false);
            next.setVisible(true);
        }
    }//GEN-LAST:event_ageKeyReleased

    private void cardKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardKeyReleased
        // TODO add your handling code here:
        String text = card.getText();
        
        if(text.length()<= 16 || text.isEmpty()){
           //Username.setText(text);
           error4.setVisible(true);
           next.setVisible(false);
        }
        else{
            error4.setVisible(false);
            next.setVisible(true);
        }
    }//GEN-LAST:event_cardKeyReleased

    private void expKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_expKeyReleased
        // TODO add your handling code here:
        String text = exp.getText();
        
        if(text.contains("2020") || text.isEmpty() || (!text.contains("/"))){
           //Username.setText(text);
           error5.setVisible(true);
           next.setVisible(false);
        }
        else{
            error5.setVisible(false);
            next.setVisible(true);
        }
    }//GEN-LAST:event_expKeyReleased

    private void cvvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvvKeyReleased
        // TODO add your handling code here:
        String text = cvv.getText();
        
        if(text.length() < 3){
           //Username.setText(text);
           error6.setVisible(true);
           next.setVisible(false);
        }
        else{
            error6.setVisible(false);
            next.setVisible(true);
            
        }
    }//GEN-LAST:event_cvvKeyReleased

    private void next1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next1MouseExited
        // TODO add your handling code here:
        darksignup1.setVisible(false);
    }//GEN-LAST:event_next1MouseExited

    private void next1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next1MouseEntered
        // TODO add your handling code here:
        darksignup1.setVisible(true);
    }//GEN-LAST:event_next1MouseEntered

    private void next1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next1ActionPerformed
        // TODO add your handling code here:
        new b_Startpage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_next1ActionPerformed

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
            java.util.logging.Logger.getLogger(c2_Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(c2_Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(c2_Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(c2_Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new c2_Signup().setVisible(true);


            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField age;
    private javax.swing.JLabel background;
    public static javax.swing.JTextField card;
    public static javax.swing.JTextField cvv;
    public static javax.swing.JLabel darksignup;
    public static javax.swing.JLabel darksignup1;
    public static javax.swing.JTextField email;
    public static javax.swing.JLabel error;
    public static javax.swing.JLabel error1;
    public static javax.swing.JLabel error2;
    public static javax.swing.JLabel error3;
    public static javax.swing.JLabel error4;
    public static javax.swing.JLabel error5;
    public static javax.swing.JLabel error6;
    public static javax.swing.JLabel error7;
    public static javax.swing.JTextField exp;
    public static javax.swing.JButton next;
    public static javax.swing.JButton next1;
    public static javax.swing.JTextField password;
    public static javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
