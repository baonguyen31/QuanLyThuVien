/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CTPhieuNhapHangDTO;
import Util.JDBCUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author noname
 */
public class CTPhieuNhapDAO {
    Statement st = null;
    ResultSet rs = null;
    Connection conn = null;
      public ArrayList<CTPhieuNhapHangDTO> getCTPNByMaPM(String MaPN){
        ArrayList<CTPhieuNhapHangDTO> dsCTPhieuNhapHang =  new ArrayList<CTPhieuNhapHangDTO>();
        try{
            conn = JDBCUtil.getConnect();
            String qry = "Select * from ct_phieunhap where MaPN = " +"'" +MaPN + "'";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            while(rs.next()){
                CTPhieuNhapHangDTO ctpm = new CTPhieuNhapHangDTO();
                ctpm.setMaPn(rs.getString("MaPN"));
                ctpm.setMaSach(rs.getString("MaSach"));
                ctpm.setSl(rs.getInt("SoLuong"));
                ctpm.setDonGia(rs.getDouble("DonGia"));
                ctpm.setThanhTien(rs.getDouble("ThanhTien"));
                dsCTPhieuNhapHang.add(ctpm);
            }
            JDBCUtil.closeConnection(conn);
        }catch(Exception e)
                {
            e.printStackTrace();
        }
        return dsCTPhieuNhapHang;
    }
}
