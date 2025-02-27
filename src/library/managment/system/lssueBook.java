/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.managment.system;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class lssueBook extends javax.swing.JFrame {

    
    Connection con=Connect.Connection();
    
     PreparedStatement  pst=null;
     ResultSet rs=null;
    
    /**
     * Creates new form lssueBook
     */
    public lssueBook() {
        initComponents();
         SimpleDateFormat  sfd=new SimpleDateFormat("dd/MM/yyyy ");
         Date d=new Date();
         txtissuedate.setText(sfd.format(d));
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
        btnclose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtbookid = new javax.swing.JTextField();
        txtstudentid = new javax.swing.JTextField();
        txtbookname = new javax.swing.JTextField();
        txtduedate = new javax.swing.JTextField();
        txtissuedate = new javax.swing.JTextField();
        btnissue = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/isue.jpg"))); // NOI18N
        jLabel1.setText("Issue Book ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 193, -1));

        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close icon.png"))); // NOI18N
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1091, 0, 40, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Book ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 192, 162, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Issue Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 446, 162, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Book Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 363, 162, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Student ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 288, 162, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Due Data");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 539, 162, 30));

        txtbookid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbookid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbookidActionPerformed(evt);
            }
        });
        getContentPane().add(txtbookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 195, 250, 30));

        txtstudentid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtstudentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 291, 250, 30));

        txtbookname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtbookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 366, 250, 30));

        txtduedate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtduedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 542, 250, 30));

        txtissuedate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtissuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 449, 250, 30));

        btnissue.setBackground(new java.awt.Color(0, 0, 255));
        btnissue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnissue.setForeground(new java.awt.Color(255, 255, 255));
        btnissue.setText("Issue");
        btnissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissueActionPerformed(evt);
            }
        });
        getContentPane().add(btnissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 621, 143, -1));

        btnsearch.setBackground(new java.awt.Color(204, 0, 0));
        btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 195, 135, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/All Page Backgraound.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
     
        if(txtbookid.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Please enter book id and search it");
        txtbookid.requestFocus();
    }
        else{
            try {
                pst=con.prepareStatement("SELECT * FROM library.book where id=?");
                
                pst.setString(1, txtbookid.getText());
                rs=pst.executeQuery();
                
                if(rs.next()){
                    txtbookname.setText(rs.getString(2));
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(lssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtbookidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbookidActionPerformed
       
        

// TODO add your handling code here:
    }//GEN-LAST:event_txtbookidActionPerformed

    private void btnissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissueActionPerformed
     

        
        if(txtbookid.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Please enter book id and search it");
        txtbookid.requestFocus();
    }
        else{
            
            try {
             // PrepareStatement
pst = con.prepareStatement("UPDATE book SET status = 'ISSUED', issuedate = ?, duedate = ?, studentid = ? WHERE id = ?");

// Set parameters
pst.setString(1, txtissuedate.getText()); // Issue date
pst.setString(2, txtduedate.getText());   // Due date
pst.setInt(3, Integer.parseInt(txtstudentid.getText())); // Student ID
pst.setInt(4, Integer.parseInt(txtbookid.getText()));    // Book ID

// Execute the update
pst.executeUpdate();



            
            JOptionPane.showMessageDialog(this, "Book Issued");
            
            txtbookid.setText("");
            txtbookname.setText("");
            txtstudentid.setText("");
            
            txtissuedate.setText("");
            txtduedate.setText("");
           
            
            
            
            } catch (SQLException ex) {
                Logger.getLogger(lssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    


// TODO add your handling code here:
    }//GEN-LAST:event_btnissueActionPerformed

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
            java.util.logging.Logger.getLogger(lssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnissue;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtbookid;
    private javax.swing.JTextField txtbookname;
    private javax.swing.JTextField txtduedate;
    private javax.swing.JTextField txtissuedate;
    private javax.swing.JTextField txtstudentid;
    // End of variables declaration//GEN-END:variables
}
