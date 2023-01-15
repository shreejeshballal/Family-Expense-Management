
import Backend.ConnectSQL;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Member_Goals_Update extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    Statement pst1;
    ResultSet rs;

    public Member_Goals_Update() {
        initComponents();
        con  = ConnectSQL.createC();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        FetchBut = new javax.swing.JButton();
        txtEDate = new javax.swing.JTextField();
        txtGid = new javax.swing.JTextField();
        txtSDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtGoal = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(470, 120));
        setMinimumSize(new java.awt.Dimension(1040, 720));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1040, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 242));
        jPanel7.setMaximumSize(new java.awt.Dimension(1010, 700));
        jPanel7.setMinimumSize(new java.awt.Dimension(1010, 700));
        jPanel7.setPreferredSize(new java.awt.Dimension(1010, 700));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(192, 223, 241));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FetchBut.setBackground(new java.awt.Color(255, 255, 242));
        FetchBut.setFont(new java.awt.Font("Rockwell", 0, 28)); // NOI18N
        FetchBut.setForeground(new java.awt.Color(42, 68, 146));
        FetchBut.setText("FETCH");
        FetchBut.setToolTipText("");
        FetchBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 68, 148), 2));
        FetchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FetchButActionPerformed(evt);
            }
        });
        jPanel8.add(FetchBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 100, 40));

        txtEDate.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtEDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(26, 69, 124)));
        txtEDate.setMargin(new java.awt.Insets(5, 5, 5, 5));
        txtEDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEDateActionPerformed(evt);
            }
        });
        jPanel8.add(txtEDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 210, 40));

        txtGid.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtGid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(26, 69, 124)));
        txtGid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGidActionPerformed(evt);
            }
        });
        jPanel8.add(txtGid, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 180, 40));

        txtSDate.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtSDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(26, 69, 124)));
        txtSDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDateActionPerformed(evt);
            }
        });
        jPanel8.add(txtSDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 210, 40));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(42, 55, 135));
        jLabel4.setText("END DATE :");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 170, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(42, 55, 135));
        jLabel6.setText("GID :");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, 30));

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(42, 55, 135));
        jLabel7.setText("START DATE :");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(42, 55, 135));
        jLabel8.setText("GOAL :");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, 30));

        txtGoal.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtGoal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(26, 69, 124)));
        txtGoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGoalActionPerformed(evt);
            }
        });
        jPanel8.add(txtGoal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 210, 40));

        jButton9.setBackground(new java.awt.Color(255, 255, 242));
        jButton9.setFont(new java.awt.Font("Rockwell", 0, 28)); // NOI18N
        jButton9.setForeground(new java.awt.Color(42, 68, 146));
        jButton9.setText("UPDATE");
        jButton9.setToolTipText("");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 68, 148), 2));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 150, 40));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 920, 540));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 34, 107));
        jLabel2.setText("GOALS DETAILS:");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 371, 69));

        Back_button.setBackground(new java.awt.Color(255, 255, 242));
        Back_button.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Back_button.setForeground(new java.awt.Color(42, 68, 146));
        Back_button.setText("Back");
        Back_button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 148), 2, true));
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });
        jPanel7.add(Back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 82, 40));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FetchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FetchButActionPerformed
             try {
           
             int GID = Integer.parseInt(txtGid.getText());
             
             pst1 = con.createStatement();
             rs = pst1.executeQuery("select * from goals where gid='"+GID+"'and user='"+Login.usern+"'");
             
             if(rs.next())
             {
            txtGoal.setText(rs.getString(3));
            txtEDate.setText(rs.getString(4));
            txtSDate.setText(rs.getString(5));

             }
        

            JOptionPane.showMessageDialog(this,"Fetched Successfully");

        } catch (SQLException ex) {
                    ex.printStackTrace();
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_FetchButActionPerformed

    private void txtEDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEDateActionPerformed

    private void txtGidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGidActionPerformed

    private void txtSDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDateActionPerformed

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
            dispose();

    }//GEN-LAST:event_Back_buttonActionPerformed

    private void txtGoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGoalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGoalActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
          String goal,sdate,edate,gid;
            goal = txtGoal.getText();
             edate = txtEDate.getText();
             sdate = txtSDate.getText();
              gid = txtGid.getText();

        try {
            pst = con.prepareStatement("update goals set goal=?,startdate=?,enddate=? where gid=? and user=?");
      
            pst.setString(1,goal);
            pst.setString(2,sdate);
            pst.setString(3,edate);
            pst.setString(4,gid);
            pst.setString(5,Login.usern);
            pst.executeUpdate();
            
            
JOptionPane.showMessageDialog(this,"Updated Successfully");
     } catch (SQLException ex) {
        
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,ex);
            
        }

             txtGoal.setText("");
            txtEDate.setText("");
            txtSDate.setText("");
            txtGid.setText("");
            
            txtGoal.requestFocus();
    }//GEN-LAST:event_jButton9ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Member_Goals_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member_Goals_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member_Goals_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member_Goals_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member_Goals_Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JButton FetchBut;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtEDate;
    private javax.swing.JTextField txtGid;
    private javax.swing.JTextField txtGoal;
    private javax.swing.JTextField txtSDate;
    // End of variables declaration//GEN-END:variables
}
