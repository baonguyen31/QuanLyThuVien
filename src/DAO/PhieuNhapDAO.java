/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.PhieuNhapHangDTO;
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
public class PhieuNhapDAO {
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public ArrayList<PhieuNhapHangDTO> getAll(){
         ArrayList<PhieuNhapHangDTO> result  = new ArrayList<>();
        try{
            conn = JDBCUtil.getConnect();
            String qry = "Select * from phieunhap ";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            while(rs.next()){
                PhieuNhapHangDTO pn = new PhieuNhapHangDTO();
                pn.setMaPNH(rs.getString("MaPN"));
                pn.setMaNV(rs.getString("MaNV"));
                pn.setMaNCC(rs.getString("MaNCC"));
                pn.setNgayNhap(rs.getDate("NgayNhap"));
                pn.setTongTien(rs.getDouble("TongTien"));
                result.add(pn);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return result;
    }
        
     public PhieuNhapHangDTO getByMaPM(String MaPN){
        PhieuNhapHangDTO PhieuNhapHangDto = null;
        try {
            conn = JDBCUtil.getConnect();
            String qry = "Select * from phieunhap where MaPN = " + "'"+ MaPN +"'";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            while(rs.next()){
                PhieuNhapHangDto = new PhieuNhapHangDTO();
                PhieuNhapHangDto.setMaPNH(rs.getString("MaPN"));
                PhieuNhapHangDto.setMaNCC(rs.getString("MaNCC"));
                PhieuNhapHangDto.setMaNV(rs.getString("MaNV"));
                PhieuNhapHangDto.setNgayNhap(rs.getDate("NgayNhap"));
                PhieuNhapHangDto.setTongTien(rs.getDouble("TongTien"));
            }
            JDBCUtil.closeConnection(conn);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return PhieuNhapHangDto;
    }
     
      public boolean insert(PhieuNhapHangDTO pn){
        try {
        conn = JDBCUtil.getConnect();
        String qry = "Insert into phieunhap values(";
        qry += "'" + pn.getMaPNH()+ "'";
        qry += "," +"'" + pn.getMaNV()+ "'";
        qry += "," +"'" + pn.getMaNCC() + "'";
        qry += ","  + "'" +sdf.format(pn.getNgayNhap()) + "'" ;
        qry += "," + pn.getTongTien()+")";
        System.out.print(qry);
        st = conn.createStatement();
        st.executeUpdate(qry); 
        JDBCUtil.closeConnection(conn);
        return true;
        } catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Thêm phiếu nhập không thành công");
        }
        return false;
    }
}
