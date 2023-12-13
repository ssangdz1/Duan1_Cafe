/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Service.GiamGiaService;
import Model.GiamGia;
import UTILS.Auth;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.formula.ptg.TblPtg;

/**
 *
 * @author sang
 */
public class GiamGiaForm extends javax.swing.JFrame {
    GiamGiaService ggs = new GiamGiaService();
    DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form HTNSJFrame
     */
    public GiamGiaForm() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Phần mềm quản lý Cafe HTNS - Giảm Giá");
        model = (DefaultTableModel) TblGG.getModel();
        fillToTable();
        setTime();
    }
    
    public void setTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                    SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm:ss a");
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Calendar cal = Calendar.getInstance();
                    // Đặt múi giờ (timezone) nếu cần
                    // Ví dụ: Set múi giờ cho Việt Nam (GMT+7)
                    TimeZone timeZone = TimeZone.getTimeZone("Asia/Ho_Chi_Minh");
                    cal.setTimeZone(timeZone);
                    // Lấy ngày giờ hiện tại
                    String time = timeFormat.format(cal.getTime());
                    String day = dateFormat.format(cal.getTime());
                    // Hiển thị thời gian và ngày trên giao diện người dùng
                    lblDongHo.setText(time);
                }
            }
        }).start();
    }
    private void sanpham(int index) {
        if (Auth.isLogin()) {
            if (index == 1 && !Auth.isManager()) {
                JOptionPane.showMessageDialog(null, "Bạn không phải là Quản Lý");
            } else {
                new SanPhamForm().setVisible(true);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng đăng nhập");
        }
    }

    private void nhanvien(int index) {
        if (Auth.isLogin()) {
            if (index == 1 && !Auth.isManager()) {
                JOptionPane.showMessageDialog(null, "Bạn không phải là Quản Lý");
            } else {
                new NhanVienForm().setVisible(true);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng đăng nhập");
        }
    }

    private void hoadon(int index) {
        if (Auth.isLogin()) {
            if (index == 1 && !Auth.isManager()) {
                JOptionPane.showMessageDialog(null, "Bạn không phải là Quản Lý");
            } else {
                new HoaDonForm().setVisible(true);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng đăng nhập");
        }
    }

    private void taikhoan(int index) {
        if (Auth.isLogin()) {
            if (index == 1 && !Auth.isManager()) {
                JOptionPane.showMessageDialog(null, "Bạn không phải là Quản Lý");
            } else {
                new TaiKhoanForm().setVisible(true);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng đăng nhập");
        }
    }

    private void thongke(int index) {
        if (Auth.isLogin()) {
            if (index == 1 && !Auth.isManager()) {
                JOptionPane.showMessageDialog(null, "Bạn không phải là Quản Lý");
            } else {
                new ThongKeForm().setVisible(true);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng đăng nhập");
        }
    }

    private void giamgia(int index) {
        if (Auth.isLogin()) {
            if (index == 1 && !Auth.isManager()) {
                JOptionPane.showMessageDialog(null, "Bạn không phải là Quản Lý");
            } else {
                new GiamGiaForm().setVisible(true);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng đăng nhập");
        }
    }
    private void banhang(int index) {
        if (Auth.isLogin()) {
            if (index == 1 && !Auth.isManager()) {
                JOptionPane.showMessageDialog(null, "Bạn không phải là Quản Lý");
            } else {
                new BanHangForm().setVisible(true);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng đăng nhập");
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

        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblGG = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMaGG = new javax.swing.JTextField();
        txtTenGG = new javax.swing.JTextField();
        txtmaSP = new javax.swing.JTextField();
        txtNgayBD = new javax.swing.JTextField();
        txtNgayKT = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        lblDongHo = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnbanhang = new javax.swing.JButton();
        btnsanpham = new javax.swing.JButton();
        btnhoadon = new javax.swing.JButton();
        btnnhanvien = new javax.swing.JButton();
        btnthongke = new javax.swing.JButton();
        bngiamgia = new javax.swing.JButton();
        btnTaiKHoan = new javax.swing.JButton();
        btndangxuat = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        MNUQUANLY = new javax.swing.JMenu();
        MNUTHONGKE = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TblGG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Giảm Giá", "Tên Giảm Giá", "Mã Sản Phẩm", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Giảm Giá", "Trạng Thái"
            }
        ));
        TblGG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblGGMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblGG);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Phần Mềm Quản Lý Cafe HTNS");

        jLabel1.setText("Mã Giảm Giá :");

        jLabel4.setText("Tên Giảm Giá :");

        jLabel10.setText("Mã Sản Phẩm :");

        jLabel11.setText("Ngày Bắt Đầu :");

        jLabel12.setText("Ngày Kết Thúc :");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clock.png"))); // NOI18N
        lblDongHo.setText("12:12:12:AM");

        jButton9.setBackground(new java.awt.Color(0, 255, 204));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Left.png"))); // NOI18N
        jButton9.setText("QUAY LẠI");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Giảm Giá");

        btnbanhang.setBackground(javax.swing.UIManager.getDefaults().getColor("ViewTab.attentionBackground"));
        btnbanhang.setText("Bán Hàng");
        btnbanhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbanhangActionPerformed(evt);
            }
        });

        btnsanpham.setBackground(javax.swing.UIManager.getDefaults().getColor("ViewTab.attentionBackground"));
        btnsanpham.setText("Sản Phẩm");
        btnsanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsanphamActionPerformed(evt);
            }
        });

        btnhoadon.setBackground(javax.swing.UIManager.getDefaults().getColor("ViewTab.attentionBackground"));
        btnhoadon.setText("Hóa Đơn");
        btnhoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhoadonActionPerformed(evt);
            }
        });

        btnnhanvien.setBackground(javax.swing.UIManager.getDefaults().getColor("ViewTab.attentionBackground"));
        btnnhanvien.setText("Nhân Viên");
        btnnhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhanvienActionPerformed(evt);
            }
        });

        btnthongke.setBackground(javax.swing.UIManager.getDefaults().getColor("ViewTab.attentionBackground"));
        btnthongke.setText("Thống Kê");
        btnthongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthongkeActionPerformed(evt);
            }
        });

        bngiamgia.setBackground(javax.swing.UIManager.getDefaults().getColor("ViewTab.attentionBackground"));
        bngiamgia.setText("Giảm Giá");
        bngiamgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bngiamgiaActionPerformed(evt);
            }
        });

        btnTaiKHoan.setBackground(javax.swing.UIManager.getDefaults().getColor("ViewTab.attentionBackground"));
        btnTaiKHoan.setText("Tài Khoản");
        btnTaiKHoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiKHoanActionPerformed(evt);
            }
        });

        btndangxuat.setBackground(javax.swing.UIManager.getDefaults().getColor("ViewTab.attentionBackground"));
        btndangxuat.setText("Đăng Xuất");
        btndangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangxuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbanhang, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnthongke, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bngiamgia, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTaiKHoan, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMaGG)
                                        .addComponent(txtTenGG)
                                        .addComponent(txtmaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(34, 34, 34)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThem)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMaGG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTenGG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtmaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbanhang, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnhoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnnhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnthongke, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bngiamgia, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTaiKHoan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btndangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 204, 204));
        jMenuBar1.setForeground(new java.awt.Color(255, 204, 204));

        mnuHeThong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Monitor.png"))); // NOI18N
        mnuHeThong.setText("Hệ thống");
        mnuHeThong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHeThongActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Đăng Nhập");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuHeThong.add(jMenuItem1);

        jMenuItem3.setText("Đăng Xuất");
        mnuHeThong.add(jMenuItem3);

        jMenuBar1.add(mnuHeThong);

        MNUQUANLY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Clien list.png"))); // NOI18N
        MNUQUANLY.setText("Quản lý");
        jMenuBar1.add(MNUQUANLY);

        MNUTHONGKE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Lists.png"))); // NOI18N
        MNUTHONGKE.setText("Thống kê");
        MNUTHONGKE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNUTHONGKEActionPerformed(evt);
            }
        });
        jMenuBar1.add(MNUTHONGKE);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuHeThongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHeThongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuHeThongActionPerformed

    private void MNUTHONGKEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNUTHONGKEActionPerformed

    }//GEN-LAST:event_MNUTHONGKEActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new HTNSJFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void TblGGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblGGMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TblGGMouseClicked

    private void btnbanhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbanhangActionPerformed
        // TODO add your handling code here:
        banhang(1);
    }//GEN-LAST:event_btnbanhangActionPerformed

    private void btnsanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsanphamActionPerformed
        // TODO add your handling code here:
        sanpham(1);
    }//GEN-LAST:event_btnsanphamActionPerformed

    private void btnhoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhoadonActionPerformed
        // TODO add your handling code here:
        hoadon(1);
    }//GEN-LAST:event_btnhoadonActionPerformed

    private void btnnhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhanvienActionPerformed
        // TODO add your handling code here:
        nhanvien(1);
    }//GEN-LAST:event_btnnhanvienActionPerformed

    private void btnthongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthongkeActionPerformed
        // TODO add your handling code here:
        thongke(1);
    }//GEN-LAST:event_btnthongkeActionPerformed

    private void bngiamgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bngiamgiaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Bạn đang trong giao diện bán hàng");
    }//GEN-LAST:event_bngiamgiaActionPerformed

    private void btnTaiKHoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiKHoanActionPerformed
        taikhoan(1);
    }//GEN-LAST:event_btnTaiKHoanActionPerformed

    private void btndangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangxuatActionPerformed
        // TODO add your handling code here:
        int chon = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn Đăng xuất?", "Đăng xuất", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (chon == JOptionPane.YES_OPTION) {
            new DangNhapFrom().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btndangxuatActionPerformed

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
            java.util.logging.Logger.getLogger(GiamGiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiamGiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiamGiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiamGiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiamGiaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MNUQUANLY;
    private javax.swing.JMenu MNUTHONGKE;
    private javax.swing.JTable TblGG;
    private javax.swing.JButton bngiamgia;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaiKHoan;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnbanhang;
    private javax.swing.JButton btndangxuat;
    private javax.swing.JButton btnhoadon;
    private javax.swing.JButton btnnhanvien;
    private javax.swing.JButton btnsanpham;
    private javax.swing.JButton btnthongke;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JTextField txtMaGG;
    private javax.swing.JTextField txtNgayBD;
    private javax.swing.JTextField txtNgayKT;
    private javax.swing.JTextField txtTenGG;
    private javax.swing.JTextField txtmaSP;
    // End of variables declaration//GEN-END:variables

    private void fillToTable() {
        model.setRowCount(0);
        ArrayList<GiamGia> lst = ggs.getAll();
        for (GiamGia gg : lst){
            model.addRow(new Object[]{gg.getMaGG(),gg.getTenMaGG(),gg.getMaSP(),gg.getNgayBD(),gg.getNgayKT(),gg.getGG(),gg.isTinhTrang()?"Đang diễn ra":"Đã kết thúc"});
        }
    }

    private void showdetail() {
        int index = TblGG.getSelectedRow();
        txtMaGG.setText(TblGG.getValueAt(index, 0).toString());
        txtmaSP.setText(TblGG.getValueAt(index, 2).toString());
        txtTenGG.setText(TblGG.getValueAt(index, 1).toString());
        txtNgayBD.setText(TblGG.getValueAt(index, 3).toString());
        txtNgayKT.setText(TblGG.getValueAt(index, 4).toString());
    }
}
