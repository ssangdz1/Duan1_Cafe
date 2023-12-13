/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assjava3.view;

import assjava3.service.DiemService;
import assjava3.model.Diem;
import assjava3.unility.DBContext;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Collections;
import java.util.Comparator;

public class QLDiemForm extends javax.swing.JFrame {

    DefaultTableModel mol = new DefaultTableModel();
    private final DiemService ds = new DiemService();
    String strMasv = "";
    int curren = -1;

    public QLDiemForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        Sorting();
        mol = (DefaultTableModel) tblBangDiem.getModel();
        loadData();
        if (tblBangDiem.getRowCount() > 0) {
            tblBangDiem.setRowSelectionInterval(0, 0);
            showDeTailForm();
        }
//        
//        lblTop1.setText(ds.getAllDiem().get(0).getMasv() + " - " + ds.getAllDiem().get(0).getHoten());
//        lblTop2.setText(ds.getAllDiem().get(1).getMasv() + " - " + ds.getAllDiem().get(1).getHoten());
//        lblTop3.setText(ds.getAllDiem().get(2).getMasv() + " - " + ds.getAllDiem().get(2).getHoten());
//        
//        
//        
    }

    public void timtheoMasv() {
        mol.setRowCount(0);
        List<Diem> list = ds.timTheoMASV(strMasv);
        for (Diem d : list) {
            mol.addRow(new Object[]{
                d.getMasv(),
                d.getHoten(),
                d.getTienganh(),
                d.getTinhoc(),
                d.getGdtc(),
                d.getDiemTb()
            }
            );
        }
    }

    public void loadData() {
        mol.setRowCount(0);
        List<Diem> list = ds.getAllDiem();
        for (Diem d : list) {
            mol.addRow(new Object[]{
                d.getMasv(),
                d.getHoten(),
                d.getTienganh(),
                d.getTinhoc(),
                d.getGdtc(),
                d.getDiemTb()
            }
            );
        }

        lblTop1.setText(ds.getAllDiem().get(0).getMasv() + " - " + ds.getAllDiem().get(0).getHoten() + " - " + " Điểm TB: " + ds.getAllDiem().get(0).getDiemTb());
        lblTop2.setText(ds.getAllDiem().get(1).getMasv() + " - " + ds.getAllDiem().get(1).getHoten() + " - " +" Điểm TB: " + ds.getAllDiem().get(1).getDiemTb());
        lblTop3.setText(ds.getAllDiem().get(2).getMasv() + " - " + ds.getAllDiem().get(2).getHoten() + " - " +" Điểm TB: " + ds.getAllDiem().get(2).getDiemTb());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtMaSVTK = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMasv = new javax.swing.JTextField();
        txtDiemTA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDiemTH = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDiemTC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbldiemTB = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnEnd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBangDiem = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblTop1 = new javax.swing.JLabel();
        lblTop2 = new javax.swing.JLabel();
        lblTop3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cboSortby = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ ĐIỂM SINH VIÊN");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Mã SV:");

        btnSearch.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 102, 102));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_search_24px.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMaSVTK, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSearch)
                    .addComponent(jLabel2)
                    .addComponent(txtMaSVTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Họ và tên:");

        txtName.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 0, 51));
        txtName.setText("Cung Tiến Ngà");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Mã SV:");

        txtMasv.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMasv.setForeground(new java.awt.Color(204, 0, 0));

        txtDiemTA.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Tiếng anh:");

        txtDiemTH.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Tin học:");

        txtDiemTC.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Giáo dục TC:");

        jLabel9.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Điểm TB:");

        lbldiemTB.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lbldiemTB.setForeground(new java.awt.Color(255, 0, 0));
        lbldiemTB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldiemTB.setText("0.0");

        btnStart.setForeground(new java.awt.Color(204, 0, 153));
        btnStart.setText("⏮");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnPre.setForeground(new java.awt.Color(102, 0, 255));
        btnPre.setText("⏪");
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });

        btnNext.setForeground(new java.awt.Color(102, 0, 255));
        btnNext.setText("⏩");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnEnd.setForeground(new java.awt.Color(204, 0, 153));
        btnEnd.setText("⏭");
        btnEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDiemTC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiemTH, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiemTA, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(lbldiemTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMasv, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 93, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnStart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(txtMasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel6)
                            .addComponent(txtDiemTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel7)
                            .addComponent(txtDiemTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel9)
                        .addGap(1, 1, 1)
                        .addComponent(lbldiemTB)))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(txtDiemTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart)
                    .addComponent(btnPre)
                    .addComponent(btnNext)
                    .addComponent(btnEnd))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tblBangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã SV", "Tên SV", "Tiếng anh", "Tin học", "Giáo dục TC", "Điểm TB"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBangDiem.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblBangDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangDiemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBangDiem);

        btnNew.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnNew.setForeground(new java.awt.Color(0, 102, 102));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Brand_New_24px_1.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 102, 102));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_save_24px_1.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 102, 102));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_delete_document_24px.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 102, 102));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_update_24px_1.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 255));
        jLabel11.setText("Top 3 Sinh Viên có điểm cao nhất:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/first-place.png"))); // NOI18N

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/second-place.png"))); // NOI18N

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/third-place.png"))); // NOI18N

        lblTop1.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        lblTop1.setForeground(new java.awt.Color(255, 0, 51));
        lblTop1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTop1.setText("MÃ SV - Full Name");

        lblTop2.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        lblTop2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTop2.setText("MÃ SV - Full Name");

        lblTop3.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        lblTop3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTop3.setText("MÃ - Full Name");

        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("SortBy:");

        cboSortby.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã SV", "Điểm TB", "Tên SV", "Tiếng anh", "Tin học", "Giáo dục tc" }));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logout.png"))); // NOI18N
        jButton1.setText("Log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/U Turn to Left.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboSortby, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnNew, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTop2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTop3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSave))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboSortby, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTop1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTop2)
                            .addComponent(lblTop3)))
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int chon = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn xóa?", "Xóa", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (chon == JOptionPane.YES_OPTION) {
            try {
                if (ds.deleteDiem(txtMasv.getText()) != null) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    loadData();
                    if (tblBangDiem.getRowCount() > 0) {
                        tblBangDiem.setRowSelectionInterval(0, 0);
                        showDeTailForm();
                    } else {
                        clearForm();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa thất bại!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi nút xóa");
            }
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblBangDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangDiemMouseClicked
        // TODO add your handling code here:
        try {
            showDeTailForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi click Table");
        }
    }//GEN-LAST:event_tblBangDiemMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (check()) {
            try {
                Diem d = getInputDataForm();
                if (ds.addDiem(d) != null) {
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                    loadData();
                    clearForm();
                } else {
                    JOptionPane.showMessageDialog(this, "Mã Sinh Viên cần thêm điểm không tồn tại!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi nút thêm");
            }
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int chon = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn Sửa?", "Sửa", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (chon == JOptionPane.YES_OPTION) {
            if(checkSua()){
            try {
            Diem d = getInputDataForm();
            if (ds.updateDiem(d) != null) {
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                loadData();
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại");
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ số điểm của Sinh Viên");
            }}
             
        }   
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        strMasv = txtMaSVTK.getText();
        timtheoMasv();
        if(txtMaSVTK.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Mã Sinh Viên cần tìm");
            
        }
        if (tblBangDiem.getRowCount() > 0) {
            tblBangDiem.setRowSelectionInterval(0, 0); // Chọn dòng đầu tiên trên bảng
            showDeTailForm(); // Hiển thị chi tiết dòng đầu tiên
        } else {
            JOptionPane.showMessageDialog(this, "Mã Sinh Viên cần tìm không có trong Bảng Điểm!");
            // Xóa nội dung trên form nếu không có kết quả tìm kiếm
            clearForm();
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        selectRowGrades(0);

    }//GEN-LAST:event_btnStartActionPerformed

    private void btnEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndActionPerformed
        // TODO add your handling code here:
        int lastRowIndex = tblBangDiem.getRowCount() - 1;
        if (lastRowIndex >= 0) {
            selectRowGrades(lastRowIndex); // Chọn dòng cuối cùng
        }
    }//GEN-LAST:event_btnEndActionPerformed

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
        // TODO add your handling code here:
        int index = tblBangDiem.getSelectedRow();
        if (index > 0) {
            selectRowGrades(index - 1);
        } else {
            int lastRowIndex = tblBangDiem.getRowCount() - 1;
            if (lastRowIndex >= 0) {
                selectRowGrades(lastRowIndex); // Chọn dòng cuối cùng
            }
        }
    }//GEN-LAST:event_btnPreActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        int index = tblBangDiem.getSelectedRow();
        if (index < tblBangDiem.getRowCount() - 1) {
            selectRowGrades(index + 1);
        } else {
            selectRowGrades(0);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int chon = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn Đăng xuất?", "Đăng xuất", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (chon == JOptionPane.YES_OPTION) {
            LoginNew lgw = new LoginNew();
            lgw.setVisible(true);
            lgw.setLocationRelativeTo(null);
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MenuQLD mn3 = new MenuQLD();
        mn3.setVisible(true);
        setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLDiemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLDiemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLDiemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLDiemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLDiemForm().setVisible(true);
            }
        });
    }

    public void showDeTailForm() {
        int index = tblBangDiem.getSelectedRow();
        txtDiemTA.setText(tblBangDiem.getValueAt(index, 2).toString());
        txtDiemTH.setText(tblBangDiem.getValueAt(index, 3).toString());
        txtDiemTC.setText(tblBangDiem.getValueAt(index, 4).toString());
        txtMasv.setText(tblBangDiem.getValueAt(index, 0).toString());
        txtName.setText(tblBangDiem.getValueAt(index, 1).toString());
        lbldiemTB.setText(tblBangDiem.getValueAt(index, 5).toString());
    }

    private Diem getInputDataForm() {
        Diem d = new Diem();
        d.setHoten(txtName.getText());
        d.setMasv(txtMasv.getText());
        d.setTienganh(Integer.parseInt(txtDiemTA.getText()));
        d.setTinhoc(Integer.parseInt(txtDiemTH.getText()));
        d.setGdtc(Integer.parseInt(txtDiemTC.getText()));
        
        return d;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEnd;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboSortby;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTop1;
    private javax.swing.JLabel lblTop2;
    private javax.swing.JLabel lblTop3;
    private javax.swing.JLabel lbldiemTB;
    private javax.swing.JTable tblBangDiem;
    private javax.swing.JTextField txtDiemTA;
    private javax.swing.JTextField txtDiemTC;
    private javax.swing.JTextField txtDiemTH;
    private javax.swing.JTextField txtMaSVTK;
    private javax.swing.JTextField txtMasv;
    private javax.swing.JLabel txtName;
    // End of variables declaration//GEN-END:variables

    private void clearForm() {
        txtMaSVTK.setText("");
        txtMasv.setText("");
        txtName.setText("");
        txtDiemTA.setText("");
        txtDiemTH.setText("");
        txtDiemTC.setText("");
        lbldiemTB.setText("0.0");
        loadData();
    }

    public void fisrt() {
        curren = 0;
        showDeTailForm();
    }

    public void last() {

    }

    public void next() {

    }

    private void selectRowGrades(int i) {
        if (i >= 0) {
            curren = i;
            tblBangDiem.setRowSelectionInterval(curren, curren);
            showDeTailForm();
            //scroll toi dong duoc chon
            tblBangDiem.scrollRectToVisible(new Rectangle(tblBangDiem.getCellRect(curren, 0, true)));

        }
    }

    private void Sorting() {
        ArrayList<Diem> list = new ArrayList<>();
        cboSortby.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) cboSortby.getSelectedItem();
                if ("Điểm TB".equals(selectedOption)) {
                    sortbyDiemTB();
                } else if ("Mã SV".equals(selectedOption)) {

                    sortbyMasv();
                } else if ("Tên SV".equals(selectedOption)) {

                    sortbyTensv();
                } else if ("Tiếng anh".equals(selectedOption)) {

                    sortbyTiengAnh();
                } else if ("Tin học".equals(selectedOption)) {

                    sortbyTinhoc();
                } else if ("Giáo dục tc".equals(selectedOption)) {

                    sortbyGDTC();
                }

                // Update the table with sorted data
            }
        });
    }

    public void sortbyMasv() {
        mol.setRowCount(0);
        List<Diem> list = ds.sapxeptheoMasv();
        for (Diem d : list) {
            mol.addRow(new Object[]{
                d.getMasv(),
                d.getHoten(),
                d.getTienganh(),
                d.getTinhoc(),
                d.getGdtc(),
                d.getDiemTb()
            }
            );
        }
    }

    public void sortbyTensv() {
        mol.setRowCount(0);
        List<Diem> list = ds.sapxeptheoTen();
        for (Diem d : list) {
            mol.addRow(new Object[]{
                d.getMasv(),
                d.getHoten(),
                d.getTienganh(),
                d.getTinhoc(),
                d.getGdtc(),
                d.getDiemTb()
            }
            );
        }
    }

    public void sortbyTiengAnh() {
        mol.setRowCount(0);
        List<Diem> list = ds.sapxeptheodiemTiengAnh();
        for (Diem d : list) {
            mol.addRow(new Object[]{
                d.getMasv(),
                d.getHoten(),
                d.getTienganh(),
                d.getTinhoc(),
                d.getGdtc(),
                d.getDiemTb()
            }
            );
        }
    }

    public void sortbyTinhoc() {
        mol.setRowCount(0);
        List<Diem> list = ds.sapxeptheodiemTinHoc();
        for (Diem d : list) {
            mol.addRow(new Object[]{
                d.getMasv(),
                d.getHoten(),
                d.getTienganh(),
                d.getTinhoc(),
                d.getGdtc(),
                d.getDiemTb()
            }
            );
        }
    }

    public void sortbyGDTC() {
        mol.setRowCount(0);
        List<Diem> list = ds.sapxeptheodiemGDTC();
        for (Diem d : list) {
            mol.addRow(new Object[]{
                d.getMasv(),
                d.getHoten(),
                d.getTienganh(),
                d.getTinhoc(),
                d.getGdtc(),
                d.getDiemTb()
            }
            );
        }
    }

    public void sortbyDiemTB() {
        mol.setRowCount(0);
        List<Diem> list = ds.sapxeptheoDiemTb();
        for (Diem d : list) {
            mol.addRow(new Object[]{
                d.getMasv(),
                d.getHoten(),
                d.getTienganh(),
                d.getTinhoc(),
                d.getGdtc(),
                d.getDiemTb()
            }
            );
        }
    }

    public boolean check() {
        if (txtMasv.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Mã Sinh Viên");
            txtMasv.requestFocus();
            return false;
        }
//        String masv = txtMasv.getText();
//        if (isMasvExists(masv)) {
//            JOptionPane.showMessageDialog(this, "Mã Sinh Viên đã tồn tại");
//            txtMasv.requestFocus();
//            return false;
//        }
        List<Diem> allDiem = ds.getAllDiem();
        for (Diem d : allDiem) {
            if (txtMasv.getText().trim().equalsIgnoreCase(d.getMasv())) {
                // Mã sinh viên đã tồn tại
                JOptionPane.showMessageDialog(this, "Sinh Viên đã có trong Bảng điểm, vui lòng kiểm tra lại!");
                txtMasv.requestFocus();
                return false; // Không cho phép thêm mới
            }
        }

        if (txtDiemTA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập điểm Tiếng Anh");
            txtDiemTA.requestFocus();
            return false;
        }
        try {
            double diem = Double.parseDouble(txtDiemTA.getText());
            if (diem < 0 || diem > 10) {
                JOptionPane.showMessageDialog(this, "Điểm Tiếng anh phải nằm trong khoảng từ 0-10");
                txtDiemTA.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Điểm Tiếng anh phải là một số hợp lệ");
            txtDiemTA.requestFocus();
            return false;
        }

        if (txtDiemTH.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập điểm Tin học");
            txtDiemTH.requestFocus();
            return false;
        }
        try {
            double diem = Double.parseDouble(txtDiemTH.getText());
            if (diem < 0 || diem > 10) {
                JOptionPane.showMessageDialog(this, "Điểm Tin học phải nằm trong khoảng từ 0-10");
                txtDiemTH.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Điểm Tin học phải là một số hợp lệ");
            txtDiemTH.requestFocus();
            return false;
        }
        if (txtDiemTC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập điểm Giáo Dục thể chất");
            txtDiemTC.requestFocus();
            return false;
        }
        try {
            double diem = Double.parseDouble(txtDiemTC.getText());
            if (diem < 0 || diem > 10) {
                JOptionPane.showMessageDialog(this, "Điểm GDTC phải nằm trong khoảng từ 0-10");
                txtDiemTC.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Điểm GDTC phải là một số hợp lệ");
            txtDiemTC.requestFocus();
            return false;
        }

        return true;
    }
    
    public boolean checkSua() {
        if (txtMasv.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Mã Sinh Viên");
            txtMasv.requestFocus();
            return false;
        }
//        String masv = txtMasv.getText();
//        if (isMasvExists(masv)) {
//            JOptionPane.showMessageDialog(this, "Mã Sinh Viên đã tồn tại");
//            txtMasv.requestFocus();
//            return false;
//        }
        
        

        if (txtDiemTA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập điểm Tiếng Anh");
            txtDiemTA.requestFocus();
            return false;
        }
        try {
            double diem = Double.parseDouble(txtDiemTA.getText());
            if (diem < 0 || diem > 10) {
                JOptionPane.showMessageDialog(this, "Điểm Tiếng anh phải nằm trong khoảng từ 0-10");
                txtDiemTA.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Điểm Tiếng anh phải là một số hợp lệ");
            txtDiemTA.requestFocus();
            return false;
        }

        if (txtDiemTH.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập điểm Tin học");
            txtDiemTH.requestFocus();
            return false;
        }
        try {
            double diem = Double.parseDouble(txtDiemTH.getText());
            if (diem < 0 || diem > 10) {
                JOptionPane.showMessageDialog(this, "Điểm Tin học phải nằm trong khoảng từ 0-10");
                txtDiemTH.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Điểm Tin học phải là một số hợp lệ");
            txtDiemTH.requestFocus();
            return false;
        }
        if (txtDiemTC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập điểm Giáo Dục thể chất");
            txtDiemTC.requestFocus();
            return false;
        }
        try {
            double diem = Double.parseDouble(txtDiemTC.getText());
            if (diem < 0 || diem > 10) {
                JOptionPane.showMessageDialog(this, "Điểm GDTC phải nằm trong khoảng từ 0-10");
                txtDiemTC.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Điểm GDTC phải là một số hợp lệ");
            txtDiemTC.requestFocus();
            return false;
        }

        return true;
    }

//    private boolean isMasvExists(String masv) {
//        String query = "SELECT COUNT(*) AS count FROM Grade WHERE Masv = ?";
//        Connection con = DBContext.getConnection();
//
//        try (PreparedStatement pstm = con.prepareStatement(query)) {
//            pstm.setString(1, masv);
//            try (ResultSet rs = pstm.executeQuery()) {
//                if (rs.next()) {
//                    int count = rs.getInt("count");
//                    return count > 0;
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi kiểm tra trùng khóa chính");
//        }
//
//        return false;
//    }
}
