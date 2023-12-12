/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author I SEvEN
 */
public class Restaurant extends javax.swing.JFrame {

    /**
     * Creates new form Restaurant
     */
    public Restaurant() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_pass_admin = new javax.swing.JTextField();
        txt_username_admin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_signin_admin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_signup_admin = new javax.swing.JButton();
        back_home3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(888, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt_pass_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 200, 40));
        getContentPane().add(txt_username_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 200, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Password :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Username :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, 30));

        btn_signin_admin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_signin_admin.setText("Sign in");
        btn_signin_admin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_signin_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signin_adminActionPerformed(evt);
            }
        });
        getContentPane().add(btn_signin_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setText("Click here to sign up :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 280, 70));

        btn_signup_admin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_signup_admin.setText("Sign up");
        btn_signup_admin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_signup_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signup_adminActionPerformed(evt);
            }
        });
        getContentPane().add(btn_signup_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, -1, -1));

        back_home3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back_home3.setText("Back");
        back_home3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back_home3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_home3ActionPerformed(evt);
            }
        });
        getContentPane().add(back_home3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 90, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\I SEvEN\\Documents\\NetBeansProjects\\Restaurant\\back.jpg")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_signin_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signin_adminActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btn_signin_adminActionPerformed

    private void btn_signup_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signup_adminActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
        new signuppage().setVisible(true);
        
    }//GEN-LAST:event_btn_signup_adminActionPerformed

    private void back_home3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_home3ActionPerformed
        // TODO add your handling code here:

        this.dispose();

        new adminoruser().setVisible(true);

    }//GEN-LAST:event_back_home3ActionPerformed

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
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_home3;
    private javax.swing.JButton btn_signin_admin;
    private javax.swing.JButton btn_signup_admin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_pass_admin;
    private javax.swing.JTextField txt_username_admin;
    // End of variables declaration//GEN-END:variables
}