/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NhaXuatBanDTO;
import DTO.SachDTO;
import DTO.TacGiaDTO;
import DTO.TheLoaiDTO;
import Util.JDBCUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author noname
 */
public class SachDAO {
    Statement st = null;
    ResultSet rs = null;
    Connection conn = null;
    
    //Đọc ds
    public ArrayList<SachDTO> selectAll(){
        ArrayList<SachDTO> result = new ArrayList<SachDTO>();
        try {
            conn = JDBCUtil.getConnect();
            String qry = "SELECT * from sach";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()){
                SachDTO sach = new SachDTO();
                sach.setMaSach(rs.getString("MaSach"));
                sach.setTenSach(rs.getString("TenSach"));
                sach.setMaTL(rs.getString("MaTL"));
                sach.setMaTG(rs.getString("MaTG"));
                sach.setMaNXB(rs.getString("MaNXB"));
                sach.setNgayXB(rs.getDate("NgayXuatBan"));
                sach.setSoLuong(rs.getInt("SoLuong"));
                sach.setDonGia(rs.getInt("DonGia"));
                result.add(sach);  
            } 
            JDBCUtil.closeConnection(conn);
            
        }catch(java.sql.SQLException e)
            {
                    JOptionPane.showMessageDialog(null, "Không thể lấy dữ liệu sách!","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        return result;    
    }

    
      public SachDTO getSachByMa(String maSach){
        SachDTO sach = new SachDTO();
        try {
            conn = JDBCUtil.getConnect();
            String qry = "Select * from sach where MaSach = '" + maSach + "'";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            if (rs.next()){
                sach.setMaSach(rs.getString("MaSach"));
                sach.setTenSach(rs.getString("TenSach"));
                sach.setMaTL(rs.getString("MaTL"));
                sach.setMaNXB(rs.getString("MaNXB"));
                sach.setNgayXB(rs.getDate("NgayXuatBan"));
                sach.setSoLuong(rs.getInt("SoLuong"));
                sach.setDonGia(rs.getInt("DonGia"));
                return sach;
            } 
            JDBCUtil.closeConnection(conn);
        }catch(java.sql.SQLException e)
            {
                    JOptionPane.showMessageDialog(null, "Không thể lấy dữ liệu sách!","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        return sach;
    }
    
    //thêm
    public boolean insertSach(SachDTO sach){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String ngayXB = sdf.format(sach.getNgayXB());
        
        try{
            conn = JDBCUtil.getConnect();
            String qry = "INSERT INTO sach(MaSach, TenSach, MaTL, MaTG, MaNXB, NgayXuatBan, SoLuong, DonGia) VALUES (";
            qry += "'" + sach.getMaSach() + "'";
            qry += "," + "'" + sach.getTenSach() + "'";
            qry += "," + "'" + sach.getMaTL() + "'";
            qry += "," + "'" + sach.getMaTG() + "'";
            qry += "," + "'" + sach.getMaNXB()+ "'";
            qry += "," + "'" + ngayXB + "'";
            qry += "," + "'" + sach.getSoLuong()+ "'";
            qry += "," + "'" + sach.getDonGia()+ "'";
            qry += ")";
            
            st = conn.createStatement();
            st.executeUpdate(qry);
            
            conn.close();
            return true;
        } catch(java.sql.SQLException e){
            JOptionPane.showMessageDialog(null, "Lỗi thêm sách vào DB" + e.getMessage());
            return false;
        }
    }
    //sửa
    public boolean editSach(SachDTO sach){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String ngayXB = sdf.format(sach.getNgayXB());
        
        try{
            conn = JDBCUtil.getConnect();
            String qry = "UPDATE sach SET ";
            qry += "TenSach = '" + sach.getTenSach() + "', ";
            qry += "MaTL = '" + sach.getMaTL() + "', ";
            qry += "MaTG = '" + sach.getMaTG() + "', ";
            qry += "MaNXB = '" + sach.getMaNXB() + "', ";
            qry += "NgayXuatBan = '" + ngayXB + "', ";
            qry += "SoLuong = " + sach.getSoLuong() + ", ";
            qry += "DonGia = " + sach.getDonGia() + " ";
            qry += "WHERE MaSach = '" + sach.getMaSach() + "'";
            
            st = conn.createStatement();
            st.executeUpdate(qry);
            return true;
        } catch(java.sql.SQLException e){
            JOptionPane.showMessageDialog(null, "Lỗi sửa sách trong DB");
            return false;
        }
    }
    
    public boolean deleteSach(String ma){
        try{
            conn = JDBCUtil.getConnect();
            String qry = "Delete FROM sach WHERE MaSach = '"+ ma +"'";
            
            st = conn.createStatement();
            st.executeUpdate(qry);
            return true;
        } catch(java.sql.SQLException e){
            JOptionPane.showMessageDialog(null, "Lỗi xóa sách trong DB");
            return false;
        }
    }
//    public void capNhatSoLuongSauXoaPhieuNhap(String maSach, int soLuong) {
//        try {
//            conn = JDBCUtil.getConnect();
//            String sql = "UPDATE sach SET SoLuong = 0 WHERE MaSach = '" + maSach + "'";
//            sql += " Set SoLuong = SoLuong" + soLuong;
//            st = conn.createStatement();
//            st.executeUpdate(sql);
//            conn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
    //Lấy tên từ mã
    public String getTenSachByMa(String MaSach){
         String tenSach = null;
         try {
            conn = JDBCUtil.getConnect();
            String qry = "Select TenSach from sach where MaSach = "+"'"+ MaSach +"'";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            if (rs.next()){
                tenSach = rs.getString("TenSach");
            } 
//            System.out.print(qry);
            JDBCUtil.closeConnection(conn);
            
        }catch(java.sql.SQLException e)
            {
                    JOptionPane.showMessageDialog(null, "Không thể lấy dữ liễu sách !","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        return tenSach;
    }
    public String getTenTLByMa(String ma){
         String ten = null;
         try {
            conn = JDBCUtil.getConnect();
            String qry = "Select TenTL from theloai where MaTL = "+"'"+ ma +"'";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            if (rs.next()){
                ten= rs.getString("TenTL");
            } 
            conn.close();
        }catch(java.sql.SQLException e)
            {
                    JOptionPane.showMessageDialog(null, "Không thể lấy dữ liễu sách !","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        return ten;
    }
    public String getTenTGByMa(String ma){
         String ten = null;
         try {
            conn = JDBCUtil.getConnect();
            String qry = "Select TenTG from tacgia where MaTG = "+"'"+ ma +"'";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            if (rs.next()){
                ten= rs.getString("TenTG");
            } 
            
        }catch(java.sql.SQLException e)
            {
                    JOptionPane.showMessageDialog(null, "Không thể lấy dữ liễu sách !","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        return ten;
    }
    public String getTenNXBByMa(String ma){
         String ten = null;
         try {
            conn = JDBCUtil.getConnect();
            String qry = "Select TenNXB from nhaxuatban where MaNXB = "+"'"+ ma +"'";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            if (rs.next()){
                ten= rs.getString("TenNXB");
            } 
            
        }catch(java.sql.SQLException e)
            {
                    JOptionPane.showMessageDialog(null, "Không thể lấy dữ liễu sách !","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        return ten;
    }
    //tìm kiếm sách
    public ArrayList<SachDTO> searchSach(String keyword){
        ArrayList<SachDTO> list = new ArrayList<>();
        try{
            conn = JDBCUtil.getConnect();
            String qry = "SELECT * FROM sach WHERE MaSach LIKE '%" + keyword + "%' OR TenSach LIKE '%" + keyword + "%'";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            while(rs.next()){
                SachDTO sach = new SachDTO();
                sach.setMaSach(rs.getString("MaSach"));
                sach.setTenSach(rs.getString("TenSach"));
                sach.setMaTL(rs.getString("MaTL"));
                sach.setMaTG(rs.getString("MaTG"));
                sach.setMaNXB(rs.getString("MaNXB"));
                sach.setNgayXB(rs.getDate("NgayXuatBan"));
                sach.setSoLuong(rs.getInt("SoLuong"));
                sach.setDonGia(rs.getInt("DonGia"));
                list.add(sach);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Không tìm thấy sách");
        }
        return list;
    }
    
    //Lọc
    public ArrayList<String> thongKeTheoTheLoai() {
        ArrayList<String> result = new ArrayList<>();
        try {
            conn = JDBCUtil.getConnect();
            String sql = "SELECT MaTL, COUNT(*) AS SoLuong FROM sach GROUP BY MaTL";
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                String theLoai = rs.getString("MaTL");
                int soLuong = rs.getInt("SoLuong");
                result.add(theLoai + " - " + soLuong);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    //đổ data vào combobox
    public ArrayList<NhaXuatBanDTO> getTenNXBByMaNXB(){
           ArrayList<NhaXuatBanDTO> dsNXB = new ArrayList<>();
           try{
               conn = JDBCUtil.getConnect();
               String qry = "SELECT MaNXB, TenNXB FROM nhaxuatban";
               st = conn.createStatement();
               rs = st.executeQuery(qry);
               while(rs.next()){
                   NhaXuatBanDTO nxb = new NhaXuatBanDTO();
                    nxb.setMaNXB(rs.getString("MaNXB"));
                    nxb.setTenNXB(rs.getString("TenNXB"));
                    dsNXB.add(nxb);
               }
               conn.close();
           } catch(SQLException e){}
           return dsNXB;
    }
    public ArrayList<TheLoaiDTO> getTenTLByMaTL(){
           ArrayList<TheLoaiDTO> dsTL = new ArrayList<>();
           try{
               conn = JDBCUtil.getConnect();
               String qry = "SELECT MaTL, TenTL FROM theloai";
               st = conn.createStatement();
               rs = st.executeQuery(qry);
               
               while(rs.next()){
                   TheLoaiDTO tl = new TheLoaiDTO();
                    tl.setMaTL(rs.getString("MaTL"));
                    tl.setTenTL(rs.getString("TenTL"));
                    dsTL.add(tl);
               }
               conn.close();
           } catch(SQLException e){}
           return dsTL;
    }
    public ArrayList<TacGiaDTO> getTenTGByMaTG(){
           ArrayList<TacGiaDTO> dsTG = new ArrayList<>();
           try{
               conn = JDBCUtil.getConnect();
               String qry = "SELECT MaTG, TenTG FROM tacgia";
               st = conn.createStatement();
               rs = st.executeQuery(qry);
               
               while(rs.next()){
                    TacGiaDTO tg = new TacGiaDTO();
                    tg.setMaTG(rs.getString("MaTG"));
                    tg.setTenTG(rs.getString("TenTG"));
                    dsTG.add(tg);
               }
               conn.close();
           } catch(SQLException e){}
           return dsTG;
    }
    //cho phiếu mượn
    public boolean giamSoluong(String maSach, int soLuong){
        try  {
            conn = JDBCUtil.getConnect();
            String qry = "Update sach set SoLuong = SoLuong - ";
            qry += soLuong + " where MaSach = "+ "'" + maSach  + "'";
//            System.out.print(qry);
            st = conn.createStatement();
            st.executeUpdate(qry);
            JDBCUtil.closeConnection(conn);
            return true;           
    }
        catch(SQLException e){
            e.printStackTrace();
    }
            return false;
    }   
    public boolean tangSoluong(String maSach, int soLuong){
        try  {
            conn = JDBCUtil.getConnect();
            String qry = "Update sach set SoLuong = SoLuong + ";
            qry += soLuong + " where MaSach = " + "'" + maSach  + "'";
            System.out.print(qry);
            st = conn.createStatement();
            st.executeUpdate(qry);
            JDBCUtil.closeConnection(conn);
            return true;           
        }
    catch(SQLException e){e.printStackTrace();}
        return false;
    }
    //cho phiếu mượn
    public int getSoluong(String maSach){
        int soLuong = 0;
        try  {
            conn = JDBCUtil.getConnect();
            String qry = "Select SoLuong from sach where MaSach = " + "'" +maSach + "'" ;
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            if (rs.next()){
                soLuong = rs.getInt("SoLuong");
            } 
            JDBCUtil.closeConnection(conn);
    }
    catch(SQLException e){
        e.printStackTrace();
}
        return soLuong;
    }
    
    public boolean isExisted(String maSach){
        try{
        conn = JDBCUtil.getConnect();
        String qry = "SELECT COUNT(*) FROM sach WHERE MaSach = '" + maSach + "'";
        st = conn.createStatement();
        rs = st.executeQuery(qry);
        if (rs.next()) {
            return rs.getInt(1) > 0; // Trả về true nếu đã tồn tại
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
    }
   
}
