/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superadmin;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author franq
 */


public class EditSchool extends javax.swing.JFrame {

    /**
     * Creates new form SetSchool
     */
    
    private ArrayList<String> schooldetails;
    
    private String schoolname,schoolgender,schoolbordingdet,motto,tel,mob,email,add,town,key;
    
    
    public EditSchool() {
        schooldetails = selects.QuerySchoolDetails.getSchoolInfo();
        String name,bordingdetails, genderdetails,motto,tel,mob,email,add,town;
        name = schooldetails.get(0);
        bordingdetails = schooldetails.get(1);
        genderdetails = schooldetails.get(2);
        motto = schooldetails.get(3);
        tel = schooldetails.get(4);
        mob = schooldetails.get(5);
        email = schooldetails.get(6);
        add = schooldetails.get(7);
        town = schooldetails.get(8);
        
        
        
            
        initComponents();
        
        //initialize the individual items
        jtfschoolname.setText(name);
        
        if("BORDING".equals(bordingdetails))
            cmbbording.setSelectedIndex(1);
        else if("DAY".equals(bordingdetails))
            cmbbording.setSelectedIndex(2);
        else if("DAY & BORDING".equals(bordingdetails))
            cmbbording.setSelectedIndex(3);
          
        if("BOYS".equals(genderdetails))
            cmbgender.setSelectedIndex(1);
        else if("GIRLS".equals(genderdetails))
            cmbgender.setSelectedIndex(2);
        else if("MIXED".equals(genderdetails))
            cmbgender.setSelectedIndex(3);
               
        jtamotto.setText(motto);
        jtftel.setText(tel);
        jtfmob.setText(mob);
        jtfemail.setText(email);
        jtfadd.setText(add);
        jtftown.setText(town);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmbgender = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        cmbbording = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtfschoolname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtamotto = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtftel = new javax.swing.JFormattedTextField();
        jtfadd = new javax.swing.JFormattedTextField();
        jtftown = new javax.swing.JFormattedTextField();
        jtfmob = new javax.swing.JFormattedTextField();
        jtfemail = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnok = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit School Details");
        setIconImage(selects.QueryMainDetails.setIcon());
        setResizable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 240));
        jLabel6.setText("Enter School Details");

        cmbgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "BOYS", "GIRLS", "MIXED" }));

        jLabel10.setForeground(new java.awt.Color(0, 0, 240));
        jLabel10.setText("Gender Details");

        cmbbording.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "BORDING", "DAY", "DAY & BORDING" }));

        jLabel9.setForeground(new java.awt.Color(0, 0, 240));
        jLabel9.setText("Bording Details");

        jLabel11.setForeground(new java.awt.Color(0, 0, 240));
        jLabel11.setText("School Motto");

        jLabel8.setForeground(new java.awt.Color(0, 0, 240));
        jLabel8.setText("School Name");

        jtamotto.setColumns(20);
        jtamotto.setRows(5);
        jScrollPane1.setViewportView(jtamotto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(cmbbording, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfschoolname)
                    .addComponent(jScrollPane1))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfschoolname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbbording, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel12.setForeground(new java.awt.Color(0, 0, 240));
        jLabel12.setText("Telephone ");

        jLabel13.setForeground(new java.awt.Color(0, 0, 240));
        jLabel13.setText("Mobile");

        jLabel14.setForeground(new java.awt.Color(0, 0, 240));
        jLabel14.setText("Email");

        jLabel15.setForeground(new java.awt.Color(0, 0, 240));
        jLabel15.setText("Physical Address");

        jLabel16.setForeground(new java.awt.Color(0, 0, 240));
        jLabel16.setText("Town");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtftel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtftown, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfadd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfmob, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfemail, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtftel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtfmob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jtfemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jtfadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtftown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jButton5.setText("Edit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cancel");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnok.setText("Ok");
        btnok.setEnabled(false);
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jButton6)
                .addGap(246, 246, 246)
                .addComponent(btnok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(106, 106, 106))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(btnok))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if("".equals(jtfschoolname.getText()))
        {
            JOptionPane.showMessageDialog(null,
                        "Data Was not saved.\n Please Enter School Name\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if(cmbgender.getSelectedIndex() == 0)
        {
           JOptionPane.showMessageDialog(null,
                        "Data Was not saved.\n Please Select school Gender Details\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if(cmbbording.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(null,
                        "Data Was not saved.\n Please Select School Bording Details\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if("".equals(jtamotto.getText()))
        {
            JOptionPane.showMessageDialog(null,
                        "Data Was not saved.\n Please Enter School Motto\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        //check contact details
        else if("".equals(jtftel.getText()))
        {
            JOptionPane.showMessageDialog(null,
                        "Data Was not saved.\n Please Enter School Contact Telephone\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if("".equals(jtfmob.getText()))
        {
            JOptionPane.showMessageDialog(null,
                        "Data Was not saved.\n Please Enter School Contact Mobile\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if("".equals(jtfemail.getText()))
        {
            JOptionPane.showMessageDialog(null,
                        "Data Was not saved.\n Please Enter School email\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if("".equals(jtfadd.getText()))
        {
            JOptionPane.showMessageDialog(null,
                        "Data Was not saved.\n Please Enter School Physical Address Details\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if("".equals(jtftown.getText()))
        {
            JOptionPane.showMessageDialog(null,
                        "Data Was not saved.\n Please Enter Location Details\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        
        else{
            //main details
            schoolname = jtfschoolname.getText().toUpperCase();
            schoolgender = cmbgender.getSelectedItem().toString().toUpperCase();
            schoolbordingdet = cmbbording.getSelectedItem().toString().toUpperCase();
            motto = jtamotto.getText().toUpperCase();
            
            //contact details
            tel = jtftel.getText().toUpperCase();
            mob = jtfmob.getText().toUpperCase();
            email = jtfemail.getText().toLowerCase();
            add = jtfadd.getText().toUpperCase();
            town = jtftown.getText().toUpperCase();
            
            
           
            try {
                //add the data to the database
                sqlupdates.Schoolinfo.updateSchool(schoolname, schoolbordingdet, schoolgender, motto, tel, mob, email, add, town);
                JOptionPane.showMessageDialog(null, "School Details Updated \n" +
                        "Press Ok to Continue", "Success ", JOptionPane.INFORMATION_MESSAGE);
                
                btnok.setEnabled(true);
            } catch (SQLException ex) {
                Logger.getLogger(EditSchool.class.getName()).log(Level.SEVERE, null, ex);
                if(ex.getErrorCode() == 1062)
                         {
                                JOptionPane.showMessageDialog(null, "School Details Already Updated\n" +
                                "Press Ok to continue.", "Failed ", JOptionPane.INFORMATION_MESSAGE);
                          }
                     else 
                          {
                                 JOptionPane.showMessageDialog(null, "Unknown Error. \n" +
                                 "Press Contact the Administrator for further advice", "Error "+ex.getErrorCode(), JOptionPane.INFORMATION_MESSAGE);
                          }
            }
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnokActionPerformed

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
            java.util.logging.Logger.getLogger(EditSchool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditSchool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditSchool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditSchool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditSchool().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnok;
    private javax.swing.JComboBox cmbbording;
    private javax.swing.JComboBox cmbgender;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtamotto;
    private javax.swing.JFormattedTextField jtfadd;
    private javax.swing.JFormattedTextField jtfemail;
    private javax.swing.JFormattedTextField jtfmob;
    private javax.swing.JTextField jtfschoolname;
    private javax.swing.JFormattedTextField jtftel;
    private javax.swing.JFormattedTextField jtftown;
    // End of variables declaration//GEN-END:variables
}