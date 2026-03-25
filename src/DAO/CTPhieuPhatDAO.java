/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CTPhieuPhatDTO;
import Util.JDBCUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author noname
 */
public class CTPhieuPhatDAO {
    Statement st = null;
    ResultSet rs = null;
    Connection conn = null;
      public ArrayList<CTPhieuPhatDTO> getCTPPByMaPP(String MaPP){
        ArrayList<CTPhieuPhatDTO> dsCTPhieuPhat =  new ArrayList<CTPhieuPhatDTO>();
        try{
            conn = JDBCUtil.getConnect();
            String qry = "Select * from ct_phieuphat where MaPP = " +"'" +MaPP + "'";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            while(rs.next()){
                CTPhieuPhatDTO ctpp = new CTPhieuPhatDTO();
//                ctpp.setMaCtpp(rs.getInt("MaCTPP"));
                ctpp.setMaPP(rs.getString("MaPP"));
                ctpp.setQdPhat(rs.getString("MaQDP"));
                ctpp.setMaSach(rs.getString("MaSach"));
                ctpp.setSoLuong(rs.getInt("SoLuong"));
//                ctpp.setSoNgayTre(rs.getInt("SoNgayTre"));
                ctpp.setLyDo(rs.getString("LyDo"));
                ctpp.setThanhTien(rs.getDouble("ThanhTien"));
                dsCTPhieuPhat.add(ctpp);
            }
            JDBCUtil.closeConnection(conn);
        }catch(Exception e)
                {
            e.printStackTrace();
        }
        return dsCTPhieuPhat;
    }
      
    public boolean insertCTPP(CTPhieuPhatDTO ctpn){
        try {
        conn = JDBCUtil.getConnect();
        String qry = "INSERT INTO ct_phieuphat VALUES(";
        qry += "'" + ctpn.getMaPP() + "', ";
        qry += "'" + ctpn.getMaSach() + "', ";
        qry += "'" + ctpn.getQdPhat()+ "', ";
        qry += "'" + ctpn.getSoLuong() + "', ";
        qry += "'" + ctpn.getLyDo() + "', ";
        qry += "'" + ctpn.getThanhTien() + "')";
        
        st = conn.createStatement();
        st.executeUpdate(qry); 
        JDBCUtil.closeConnection(conn);
        return true;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Lỗi thêm ct phiếu phạt trong DB");
            return false;
        }
    }
    
    public boolean deleteByMaPP(String ma) {
        try {
            conn = JDBCUtil.getConnect();
            String qry = "DELETE FROM ct_phieuphat WHERE maPP ='" + ma + "'";
            st = conn.createStatement();
            st.executeUpdate(qry); 
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa ct phiếu phạt trong DB");
            return false;
        }
    }
}

