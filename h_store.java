/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1bookcloud;

/**
 *
 * @author nooralsharif
 */
public class h_store extends javax.swing.JFrame {

    /**
     * Creates new form h_store
     */
    public h_store() {
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

        buy = new javax.swing.JButton();
        more = new javax.swing.JButton();
        closefocus = new javax.swing.JButton();
        focus = new javax.swing.JLabel();
        top = new javax.swing.JLabel();
        library = new javax.swing.JButton();
        home = new javax.swing.JButton();
        bottom = new javax.swing.JLabel();
        book2 = new javax.swing.JLabel();
        group = new javax.swing.JLabel();
        up = new javax.swing.JButton();
        down = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(374, 830));
        getContentPane().setLayout(null);

        buy.setBorder(null);
        buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });
        getContentPane().add(buy);
        buy.setBounds(240, 539, 100, 50);
        buy.setOpaque(false);
        buy.setContentAreaFilled(false);
        buy.setBorderPainted(false);
        buy.setVisible(false);

        more.setBorder(null);
        more.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreActionPerformed(evt);
            }
        });
        getContentPane().add(more);
        more.setBounds(40, 540, 100, 50);
        more.setOpaque(false);
        more.setContentAreaFilled(false);
        more.setBorderPainted(false);
        more.setVisible(false);

        closefocus.setBorder(null);
        closefocus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closefocusActionPerformed(evt);
            }
        });
        getContentPane().add(closefocus);
        closefocus.setBounds(20, 600, 340, 100);
        closefocus.setOpaque(false);
        closefocus.setContentAreaFilled(false);
        closefocus.setBorderPainted(false);

        focus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/Book Cloud jpeg/New 15 Store book clicked – 1.png"))); // NOI18N
        focus.setMaximumSize(new java.awt.Dimension(374, 813));
        focus.setMinimumSize(new java.awt.Dimension(374, 813));
        focus.setPreferredSize(new java.awt.Dimension(374, 813));
        getContentPane().add(focus);
        focus.setBounds(0, 190, 374, 440);
        focus.setVisible(false);

        top.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/Book Cloud jpeg/New 14 Store – 2.png"))); // NOI18N
        top.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(top);
        top.setBounds(0, 0, 375, 196);

        library.setBackground(new java.awt.Color(255, 255, 255));
        library.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        library.setForeground(new java.awt.Color(123, 92, 170));
        library.setToolTipText("");
        library.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        library.setBorderPainted(false);
        library.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libraryActionPerformed(evt);
            }
        });
        getContentPane().add(library);
        library.setBounds(160, 750, 60, 60);
        library.setOpaque(false);
        library.setContentAreaFilled(false);
        library.setBorderPainted(false);

        home.setBorder(null);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home);
        home.setBounds(50, 750, 60, 60);
        home.setOpaque(false);
        home.setContentAreaFilled(false);
        home.setBorderPainted(false);

        bottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/Book Cloud jpeg/New 14 Store – 2.png"))); // NOI18N
        bottom.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(bottom);
        bottom.setBounds(0, 752, 375, 60);

        book2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/grat gatsby.jpg"))); // NOI18N
        book2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book2.setSize(new java.awt.Dimension(90, 135));
        book2.setVerifyInputWhenFocusTarget(false);
        book2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        book2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book2book(evt);
            }
        });
        getContentPane().add(book2);
        book2.setBounds(145, 218, 90, 135);

        group.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/Book Cloud jpeg/book store.png"))); // NOI18N
        group.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                more(evt);
            }
        });
        getContentPane().add(group);
        group.setBounds(30, 215, 322, 534);

        up.setBorder(null);
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        getContentPane().add(up);
        up.setBounds(327, 210, 50, 110);
        up.setOpaque(false);
        up.setContentAreaFilled(false);
        up.setBorderPainted(false);

        down.setBorder(null);
        down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downActionPerformed(evt);
            }
        });
        getContentPane().add(down);
        down.setBounds(330, 630, 50, 110);
        down.setOpaque(false);
        down.setContentAreaFilled(false);
        down.setBorderPainted(false);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/Book Cloud jpeg/New 14 Store – 2.png"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(374, 813));
        background.setMinimumSize(new java.awt.Dimension(374, 813));
        background.setPreferredSize(new java.awt.Dimension(374, 813));
        background.setSize(new java.awt.Dimension(374, 813));
        getContentPane().add(background);
        background.setBounds(0, 0, 374, 813);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        new d_Homepage().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_homeActionPerformed

    private void libraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libraryActionPerformed
        // TODO add your handling code here:
        new f1_Library().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_libraryActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
        if(group.getY()-50 >= 0){
            group.setLocation(group.getX(), group.getY()-50);
        }
    }//GEN-LAST:event_upActionPerformed

    private void downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed
        // TODO add your handling code here:
        if(group.getY()+50 <= 215){
            group.setLocation(group.getX(), group.getY()+50);
        }
    }//GEN-LAST:event_downActionPerformed

    private void more(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_more
        // TODO add your handling code here:
       
    }//GEN-LAST:event_more

    private void closefocusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closefocusActionPerformed
        // TODO add your handling code here:
        focus.setVisible(false);
        more.setVisible(false);
        buy.setVisible(false);
        closefocus.setVisible(false);
    }//GEN-LAST:event_closefocusActionPerformed

    private void book2book(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book2book
        // TODO add your handling code here:
        focus.setVisible(true);
        more.setVisible(true);
        buy.setVisible(true);
        closefocus.setVisible(true);
    }//GEN-LAST:event_book2book

    private void moreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreActionPerformed
        // TODO add your handling code here:
        new i_more().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_moreActionPerformed

    private void buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyActionPerformed
        // TODO add your handling code here:
        new j_buy().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buyActionPerformed

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
            java.util.logging.Logger.getLogger(h_store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(h_store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(h_store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(h_store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new h_store().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel background;
    public static javax.swing.JLabel book2;
    public static javax.swing.JLabel bottom;
    public static javax.swing.JButton buy;
    public static javax.swing.JButton closefocus;
    public static javax.swing.JButton down;
    public static javax.swing.JLabel focus;
    public static javax.swing.JLabel group;
    public static javax.swing.JButton home;
    public static javax.swing.JButton library;
    public static javax.swing.JButton more;
    public static javax.swing.JLabel top;
    public static javax.swing.JButton up;
    // End of variables declaration//GEN-END:variables
}
