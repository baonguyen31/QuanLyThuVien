/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CTPhieuMuonDTO;
import DTO.PhieuMuonDTO;
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
public class CTPhieuMuonDAO {
    Statement st = null;
    ResultSet rs = null;
    Connection conn = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
    
    
    public ArrayList<CTPhieuMuonDTO> getCTPMByMaPM(String MaPM){
        ArrayList<CTPhieuMuonDTO> dsCTPhieuMuon =  new ArrayList<CTPhieuMuonDTO>();
        try{
            conn = JDBCUtil.getConnect();
            String qry = "Select * from ct_phieumuon where MaPM = " +"'" +MaPM + "'";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            while(rs.next()){
                CTPhieuMuonDTO ctpm = new CTPhieuMuonDTO();
                ctpm.setMaPM(rs.getString("MaPM"));
                ctpm.setMaSach(rs.getString("MaSach"));
                ctpm.setSoLuong(rs.getInt("SoLuong"));
                dsCTPhieuMuon.add(ctpm);
            }
            JDBCUtil.closeConnection(conn);
        }catch(Exception e)
                {
            e.printStackTrace();
        }
        return dsCTPhieuMuon;
    }
     public boolean insert(CTPhieuMuonDTO ctpm){
        try {
        conn = JDBCUtil.getConnect();
        String qry = "Insert into ct_phieumuon values(";
        qry += "'" + ctpm.getMaPM() + "'";
        qry += ","+ "'" + ctpm.getMaSach()+ "'";
        qry += "," + "'" + ctpm.getSoLuong()+ "')";
        st = conn.createStatement();
        st.executeUpdate(qry); 
        System.out.print(qry);
        JDBCUtil.closeConnection(conn);
        return true;
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Thêm ct phiếu mượn không thành công");
        }
        return false;
    }
    
        public ArrayList<CTPhieuMuonDTO> top10Sach(Date tuNgay, Date denNgay){
        ArrayList<CTPhieuMuonDTO> result = new ArrayList<>();
        try {
            conn = JDBCUtil.getConnect();
            String qry = "Select s.MaSach, SUM(ct.SoLuong) as SoLuongMuon";
            qry += " from ct_phieumuon ct";
            qry += " join sach s on s.MaSach = ct.MaSach";
            qry += " join phieumuon pm on pm.MaPM = ct.MaPM";
            if(tuNgay != null) qry += " and pm.NgayMuon >= '" + sdf.format(tuNgay) + "'";
            if(denNgay != null) qry += " and pm.NgayMuon <= '" + sdf.format(denNgay) + "'";
            qry += " group by s.MaSach ";
            qry += " order by SoLuongMuon desc"; 
            qry += " limit 10";
//            System.out.println(qry);
            st = conn.createStatement();
            rs = st.executeQuery(qry);           
            while(rs.next()){
                CTPhieuMuonDTO ctpm = new CTPhieuMuonDTO();
                ctpm.setMaSach(rs.getString("MaSach"));
                ctpm.setTongSoLuong(rs.getInt("SoLuongMuon"));
                result.add(ctpm);
            }
            JDBCUtil.closeConnection(conn);
        } catch (SQLException ex) {
                    ex.printStackTrace();
               }
        return result;
    }
        
    public void deleteCtpm(String maPm){
        
        try {
            conn = JDBCUtil.getConnect();
            String qry = " delete from ct_phieumuon where MaPM = '" +maPm + "'";
            st = conn.createStatement();
            st.executeUpdate(qry);
        } catch (SQLException ex) {
            Logger.getLogger(CTPhieuMuonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public boolean update(CTPhieuMuonDTO ctpm){
        try {
        conn = JDBCUtil.getConnect();
        String qry = "Update ct_phieumuon Set ";
        qry += "SoLuong = '" + ctpm.getSoLuongTra() + "'";
        qry += " where MaPM = '" + ctpm.getMaPM() + "'";
        qry += " and MaSach = '" + ctpm.getMaSach()+ "'";
        st = conn.createStatement();
        st.executeUpdate(qry); 
        System.out.print(qry);
        JDBCUtil.closeConnection(conn);
        return true;
        } catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "thêm số lượng còn không thành công");
        }
        return false;
    }
}
