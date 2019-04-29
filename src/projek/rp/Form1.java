package projek.rp;

import java.sql.*;
import static projek.rp.ProjekRP.rs;

public class Form1 extends javax.swing.JFrame {

    public Form1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtVar1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtVar2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtVar3 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtVar4 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtVar5 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtVar6 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtVar7 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtVar9 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtVar8 = new javax.swing.JTextField();
        btnDiag = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiag = new javax.swing.JTextArea();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(471, 538));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Sistem Pendukung Keputusan");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Identifikasi Hasil Biopsi pada Pasien dengan Tummor Mammae");

        jLabel15.setText("Dari skala 1 - 10 berikan penilaian anda terhadap ciri-ciri tummoryang diderita pasien");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Pertanyaan 1");

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel13.setText("Clump Thickness");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVar1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Pertanyaan 2");

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel14.setText("Uniformity of Cell Size");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel14)
                    .addComponent(txtVar2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Pertanyaan 3");

        jLabel16.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel16.setText("Uniformity of Cell Shape");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel16)
                    .addComponent(txtVar3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Pertanyaan 4");

        jLabel17.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel17.setText("Marginal Adhesion");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel17)
                    .addComponent(txtVar4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 99, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Pertanyaan 5");

        jLabel18.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel18.setText("Single Epithelial Cell Size");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel18)
                    .addComponent(txtVar5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Pertanyaan 6");

        jLabel19.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel19.setText("Bare Nuclei");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVar6))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Pertanyaan 7");

        jLabel20.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel20.setText("Bland Chromatin");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVar7))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVar7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Pertanyaan 9");

        jLabel21.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel21.setText("Mitoses");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVar9))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVar9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Pertanyaan 8");

        jLabel22.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel22.setText("Normal Nucleoli");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVar8))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVar8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnDiag.setText("Diagnosa");
        btnDiag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDiagMouseClicked(evt);
            }
        });

        jLabel12.setText("Diagnosa pasien yang bersangkutan :");

        txtDiag.setColumns(20);
        txtDiag.setRows(5);
        jScrollPane1.setViewportView(txtDiag);

        btnReset.setText("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addComponent(jLabel15))
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnReset))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDiag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDiag)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDiagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDiagMouseClicked
        try {
            // definisi variabel
            double clsJinak = 0, clsGanas = 0;
            double varCT = 0, varUCSIZE = 0, varUCSHAPE = 0, varMA = 0, varSEC = 0, varBN = 0, varBC = 0, varNN = 0, varM = 0;
            double probCTJinak = 0, probUCSIZEJinak = 0, probUCSHAPEJinak = 0, probMAJinak = 0, probSECJinak = 0, probBNJinak = 0, probBCJinak = 0, probNNJinak = 0, probMJinak = 0;
            double probCTGanas = 0, probUCSIZEGanas = 0, probUCSHAPEGanas = 0, probMAGanas = 0, probSECGanas = 0, probBNGanas = 0, probBCGanas = 0, probNNGanas = 0, probMGanas = 0;
            double probTotalJinak, probTotalGanas;

            //definisi dan inisialisasi fitur dari form dari masukan user
            int var1 = Integer.valueOf(txtVar1.getText());
            int var2 = Integer.valueOf(txtVar2.getText());
            int var3 = Integer.valueOf(txtVar3.getText());
            int var4 = Integer.valueOf(txtVar4.getText());
            int var5 = Integer.valueOf(txtVar5.getText());
            int var6 = Integer.valueOf(txtVar6.getText());
            int var7 = Integer.valueOf(txtVar7.getText());
            int var8 = Integer.valueOf(txtVar8.getText());
            int var9 = Integer.valueOf(txtVar9.getText());

            if (var1 == 0 || var2 == 0 || var3 == 0 || var4 == 0 || var5 == 0 || var6 == 0 || var7 == 0 || var8 == 0 || var9 == 0) {
                DialogUI dialogUI = new DialogUI("Jangan Masukkan nilai 0");
                dialogUI.pack();
                dialogUI.setLocationRelativeTo(null);
                dialogUI.setVisible(true);
                txtVar1.setText("");
                txtVar2.setText("");
                txtVar3.setText("");
                txtVar4.setText("");
                txtVar5.setText("");
                txtVar6.setText("");
                txtVar7.setText("");
                txtVar8.setText("");
                txtVar9.setText("");
                txtDiag.setText("");
            } else {
                //menghitung jumlah jinak          
                String query = "SELECT COUNT(*) FROM dataset WHERE CLASS = 2";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    clsJinak = ProjekRP.rs.getDouble("count(*)");
                }

                //menghitung jumlah ganas
                query = "SELECT COUNT(*) FROM dataset WHERE CLASS = 4";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    clsGanas = ProjekRP.rs.getDouble("count(*)");
                }

                //menghitung probabilitas jinak dan ganas
                double probJinak = clsJinak / (clsJinak + clsGanas);
                double probGanas = clsGanas / (clsJinak + clsGanas);

                //menghitung probabilitas masing2 fitur yang mempunyai kelas jinak
                query = "SELECT COUNT(*) FROM DATASET WHERE CT = " + var1 + " AND CLASS = 2";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    varCT = ProjekRP.rs.getDouble("count(*)");
                }

                //Laplace Correction
                if (varCT == 0) {
                    probCTJinak = (varCT + 1) / (clsJinak + 2);
                } else if (varCT > 0) {
                    probCTJinak = varCT / clsJinak;
                }

                query = "SELECT COUNT(*) FROM DATASET WHERE UCSIZE = " + var2 + " AND CLASS = 2";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    varUCSIZE = ProjekRP.rs.getDouble("count(*)");
                }

                //Laplace Correction
                if (varUCSIZE == 0) {
                    probUCSIZEJinak = (varCT + 1) / (clsJinak + 2);
                } else if (varUCSIZE > 0) {
                    probUCSIZEJinak = varUCSIZE / clsJinak;
                }

                query = "SELECT COUNT(*) FROM DATASET WHERE UCSHAPE = " + var3 + " AND CLASS = 2";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    varUCSHAPE = ProjekRP.rs.getDouble("count(*)");
                }

                //Laplace Correction
                if (varUCSHAPE == 0) {
                    probUCSHAPEJinak = (varUCSHAPE + 1) / (clsJinak + 2);
                } else if (varUCSHAPE > 0) {
                    probUCSHAPEJinak = varUCSHAPE / clsJinak;
                }

                query = "SELECT COUNT(*) FROM DATASET WHERE MA = " + var4 + " AND CLASS = 2";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    varMA = ProjekRP.rs.getDouble("count(*)");
                }

                //Laplace Correction
                if (varMA == 0) {
                    probMAJinak = (varMA + 1) / (clsJinak + 2);
                } else if (varMA > 0) {
                    probMAJinak = varMA / clsJinak;
                }

                query = "SELECT COUNT(*) FROM DATASET WHERE SEC = " + var5 + " AND CLASS = 2";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    varSEC = ProjekRP.rs.getDouble("count(*)");
                }

                //Laplace Correction
                if (varSEC == 0) {
                    probSECJinak = (varSEC + 1) / (clsJinak + 2);
                } else if (varSEC > 0) {
                    probSECJinak = varSEC / clsJinak;
                }

                query = "SELECT COUNT(*) FROM DATASET WHERE BN = " + var6 + " AND CLASS = 2";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    varBN = ProjekRP.rs.getDouble("count(*)");
                }

                //Laplace Correction
                if (varBN == 0) {
                    probBNJinak = (varBN + 1) / (clsJinak + 2);
                } else if (varBN > 0) {
                    probBNJinak = varBN / clsJinak;
                }

                query = "SELECT COUNT(*) FROM DATASET WHERE BC = " + var7 + " AND CLASS = 2";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    varBC = ProjekRP.rs.getDouble("count(*)");
                }

                //Laplace Correction
                if (varBC == 0) {
                    probBCJinak = (varBC + 1) / (clsJinak + 2);
                } else if (varBC > 0) {
                    probBCJinak = varBC / clsJinak;
                }

                query = "SELECT COUNT(*) FROM DATASET WHERE NN = " + var8 + " AND CLASS = 2";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    varNN = ProjekRP.rs.getDouble("count(*)");
                }

                //Laplace Correction
                if (varNN == 0) {
                    probNNJinak = (varNN + 1) / (clsJinak + 2);
                } else if (varNN > 0) {
                    probNNJinak = varNN / clsJinak;
                }

                query = "SELECT COUNT(*) FROM DATASET WHERE M = " + var9 + " AND CLASS = 2";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    varM = ProjekRP.rs.getDouble("count(*)");
                }

                //Laplace Correction
                if (varM == 0) {
                    probMJinak = (varM + 1) / (clsJinak + 2);
                } else if (varM > 0) {
                    probMJinak = varM / clsJinak;
                }

                //menghitung probabilitas masing2 fitur yang mempunyai keLas GANAS
                query = "SELECT COUNT(*) FROM DATASET WHERE CT = " + var1 + " AND CLASS = 4";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    varCT = ProjekRP.rs.getDouble("count(*)");
                }

                //Laplace Correction
                if (varCT == 0) {
                    probCTGanas = (varCT + 1) / (clsGanas + 2);
                } else if (varCT > 0) {
                    probCTGanas = varCT / clsGanas;
                }

                query = "SELECT COUNT(*) FROM DATASET WHERE UCSIZE = " + var2 + " AND CLASS = 4";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    varUCSIZE = ProjekRP.rs.getDouble("count(*)");
                }

                //Laplace Correction
                if (varUCSIZE == 0) {
                    probUCSIZEGanas = (varUCSIZE + 1) / (clsGanas + 2);
                } else if (varUCSIZE > 0) {
                    probUCSIZEGanas = varUCSIZE / clsGanas;
                }

                query = "SELECT COUNT(*) FROM DATASET WHERE UCSHAPE = " + var3 + " AND CLASS = 4";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    varUCSHAPE = ProjekRP.rs.getDouble("count(*)");
                }

                //Laplace Correction
                if (varUCSHAPE == 0) {
                    probUCSHAPEGanas = (varUCSHAPE + 1) / (clsGanas + 2);
                } else if (varUCSIZE > 0) {
                    probUCSHAPEGanas = varUCSHAPE / clsGanas;
                }

                query = "SELECT COUNT(*) FROM DATASET WHERE MA = " + var4 + " AND CLASS = 4";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    varMA = ProjekRP.rs.getDouble("count(*)");
                }

                //Laplace Correction
                if (varMA == 0) {
                    probMAGanas = (varMA + 1) / (clsGanas + 2);
                } else if (varMA > 0) {
                    probMAGanas = varMA / clsGanas;
                }

                query = "SELECT COUNT(*) FROM DATASET WHERE SEC = " + var5 + " AND CLASS = 4";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    varSEC = ProjekRP.rs.getDouble("count(*)");
                }

                //Laplace Correction
                if (varSEC == 0) {
                    probSECGanas = (varSEC + 1) / (clsGanas + 2);
                } else if (varSEC > 0) {
                    probSECGanas = varSEC / clsGanas;
                }

                query = "SELECT COUNT(*) FROM DATASET WHERE BN = " + var6 + " AND CLASS = 4";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    varBN = ProjekRP.rs.getDouble("count(*)");
                }

                //Laplace Correction
                if (varBN == 0) {
                    probBNGanas = (varBN + 1) / (clsGanas + 2);
                } else if (varBN > 0) {
                    probBNGanas = varBN / clsGanas;
                }

                query = "SELECT COUNT(*) FROM DATASET WHERE BC = " + var7 + " AND CLASS = 4";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    varBC = ProjekRP.rs.getDouble("count(*)");
                }

                //Laplace Correction
                if (varBC == 0) {
                    probBCGanas = (varBC + 1) / (clsGanas + 2);
                } else if (varBC > 0) {
                    probBCGanas = varBC / clsGanas;
                }

                query = "SELECT COUNT(*) FROM DATASET WHERE NN = " + var8 + " AND CLASS = 4";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    varNN = ProjekRP.rs.getDouble("count(*)");
                }

                //Laplace Correction
                if (varNN == 0) {
                    probNNGanas = (varNN + 1) / (clsGanas + 2);
                } else if (varNN > 0) {
                    probNNGanas = varNN / clsGanas;
                }

                query = "SELECT COUNT(*) FROM DATASET WHERE M = " + var9 + " AND CLASS = 4";
                ProjekRP.stm = ProjekRP.con.createStatement();
                ProjekRP.rs = ProjekRP.stm.executeQuery(query);
                while (rs.next()) {
                    varM = ProjekRP.rs.getDouble("count(*)");
                }

                //Laplace Correction
                if (varM == 0) {
                    probMGanas = (varM + 1) / (clsGanas + 2);
                } else if (varM > 0) {
                    probMGanas = varM / clsGanas;
                }

                //hitung nilai naive bayes
                probTotalJinak = (probCTJinak * probUCSIZEJinak * probUCSHAPEJinak * probMAJinak * probSECJinak * probBNJinak * probBCJinak * probNNJinak * probMJinak) * probJinak;
                probTotalGanas = (probCTGanas * probUCSIZEGanas * probUCSHAPEGanas * probMAGanas * probSECGanas * probBNGanas * probBCGanas * probNNGanas * probMGanas) * probGanas;

                if (probTotalJinak > probTotalGanas) {
                    txtDiag.setText("Tumor Jinak \n");
                } else if (probTotalJinak < probTotalGanas) {
                    txtDiag.setText("Tumor Ganas");
                }

                ProjekRP.stm.close();
                ProjekRP.rs.close();
                ProjekRP.stm.close();
            }

        } catch (Exception e) {
            DialogUI dialogUI = new DialogUI(e.getMessage());
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
        }


    }//GEN-LAST:event_btnDiagMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        txtVar1.setText("");
        txtVar2.setText("");
        txtVar3.setText("");
        txtVar4.setText("");
        txtVar5.setText("");
        txtVar6.setText("");
        txtVar7.setText("");
        txtVar8.setText("");
        txtVar9.setText("");
        txtDiag.setText("");
    }//GEN-LAST:event_btnResetMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiag;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDiag;
    private javax.swing.JTextField txtVar1;
    private javax.swing.JTextField txtVar2;
    private javax.swing.JTextField txtVar3;
    private javax.swing.JTextField txtVar4;
    private javax.swing.JTextField txtVar5;
    private javax.swing.JTextField txtVar6;
    private javax.swing.JTextField txtVar7;
    private javax.swing.JTextField txtVar8;
    private javax.swing.JTextField txtVar9;
    // End of variables declaration//GEN-END:variables
}
