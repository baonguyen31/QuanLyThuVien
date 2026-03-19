/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NhaXuatBanDTO;
import DTO.SachDTO;
import DTO.TheLoaiDTO;
import Util.JDBCUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
            String qry = "Select * from sach";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()){
                SachDTO sach = new SachDTO();
                sach.setMaSach(rs.getString("MaSach"));
                sach.setTenSach(rs.getString("TenSach"));
                sach.setMaTL(rs.getString("MaTL"));
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
    
    
    public boolean insertSach(SachDTO sach){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String ngayXB = sdf.format(sach.getNgayXB());
        
        try{
            conn = JDBCUtil.getConnect();
            String qry = "INSERT INTO sach(MaSach, TenSach, MaTL, MaNXB, NgayXuatBan, SoLuong, DonGia) VALUES (";
            qry += "'" + sach.getMaSach() + "'";
            qry += "," + "'" + sach.getTenSach() + "'";
            qry += "," + "'" + sach.getMaTL() + "'";
            qry += "," + "'" + sach.getMaNXB()+ "'";
            qry += "," + "'" + ngayXB + "'";
            qry += "," + "'" + sach.getSoLuong()+ "'";
            qry += "," + "'" + sach.getDonGia()+ "'";
            qry += ")";
            
            st = conn.createStatement();
//            System.out.println("\nQRY: " + qry);
            st.executeUpdate(qry);
            
            conn.close();
            return true;
        } catch(java.sql.SQLException e){
            JOptionPane.showMessageDialog(null, "Lỗi thêm sách vào DB" + e.getMessage());
            return false;
        }
    }
    
    public boolean editSach(SachDTO sach){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String ngayXB = sdf.format(sach.getNgayXB());
        try{
            conn = JDBCUtil.getConnect();
            String qry = "UPDATE sach SET ";
            qry += "TenSach = '" + sach.getTenSach() + "', ";
            qry += "MaTL = '" + sach.getMaTL() + "', ";
            qry += "MaNXB = '" + sach.getMaNXB() + "', ";
            qry += "NgayXuatBan = '" + ngayXB + "', ";
            qry += "SoLuong = " + sach.getSoLuong() + ", ";
            qry += "DonGia = " + sach.getDonGia() + " ";
            qry += "WHERE MaSach = '" + sach.getMaSach() + "'";
            
            st = conn.createStatement();
//            System.out.println("\nQRY: " + qry);
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
    
    public boolean suaSach(SachDTO sach){
        try{
            conn = JDBCUtil.getConnect();
            String qry = "Update sach SET ";
            qry += "TenSach = '" + sach.getTenSach() + "', ";
            qry += "MaTL = '" + sach.getMaTL() + "', ";
            qry += "MaNXB = '" + sach.getMaNXB() + "', ";
            qry += "MaNgayXB = '" + sach.getNgayXB() + "', ";
            qry += " Where MaSach = '" + sach.getMaSach() + "'";
            
            st = conn.createStatement();
            st.executeUpdate(qry);
            return true;
        } catch(java.sql.SQLException e){
            JOptionPane.showMessageDialog(null, "Lỗi");
            return false;
        }
    }
    
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
           } catch(SQLException e){e.printStackTrace();}
           return dsTL;
    }
    
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
           } catch(SQLException e){e.printStackTrace();}
           return dsNXB;
    }
    
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
    
   
}
