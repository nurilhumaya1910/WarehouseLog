package com.Home;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JPanel;

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
        
        model.addColumn("Kode");
        model.addColumn("Nama");
        model.addColumn("Jenis");
        model.addColumn("Jumlah");
        model.addColumn("Supplier");
        model.addColumn("Tanggal Terima");
        
        try{
            String sql = "SELECT * FROM barang";
            java.sql.Connection conn = (Connection)config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
            }
            tableBarang.setModel(model);
            
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    private void setColor(JPanel panel){
        panel.setBackground(new Color(207,117,0));
    }
    
    private void resetColor(JPanel panel){
        panel.setBackground(new Color(240,165,0));
    }
    
    public panelBarang() {
        initComponents();
        print_data();
        empty_form();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainContainer = new javax.swing.JPanel();
        menuContainer = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        panelTambahData = new javax.swing.JPanel();
        tambahData = new javax.swing.JLabel();
        panelGudang = new javax.swing.JPanel();
        gudang = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();
        addDataContainer = new javax.swing.JPanel();
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
        separator1 = new javax.swing.JSeparator();
        separator2 = new javax.swing.JSeparator();
        separator3 = new javax.swing.JSeparator();
        separator4 = new javax.swing.JSeparator();
        separator5 = new javax.swing.JSeparator();
        separator6 = new javax.swing.JSeparator();
        databaseContainer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBarang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Warehouse Log");

        menuContainer.setBackground(new java.awt.Color(240, 165, 0));
        menuContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setFont(new java.awt.Font("Thin Lines and Curves", 0, 14)); // NOI18N
        logo.setText("WAREHOUSE");
        menuContainer.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 58, -1, -1));

        panelTambahData.setBackground(new java.awt.Color(207, 117, 0));
        panelTambahData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelTambahData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelTambahDataMousePressed(evt);
            }
        });

        tambahData.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tambahData.setForeground(new java.awt.Color(240, 240, 240));
        tambahData.setText("Tambah Data");

        javax.swing.GroupLayout panelTambahDataLayout = new javax.swing.GroupLayout(panelTambahData);
        panelTambahData.setLayout(panelTambahDataLayout);
        panelTambahDataLayout.setHorizontalGroup(
            panelTambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahDataLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(tambahData)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panelTambahDataLayout.setVerticalGroup(
            panelTambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahDataLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(tambahData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuContainer.add(panelTambahData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 176, 40));

        panelGudang.setBackground(new java.awt.Color(240, 165, 0));
        panelGudang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelGudang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelGudangMouseClicked(evt);
            }
        });

        gudang.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        gudang.setForeground(new java.awt.Color(240, 240, 240));
        gudang.setText("Gudang");

        javax.swing.GroupLayout panelGudangLayout = new javax.swing.GroupLayout(panelGudang);
        panelGudang.setLayout(panelGudangLayout);
        panelGudangLayout.setHorizontalGroup(
            panelGudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGudangLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(gudang)
                .addGap(65, 65, 65))
        );
        panelGudangLayout.setVerticalGroup(
            panelGudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGudangLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(gudang)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        menuContainer.add(panelGudang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 176, 40));

        cardPanel.setBackground(new java.awt.Color(219, 219, 219));
        cardPanel.setLayout(new java.awt.CardLayout());

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setText("Data Barang");

        kode.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        kode.setForeground(new java.awt.Color(102, 102, 102));
        kode.setText("KODE");

        nama.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        nama.setForeground(new java.awt.Color(102, 102, 102));
        nama.setText("NAMA");

        jenis.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jenis.setForeground(new java.awt.Color(102, 102, 102));
        jenis.setText("JENIS");

        jumlah.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jumlah.setForeground(new java.awt.Color(102, 102, 102));
        jumlah.setText("JUMLAH");

        supplier.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        supplier.setForeground(new java.awt.Color(102, 102, 102));
        supplier.setText("SUPPLIER");

        tanggal.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        tanggal.setForeground(new java.awt.Color(102, 102, 102));
        tanggal.setText("TANGGAL TERIMA");

        fieldKode.setBackground(new java.awt.Color(240, 240, 240));
        fieldKode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fieldKode.setForeground(new java.awt.Color(51, 51, 51));
        fieldKode.setText("e.x 011");
        fieldKode.setBorder(null);
        fieldKode.setOpaque(false);
        fieldKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldKodeActionPerformed(evt);
            }
        });

        fieldNama.setBackground(new java.awt.Color(240, 240, 240));
        fieldNama.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fieldNama.setForeground(new java.awt.Color(51, 51, 51));
        fieldNama.setText("e.x");
        fieldNama.setBorder(null);
        fieldNama.setOpaque(false);
        fieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNamaActionPerformed(evt);
            }
        });

        fieldJenis.setBackground(new java.awt.Color(240, 240, 240));
        fieldJenis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fieldJenis.setForeground(new java.awt.Color(51, 51, 51));
        fieldJenis.setText("e.x");
        fieldJenis.setBorder(null);
        fieldJenis.setOpaque(false);
        fieldJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldJenisActionPerformed(evt);
            }
        });

        fieldJumlah.setBackground(new java.awt.Color(240, 240, 240));
        fieldJumlah.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fieldJumlah.setForeground(new java.awt.Color(51, 51, 51));
        fieldJumlah.setText("e.x");
        fieldJumlah.setBorder(null);
        fieldJumlah.setOpaque(false);

        fieldSupplier.setBackground(new java.awt.Color(240, 240, 240));
        fieldSupplier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fieldSupplier.setForeground(new java.awt.Color(51, 51, 51));
        fieldSupplier.setText("e.x");
        fieldSupplier.setBorder(null);
        fieldSupplier.setOpaque(false);
        fieldSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSupplierActionPerformed(evt);
            }
        });

        fieldTanggal.setBackground(new java.awt.Color(240, 240, 240));
        fieldTanggal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fieldTanggal.setForeground(new java.awt.Color(51, 51, 51));
        fieldTanggal.setText("e.x");
        fieldTanggal.setBorder(null);
        fieldTanggal.setOpaque(false);
        fieldTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTanggalActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh");
        refreshButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        separator1.setBackground(new java.awt.Color(51, 51, 51));
        separator1.setForeground(new java.awt.Color(51, 51, 51));

        separator2.setBackground(new java.awt.Color(51, 51, 51));
        separator2.setForeground(new java.awt.Color(51, 51, 51));

        separator3.setBackground(new java.awt.Color(51, 51, 51));
        separator3.setForeground(new java.awt.Color(51, 51, 51));

        separator4.setBackground(new java.awt.Color(51, 51, 51));
        separator4.setForeground(new java.awt.Color(51, 51, 51));

        separator5.setBackground(new java.awt.Color(51, 51, 51));
        separator5.setForeground(new java.awt.Color(51, 51, 51));

        separator6.setBackground(new java.awt.Color(51, 51, 51));
        separator6.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout addDataContainerLayout = new javax.swing.GroupLayout(addDataContainer);
        addDataContainer.setLayout(addDataContainerLayout);
        addDataContainerLayout.setHorizontalGroup(
            addDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDataContainerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(addDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addDataContainerLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(submitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshButton)
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addGroup(addDataContainerLayout.createSequentialGroup()
                        .addGroup(addDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(separator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(addDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nama)
                                    .addGroup(addDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(fieldNama, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(kode, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(title, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jenis, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fieldKode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(separator3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(separator5, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addComponent(fieldJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(addDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(supplier)
                            .addGroup(addDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fieldSupplier, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(fieldJumlah, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tanggal, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(separator2)
                                .addComponent(jumlah, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(separator4)
                                .addComponent(separator6))
                            .addComponent(fieldTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        addDataContainerLayout.setVerticalGroup(
            addDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDataContainerLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(addDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addDataContainerLayout.createSequentialGroup()
                        .addGroup(addDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(addDataContainerLayout.createSequentialGroup()
                                .addComponent(jumlah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addDataContainerLayout.createSequentialGroup()
                                .addComponent(title)
                                .addGap(18, 18, 18)
                                .addComponent(kode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldKode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(addDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(addDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(supplier)
                            .addComponent(nama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fieldSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(separator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addDataContainerLayout.createSequentialGroup()
                        .addComponent(tanggal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addDataContainerLayout.createSequentialGroup()
                        .addComponent(jenis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(addDataContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(editButton)
                    .addComponent(deleteButton)
                    .addComponent(refreshButton))
                .addGap(50, 50, 50))
        );

        cardPanel.add(addDataContainer, "card20");

        tableBarang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        tableBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableBarang.setFocusable(false);
        tableBarang.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableBarang.setRowHeight(20);
        tableBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBarang);

        javax.swing.GroupLayout databaseContainerLayout = new javax.swing.GroupLayout(databaseContainer);
        databaseContainer.setLayout(databaseContainerLayout);
        databaseContainerLayout.setHorizontalGroup(
            databaseContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(databaseContainerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        databaseContainerLayout.setVerticalGroup(
            databaseContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(databaseContainerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        cardPanel.add(databaseContainer, "card3");

        javax.swing.GroupLayout mainContainerLayout = new javax.swing.GroupLayout(mainContainer);
        mainContainer.setLayout(mainContainerLayout);
        mainContainerLayout.setHorizontalGroup(
            mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(mainContainerLayout.createSequentialGroup()
                .addComponent(menuContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mainContainerLayout.setVerticalGroup(
            mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBarangMouseClicked
        int baris = tableBarang.rowAtPoint(evt.getPoint());
        
        String Kode = tableBarang.getValueAt(baris, 0).toString();
        fieldKode.setText(Kode);
        String Nama = tableBarang.getValueAt(baris, 1).toString();
        fieldNama.setText(Nama);
        String Jenis = tableBarang.getValueAt(baris, 2).toString();
        fieldJenis.setText(Jenis);
        String Jumlah = tableBarang.getValueAt(baris, 3).toString();
        fieldJumlah.setText(Jumlah);
        String Supplier = tableBarang.getValueAt(baris, 4).toString();
        fieldSupplier.setText(Supplier);
        String Tanggal = tableBarang.getValueAt(baris, 5).toString();
        fieldTanggal.setText(Tanggal);
    }//GEN-LAST:event_tableBarangMouseClicked

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        empty_form();
    }//GEN-LAST:event_refreshButtonActionPerformed

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

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        try{
            String sql = "UPDATE barang SET kode_barang='"+fieldKode.getText()+"',nama_barang='"+fieldNama.getText()+"',jenis_barang='"+fieldJenis.getText()+"',jumlah_barang='"+fieldJumlah.getText()+"',supplier_barang='"+fieldSupplier.getText()+"',tanggal_terima='"+fieldTanggal.getText()+"' WHERE kode_barang='"+fieldKode.getText()+"'";
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

    private void fieldTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTanggalActionPerformed

    }//GEN-LAST:event_fieldTanggalActionPerformed

    private void fieldSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSupplierActionPerformed

    }//GEN-LAST:event_fieldSupplierActionPerformed

    private void fieldJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldJenisActionPerformed

    }//GEN-LAST:event_fieldJenisActionPerformed

    private void fieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNamaActionPerformed
    
    }//GEN-LAST:event_fieldNamaActionPerformed

    private void fieldKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldKodeActionPerformed
    
    }//GEN-LAST:event_fieldKodeActionPerformed

    private void panelGudangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGudangMouseClicked
        setColor(panelGudang);
        resetColor(panelTambahData);
        
        if(evt.getSource() == panelGudang){
            databaseContainer.setVisible(true);
            addDataContainer.setVisible(false);
        }
    }//GEN-LAST:event_panelGudangMouseClicked

    private void panelTambahDataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTambahDataMousePressed
        setColor(panelTambahData);
        resetColor(panelGudang);

        if(evt.getSource() == panelTambahData){
            addDataContainer.setVisible(true);
            databaseContainer.setVisible(false);
        }
    }//GEN-LAST:event_panelTambahDataMousePressed

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
    private javax.swing.JPanel addDataContainer;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JPanel databaseContainer;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField fieldJenis;
    private javax.swing.JTextField fieldJumlah;
    private javax.swing.JTextField fieldKode;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldSupplier;
    private javax.swing.JTextField fieldTanggal;
    private javax.swing.JLabel gudang;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jenis;
    private javax.swing.JLabel jumlah;
    private javax.swing.JLabel kode;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel mainContainer;
    private javax.swing.JPanel menuContainer;
    private javax.swing.JLabel nama;
    private javax.swing.JPanel panelGudang;
    private javax.swing.JPanel panelTambahData;
    private javax.swing.JButton refreshButton;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JSeparator separator3;
    private javax.swing.JSeparator separator4;
    private javax.swing.JSeparator separator5;
    private javax.swing.JSeparator separator6;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel supplier;
    private javax.swing.JTable tableBarang;
    private javax.swing.JLabel tambahData;
    private javax.swing.JLabel tanggal;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
