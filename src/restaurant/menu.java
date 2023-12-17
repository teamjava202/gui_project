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
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_order = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rb_roasted = new javax.swing.JRadioButton();
        rb_Chicken_fries = new javax.swing.JRadioButton();
        rb_kabab = new javax.swing.JRadioButton();
        rb_basta = new javax.swing.JRadioButton();
        rb_steak = new javax.swing.JRadioButton();
        rb_gurger = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txt_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\I SEvEN\\Documents\\NetBeansProjects\\Restaurant\\bergur.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\I SEvEN\\Documents\\NetBeansProjects\\Restaurant\\kabab.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\I SEvEN\\Documents\\NetBeansProjects\\Restaurant\\roastedm.jpg")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, -1, -1));

        btn_order.setText("Order");
        getContentPane().add(btn_order, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 110, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\I SEvEN\\Documents\\NetBeansProjects\\Restaurant\\fried.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\I SEvEN\\Documents\\NetBeansProjects\\Restaurant\\bassta.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\I SEvEN\\Documents\\NetBeansProjects\\Restaurant\\steek2.jpg")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        rb_roasted.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rb_roasted.setForeground(new java.awt.Color(255, 255, 255));
        rb_roasted.setText("Roasted");
        getContentPane().add(rb_roasted, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 100, -1));

        rb_Chicken_fries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rb_Chicken_fries.setForeground(new java.awt.Color(255, 255, 255));
        rb_Chicken_fries.setText("Chicken & fries");
        getContentPane().add(rb_Chicken_fries, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 180, -1));

        rb_kabab.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rb_kabab.setForeground(new java.awt.Color(255, 255, 255));
        rb_kabab.setText("Kabab");
        getContentPane().add(rb_kabab, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 90, -1));

        rb_basta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rb_basta.setForeground(new java.awt.Color(255, 255, 255));
        rb_basta.setText("Basta");
        getContentPane().add(rb_basta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));

        rb_steak.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rb_steak.setForeground(new java.awt.Color(255, 255, 255));
        rb_steak.setText("Steak");
        getContentPane().add(rb_steak, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, -1, -1));

        rb_gurger.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rb_gurger.setForeground(new java.awt.Color(255, 255, 255));
        rb_gurger.setText("Burger");
        getContentPane().add(rb_gurger, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\I SEvEN\\Documents\\NetBeansProjects\\Restaurant\\proo.png")); // NOI18N
        jButton1.setText("Profile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 30));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\I SEvEN\\Documents\\NetBeansProjects\\Restaurant\\log-out_3596149ssss.png")); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Go to admin page");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 200, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("Dessert");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 160, 40));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setText("Food");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 160, 40));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setText("Drinks");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 160, 40));

        txt_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 160, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\I SEvEN\\Documents\\NetBeansProjects\\Restaurant\\front.jpg")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 890, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
        new Dessert().setVisible(true);
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
        new Drinks().setVisible(true);
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
        new Profile().setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
        new Restaurant().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
        new adminpage().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_order;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rb_Chicken_fries;
    private javax.swing.JRadioButton rb_basta;
    private javax.swing.JRadioButton rb_gurger;
    private javax.swing.JRadioButton rb_kabab;
    private javax.swing.JRadioButton rb_roasted;
    private javax.swing.JRadioButton rb_steak;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
