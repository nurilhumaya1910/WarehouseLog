package com.Home;

import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Connection;

public class panelBarang extends javax.swing.JFrame {

    private void empty_form(){
        fieldKode.setEditable(true);
        fieldKode.setText(null);
        fieldNama.setText(null);
        fieldJenis.setText(null);
        fieldJumlah.setText(null);
        fieldSupplier.setText(null);
        fieldTanggal.setText(null);
    }
    
    private void print_data(){       
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("No. ");
        model.addColumn("Kode");
        model.addColumn("Nama");
        model.addColumn("Jenis");
        model.addColumn("Jumlah");
        model.addColumn("Supplier");
        model.addColumn("Tanggal Terima");
        
        try{
            int no = 1;
            String sql = "SELECT * FROM barang";
            java.sql.Connection conn = (Connection)config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
            }
            tableBarang.setModel(model);
            
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    public panelBarang() {
        initComponents();
        print_data();
        empty_form();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        kode = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        jenis = new javax.swing.JLabel();
        jumlah = new javax.swing.JLabel();
        supplier = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        fieldKode = new javax.swing.JTextField();
        fieldNama = new javax.swing.JTextField();
        fieldJenis = new javax.swing.JTextField();
        fieldJumlah = new javax.swing.JTextField();
        fieldSupplier = new javax.swing.JTextField();
        fieldTanggal = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBarang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Warehouse Log");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("HelveticaNeueLT Std", 1, 24)); // NOI18N
        title.setText("Data Barang");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 39, -1, -1));

        kode.setText("Kode");
        getContentPane().add(kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 81, -1, -1));

        nama.setText("Nama");
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 119, -1, -1));

        jenis.setText("Jenis");
        getContentPane().add(jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 157, -1, -1));

        jumlah.setText("Jumlah");
        getContentPane().add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 195, -1, -1));

        supplier.setText("Supplier");
        getContentPane().add(supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 232, -1, -1));

        tanggal.setText("Tanggal Diterima");
        getContentPane().add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 270, -1, -1));
        getContentPane().add(fieldKode, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 78, 150, -1));
        getContentPane().add(fieldNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 116, 150, -1));

        fieldJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldJenisActionPerformed(evt);
            }
        });
        getContentPane().add(fieldJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 154, 150, -1));
        getContentPane().add(fieldJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 192, 150, -1));

        fieldSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSupplierActionPerformed(evt);
            }
        });
        getContentPane().add(fieldSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 229, 150, -1));

        fieldTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTanggalActionPerformed(evt);
            }
        });
        getContentPane().add(fieldTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 267, 150, -1));

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 305, -1, -1));

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 305, -1, -1));

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 305, -1, -1));

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        getContentPane().add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 305, -1, -1));

        tableBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBarang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 365, -1, 150));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTanggalActionPerformed
    
    }//GEN-LAST:event_fieldTanggalActionPerformed

    private void fieldJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldJenisActionPerformed
    
    }//GEN-LAST:event_fieldJenisActionPerformed

    private void fieldSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSupplierActionPerformed

    }//GEN-LAST:event_fieldSupplierActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try{
            String sql = "INSERT INTO barang VALUES ('"+fieldKode.getText()+"','"+fieldNama.getText()+"','"+fieldJenis.getText()+"','"+fieldJumlah.getText()+"','"+fieldSupplier.getText()+"','"+fieldTanggal.getText()+"')";
            java.sql.Connection conn = (Connection)config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Save Successful!");
            print_data();
            empty_form();
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void tableBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBarangMouseClicked
        int baris = tableBarang.rowAtPoint(evt.getPoint());
        
        String Kode = tableBarang.getValueAt(baris, 1).toString();
        fieldKode.setText(Kode);
        String Nama = tableBarang.getValueAt(baris, 2).toString();
        fieldKode.setText(Nama);
        String Jenis = tableBarang.getValueAt(baris, 3).toString();
        fieldKode.setText(Jenis);
        String Jumlah = tableBarang.getValueAt(baris, 4).toString();
        fieldKode.setText(Jumlah);
        String Supplier = tableBarang.getValueAt(baris, 5).toString();
        fieldKode.setText(Supplier);
        String Tanggal = tableBarang.getValueAt(baris, 6).toString();
        fieldKode.setText(Tanggal);
    }//GEN-LAST:event_tableBarangMouseClicked

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        empty_form();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        try{
            String sql = "UPDATE barang SET kode_barang='"+fieldKode.getText()+"',nama_barang='"+fieldNama.getText()+"',jenis_barang='"+fieldJenis.getText()+"',jumlah_barang='"+fieldJumlah.getText()+"',supplier_barang='"+fieldSupplier.getText()+"',tanggal_terima='"+fieldTanggal.getText()+"' WHERE kode_barang = '"+fieldKode.getText()+"'";
            java.sql.Connection conn = (Connection)config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit Successful!");
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        print_data();
        empty_form();
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try{
            String sql = "DELETE FROM barang WHERE kode_barang='"+fieldKode.getText()+"'";
            java.sql.Connection conn = (Connection)config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Delete Successful!");
        
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        print_data();
        empty_form();
    }//GEN-LAST:event_deleteButtonActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(panelBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panelBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panelBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panelBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panelBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField fieldJenis;
    private javax.swing.JTextField fieldJumlah;
    private javax.swing.JTextField fieldKode;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldSupplier;
    private javax.swing.JTextField fieldTanggal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jenis;
    private javax.swing.JLabel jumlah;
    private javax.swing.JLabel kode;
    private javax.swing.JLabel nama;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel supplier;
    private javax.swing.JTable tableBarang;
    private javax.swing.JLabel tanggal;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
