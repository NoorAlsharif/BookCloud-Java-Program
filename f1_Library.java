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
public class f1_Library extends javax.swing.JFrame {

    /**
     * Creates new form f_Library
     */
    public f1_Library() {
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

        up = new javax.swing.JButton();
        down = new javax.swing.JButton();
        store = new javax.swing.JButton();
        home = new javax.swing.JButton();
        list = new javax.swing.JButton();
        order = new javax.swing.JComboBox<>();
        top = new javax.swing.JLabel();
        options = new javax.swing.JLabel();
        book16 = new javax.swing.JLabel();
        book17 = new javax.swing.JLabel();
        book18 = new javax.swing.JLabel();
        book15 = new javax.swing.JLabel();
        book14 = new javax.swing.JLabel();
        book13 = new javax.swing.JLabel();
        book12 = new javax.swing.JLabel();
        book11 = new javax.swing.JLabel();
        book10 = new javax.swing.JLabel();
        book9 = new javax.swing.JLabel();
        book8 = new javax.swing.JLabel();
        book7 = new javax.swing.JLabel();
        book6 = new javax.swing.JLabel();
        book5 = new javax.swing.JLabel();
        book4 = new javax.swing.JLabel();
        book3 = new javax.swing.JLabel();
        book2 = new javax.swing.JLabel();
        book1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(375, 830));
        getContentPane().setLayout(null);

        up.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        getContentPane().add(up);
        up.setBounds(330, 150, 50, 110);
        up.setOpaque(false);
        up.setContentAreaFilled(false);
        up.setBorderPainted(false);

        down.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downActionPerformed(evt);
            }
        });
        getContentPane().add(down);
        down.setBounds(330, 639, 50, 110);
        down.setOpaque(false);
        down.setContentAreaFilled(false);
        down.setBorderPainted(false);

        store.setBorder(null);
        store.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeActionPerformed(evt);
            }
        });
        getContentPane().add(store);
        store.setBounds(270, 750, 60, 60);
        store.setOpaque(false);
        store.setContentAreaFilled(false);
        store.setBorderPainted(false);

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

        list.setBorder(null);
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });
        getContentPane().add(list);
        list.setBounds(310, 99, 30, 40);
        list.setOpaque(false);
        list.setContentAreaFilled(false);
        list.setBorderPainted(false);

        order.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Title", "Author", "Rating" }));
        getContentPane().add(order);
        order.setBounds(30, 110, 100, 27);

        top.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/Book Cloud jpeg/New 8 Library grid – 1.png"))); // NOI18N
        top.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(top);
        top.setBounds(0, 0, 380, 144);

        options.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/Book Cloud jpeg/New 8 Library grid – 1.png"))); // NOI18N
        options.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(options);
        options.setBounds(0, 750, 375, 60);

        book16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/sharp things.jpg"))); // NOI18N
        book16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book16.setSize(new java.awt.Dimension(90, 135));
        book16.setVerifyInputWhenFocusTarget(false);
        book16.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(book16);
        book16.setBounds(32, 888, 90, 135);

        book17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/it's kind of a dunny story.jpg"))); // NOI18N
        book17.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book17.setSize(new java.awt.Dimension(90, 135));
        book17.setVerifyInputWhenFocusTarget(false);
        book17.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(book17);
        book17.setBounds(143, 888, 90, 135);

        book18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/the troop.jpg"))); // NOI18N
        book18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book18.setSize(new java.awt.Dimension(90, 135));
        book18.setVerifyInputWhenFocusTarget(false);
        book18.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(book18);
        book18.setBounds(254, 888, 90, 135);

        book15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/the help.jpg"))); // NOI18N
        book15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book15.setSize(new java.awt.Dimension(90, 135));
        book15.setVerifyInputWhenFocusTarget(false);
        book15.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        book15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book1MouseClicked(evt);
            }
        });
        getContentPane().add(book15);
        book15.setBounds(254, 741, 90, 135);

        book14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/pretty girls.jpg"))); // NOI18N
        book14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book14.setSize(new java.awt.Dimension(90, 135));
        book14.setVerifyInputWhenFocusTarget(false);
        book14.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        book14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book1MouseClicked(evt);
            }
        });
        getContentPane().add(book14);
        book14.setBounds(143, 741, 90, 135);

        book13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/life of pi.jpg"))); // NOI18N
        book13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book13.setSize(new java.awt.Dimension(90, 135));
        book13.setVerifyInputWhenFocusTarget(false);
        book13.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        book13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book13MouseClicked(evt);
            }
        });
        getContentPane().add(book13);
        book13.setBounds(32, 741, 90, 135);

        book12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/the shining.jpg"))); // NOI18N
        book12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book12.setSize(new java.awt.Dimension(90, 135));
        book12.setVerifyInputWhenFocusTarget(false);
        book12.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        book12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book1MouseClicked(evt);
            }
        });
        getContentPane().add(book12);
        book12.setBounds(254, 594, 90, 135);

        book11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/the good daughter.jpg"))); // NOI18N
        book11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book11.setSize(new java.awt.Dimension(90, 135));
        book11.setVerifyInputWhenFocusTarget(false);
        book11.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        book11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book1MouseClicked(evt);
            }
        });
        getContentPane().add(book11);
        book11.setBounds(143, 594, 90, 135);

        book10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/new moon.jpg"))); // NOI18N
        book10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book10.setSize(new java.awt.Dimension(90, 135));
        book10.setVerifyInputWhenFocusTarget(false);
        book10.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        book10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book1MouseClicked(evt);
            }
        });
        getContentPane().add(book10);
        book10.setBounds(32, 594, 90, 135);

        book9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/demian.jpg"))); // NOI18N
        book9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book9.setSize(new java.awt.Dimension(90, 135));
        book9.setVerifyInputWhenFocusTarget(false);
        book9.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        book9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book1MouseClicked(evt);
            }
        });
        getContentPane().add(book9);
        book9.setBounds(254, 447, 90, 135);

        book8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/into the wild.jpg"))); // NOI18N
        book8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book8.setSize(new java.awt.Dimension(90, 135));
        book8.setVerifyInputWhenFocusTarget(false);
        book8.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        book8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book1MouseClicked(evt);
            }
        });
        getContentPane().add(book8);
        book8.setBounds(143, 447, 90, 135);

        book7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/PL_Podziemny_krag_okladka.jpg"))); // NOI18N
        book7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book7.setSize(new java.awt.Dimension(90, 135));
        book7.setVerifyInputWhenFocusTarget(false);
        book7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        book7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book1MouseClicked(evt);
            }
        });
        getContentPane().add(book7);
        book7.setBounds(32, 447, 90, 135);

        book6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/malcolmX.jpg"))); // NOI18N
        book6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book6.setSize(new java.awt.Dimension(90, 135));
        book6.setVerifyInputWhenFocusTarget(false);
        book6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        book6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book1MouseClicked(evt);
            }
        });
        getContentPane().add(book6);
        book6.setBounds(32, 300, 90, 135);

        book5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/twilight sun.jpg"))); // NOI18N
        book5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book5.setSize(new java.awt.Dimension(90, 135));
        book5.setVerifyInputWhenFocusTarget(false);
        book5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        book5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book1MouseClicked(evt);
            }
        });
        getContentPane().add(book5);
        book5.setBounds(143, 300, 90, 135);

        book4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/twilight.jpg"))); // NOI18N
        book4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book4.setSize(new java.awt.Dimension(90, 135));
        book4.setVerifyInputWhenFocusTarget(false);
        book4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        book4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book1MouseClicked(evt);
            }
        });
        getContentPane().add(book4);
        book4.setBounds(254, 300, 90, 135);

        book3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/the outsider.jpg"))); // NOI18N
        book3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book3.setSize(new java.awt.Dimension(90, 135));
        book3.setVerifyInputWhenFocusTarget(false);
        book3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        book3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book1MouseClicked(evt);
            }
        });
        getContentPane().add(book3);
        book3.setBounds(252, 153, 90, 135);

        book2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/moby dick.jpg"))); // NOI18N
        book2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book2.setSize(new java.awt.Dimension(90, 135));
        book2.setVerifyInputWhenFocusTarget(false);
        book2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        book2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book1MouseClicked(evt);
            }
        });
        getContentPane().add(book2);
        book2.setBounds(142, 153, 90, 135);

        book1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/hp1.jpg"))); // NOI18N
        book1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book1.setSize(new java.awt.Dimension(90, 135));
        book1.setVerifyInputWhenFocusTarget(false);
        book1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        book1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book(evt);
            }
        });
        getContentPane().add(book1);
        book1.setBounds(32, 153, 90, 135);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/Book Cloud jpeg/New 8 Library grid – 1.png"))); // NOI18N
        background.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(background);
        background.setBounds(0, 0, 375, 810);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
        
        //if ( ((book13.getY()- 20) >= 594)  && ((book14.getY()- 20) >= 594)  && ((book15.getY()- 20) >= 594)){
        if ( ((book16.getY()- 20) >= 588)  && ((book17.getY()- 20) >= 588)  && ((book18.getY()- 20) >= 588)){
            
            book1.setLocation(book1.getX(), book1.getY() -50);
            book2.setLocation(book2.getX(), book2.getY() -50);
            book3.setLocation(book3.getX(), book3.getY() -50);
            book4.setLocation(book4.getX(), book4.getY() -50);
            book5.setLocation(book5.getX(), book5.getY() -50);
            book6.setLocation(book6.getX(), book6.getY() -50);
            book7.setLocation(book7.getX(), book7.getY() -50);
            book8.setLocation(book8.getX(), book8.getY() -50);
            book9.setLocation(book9.getX(), book9.getY() -50);
            book10.setLocation(book10.getX(), book10.getY() -50);
            book11.setLocation(book11.getX(), book11.getY() -50);
            book12.setLocation(book12.getX(), book12.getY() -50);
            book13.setLocation(book13.getX(), book13.getY() -50);
            book14.setLocation(book14.getX(), book14.getY() -50);
            book15.setLocation(book15.getX(), book15.getY() -50);
            
            book16.setLocation(book16.getX(), book16.getY() -50);
            book17.setLocation(book17.getX(), book17.getY() -50);
            book18.setLocation(book18.getX(), book18.getY() -50);
        }
        
        
    }//GEN-LAST:event_upActionPerformed

    private void downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed
        // TODO add your handling code here:
        
        if ( ((book1.getY()+ 20) <= 153)  && ((book2.getY()+ 20) <= 153)  && ((book3.getY()+ 20) <= 153)){
            
            book1.setLocation(book1.getX(), book1.getY() +50);
            book2.setLocation(book2.getX(), book2.getY() +50);
            book3.setLocation(book3.getX(), book3.getY() +50);
            book4.setLocation(book4.getX(), book4.getY() +50);
            book5.setLocation(book5.getX(), book5.getY() +50);
            book6.setLocation(book6.getX(), book6.getY() +50);
            book7.setLocation(book7.getX(), book7.getY() +50);
            book8.setLocation(book8.getX(), book8.getY() +50);
            book9.setLocation(book9.getX(), book9.getY() +50);
            book10.setLocation(book10.getX(), book10.getY() +50);
            book11.setLocation(book11.getX(), book11.getY() +50);
            book12.setLocation(book12.getX(), book12.getY() +50);
            book13.setLocation(book13.getX(), book13.getY() +50);
            book14.setLocation(book14.getX(), book14.getY() +50);
            book15.setLocation(book15.getX(), book15.getY() +50);
            
            book16.setLocation(book16.getX(), book16.getY() +50);
            book17.setLocation(book17.getX(), book17.getY() +50);
            book18.setLocation(book18.getX(), book18.getY() +50);
        }
        
    }//GEN-LAST:event_downActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        
        new d_Homepage().setVisible(true);
        this.dispose();
    
    }//GEN-LAST:event_homeActionPerformed

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
        // TODO add your handling code here:
        new f2_Library().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listActionPerformed

    private void book13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book13MouseClicked
        // TODO add your handling code here:
        new g_Book().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_book13MouseClicked

    private void book1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book1MouseClicked
        // TODO add your handling code here:
        new g_Book().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_book1MouseClicked

    private void book(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book
        // TODO add your handling code here:
        new g_Book().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_book

    private void storeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeActionPerformed
        // TODO add your handling code here:
        new h_store().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_storeActionPerformed

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
            java.util.logging.Logger.getLogger(f1_Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f1_Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f1_Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f1_Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f1_Library().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel background;
    public static javax.swing.JLabel book1;
    public static javax.swing.JLabel book10;
    public static javax.swing.JLabel book11;
    public static javax.swing.JLabel book12;
    public static javax.swing.JLabel book13;
    public static javax.swing.JLabel book14;
    public static javax.swing.JLabel book15;
    public static javax.swing.JLabel book16;
    public static javax.swing.JLabel book17;
    public static javax.swing.JLabel book18;
    public static javax.swing.JLabel book2;
    public static javax.swing.JLabel book3;
    public static javax.swing.JLabel book4;
    public static javax.swing.JLabel book5;
    public static javax.swing.JLabel book6;
    public static javax.swing.JLabel book7;
    public static javax.swing.JLabel book8;
    public static javax.swing.JLabel book9;
    public static javax.swing.JButton down;
    public static javax.swing.JButton home;
    public static javax.swing.JButton list;
    public static javax.swing.JLabel options;
    private javax.swing.JComboBox<String> order;
    public static javax.swing.JButton store;
    public static javax.swing.JLabel top;
    public static javax.swing.JButton up;
    // End of variables declaration//GEN-END:variables
}
