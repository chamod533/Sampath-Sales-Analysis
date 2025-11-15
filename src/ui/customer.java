/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import code.customerCode;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class customer extends javax.swing.JFrame {

    /**
     * Creates new form customer
     */
    public customer() {
        initComponents();
        show_customer();
        sum();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbltotalAmount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tblCustomer.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Name", "Telephone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCustomer.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblCustomerAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tblCustomer);
        if (tblCustomer.getColumnModel().getColumnCount() > 0) {
            tblCustomer.getColumnModel().getColumn(0).setResizable(false);
            tblCustomer.getColumnModel().getColumn(1).setResizable(false);
            tblCustomer.getColumnModel().getColumn(2).setResizable(false);
            tblCustomer.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Search By Name :");

        lbltotalAmount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbltotalAmount.setText("0.00");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 102));
        jLabel2.setText("Customer Page");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbltotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lbltotalAmount)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            MessageFormat header = new MessageFormat("Anual Reports");
            MessageFormat footer = new MessageFormat("Page{0, number, integer}");
            tblCustomer.print(JTable.PrintMode.FIT_WIDTH, header, footer);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        ArrayList<customerCode> list = new ArrayList<customerCode>();
        String search = txtSearch.getText().trim();
        try {
            Connection con;
            Statement st;
            con = db.db.getConnection();
            st = con.createStatement();
            String query = "Select * from customer where name like '%" + search + "%'";
            ResultSet rs = st.executeQuery(query);
            customerCode cus;
            while (rs.next()) {
                cus = new customerCode(rs.getString("c_id"), rs.getString("name"), rs.getString("telephone"), rs.getString("email"));
                list.add(cus);
            }

            DefaultTableModel model = (DefaultTableModel) tblCustomer.getModel();
            model.setRowCount(0);

            Object[] row = new Object[4];

            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getC_id();
                row[1] = list.get(i).getName();
                row[2] = list.get(i).getTelephone();
                row[3] = list.get(i).getEmail();

                model.addRow(row);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_txtSearchKeyReleased

    private void tblCustomerAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblCustomerAncestorAdded
        // TODO add your handling code here: 
        tblCustomer.getTableHeader().setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        tblCustomer.getTableHeader().setOpaque(true);
        tblCustomer.getTableHeader().setBackground(new java.awt.Color(235, 235, 235)); // light grey
        tblCustomer.getTableHeader().setForeground(java.awt.Color.BLACK); // black text

// ---------- ROWS (White Background) ----------
        tblCustomer.setRowHeight(28);
        tblCustomer.setFont(new java.awt.Font("Segoe UI", 0, 14));
        tblCustomer.setBackground(java.awt.Color.WHITE);  // white rows

// ---------- GRID LINES (Bright Green) ----------
        tblCustomer.setShowGrid(true);
        tblCustomer.setGridColor(new java.awt.Color(0, 220, 0)); // bright green like picture

// ---------- OPTIONAL: No selection highlight ----------
        tblCustomer.setSelectionBackground(new java.awt.Color(204, 255, 204)); // soft green
        tblCustomer.setSelectionForeground(java.awt.Color.BLACK);


    }//GEN-LAST:event_tblCustomerAncestorAdded

    public ArrayList<customerCode> CustomerList() {
        ArrayList<customerCode> CustomerList = new ArrayList<>();
        try {
            Connection con;
            Statement st;
            con = db.db.getConnection();
            st = con.createStatement();
            String query = "Select * from customer";
            ResultSet rs = st.executeQuery(query);
            customerCode cus;
            while (rs.next()) {
                cus = new customerCode(rs.getString("c_id"), rs.getString("name"), rs.getString("telephone"), rs.getString("email"));
                CustomerList.add(cus);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return CustomerList;
    }

    public void show_customer() {
        ArrayList<customerCode> list = CustomerList();
        DefaultTableModel model = (DefaultTableModel) tblCustomer.getModel();
        Object[] row = new Object[4];

        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getC_id();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getTelephone();
            row[3] = list.get(i).getEmail();

            model.addRow(row);
        }

    }

    public void sum() {
        int total = tblCustomer.getRowCount(); // count rows
        lbltotalAmount.setText(String.valueOf(total));

    }

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
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltotalAmount;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
