/**
 *
 * @author pdreiter
 * filename: Team7.java
 * creation date: 05/18/2017
 * description: file containing Team7 class for CSE360 Summer C Project 1
 * Team members:
 *  - Michael Xhu (wilson.xhy@outlook.com)
 *  - Chen Yang (cyang112@asu.edu)
 *  - Sara Goddard (slgoddar@asu.edu)
 *  - Pemma Reiter (pdreiter@asu.edu)
 *  Notes from author: This class was originally created via NetBeans Java Form, but diverged during testing.
 *    Autorelationship via embedded form macros have been deleted and values associated with fields created with original 
 *    form have been manipulated.  
 *
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSE360;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author pdreiter
 */
public class Team7 extends JPanel {

    /**
     * Creates new form Team7
     */
    public Team7() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(128, 64, 240));
        setForeground(new java.awt.Color(128, 12, 64));

        jTextField1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Team 7 : FTW");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    private javax.swing.JTextField jTextField1;
}
