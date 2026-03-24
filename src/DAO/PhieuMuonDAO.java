/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.PhieuMuonDTO;
import Util.FormatDate;
import Util.JDBCUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author noname
 */
public class PhieuMuonDAO {
    Statement st = null;
    ResultSet rs = null;
    Connection conn = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public ArrayList<PhieuMuonDTO> selectAll (){
        ArrayList<PhieuMuonDTO> phieumuonDs = new ArrayList<>();
        try {
            conn = JDBCUtil.getConnect();
            String qry = "Select * from phieumuon";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            while(rs.next()){
                PhieuMuonDTO phieuMuonDto = new PhieuMuonDTO();
                phieuMuonDto.setMaPM(rs.getString("MaPM"));
                phieuMuonDto.setMaDG(rs.getString("MaDG"));
                phieuMuonDto.setMaNV(rs.getString("MaNV"));
                phieuMuonDto.setNgayMuon(rs.getDate("NgayMuon"));
                phieuMuonDto.setHanTra(rs.getDate("HanTra"));
                phieuMuonDto.setNgayTraThucTe(rs.getDate("NgayTraThucTe"));
                phieuMuonDto.setTrangThai(rs.getInt("TrangThai"));
                phieumuonDs.add(phieuMuonDto);
            }
            JDBCUtil.closeConnection(conn);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return phieumuonDs;
    }
    
    
     public PhieuMuonDTO getByMaPM(String MaPM){
        PhieuMuonDTO phieuMuonDto = null;
        try {
            conn = JDBCUtil.getConnect();
            String qry = "Select * from phieumuon where MaPM = " + "'"+ MaPM +"'";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            while(rs.next()){
                phieuMuonDto = new PhieuMuonDTO();
                phieuMuonDto.setMaPM(rs.getString("MaPM"));
                phieuMuonDto.setMaDG(rs.getString("MaDG"));
                phieuMuonDto.setMaNV(rs.getString("MaNV"));
                phieuMuonDto.setNgayMuon(rs.getDate("NgayMuon"));
                phieuMuonDto.setHanTra(rs.getDate("HanTra"));
                phieuMuonDto.setNgayTraThucTe(rs.getDate("NgayTraThucTe"));
                phieuMuonDto.setTrangThai(rs.getInt("TrangThai"));
            }
            JDBCUtil.closeConnection(conn);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return phieuMuonDto;
    }
     
    public String getLastMaPM() {
    String sql = "SELECT MaPM FROM phieumuon ORDER BY MaPM DESC LIMIT 1";
    try {
        conn = JDBCUtil.getConnect();
        st = conn.createStatement();
        rs = st.executeQuery(sql);
        if (rs.next()) {
            return rs.getString("MaPM");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}
    public boolean insert(PhieuMuonDTO pm){
        try {
        conn = JDBCUtil.getConnect();
        String qry = "Insert into phieumuon values(";
        qry += "'" + pm.getMaPM() + "'";
        qry += "," +"'" + pm.getMaDG() + "'";
        qry += "," +"'" + pm.getMaNV() + "'";
        qry += "," +"'" + new java.sql.Date(pm.getNgayMuon().getTime()) + "'";
        qry += "," +"'" + new java.sql.Date(pm.getHanTra().getTime()) + "'";
        qry += ","  + pm.getNgayTraThucTe();
        qry += "," + pm.getTrangThai()+")";
//        System.out.print(qry);
        st = conn.createStatement();
        st.executeUpdate(qry); 
        JDBCUtil.closeConnection(conn);
        return true;
        } catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Thêm phiếu mượn không thành công");
        }
        return false;
    }
    
    
    public void updateQuaHan() {
    try {
        conn = JDBCUtil.getConnect();
        String sql = "UPDATE phieumuon " +
                     "SET TrangThai = 2 " +
                     "WHERE TrangThai = 0 AND HanTra < CURDATE()";

        st = conn.createStatement();
        st.executeUpdate(sql);
        JDBCUtil.closeConnection(conn);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    public boolean updateNgayTra(String maPm){
        try{
            conn = JDBCUtil.getConnect();
            String qry = "Update phieumuon ";
            qry += "Set NgayTraThucTe = CURDATE() ";
            qry += " where MaPM = '" +maPm + "'" ;
//            qry += " where MaPM = '" + pm.getMaPM() +"'";
        System.out.print(qry);
        st = conn.createStatement();
        st.executeUpdate(qry); 
        
        JDBCUtil.closeConnection(conn);
        return true;
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Sửa phiếu mượn không thành công");
        }
        return false;
    }
    public boolean traSach(String maPm){
        try  {
            conn = JDBCUtil.getConnect();
            String qry = "Update phieumuon set TrangThai = 1";
            qry += " , NgayTraThucTe = CURDATE()";
            qry += " where MaPM = " + "'" + maPm  + "'";
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
    
    public boolean updatePM(PhieuMuonDTO pmDto){    
        try{
            conn = JDBCUtil.getConnect();
            String qry = "Update phieumuon ";
            qry += " Set MaDG = " + "'" + pmDto.getMaDG() + "'";
            
            
            qry += " , HanTra = " + "'" + sdf.format(pmDto.getHanTra() )+ "'" ;
            qry += " where MaPM = " + "'" + pmDto.getMaPM() + "'";
            st = conn.createStatement();
            st.executeUpdate(qry);  
            System.out.print(qry);
            JDBCUtil.closeConnection(conn);
            return true;
        }
        catch(SQLException e){
          e.printStackTrace();
        }
        return false;
    }
     public ArrayList<PhieuMuonDTO> filter(String loaiNgay, int trangThai, Date tuNgay, Date denNgay){
        ArrayList<PhieuMuonDTO> phieumuonDs = new ArrayList<>();
       try{
           conn = JDBCUtil.getConnect();
           String column = "";
           if(loaiNgay.equals("Ngày Mượn")){
               column = "NgayMuon";
           }
           else if(loaiNgay.equals("Hạn Trả")){
               column = "HanTra";
           }
           else if(loaiNgay.equals("Ngày trả thực tế")){
               column = "NgayTraThucTe";
           }
           String qry = "Select * from phieumuon where 1 = 1 ";
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

           if(!column.trim().isEmpty()){
           if(tuNgay != null) qry += " and " + column + " >= '" + sdf.format(tuNgay) + "'";
           if(denNgay != null) qry += " and " + column+ "<= '" + sdf.format(denNgay) + "'" ;
           }
           if(trangThai != -1)   qry += " and TrangThai = " + trangThai;
           System.out.print(qry);
            st  = conn.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()){
                PhieuMuonDTO phieuMuonDto = new PhieuMuonDTO();
                phieuMuonDto.setMaPM(rs.getString("MaPM"));
                phieuMuonDto.setMaDG(rs.getString("MaDG"));
                phieuMuonDto.setMaNV(rs.getString("MaNV"));
                phieuMuonDto.setNgayMuon(rs.getDate("NgayMuon"));
                phieuMuonDto.setHanTra(rs.getDate("HanTra"));
                phieuMuonDto.setNgayTraThucTe(rs.getDate("NgayTraThucTe"));
                phieuMuonDto.setTrangThai(rs.getInt("TrangThai"));
                phieumuonDs.add(phieuMuonDto);
            }
            JDBCUtil.closeConnection(conn);
            
       } catch(SQLException e){
                e.printStackTrace();
                }
       return phieumuonDs;
     }
     
   
}
