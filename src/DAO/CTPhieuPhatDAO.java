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
                ctpp.setMaCtpp(rs.getInt("MaCTPP"));
                ctpp.setMaPP(rs.getString("MaPP"));
                ctpp.setQdPhat(rs.getString("MaQDP"));
                ctpp.setMaSach(rs.getString("MaSach"));
                ctpp.setSoNgayTre(rs.getInt("SoNgayTre"));
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
      
//    public boolean insert(CTPhieuPhatDTO ctpn){
//        try {
//        conn = JDBCUtil.getConnect();
//        String qry = "Insert into ct_phieunhap values(";
//        qry += "'" + ctpn.getMaPn()+ "'";
//        qry += ","+ "'" + ctpn.getMaSach()+ "', ";
//        qry +=  ctpn.getSl()+ ", ";
//        qry +=  ctpn.getDonGia()+ ", ";
//        qry +=  ctpn.getThanhTien()+ ")";
//        System.out.print(qry);
//        st = conn.createStatement();
//        st.executeUpdate(qry); 
//        JDBCUtil.closeConnection(conn);
//        return true;
//        } catch(SQLException e){
//            JOptionPane.showMessageDialog(null, "Thêm ct phiếu nhập không thành công");
//        }
//        return false;
//    }
}

