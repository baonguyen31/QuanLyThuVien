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
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author noname
 */
public class CTPhieuMuonDAO {
    Statement st = null;
    ResultSet rs = null;
    Connection conn = null;
       
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
    
    
}
