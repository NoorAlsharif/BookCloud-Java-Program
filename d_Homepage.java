/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1bookcloud;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

/**
 *
 * @author nooralsharif
 */
public class d_Homepage extends javax.swing.JFrame {

    /**
     * Creates new form d_Homepage
     */
    public d_Homepage() {
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

        username = new javax.swing.JLabel();
        edit = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        cvv = new javax.swing.JTextField();
        exp = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        card = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        closeprofile = new javax.swing.JButton();
        about = new javax.swing.JLabel();
        prof = new javax.swing.JLabel();
        profile = new javax.swing.JButton();
        goR2 = new javax.swing.JButton();
        goL2 = new javax.swing.JButton();
        goR1 = new javax.swing.JButton();
        goL1 = new javax.swing.JButton();
        goL = new javax.swing.JButton();
        goR = new javax.swing.JButton();
        book1 = new javax.swing.JLabel();
        book2 = new javax.swing.JLabel();
        book3 = new javax.swing.JLabel();
        book4 = new javax.swing.JLabel();
        book5 = new javax.swing.JLabel();
        book6 = new javax.swing.JLabel();
        book7 = new javax.swing.JLabel();
        book8 = new javax.swing.JLabel();
        book9 = new javax.swing.JLabel();
        book10 = new javax.swing.JLabel();
        book11 = new javax.swing.JLabel();
        book12 = new javax.swing.JLabel();
        book13 = new javax.swing.JLabel();
        store = new javax.swing.JButton();
        library = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(375, 830));
        setResizable(false);
        getContentPane().setLayout(null);

        username.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        username.setForeground(new java.awt.Color(0, 81, 158));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("Username");
        username.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(username);
        username.setBounds(60, 110, 270, 60);
        username.setVisible(false);
        username.setText(c2_Signup.username.getText());

        edit.setBackground(new java.awt.Color(255, 255, 255));
        edit.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        edit.setForeground(new java.awt.Color(123, 92, 170));
        edit.setToolTipText("");
        edit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        edit.setBorderPainted(false);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit);
        edit.setBounds(220, 490, 110, 40);
        edit.setOpaque(false);
        edit.setContentAreaFilled(false);
        edit.setBorderPainted(false);
        edit.setVisible(false);

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        logout.setForeground(new java.awt.Color(123, 92, 170));
        logout.setToolTipText("");
        logout.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        logout.setBorderPainted(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(60, 485, 120, 40);
        logout.setOpaque(false);
        logout.setContentAreaFilled(false);
        logout.setBorderPainted(false);
        logout.setVisible(false);

        cvv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cvv.setForeground(new java.awt.Color(153, 153, 153));
        cvv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvvActionPerformed(evt);
            }
        });
        getContentPane().add(cvv);
        cvv.setBounds(274, 380, 80, 50);
        cvv.setVisible(false);
        cvv.setText(c2_Signup.cvv.getText());

        exp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        exp.setForeground(new java.awt.Color(153, 153, 153));
        exp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(exp);
        exp.setBounds(105, 383, 105, 50);
        exp.setVisible(false);
        exp.setText(c2_Signup.exp.getText());

        age.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        age.setForeground(new java.awt.Color(153, 153, 153));
        age.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(age);
        age.setBounds(105, 253, 120, 50);
        age.setVisible(false);
        age.setText(c2_Signup.age.getText());

        card.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        card.setForeground(new java.awt.Color(153, 153, 153));
        card.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(card);
        card.setBounds(105, 315, 248, 50);
        card.setVisible(false);
        card.setText(c2_Signup.card.getText());

        email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        email.setForeground(new java.awt.Color(153, 153, 153));
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setToolTipText("");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email);
        email.setBounds(105, 190, 248, 50);
        email.setVisible(false);
        email.setText(c2_Signup.email.getText());

        closeprofile.setBackground(new java.awt.Color(255, 255, 255));
        closeprofile.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        closeprofile.setForeground(new java.awt.Color(123, 92, 170));
        closeprofile.setToolTipText("");
        closeprofile.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        closeprofile.setBorderPainted(false);
        closeprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeprofileActionPerformed(evt);
            }
        });
        getContentPane().add(closeprofile);
        closeprofile.setBounds(270, 10, 60, 60);
        closeprofile.setOpaque(false);
        closeprofile.setContentAreaFilled(false);
        closeprofile.setBorderPainted(false);
        closeprofile.setVisible(false);

        about.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        about.setText("??? About");
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        getContentPane().add(about);
        about.setBounds(50, 80, 60, 20);
        about.getAccessibleContext().setAccessibleName("");
        about.setVisible(false);

        prof.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/Book Cloud jpeg/Picture2.png"))); // NOI18N
        prof.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        prof.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(prof);
        prof.setBounds(30, 0, 330, 590);
        prof.setVisible(false);

        profile.setBackground(new java.awt.Color(255, 255, 255));
        profile.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        profile.setForeground(new java.awt.Color(123, 92, 170));
        profile.setToolTipText("");
        profile.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        profile.setBorderPainted(false);
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });
        getContentPane().add(profile);
        profile.setBounds(270, 10, 60, 60);
        profile.setOpaque(false);
        profile.setContentAreaFilled(false);
        profile.setBorderPainted(false);

        goR2.setBackground(new java.awt.Color(255, 255, 255));
        goR2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        goR2.setForeground(new java.awt.Color(123, 92, 170));
        goR2.setToolTipText("");
        goR2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        goR2.setBorderPainted(false);
        goR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goR2ActionPerformed(evt);
            }
        });
        getContentPane().add(goR2);
        goR2.setBounds(310, 560, 60, 190);
        goR2.setOpaque(false);
        goR2.setContentAreaFilled(false);
        goR2.setBorderPainted(false);

        goL2.setBackground(new java.awt.Color(255, 255, 255));
        goL2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        goL2.setForeground(new java.awt.Color(123, 92, 170));
        goL2.setToolTipText("");
        goL2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        goL2.setBorderPainted(false);
        goL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goL2ActionPerformed(evt);
            }
        });
        getContentPane().add(goL2);
        goL2.setBounds(0, 560, 60, 190);
        goL2.setOpaque(false);
        goL2.setContentAreaFilled(false);
        goL2.setBorderPainted(false);

        goR1.setBackground(new java.awt.Color(255, 255, 255));
        goR1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        goR1.setForeground(new java.awt.Color(123, 92, 170));
        goR1.setToolTipText("");
        goR1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        goR1.setBorderPainted(false);
        goR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goR1ActionPerformed(evt);
            }
        });
        getContentPane().add(goR1);
        goR1.setBounds(310, 360, 60, 190);
        goR1.setOpaque(false);
        goR1.setContentAreaFilled(false);
        goR1.setBorderPainted(false);

        goL1.setBackground(new java.awt.Color(255, 255, 255));
        goL1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        goL1.setForeground(new java.awt.Color(123, 92, 170));
        goL1.setToolTipText("");
        goL1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        goL1.setBorderPainted(false);
        goL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goL1ActionPerformed(evt);
            }
        });
        getContentPane().add(goL1);
        goL1.setBounds(0, 360, 60, 190);
        goL1.setOpaque(false);
        goL1.setContentAreaFilled(false);
        goL1.setBorderPainted(false);

        goL.setBackground(new java.awt.Color(255, 255, 255));
        goL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        goL.setForeground(new java.awt.Color(123, 92, 170));
        goL.setToolTipText("");
        goL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        goL.setBorderPainted(false);
        goL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goLActionPerformed(evt);
            }
        });
        getContentPane().add(goL);
        goL.setBounds(0, 130, 60, 190);
        goL.setOpaque(false);
        goL.setContentAreaFilled(false);
        goL.setBorderPainted(false);

        goR.setBackground(new java.awt.Color(255, 255, 255));
        goR.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        goR.setForeground(new java.awt.Color(123, 92, 170));
        goR.setToolTipText("");
        goR.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        goR.setBorderPainted(false);
        goR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goRActionPerformed(evt);
            }
        });
        getContentPane().add(goR);
        goR.setBounds(320, 130, 60, 190);
        goR.setOpaque(false);
        goR.setContentAreaFilled(false);
        goR.setBorderPainted(false);

        book1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/hp1.jpg"))); // NOI18N
        book1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book1.setSize(new java.awt.Dimension(90, 135));
        book1.setVerifyInputWhenFocusTarget(false);
        book1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        book1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book1MouseClicked(evt);
            }
        });
        getContentPane().add(book1);
        book1.setBounds(0, 153, 90, 135);

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
        book2.setBounds(110, 153, 90, 135);

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
        book3.setBounds(220, 153, 90, 135);

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
        book4.setBounds(330, 153, 90, 135);

        book5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/eclipse.jpg"))); // NOI18N
        book5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book5.setSize(new java.awt.Dimension(90, 135));
        book5.setVerifyInputWhenFocusTarget(false);
        book5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        book5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                store(evt);
            }
        });
        getContentPane().add(book5);
        book5.setBounds(-77, 378, 90, 135);

        book6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/life of pi.jpg"))); // NOI18N
        book6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book6.setSize(new java.awt.Dimension(90, 135));
        book6.setVerifyInputWhenFocusTarget(false);
        book6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(book6);
        book6.setBounds(33, 378, 90, 135);

        book7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/hp2.jpeg"))); // NOI18N
        book7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book7.setSize(new java.awt.Dimension(90, 135));
        book7.setVerifyInputWhenFocusTarget(false);
        book7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(book7);
        book7.setBounds(143, 378, 90, 135);

        book8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/hp4.jpeg"))); // NOI18N
        book8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book8.setSize(new java.awt.Dimension(90, 135));
        book8.setVerifyInputWhenFocusTarget(false);
        book8.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(book8);
        book8.setBounds(253, 378, 90, 135);

        book9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/the shining.jpg"))); // NOI18N
        book9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book9.setSize(new java.awt.Dimension(90, 135));
        book9.setVerifyInputWhenFocusTarget(false);
        book9.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(book9);
        book9.setBounds(363, 378, 90, 135);

        book10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/the woman in the window.jpg"))); // NOI18N
        book10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book10.setSize(new java.awt.Dimension(90, 135));
        book10.setVerifyInputWhenFocusTarget(false);
        book10.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(book10);
        book10.setBounds(-45, 603, 90, 135);

        book11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/the art of thinking.jpg"))); // NOI18N
        book11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book11.setSize(new java.awt.Dimension(90, 135));
        book11.setVerifyInputWhenFocusTarget(false);
        book11.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(book11);
        book11.setBounds(65, 603, 90, 135);

        book12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/the troop.jpg"))); // NOI18N
        book12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book12.setSize(new java.awt.Dimension(90, 135));
        book12.setVerifyInputWhenFocusTarget(false);
        book12.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(book12);
        book12.setBounds(175, 603, 90, 135);

        book13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/books/long walk.jpg"))); // NOI18N
        book13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        book13.setSize(new java.awt.Dimension(90, 135));
        book13.setVerifyInputWhenFocusTarget(false);
        book13.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(book13);
        book13.setBounds(285, 603, 90, 135);

        store.setBackground(new java.awt.Color(255, 255, 255));
        store.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        store.setForeground(new java.awt.Color(123, 92, 170));
        store.setToolTipText("");
        store.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        store.setBorderPainted(false);
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

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1bookcloud/Book Cloud jpeg/New 5 homepage ??? 1.jpg"))); // NOI18N
        background.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(background);
        background.setBounds(0, 0, 375, 810);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void goRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goRActionPerformed
        // TODO add your handling code here:
        
        if ((book4.getX()- 20) >= 230){
            book1.setLocation(book1.getX()- 20, book1.getY());
            book2.setLocation(book2.getX()- 20, book2.getY());
            book3.setLocation(book3.getX()- 20, book3.getY());
            book4.setLocation(book4.getX()- 20, book4.getY());
        }
    }//GEN-LAST:event_goRActionPerformed

    private void goLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goLActionPerformed
        // TODO add your handling code here:
        
        if ((book1.getX()- 20) <= 0){
            book1.setLocation(book1.getX()+ 20, book1.getY());
            book2.setLocation(book2.getX()+ 20, book2.getY());
            book3.setLocation(book3.getX()+ 20, book3.getY());
            book4.setLocation(book4.getX()+ 20, book4.getY());
        }
        
        
    }//GEN-LAST:event_goLActionPerformed

    private void goR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goR1ActionPerformed
        // TODO add your handling code here:
        
        if ((book9.getX()- 40) >= 230){
            book5.setLocation(book5.getX()- 40, book5.getY());
            book6.setLocation(book6.getX()- 40, book6.getY());
            book7.setLocation(book7.getX()- 40, book7.getY());
            book8.setLocation(book8.getX()- 40, book8.getY());
            book9.setLocation(book9.getX()- 40, book9.getY());
        }
    }//GEN-LAST:event_goR1ActionPerformed

    private void goL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goL1ActionPerformed
        // TODO add your handling code here:
        
        if ((book5.getX()- 40) <= 1){
            book5.setLocation(book5.getX()+ 40, book5.getY());
            book6.setLocation(book6.getX()+ 40, book6.getY());
            book7.setLocation(book7.getX()+ 40, book7.getY());
            book8.setLocation(book8.getX()+ 40, book8.getY());
            book9.setLocation(book9.getX()+ 40, book9.getY());
        }
    }//GEN-LAST:event_goL1ActionPerformed

    private void goR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goR2ActionPerformed
        // TODO add your handling code here:
        
        if ((book13.getX()- 20) >= 230){
            book10.setLocation(book10.getX()- 20, book10.getY());
            book11.setLocation(book11.getX()- 20, book11.getY());
            book12.setLocation(book12.getX()- 20, book12.getY());
            book13.setLocation(book13.getX()- 20, book13.getY());
        }
        
    }//GEN-LAST:event_goR2ActionPerformed

    private void goL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goL2ActionPerformed
        // TODO add your handling code here:
        
        if ((book10.getX()- 20) <= 0){
            book10.setLocation(book10.getX()+ 20, book10.getY());
            book11.setLocation(book11.getX()+ 20, book11.getY());
            book12.setLocation(book12.getX()+ 20, book12.getY());
            book13.setLocation(book13.getX()+ 20, book13.getY());
        }
    }//GEN-LAST:event_goL2ActionPerformed

    private void libraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libraryActionPerformed
        // TODO add your handling code here:
        
        new f1_Library().setVisible(true);
        this.dispose();
                
    }//GEN-LAST:event_libraryActionPerformed

    private void closeprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeprofileActionPerformed
        // TODO add your handling code here:

        prof.setVisible(false);
        closeprofile.setVisible(false);
        profile.setVisible(true);
        about.setVisible(false);
        
        username.setVisible(false);

        email.setVisible(false);
        age.setVisible(false);
        card.setVisible(false);
        exp.setVisible(false);
        cvv.setVisible(false);

        logout.setVisible(false);
        edit.setVisible(false);
    }//GEN-LAST:event_closeprofileActionPerformed

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
        // TODO add your handling code here:

        prof.setVisible(true);
        closeprofile.setVisible(true);
        profile.setVisible(false);
        about.setVisible(true);
        
        username.setVisible(true);

        email.setVisible(true);
        age.setVisible(true);
        card.setVisible(true);
        exp.setVisible(true);
        cvv.setVisible(true);

        logout.setVisible(true);
        edit.setVisible(true);

    }//GEN-LAST:event_profileActionPerformed

    private void cvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvvActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        new b_Startpage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        
        new e_Editprofile().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_editActionPerformed

    private void book1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book1MouseClicked
        // TODO add your handling code here:
        new g_Book().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_book1MouseClicked

    private void storeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeActionPerformed
        // TODO add your handling code here:
        new h_store().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_storeActionPerformed

    private void store(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_store
        // TODO add your handling code here:
        new h_store().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_store

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_emailActionPerformed

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "With Book Cloud, you can swiftly\n"+
                                            "open a book and start reading\n"+
                                            "immediately.\n" +
                                            "This application combines all\n"+
                                            "of your books in one place\n"+
                                            "for you to read." +
                                            " Reading eBooks has never been\n"+
                                            "more accessible."
                                            ,"??? About", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aboutMouseClicked

    
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
            java.util.logging.Logger.getLogger(d_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(d_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(d_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(d_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new d_Homepage().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel about;
    public static javax.swing.JTextField age;
    private javax.swing.JLabel background;
    public static javax.swing.JLabel book1;
    public static javax.swing.JLabel book10;
    public static javax.swing.JLabel book11;
    public static javax.swing.JLabel book12;
    public static javax.swing.JLabel book13;
    public static javax.swing.JLabel book2;
    public static javax.swing.JLabel book3;
    public static javax.swing.JLabel book4;
    public static javax.swing.JLabel book5;
    public static javax.swing.JLabel book6;
    public static javax.swing.JLabel book7;
    public static javax.swing.JLabel book8;
    public static javax.swing.JLabel book9;
    public static javax.swing.JTextField card;
    public static javax.swing.JButton closeprofile;
    public static javax.swing.JTextField cvv;
    public static javax.swing.JButton edit;
    public static javax.swing.JTextField email;
    public static javax.swing.JTextField exp;
    public static javax.swing.JButton goL;
    public static javax.swing.JButton goL1;
    public static javax.swing.JButton goL2;
    public static javax.swing.JButton goR;
    public static javax.swing.JButton goR1;
    public static javax.swing.JButton goR2;
    public static javax.swing.JButton library;
    public static javax.swing.JButton logout;
    public static javax.swing.JLabel prof;
    public static javax.swing.JButton profile;
    public static javax.swing.JButton store;
    public static javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
