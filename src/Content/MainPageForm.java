/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Content;

import GUI.AddBookForm;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author noname
 */
public class MainPageForm extends javax.swing.JFrame {

    /**
     * Creates new form MainPageForm
     */
    public MainPageForm() {
        setUndecorated(true);
        initComponents();
        addMenuEvent(pnSach, "book");
        addMenuEvent(pnDocGia, "reader");
        addMenuEvent(pnNhanVien, "nhanvien");
        addMenuEvent(pnMuonTra, "muonTra");
        addMenuEvent(pnPhieuPhat, "phieuPhat");
        addMenuEvent(pnNhapSach, "nhapSach");
        addMenuEvent(pnThongKe, "thongKe");
        
        
    
    

    }

    Color COLOR_DEFAULT = new Color(31,58,95);
    Color COLOR_HOVER   = new Color(31,33,95);
    Color COLOR_ACTIVE  = new Color(31,33,95); // đang chọn
    Color COLOR_TEXT_ACTIVE = Color.WHITE;
    
    JPanel selectedMenu = null;
    
    private void setMenuStyle(JPanel panel, boolean active) {
    if (active) {
        panel.setBackground(COLOR_ACTIVE);
    } else {
        panel.setBackground(COLOR_DEFAULT);
    }
}

    int width =153; int height = 658; 
    void openMenuBar(){ 
        new Thread(new Runnable() { 
            @Override public void run(){ 
                for(int i = 0; i <= width; i++){ 
                    try {
                        pnMenu.setSize(i, height);
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainPageForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } 
            } 
        }).start(); 
    }

    void closeMenuBar(){ 
        new Thread(new Runnable() { 
            @Override public void run(){ 
                for(int i = width; i >= 0; i--){ 
                    try {
                        pnMenu.setSize(i, height);
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainPageForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } 
            } 
        }).start(); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pnMenu = new javax.swing.JPanel();
        pnSach = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnDocGia = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnNhanVien = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pnMuonTra = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pnPhieuPhat = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        pnNhapSach = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        pnThongKe = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnHeader = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnClose = new javax.swing.JPanel();
        lblClose1 = new javax.swing.JLabel();
        pnChucNang = new javax.swing.JPanel();
        book = new javax.swing.JPanel();
        pnTimkiem1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        addBook = new javax.swing.JButton();
        editBook = new javax.swing.JButton();
        deleteBook = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        sachTable = new javax.swing.JTable();
        docgia = new javax.swing.JPanel();
        pnTimkiem2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        addBook1 = new javax.swing.JButton();
        editBook1 = new javax.swing.JButton();
        deleteBook1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        docgiaTable = new javax.swing.JTable();
        nhanvien = new javax.swing.JPanel();
        pnTimkiem3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        addBook2 = new javax.swing.JButton();
        editBook2 = new javax.swing.JButton();
        deleteBook2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        muonTra = new javax.swing.JPanel();
        pnTimkiem5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        addBook4 = new javax.swing.JButton();
        editBook4 = new javax.swing.JButton();
        deleteBook8 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        phieuPhat = new javax.swing.JPanel();
        pnTimkiem10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        addBook9 = new javax.swing.JButton();
        editBook9 = new javax.swing.JButton();
        deleteBook9 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        nhapSach = new javax.swing.JPanel();
        pnTimkiem11 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        addBook10 = new javax.swing.JButton();
        editBook10 = new javax.swing.JButton();
        deleteBook10 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        thongKe = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 70));
        setSize(new java.awt.Dimension(1450, 850));

        pnMenu.setBackground(new java.awt.Color(31, 58, 95));
        pnMenu.setPreferredSize(new java.awt.Dimension(200, 800));

        pnSach.setBackground(new java.awt.Color(31, 58, 95));
        pnSach.setForeground(new java.awt.Color(255, 255, 255));
        pnSach.setPreferredSize(new java.awt.Dimension(136, 55));
        pnSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnSachMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-realbook-24.png"))); // NOI18N
        jLabel4.setText("Quản lý sách");

        javax.swing.GroupLayout pnSachLayout = new javax.swing.GroupLayout(pnSach);
        pnSach.setLayout(pnSachLayout);
        pnSachLayout.setHorizontalGroup(
            pnSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSachLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnSachLayout.setVerticalGroup(
            pnSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pnDocGia.setBackground(new java.awt.Color(31, 58, 95));
        pnDocGia.setForeground(new java.awt.Color(255, 255, 255));
        pnDocGia.setPreferredSize(new java.awt.Dimension(136, 55));
        pnDocGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnDocGiaMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-book-24.png"))); // NOI18N
        jLabel7.setText("Quản lý độc giả ");

        javax.swing.GroupLayout pnDocGiaLayout = new javax.swing.GroupLayout(pnDocGia);
        pnDocGia.setLayout(pnDocGiaLayout);
        pnDocGiaLayout.setHorizontalGroup(
            pnDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDocGiaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnDocGiaLayout.setVerticalGroup(
            pnDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDocGiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pnNhanVien.setBackground(new java.awt.Color(31, 58, 95));
        pnNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        pnNhanVien.setPreferredSize(new java.awt.Dimension(136, 55));
        pnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnNhanVienMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-staff-24.png"))); // NOI18N
        jLabel8.setText("Quản lý nhân viên");

        javax.swing.GroupLayout pnNhanVienLayout = new javax.swing.GroupLayout(pnNhanVien);
        pnNhanVien.setLayout(pnNhanVienLayout);
        pnNhanVienLayout.setHorizontalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhanVienLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnNhanVienLayout.setVerticalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pnMuonTra.setBackground(new java.awt.Color(31, 58, 95));
        pnMuonTra.setForeground(new java.awt.Color(255, 255, 255));
        pnMuonTra.setPreferredSize(new java.awt.Dimension(136, 55));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-check-book-24.png"))); // NOI18N
        jLabel9.setText("Mượn - Trả Sách");

        javax.swing.GroupLayout pnMuonTraLayout = new javax.swing.GroupLayout(pnMuonTra);
        pnMuonTra.setLayout(pnMuonTraLayout);
        pnMuonTraLayout.setHorizontalGroup(
            pnMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMuonTraLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMuonTraLayout.setVerticalGroup(
            pnMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMuonTraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pnPhieuPhat.setBackground(new java.awt.Color(31, 58, 95));
        pnPhieuPhat.setForeground(new java.awt.Color(255, 255, 255));
        pnPhieuPhat.setPreferredSize(new java.awt.Dimension(136, 55));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-refund-24.png"))); // NOI18N
        jLabel15.setText("Phiếu phạt");

        javax.swing.GroupLayout pnPhieuPhatLayout = new javax.swing.GroupLayout(pnPhieuPhat);
        pnPhieuPhat.setLayout(pnPhieuPhatLayout);
        pnPhieuPhatLayout.setHorizontalGroup(
            pnPhieuPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhieuPhatLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnPhieuPhatLayout.setVerticalGroup(
            pnPhieuPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhieuPhatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pnNhapSach.setBackground(new java.awt.Color(31, 58, 95));
        pnNhapSach.setForeground(new java.awt.Color(255, 255, 255));
        pnNhapSach.setPreferredSize(new java.awt.Dimension(136, 55));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-import-24.png"))); // NOI18N
        jLabel16.setText("Nhập sách ");

        javax.swing.GroupLayout pnNhapSachLayout = new javax.swing.GroupLayout(pnNhapSach);
        pnNhapSach.setLayout(pnNhapSachLayout);
        pnNhapSachLayout.setHorizontalGroup(
            pnNhapSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhapSachLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnNhapSachLayout.setVerticalGroup(
            pnNhapSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhapSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pnThongKe.setBackground(new java.awt.Color(31, 58, 95));
        pnThongKe.setForeground(new java.awt.Color(255, 255, 255));
        pnThongKe.setPreferredSize(new java.awt.Dimension(136, 55));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-statistics-24.png"))); // NOI18N
        jLabel17.setText("Thống kê");

        javax.swing.GroupLayout pnThongKeLayout = new javax.swing.GroupLayout(pnThongKe);
        pnThongKe.setLayout(pnThongKeLayout);
        pnThongKeLayout.setHorizontalGroup(
            pnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongKeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnThongKeLayout.setVerticalGroup(
            pnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-logout-32.png"))); // NOI18N
        jLabel10.setText("Đăng xuất ");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-library-64.png"))); // NOI18N

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(pnSach, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(pnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(pnMuonTra, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(pnPhieuPhat, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(pnNhapSach, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(pnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGap(110, 110, 110)
                .addComponent(pnSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnPhieuPhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnNhapSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        pnHeader.setBackground(new java.awt.Color(46, 92, 138));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Library Management System");

        pnClose.setBackground(new java.awt.Color(46, 92, 138));
        pnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnCloseMouseExited(evt);
            }
        });

        lblClose1.setBackground(new java.awt.Color(255, 255, 255));
        lblClose1.setForeground(new java.awt.Color(255, 255, 255));
        lblClose1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png"))); // NOI18N
        lblClose1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClose1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblClose1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnCloseLayout = new javax.swing.GroupLayout(pnClose);
        pnClose.setLayout(pnCloseLayout);
        pnCloseLayout.setHorizontalGroup(
            pnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCloseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblClose1)
                .addContainerGap())
        );
        pnCloseLayout.setVerticalGroup(
            pnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCloseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblClose1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnHeaderLayout = new javax.swing.GroupLayout(pnHeader);
        pnHeader.setLayout(pnHeaderLayout);
        pnHeaderLayout.setHorizontalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnHeaderLayout.setVerticalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addContainerGap())
            .addComponent(pnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnHeader, java.awt.BorderLayout.PAGE_START);

        pnChucNang.setBackground(new java.awt.Color(255, 255, 255));
        pnChucNang.setPreferredSize(new java.awt.Dimension(1440, 850));
        pnChucNang.setLayout(new java.awt.CardLayout());

        book.setBackground(new java.awt.Color(244, 247, 251));
        book.setPreferredSize(new java.awt.Dimension(1201, 830));

        pnTimkiem1.setBackground(new java.awt.Color(255, 255, 255));
        pnTimkiem1.setPreferredSize(new java.awt.Dimension(1237, 60));

        jLabel13.setText("Tìm kiếm theo tên ");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search-interface-symbol.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        addBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add (1).png"))); // NOI18N
        addBook.setText("Thêm");
        addBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBookMouseClicked(evt);
            }
        });
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });

        editBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        editBook.setText("Sửa");
        editBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBookActionPerformed(evt);
            }
        });

        deleteBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        deleteBook.setText("Xóa");
        deleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTimkiem1Layout = new javax.swing.GroupLayout(pnTimkiem1);
        pnTimkiem1.setLayout(pnTimkiem1Layout);
        pnTimkiem1Layout.setHorizontalGroup(
            pnTimkiem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimkiem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addGap(159, 159, 159))
        );
        pnTimkiem1Layout.setVerticalGroup(
            pnTimkiem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimkiem1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnTimkiem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addGroup(pnTimkiem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(pnTimkiem1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTimkiem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        sachTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(sachTable);

        javax.swing.GroupLayout bookLayout = new javax.swing.GroupLayout(book);
        book.setLayout(bookLayout);
        bookLayout.setHorizontalGroup(
            bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnTimkiem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bookLayout.setVerticalGroup(
            bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(pnTimkiem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnChucNang.add(book, "book");

        docgia.setBackground(new java.awt.Color(244, 247, 251));

        pnTimkiem2.setBackground(new java.awt.Color(255, 255, 255));
        pnTimkiem2.setPreferredSize(new java.awt.Dimension(1237, 60));

        jLabel14.setText("Tìm kiếm theo tên ");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search-interface-symbol.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        addBook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add (1).png"))); // NOI18N
        addBook1.setText("Thêm");
        addBook1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBook1MouseClicked(evt);
            }
        });
        addBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBook1ActionPerformed(evt);
            }
        });

        editBook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        editBook1.setText("Sửa");
        editBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBook1ActionPerformed(evt);
            }
        });

        deleteBook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        deleteBook1.setText("Xóa");
        deleteBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBook1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTimkiem2Layout = new javax.swing.GroupLayout(pnTimkiem2);
        pnTimkiem2.setLayout(pnTimkiem2Layout);
        pnTimkiem2Layout.setHorizontalGroup(
            pnTimkiem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimkiem2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBook1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBook1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBook1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addGap(159, 159, 159))
        );
        pnTimkiem2Layout.setVerticalGroup(
            pnTimkiem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimkiem2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnTimkiem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addGroup(pnTimkiem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(pnTimkiem2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTimkiem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBook1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBook1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBook1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        docgiaTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(docgiaTable);

        javax.swing.GroupLayout docgiaLayout = new javax.swing.GroupLayout(docgia);
        docgia.setLayout(docgiaLayout);
        docgiaLayout.setHorizontalGroup(
            docgiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(docgiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(docgiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnTimkiem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        docgiaLayout.setVerticalGroup(
            docgiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(docgiaLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(pnTimkiem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnChucNang.add(docgia, "reader");

        nhanvien.setBackground(new java.awt.Color(244, 247, 251));

        pnTimkiem3.setBackground(new java.awt.Color(255, 255, 255));
        pnTimkiem3.setPreferredSize(new java.awt.Dimension(1237, 60));

        jLabel19.setText("Tìm kiếm theo tên ");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search-interface-symbol.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        addBook2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add (1).png"))); // NOI18N
        addBook2.setText("Thêm");
        addBook2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBook2MouseClicked(evt);
            }
        });
        addBook2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBook2ActionPerformed(evt);
            }
        });

        editBook2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        editBook2.setText("Sửa");
        editBook2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBook2ActionPerformed(evt);
            }
        });

        deleteBook2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        deleteBook2.setText("Xóa");
        deleteBook2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBook2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTimkiem3Layout = new javax.swing.GroupLayout(pnTimkiem3);
        pnTimkiem3.setLayout(pnTimkiem3Layout);
        pnTimkiem3Layout.setHorizontalGroup(
            pnTimkiem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimkiem3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBook2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBook2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBook2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addGap(159, 159, 159))
        );
        pnTimkiem3Layout.setVerticalGroup(
            pnTimkiem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimkiem3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnTimkiem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12)
                    .addGroup(pnTimkiem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(pnTimkiem3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTimkiem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBook2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBook2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBook2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout nhanvienLayout = new javax.swing.GroupLayout(nhanvien);
        nhanvien.setLayout(nhanvienLayout);
        nhanvienLayout.setHorizontalGroup(
            nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nhanvienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnTimkiem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nhanvienLayout.setVerticalGroup(
            nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nhanvienLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(pnTimkiem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnChucNang.add(nhanvien, "nhanvien");

        muonTra.setPreferredSize(new java.awt.Dimension(1400, 860));

        pnTimkiem5.setBackground(new java.awt.Color(255, 255, 255));
        pnTimkiem5.setPreferredSize(new java.awt.Dimension(1237, 60));

        jLabel24.setText("Tìm kiếm theo tên ");

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search-interface-symbol.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        addBook4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add (1).png"))); // NOI18N
        addBook4.setText("Thêm");
        addBook4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBook4MouseClicked(evt);
            }
        });
        addBook4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBook4ActionPerformed(evt);
            }
        });

        editBook4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        editBook4.setText("Sửa");
        editBook4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBook4ActionPerformed(evt);
            }
        });

        deleteBook8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        deleteBook8.setText("Xóa");
        deleteBook8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBook8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTimkiem5Layout = new javax.swing.GroupLayout(pnTimkiem5);
        pnTimkiem5.setLayout(pnTimkiem5Layout);
        pnTimkiem5Layout.setHorizontalGroup(
            pnTimkiem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimkiem5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBook4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBook4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBook8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13)
                .addGap(159, 159, 159))
        );
        pnTimkiem5Layout.setVerticalGroup(
            pnTimkiem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimkiem5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnTimkiem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13)
                    .addGroup(pnTimkiem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(pnTimkiem5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTimkiem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBook4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBook4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBook8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable10);

        javax.swing.GroupLayout muonTraLayout = new javax.swing.GroupLayout(muonTra);
        muonTra.setLayout(muonTraLayout);
        muonTraLayout.setHorizontalGroup(
            muonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(muonTraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(muonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnTimkiem5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        muonTraLayout.setVerticalGroup(
            muonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(muonTraLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(pnTimkiem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnChucNang.add(muonTra, "muonTra");

        pnTimkiem10.setBackground(new java.awt.Color(255, 255, 255));
        pnTimkiem10.setPreferredSize(new java.awt.Dimension(1237, 60));

        jLabel25.setText("Tìm kiếm theo tên ");

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search-interface-symbol.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        addBook9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add (1).png"))); // NOI18N
        addBook9.setText("Thêm");
        addBook9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBook9MouseClicked(evt);
            }
        });
        addBook9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBook9ActionPerformed(evt);
            }
        });

        editBook9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        editBook9.setText("Sửa");
        editBook9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBook9ActionPerformed(evt);
            }
        });

        deleteBook9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        deleteBook9.setText("Xóa");
        deleteBook9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBook9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTimkiem10Layout = new javax.swing.GroupLayout(pnTimkiem10);
        pnTimkiem10.setLayout(pnTimkiem10Layout);
        pnTimkiem10Layout.setHorizontalGroup(
            pnTimkiem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimkiem10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBook9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBook9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBook9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14)
                .addGap(159, 159, 159))
        );
        pnTimkiem10Layout.setVerticalGroup(
            pnTimkiem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimkiem10Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnTimkiem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14)
                    .addGroup(pnTimkiem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(pnTimkiem10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTimkiem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBook9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBook9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBook9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(jTable11);

        javax.swing.GroupLayout phieuPhatLayout = new javax.swing.GroupLayout(phieuPhat);
        phieuPhat.setLayout(phieuPhatLayout);
        phieuPhatLayout.setHorizontalGroup(
            phieuPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phieuPhatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(phieuPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnTimkiem10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        phieuPhatLayout.setVerticalGroup(
            phieuPhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phieuPhatLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(pnTimkiem10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnChucNang.add(phieuPhat, "phieuPhat");

        pnTimkiem11.setBackground(new java.awt.Color(255, 255, 255));
        pnTimkiem11.setPreferredSize(new java.awt.Dimension(1237, 60));

        jLabel26.setText("Tìm kiếm theo tên ");

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search-interface-symbol.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        addBook10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add (1).png"))); // NOI18N
        addBook10.setText("Thêm");
        addBook10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBook10MouseClicked(evt);
            }
        });
        addBook10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBook10ActionPerformed(evt);
            }
        });

        editBook10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        editBook10.setText("Sửa");
        editBook10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBook10ActionPerformed(evt);
            }
        });

        deleteBook10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        deleteBook10.setText("Xóa");
        deleteBook10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBook10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTimkiem11Layout = new javax.swing.GroupLayout(pnTimkiem11);
        pnTimkiem11.setLayout(pnTimkiem11Layout);
        pnTimkiem11Layout.setHorizontalGroup(
            pnTimkiem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimkiem11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBook10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBook10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBook10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15)
                .addGap(159, 159, 159))
        );
        pnTimkiem11Layout.setVerticalGroup(
            pnTimkiem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimkiem11Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnTimkiem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15)
                    .addGroup(pnTimkiem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(pnTimkiem11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTimkiem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBook10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBook10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBook10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane12.setViewportView(jTable12);

        javax.swing.GroupLayout nhapSachLayout = new javax.swing.GroupLayout(nhapSach);
        nhapSach.setLayout(nhapSachLayout);
        nhapSachLayout.setHorizontalGroup(
            nhapSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nhapSachLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nhapSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnTimkiem11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nhapSachLayout.setVerticalGroup(
            nhapSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nhapSachLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(pnTimkiem11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnChucNang.add(nhapSach, "nhapSach");

        javax.swing.GroupLayout thongKeLayout = new javax.swing.GroupLayout(thongKe);
        thongKe.setLayout(thongKeLayout);
        thongKeLayout.setHorizontalGroup(
            thongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        thongKeLayout.setVerticalGroup(
            thongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnChucNang.add(thongKe, "card8");

        getContentPane().add(pnChucNang, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSachMouseClicked
        // TODO add your handling code here:
        //       book.setVisible(true);
        //       reader.setVisible(false);
        //       nhanvien.setVisible(false);
    }//GEN-LAST:event_pnSachMouseClicked

    private void pnDocGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnDocGiaMouseClicked
        // TODO add your handling code here:
        //       book.setVisible(false);
        //       reader.setVisible(true);
        //       nhanvien.setVisible(false);
    }//GEN-LAST:event_pnDocGiaMouseClicked

    private void pnNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnNhanVienMouseClicked
        // TODO add your handling code here:
        //       book.setVisible(false);
        //       reader.setVisible(false);
        //       nhanvien.setVisible(true);
    }//GEN-LAST:event_pnNhanVienMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        openMenuBar();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void lblClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblClose1MouseClicked

    private void lblClose1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose1MouseEntered
        // TODO add your handling code here:
        pnClose.setBackground(Color.RED);
    }//GEN-LAST:event_lblClose1MouseEntered

    private void pnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_pnCloseMouseClicked

    private void pnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnCloseMouseEntered
        // TODO add your handling code here:
        pnClose.setBackground(Color.RED);
    }//GEN-LAST:event_pnCloseMouseEntered

    private void pnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnCloseMouseExited
        // TODO add your handling code here:
        pnClose.setBackground(new Color(46,92,138));
    }//GEN-LAST:event_pnCloseMouseExited

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void addBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBookMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addBookMouseClicked

    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        // TODO add your handling code here:
        AddBookForm bookForm = new AddBookForm();
        bookForm.setVisible(true);
    }//GEN-LAST:event_addBookActionPerformed

    private void editBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBookActionPerformed
        // TODO add your handling code here:
        AddBookForm bookForm = new AddBookForm();
        bookForm.setVisible(true);
    }//GEN-LAST:event_editBookActionPerformed

    private void deleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBookActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void addBook1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBook1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addBook1MouseClicked

    private void addBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBook1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBook1ActionPerformed

    private void editBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBook1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBook1ActionPerformed

    private void deleteBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBook1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBook1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void addBook2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBook2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addBook2MouseClicked

    private void addBook2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBook2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBook2ActionPerformed

    private void editBook2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBook2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBook2ActionPerformed

    private void deleteBook2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBook2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBook2ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void addBook4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBook4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addBook4MouseClicked

    private void addBook4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBook4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBook4ActionPerformed

    private void editBook4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBook4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBook4ActionPerformed

    private void deleteBook8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBook8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBook8ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void addBook9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBook9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addBook9MouseClicked

    private void addBook9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBook9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBook9ActionPerformed

    private void editBook9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBook9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBook9ActionPerformed

    private void deleteBook9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBook9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBook9ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void addBook10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBook10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addBook10MouseClicked

    private void addBook10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBook10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBook10ActionPerformed

    private void editBook10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBook10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBook10ActionPerformed

    private void deleteBook10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBook10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBook10ActionPerformed
    private void addMenuEvent(JPanel panel, String cardName){
        CardLayout cardLayout = (CardLayout) pnChucNang.getLayout();
        panel.addMouseListener(new MouseAdapter(){
                @Override
        public void mouseEntered(MouseEvent e) {
            if (panel != selectedMenu) {
                panel.setBackground(COLOR_HOVER);
                
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (panel != selectedMenu) {
                panel.setBackground(COLOR_DEFAULT);
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            if (selectedMenu != null) {
                selectedMenu.setBackground(COLOR_DEFAULT);
            }
            selectedMenu = panel;
            panel.setBackground(COLOR_ACTIVE);
            cardLayout.show(pnChucNang, cardName);
            
        }
        });
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
            java.util.logging.Logger.getLogger(MainPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPageForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBook;
    private javax.swing.JButton addBook1;
    private javax.swing.JButton addBook10;
    private javax.swing.JButton addBook2;
    private javax.swing.JButton addBook4;
    private javax.swing.JButton addBook9;
    private javax.swing.JPanel book;
    private javax.swing.JButton deleteBook;
    private javax.swing.JButton deleteBook1;
    private javax.swing.JButton deleteBook10;
    private javax.swing.JButton deleteBook2;
    private javax.swing.JButton deleteBook8;
    private javax.swing.JButton deleteBook9;
    private javax.swing.JPanel docgia;
    private javax.swing.JTable docgiaTable;
    private javax.swing.JButton editBook;
    private javax.swing.JButton editBook1;
    private javax.swing.JButton editBook10;
    private javax.swing.JButton editBook2;
    private javax.swing.JButton editBook4;
    private javax.swing.JButton editBook9;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblClose1;
    private javax.swing.JPanel muonTra;
    private javax.swing.JPanel nhanvien;
    private javax.swing.JPanel nhapSach;
    private javax.swing.JPanel phieuPhat;
    private javax.swing.JPanel pnChucNang;
    private javax.swing.JPanel pnClose;
    private javax.swing.JPanel pnDocGia;
    private javax.swing.JPanel pnHeader;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnMuonTra;
    private javax.swing.JPanel pnNhanVien;
    private javax.swing.JPanel pnNhapSach;
    private javax.swing.JPanel pnPhieuPhat;
    private javax.swing.JPanel pnSach;
    private javax.swing.JPanel pnThongKe;
    private javax.swing.JPanel pnTimkiem1;
    private javax.swing.JPanel pnTimkiem10;
    private javax.swing.JPanel pnTimkiem11;
    private javax.swing.JPanel pnTimkiem2;
    private javax.swing.JPanel pnTimkiem3;
    private javax.swing.JPanel pnTimkiem5;
    private javax.swing.JTable sachTable;
    private javax.swing.JPanel thongKe;
    // End of variables declaration//GEN-END:variables
}
