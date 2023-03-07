/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_project;

/**
 *
 * @author Bimindu
 * 
 */
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
public class chef1 extends javax.swing.JFrame {
    final String password ="";
    final String username="root";
    final String URL = "jdbc:mysql://localhost:3308/hospital";    
    Connection con = null;
    PreparedStatement Insertps = null;
    ResultSet rs =null;
    /**
     * Creates new form chef
     */
    public chef1() {
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
        showdata();
        style();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void showdata(){
        String sql = "SELECT P.BEDCODE,o.FOODNAME,p.PCODE,P.ALLERGY FROM ORDERS O INNER JOIN PATIENT P ON P.PCODE = O.PCODE and o.DELIVERED=0;";
         try {
            Insertps = con.prepareStatement(sql);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
           
            rs = Insertps.executeQuery();
            while(rs.next()){
             
              // model.addRow(new Object[]{rs.getString("FOODCODE"),rs.getString("BEDCODE"),rs.getString("FOODCODE")});
              model.addRow(new Object[]{rs.getString("BEDCODE"),rs.getString("FOODNAME"),rs.getString("PCODE"),rs.getString("ALLERGY")});
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(add_patient.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    public void style(){
        JTableHeader header = jTable1.getTableHeader();
        header.setBackground(Color.green);
        header.setForeground(Color.blue);
        header.setFont(new Font("Tahome",Font.BOLD,16));
    }
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutbutton = new javax.swing.JButton();
        refreshbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        resetbutton = new javax.swing.JButton();
        mealcountbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project images/4400828_1_70x70.png"))); // NOI18N
        logoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 700, 80, 80));

        refreshbutton.setBackground(new java.awt.Color(0, 153, 0));
        refreshbutton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        refreshbutton.setForeground(new java.awt.Color(255, 255, 255));
        refreshbutton.setText("Refresh");
        refreshbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(refreshbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 380, 90));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 153));
        jLabel2.setText("Hello Welcome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        resetbutton.setBackground(new java.awt.Color(204, 0, 0));
        resetbutton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        resetbutton.setForeground(new java.awt.Color(255, 255, 255));
        resetbutton.setText("Reset");
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(resetbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 380, 90));

        mealcountbutton.setBackground(new java.awt.Color(204, 204, 0));
        mealcountbutton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mealcountbutton.setForeground(new java.awt.Color(255, 255, 255));
        mealcountbutton.setText("Meal Counts");
        mealcountbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mealcountbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(mealcountbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 380, 90));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bed Code", "Food Name", "Patient Code", "Allergies"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 930, 700));

        jLabel4.setBackground(new java.awt.Color(51, 0, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Preferences");
        jLabel4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 380, 90));

        jLabel1.setBackground(new java.awt.Color(255, 51, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project images/kithen.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1930, 1090));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 330, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbuttonActionPerformed
        // TODO add your handling code here:
        jTable1.setModel(new DefaultTableModel(null,new String[]{"Bed Code","Food Name","Patient Code","Allergies"}));
        showdata();
    }//GEN-LAST:event_refreshbuttonActionPerformed

    private void mealcountbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mealcountbuttonActionPerformed
        // TODO add your handling code here:
        chef2 cf =new chef2();
        cf.setVisible(true);
        dispose();
    }//GEN-LAST:event_mealcountbuttonActionPerformed

    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
        // TODO add your handling code here:
        
        jTable1.setModel(new DefaultTableModel(null,new String[]{"Bed Code","Food Name","Patient Code","Allergies"}));
        
    }//GEN-LAST:event_resetbuttonActionPerformed

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        // TODO add your handling code here:
        login log = new login();
        log.setVisible(true);
    }//GEN-LAST:event_logoutbuttonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int YesOrNo = JOptionPane.showConfirmDialog(null,"Did you delivered this order ?","Delivery", JOptionPane.YES_NO_OPTION);
        if(YesOrNo==0){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedrow = jTable1.getSelectedRow();
        String pcode = model.getValueAt(selectedrow,2).toString();
        String food = model.getValueAt(selectedrow,1).toString();
        String sql = "UPDATE orders set DELIVERED=1 WHERE PCODE='"+pcode+"' and FOODNAME = '"+food+"'";
        try {
            Insertps = con.prepareStatement(sql);
            int x = Insertps.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(chef1.class.getName()).log(Level.SEVERE, null, ex);
        }
        }  
        
    }//GEN-LAST:event_jTable1MouseClicked

    
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
            java.util.logging.Logger.getLogger(chef1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chef1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chef1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chef1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chef1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JButton mealcountbutton;
    private javax.swing.JButton refreshbutton;
    private javax.swing.JButton resetbutton;
    // End of variables declaration//GEN-END:variables
}
