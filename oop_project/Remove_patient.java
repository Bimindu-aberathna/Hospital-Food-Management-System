package oop_project;

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Bimindu
 */


import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Remove_patient extends javax.swing.JFrame {

    /**
     * Creates new form Remove_patient
     */
    final String password ="";
    final String username="root";
    final String URL = "jdbc:mysql://localhost:3308/hospital";    
    Connection con = null;
    PreparedStatement Insertps = null;
    ResultSet rs =null;
    Statement statement;
    String WC;
    
    
    public Remove_patient(String wccode) {
        WC = wccode;
        initComponents();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con = DriverManager.getConnection(URL,username,password);
            } catch (SQLException ex) {
                Logger.getLogger(add_patient.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(add_patient.class.getName()).log(Level.SEVERE, null, ex);
        }
        removepatientcombo();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void removepatientcombo(){         
    String sql = "select PCODE from patient";
        try {
            Insertps = con.prepareStatement(sql);
            rs = Insertps.executeQuery();
            while(rs.next()){
                removepatientcode.addItem(rs.getString("PCODE"));
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
   
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        editpatient = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        enterbutton = new javax.swing.JButton();
        showname = new javax.swing.JLabel();
        showcode = new javax.swing.JLabel();
        showbedcode = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        removebutton = new javax.swing.JButton();
        addpatient = new javax.swing.JButton();
        removepatientcode = new javax.swing.JComboBox<>();
        orderfood = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Remove Patient");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 282, 59));

        editpatient.setBackground(new java.awt.Color(204, 0, 0));
        editpatient.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        editpatient.setForeground(new java.awt.Color(255, 255, 255));
        editpatient.setText("Edit Patient");
        editpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpatientActionPerformed(evt);
            }
        });
        getContentPane().add(editpatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 370, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Patient code");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 90, 30));

        enterbutton.setBackground(new java.awt.Color(0, 204, 51));
        enterbutton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        enterbutton.setForeground(new java.awt.Color(242, 242, 242));
        enterbutton.setText("Enter");
        enterbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(enterbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 180, 120, 40));

        showname.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        getContentPane().add(showname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 310, 250, 30));

        showcode.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        getContentPane().add(showcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 340, 240, 20));

        showbedcode.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        getContentPane().add(showbedcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, 250, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Remove Patient");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 370, 80));

        removebutton.setBackground(new java.awt.Color(255, 0, 0));
        removebutton.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        removebutton.setForeground(new java.awt.Color(242, 242, 242));
        removebutton.setText("Remove");
        removebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(removebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 420, 280, 40));

        addpatient.setBackground(new java.awt.Color(0, 153, 0));
        addpatient.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addpatient.setForeground(new java.awt.Color(255, 255, 255));
        addpatient.setText("Add Patient");
        addpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addpatientActionPerformed(evt);
            }
        });
        getContentPane().add(addpatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 370, 80));

        getContentPane().add(removepatientcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 140, 250, -1));

        orderfood.setBackground(new java.awt.Color(153, 0, 153));
        orderfood.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        orderfood.setForeground(new java.awt.Color(255, 255, 255));
        orderfood.setText("Order Food");
        orderfood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderfoodActionPerformed(evt);
            }
        });
        getContentPane().add(orderfood, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 370, 80));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project images/4400828_1_70x70.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 710, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project images/doctor.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpatientActionPerformed
        // TODO add your handling code here:
        Edit_patient ep = new Edit_patient(WC);
        ep.setVisible(true);
        dispose();
    }//GEN-LAST:event_editpatientActionPerformed

    private void addpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addpatientActionPerformed
        // TODO add your handling code here:
        add_patient ap = new add_patient(WC);
        ap.setVisible(true);
        dispose();
    }//GEN-LAST:event_addpatientActionPerformed

    private void removebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebuttonActionPerformed
        // TODO add your handling code here:
         int YesOrNo = JOptionPane.showConfirmDialog(null,"Do You Want To Remove This Patient","Delete Patient", JOptionPane.YES_NO_OPTION);
        if(YesOrNo == 0)
        {   String apnd = "'"+removepatientcode.getSelectedItem()+"'";
            String sql = "DELETE FROM PATIENT WHERE PCODE = "+apnd ;
            try {
            Insertps = con.prepareStatement(sql);
            int x = Insertps.executeUpdate();
            
                if(x==1){
                    JOptionPane.showMessageDialog(null, "Patient removed Successfully!!");
                }
             
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
          Remove_patient rp = new Remove_patient(WC);
          rp.setVisible(true);  
            
        }else{
             
        }
        
    }//GEN-LAST:event_removebuttonActionPerformed

    private void enterbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterbuttonActionPerformed
        // TODO add your handling code here:
        showcode.setText("Patient Code : "+(String) removepatientcode.getSelectedItem());
        try {
            statement = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Remove_patient.class.getName()).log(Level.SEVERE, null, ex);
        }
        String apnd = "'"+(String) removepatientcode.getSelectedItem()+"'";
        
        try {
            rs = statement.executeQuery("select * from patient where PCODE = "+apnd);
            while(rs.next()){
                            String bed_code=rs.getString("BEDCODE");
                            String name=rs.getString("PNAME");
                            
                            showname.setText("Name   : "+name);
                            showbedcode.setText("Bed Code : "+bed_code);
                                    }
        } catch (SQLException ex) {
            Logger.getLogger(Remove_patient.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
            
        
        
        
    }//GEN-LAST:event_enterbuttonActionPerformed

    private void orderfoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderfoodActionPerformed
        // TODO add your handling code here:
        order_food of = new order_food(WC);
        of.setVisible(true);
        dispose();
    }//GEN-LAST:event_orderfoodActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        login log = new login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Remove_patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Remove_patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Remove_patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Remove_patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Remove_patient(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addpatient;
    private javax.swing.JButton editpatient;
    private javax.swing.JButton enterbutton;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton orderfood;
    private javax.swing.JButton removebutton;
    private javax.swing.JComboBox<String> removepatientcode;
    private javax.swing.JLabel showbedcode;
    private javax.swing.JLabel showcode;
    private javax.swing.JLabel showname;
    // End of variables declaration//GEN-END:variables
}
