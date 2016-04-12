/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import testSystem.MainFrame;
import testSystem.User;

/**
 *
 * @author Alejandro, Alec, Zane, Tucker
 * @version 12/5/14
 *
 */
public class Login extends javax.swing.JPanel {
    private MainFrame parentFrame;
    private String name;
    private String pass;

    /**
     * Creates new form Login
     */
    public Login(MainFrame frame) {
        
        initComponents();
        this.parentFrame = frame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameEntry = new javax.swing.JTextField();
        passwordEntry = new javax.swing.JPasswordField();
        signInButton = new javax.swing.JButton();
        createAccountButton = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setBackground(new java.awt.Color(188, 239, 252));
        setMaximumSize(new java.awt.Dimension(860, 560));
        setMinimumSize(new java.awt.Dimension(860, 560));
        setPreferredSize(new java.awt.Dimension(860, 560));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        jLabel1.setText("Test Taking System");

        jPanel1.setBackground(new java.awt.Color(117, 184, 223));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(18, 145, 209), 4));

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel3.setText("Username:");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel4.setText("Password:");

        nameEntry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameEntryFocusLost(evt);
            }
        });

        passwordEntry.setText("jPasswordField1");
        passwordEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordEntryActionPerformed(evt);
            }
        });
        passwordEntry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordEntryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordEntryFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {nameEntry, passwordEntry});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel4});

        signInButton.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        signInButton.setText("Sign In");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        createAccountButton.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        createAccountButton.setText("Create Account");
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 257, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(249, 249, 249))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {createAccountButton, signInButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signInButton)
                    .addComponent(createAccountButton))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {createAccountButton, signInButton});

    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Sign into the system and send to Menu Screen.
     * @param evt 
     */
    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        try {
            login();
            //User user = new User("username", "password", "email", 0);
            //Here to go straight into system for testing
            //this.parentFrame.changePanel(this.parentFrame.getStudentMenu(user));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_signInButtonActionPerformed

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        this.parentFrame.changePanel(this.parentFrame.getCreateAccount());
    }//GEN-LAST:event_createAccountButtonActionPerformed

    private void nameEntryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameEntryFocusLost
        this.name = this.nameEntry.getText();
    }//GEN-LAST:event_nameEntryFocusLost

    private void passwordEntryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordEntryFocusLost
        StringBuilder build = new StringBuilder(this.passwordEntry.getPassword().length);
        build.append(this.passwordEntry.getPassword());
        this.pass = build.toString();
    }//GEN-LAST:event_passwordEntryFocusLost

    private void passwordEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordEntryActionPerformed
       
    }//GEN-LAST:event_passwordEntryActionPerformed

    private void passwordEntryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordEntryFocusGained
        this.passwordEntry.selectAll();
    }//GEN-LAST:event_passwordEntryFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAccountButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameEntry;
    private javax.swing.JPasswordField passwordEntry;
    private javax.swing.JButton signInButton;
    // End of variables declaration//GEN-END:variables

    private void login() throws FileNotFoundException {
        User user = this.parentFrame.searchUsers(this.name, this.pass);
        if (user != null) {
            JOptionPane.showMessageDialog(this.parentFrame, "Login Successful");
            switch (user.getPermissionNum()) {
            case 0:
                this.parentFrame.changePanel(this.parentFrame.getStudentMenu(user));
                break;
            case 1:
                this.parentFrame.changePanel(this.parentFrame.getInstructorMenu(user));
                break;
            case 2:
                this.parentFrame.changePanel(this.parentFrame.getAdminMenu(user));
                break;
            default:
                javax.swing.JOptionPane.showMessageDialog(this.parentFrame,
                        "Error in permission information, signing out.");
                this.parentFrame.changePanel(this.parentFrame.getLogin());
                break;
        }
                
        }
        else
            JOptionPane.showMessageDialog(this.parentFrame, 
                    "No user found with input username and password.");
    }
}
