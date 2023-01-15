


import java.sql.*;
import Backend.*;

public class Member_Info extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst,pst2;
    ResultSet rs1,rs2;
    public Member_Info() {
        initComponents();
        con = ConnectSQL.createC();
        update_info();
    }

    

    public void update_info() {
        int gc = 0;
        float income, loan, expense, saving;
        try {
            pst = con.prepareStatement("select count(gid)  from goals where user=?");
             pst.setString(1, Login.usern);
           
            
             rs1= pst.executeQuery();

            while (rs1.next()) {
                gc = rs1.getInt(1);
            }
            
            txtGc.setText(String.valueOf(gc));
//            Expense.setText(String);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Savings = new javax.swing.JLabel();
        Income = new javax.swing.JLabel();
        txtGc = new javax.swing.JLabel();
        Expense = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Loans1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(470, 120));
        setMinimumSize(new java.awt.Dimension(1010, 700));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1010, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 242));
        jPanel1.setMinimumSize(new java.awt.Dimension(925, 625));
        jPanel1.setPreferredSize(new java.awt.Dimension(925, 625));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(192, 223, 241));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 26, -1, 319));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 36, 51));
        jLabel5.setText("TOTAL INCOME :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 330, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(64, 36, 51));
        jLabel6.setText("TOTAL EXPENSES :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 390, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(64, 36, 51));
        jLabel7.setText("TOTAL GOAL COUNT :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 370, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(64, 36, 51));
        jLabel8.setText("TOTAL SAVINGS :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 330, -1));

        Savings.setBackground(new java.awt.Color(255, 255, 242));
        Savings.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        Savings.setText("0 ");
        jPanel3.add(Savings, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 98, -1));

        Income.setBackground(new java.awt.Color(255, 255, 242));
        Income.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        Income.setText("0");
        jPanel3.add(Income, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 98, -1));

        txtGc.setBackground(new java.awt.Color(255, 255, 242));
        txtGc.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        txtGc.setText("0");
        jPanel3.add(txtGc, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 98, -1));

        Expense.setBackground(new java.awt.Color(255, 255, 242));
        Expense.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        Expense.setText("0");
        jPanel3.add(Expense, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 98, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(64, 36, 51));
        jLabel9.setText("TOTAL LOAN :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 330, -1));

        Loans1.setBackground(new java.awt.Color(255, 255, 242));
        Loans1.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        Loans1.setText("0");
        jPanel3.add(Loans1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 98, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 900, 470));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 16, 108));
        jLabel2.setText("MEMBER INFO :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 329, 80));

        jButton3.setBackground(new java.awt.Color(255, 255, 242));
        jButton3.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        jButton3.setForeground(new java.awt.Color(42, 68, 148));
        jButton3.setText("Back");
        jButton3.setToolTipText("");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 148), 2, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1041, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
       
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Expense;
    private javax.swing.JLabel Income;
    private javax.swing.JLabel Loans1;
    private javax.swing.JLabel Savings;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtGc;
    // End of variables declaration//GEN-END:variables
}