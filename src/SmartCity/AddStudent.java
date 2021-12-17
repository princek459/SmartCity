/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SmartCity;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddStudent extends javax.swing.JFrame {

    /**
     * Creates new form AddStudent
     */
    
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    
    private static String USERNAME = "root";
    private static String PASSWORD = "";
    public static final String URL = "jdbc:mysql://localhost:8081/citydb";
    
    public AddStudent() {
        initComponents();
        
        //Exception Handling
        try {
                // Establishing the connection
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                
                //Test the connection
                JOptionPane.showMessageDialog(null,"Connection Successful!");
                
            } catch (SQLException ex) {
                System.out.println("Errorrr" + ex.getMessage());
            }
        
        updatingTable();
    }
    
    public void updatingTable(){
    int c;
        
        String SQL1 = "SELECT * FROM student";
        
        try{
            pst = conn.prepareStatement(SQL1);
            rs = pst.executeQuery();
            
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            
            DefaultTableModel d = (DefaultTableModel)table2.getModel();
            d.setRowCount(0);
            
            while(rs.next()){
                Vector v2 = new Vector();
                
                for(int i = 1; i <= c; i++){
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("description"));
                    v2.add(rs.getString("location"));
                    v2.add(rs.getString("contact"));
                }
                d.addRow(v2);
            }
            
        } catch (SQLException eg) {
            System.out.println("Errorrr" + eg.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtdescription = new javax.swing.JTextField();
        txtlocation = new javax.swing.JTextField();
        txtcontact = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Cancel = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        txtdescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescriptionActionPerformed(evt);
            }
        });

        txtlocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlocationActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        jLabel3.setText("Desciption:");

        jLabel4.setText("Location:");

        jLabel5.setText("Contact:");

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Add Student Information");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID:", "Desciption:", "Location:", "Contact:"
            }
        ));
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(55, 55, 55))
                            .addComponent(Add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delete, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtid, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtdescription, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtlocation, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Cancel))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel6)))
                .addGap(26, 26, 26))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Add, Cancel, Delete, Update});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtdescription, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtlocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(43, 43, 43)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Delete)
                            .addComponent(Cancel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(87, 87, 87))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Add, Cancel, Delete, Update});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescriptionActionPerformed

    private void txtlocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlocationActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtid.getText());
        String description = txtdescription.getText();
        String location = txtlocation.getText();
        String contact = txtcontact.getText();
        String SQL = "INSERT INTO student VALUES (?,?,?,?)";

        try{

            pst = conn.prepareStatement(SQL);
            
            // Setting parameter vallues based on the parameter order
            pst.setInt(1, id);
            pst.setString(2, description);
            pst.setString(3, location);
            pst.setString(4, contact);           
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Student Info Addded");
            updatingTable();
            txtdescription.setText("");
            txtlocation.setText("");
            txtcontact.setText("");
            txtdescription.requestFocus();
            txtlocation.requestFocus();
            txtcontact.requestFocus(); 
            
        } catch (SQLException ex) {
            System.out.println("Errorrr" + ex.getMessage());
        }
    }//GEN-LAST:event_AddActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)table2.getModel();
        int selectIndex = table2.getSelectedRow();
    
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        
        String description = txtdescription.getText();
        String location = txtlocation.getText();
        String contact = txtcontact.getText();
        
        try{

            pst = conn.prepareStatement("UPDATE student SET description=?, location=?, contact=? WHERE id = ?");
            
            // Setting parameter vallues based on the parameter order
            pst.setString(1, description);
            pst.setString(2, location);
            pst.setString(3, contact);
            pst.setInt(4, id);
            pst.executeUpdate();
            
            
            if(pst.executeUpdate() == 1){
                JOptionPane.showMessageDialog(this,"Student Info Updated");
                txtdescription.setText("");
                txtlocation.setText("");
                txtcontact.setText("");
                updatingTable();
                Add.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this,"Errror updating info");
            }
            
            
        } catch (SQLException ex) {
            System.out.println("Errorrr" + ex.getMessage());
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_CancelActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)table2.getModel();
        int selectIndex = table2.getSelectedRow();
    
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        
       
        try{

            pst = conn.prepareStatement("DELETE FROM student WHERE id = ?");
            
            // Setting parameter vallues based on the parameter order
            pst.setInt(1, id);
            
            
            if(pst.executeUpdate() == 1){
                JOptionPane.showMessageDialog(this,"Student Info Deleted");
                txtdescription.setText("");
                txtcontact.setText("");
                txtlocation.setText("");
                updatingTable();
                Add.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this,"Errror Deleting Student Info");
            }
            
            
        } catch (SQLException ex) {
            System.out.println("Errorrr" + ex.getMessage());
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)table2.getModel();
        int selectIndex = table2.getSelectedRow();
    
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
    
        txtdescription.setText(d1.getValueAt(selectIndex, 1).toString());
        txtlocation.setText(d1.getValueAt(selectIndex, 2).toString());
        txtcontact.setText(d1.getValueAt(selectIndex, 3).toString());
 
    
        Add.setEnabled(false);
    }//GEN-LAST:event_table2MouseClicked

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table2;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtdescription;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlocation;
    // End of variables declaration//GEN-END:variables
}
