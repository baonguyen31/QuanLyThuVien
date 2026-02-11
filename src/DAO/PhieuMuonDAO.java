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
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author noname
 */
public class PhieuMuonDAO {
    Statement st = null;
    ResultSet rs = null;
    Connection conn = null;
    
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
        System.out.print(qry);
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
}
