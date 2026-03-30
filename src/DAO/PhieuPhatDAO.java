/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.PhieuPhatDTO;
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
public class PhieuPhatDAO {
    Statement st = null;
    ResultSet rs = null;
    Connection conn = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public ArrayList<PhieuPhatDTO> getAll(){
         ArrayList<PhieuPhatDTO> result  = new ArrayList<>();
        try{
            conn = JDBCUtil.getConnect();
            String qry = "Select * from phieuphat ";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            while(rs.next()){
                PhieuPhatDTO pn = new PhieuPhatDTO();
                pn.setMaPP(rs.getString("MaPP"));
                pn.setMaPM(rs.getString("MaPM"));
                pn.setMaDG(rs.getString("MaDG"));
                pn.setNgayLap(rs.getDate("NgayLap"));
                pn.setSoNgayTre(rs.getInt("SoNgayTre"));
                pn.setTongTien(rs.getDouble("TongTien"));
                pn.setTrangThai(rs.getInt("TrangThai"));
                result.add(pn);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return result;
    }
        
    
    
     public String getLastMaPP() {
    String sql = "SELECT MaPP FROM phieuphat ORDER BY MaPP DESC LIMIT 1";
    try {
        conn = JDBCUtil.getConnect();
        st = conn.createStatement();
        rs = st.executeQuery(sql);
        if (rs.next()) {
            return rs.getString("MaPP");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}
    public PhieuPhatDTO getByMaPP(String MaPP){
        PhieuPhatDTO PhieuPhatDto = null;
        try {
            conn = JDBCUtil.getConnect();
            String qry = "Select * from phieuphat where MaPP = " + "'"+ MaPP +"'";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            if(rs.next()){
                PhieuPhatDto = new PhieuPhatDTO();
                PhieuPhatDto.setMaPP(rs.getString("MaPP"));
                PhieuPhatDto.setMaPM(rs.getString("MaPM"));
                PhieuPhatDto.setMaDG(rs.getString("MaDG"));
                PhieuPhatDto.setMaNV(rs.getString("MaNV"));
                PhieuPhatDto.setNgayLap(rs.getDate("NgayLap"));
                PhieuPhatDto.setSoNgayTre(rs.getInt("SoNgayTre"));
                PhieuPhatDto.setTongTien(rs.getDouble("TongTien"));
                PhieuPhatDto.setTrangThai(rs.getInt("TrangThai"));
                System.out.println(qry);
            }
            JDBCUtil.closeConnection(conn);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return PhieuPhatDto;
    }
    //============Thêm, sửa==============//
    public boolean insertPP(PhieuPhatDTO pp){
        try{
            conn = JDBCUtil.getConnect();
            String qry = "INSERT INTO phieuphat(maPP, maPM, maDG, maNV, ngayLap, soNgayTre, tongTien, trangThai) VALUES (";
            qry +=  "'" + pp.getMaPP() + "', ";
            qry += "'" + pp.getMaPM() + "', ";
            qry += "'" + pp.getMaDG() + "', ";
            qry += "'" + pp.getMaNV() + "', ";
            qry += "'" + new java.sql.Date(pp.getNgayLap().getTime()) + "', ";
//            qry += "'" + sdf.format(pp.getNgayLap()) + "', ";
            qry += pp.getSoNgayTre()+ ", ";
            qry += pp.getTongTien() + ", ";
            qry += pp.getTrangThai() + ")";
            
            st = conn.createStatement();
            st.executeUpdate(qry);
            return true;
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi thêm phiếu phạt trong DB");
            return false;
        }
    }
    
    public boolean updatePP(PhieuPhatDTO pp) {
        try {
            conn = JDBCUtil.getConnect();
            String qry = "UPDATE phieuphat SET ";
            qry += "maPM='" + pp.getMaPM() + "', ";
            qry += "maDG='" + pp.getMaDG() + "', ";
            qry += "maNV='" + pp.getMaNV() + "', ";
            qry += "ngayLap='" + new java.sql.Date(pp.getNgayLap().getTime()) + "', ";
            qry += "soNgayTre=" + pp.getSoNgayTre()+ ", ";
            qry += "tongTien=" + pp.getTongTien() + ", ";
            qry += "trangThai=" + pp.getTrangThai();
            qry += " WHERE maPP='" + pp.getMaPP() + "'";
            
            st = conn.createStatement();
            st.executeUpdate(qry);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi sửa phiếu phạt trong DB");
            return false;
        }
    }
    
    public boolean deletePP(String ma){
        try{
            conn = JDBCUtil.getConnect();
            String qry = "DELETE FROM phieuphat WHERE MaPP = '" + ma + "'";
            st = conn.createStatement();
            st.executeUpdate(qry);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi xóa phiếu phạt trong DB");
            return false;
        }
    }
    //tìm kiếm
    public ArrayList<PhieuPhatDTO> searchByMaPP(String keyword, ArrayList<PhieuPhatDTO> list){
        ArrayList<PhieuPhatDTO> searchList = new ArrayList<>();
        try {
            conn = JDBCUtil.getConnect();
            String qry = "SELECT * FROM phieuphat WHERE MaPP LIKE '%" + keyword + "%'";
            qry += " OR MaPM LIKE '%" + keyword + "%'";
            qry += " OR MaDG LIKE '%" + keyword + "%'";
            st = conn.createStatement();
            rs = st.executeQuery(qry);

            while (rs.next()) {
                PhieuPhatDTO pp = new PhieuPhatDTO();
                pp.setMaPP(rs.getString("MaPP"));
                pp.setMaPM(rs.getString("MaPM"));
                pp.setMaDG(rs.getString("MaDG"));
                pp.setNgayLap(rs.getDate("NgayLap"));
                pp.setTongTien(rs.getDouble("TongTien"));
                pp.setTrangThai(rs.getInt("TrangThai"));
                searchList.add(pp);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi tìm kiếm phiếu phạt trong DB");
        }
        return searchList;
        }
    //thống kê và lọc
    public int thongKeTheoTrangThai(int trangThai) {
        int count = 0;
        try {
            conn = JDBCUtil.getConnect();
            String qry = "SELECT COUNT(*) AS total FROM phieuphat WHERE TrangThai = " + trangThai;
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            if (rs.next()) {
                count = rs.getInt("total");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi không thể thống kê phiếu phạt");
        }
        return count;
    }
    public ArrayList<PhieuPhatDTO> filterByTrangThai(int trangThai) {
        ArrayList<PhieuPhatDTO> list = new ArrayList<>();
        try {
            conn = JDBCUtil.getConnect();
            String qry = "SELECT * FROM phieuphat WHERE TrangThai = " + trangThai;
            st = conn.createStatement();
            rs = st.executeQuery(qry);

            while (rs.next()) {
                PhieuPhatDTO pp = new PhieuPhatDTO();
                pp.setMaPP(rs.getString("MaPP"));
                pp.setMaDG(rs.getString("MaDG"));
                pp.setNgayLap(rs.getDate("NgayLap"));
                pp.setTongTien(rs.getDouble("TongTien"));
                pp.setTrangThai(rs.getInt("TrangThai"));
                list.add(pp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
