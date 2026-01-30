/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.SachDTO;
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
public class SachDAO {
//    Connection conn;
    public ArrayList<SachDTO> selectAll(){
        ArrayList<SachDTO> result = new ArrayList<SachDTO>();
        try {
            Connection conn = JDBCUtil.getConnect();
            String qry = "Select * from sach";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(qry);
            while (rs.next()){
                SachDTO sach = new SachDTO();
                sach.setMaSach(rs.getString("MaSach"));
                sach.setTenSach(rs.getString("TenSach"));
                sach.setMaTL(rs.getString("MaTL"));
                sach.setMaNXB(rs.getString("MaNXB"));
                sach.setNgayXB(rs.getString("NgayXuatBan"));
                sach.setSoLuong(rs.getInt("SoLuong"));
                sach.setDonGia(rs.getInt("DonGia"));
                result.add(sach);  
            } 
            JDBCUtil.closeConnection(conn);
            
        }catch(java.sql.SQLException e)
            {
                    JOptionPane.showMessageDialog(null, "Khong the lay du lieu sach !","Lỗi",JOptionPane.ERROR_MESSAGE);
            
        }
        return result;    
    }
    
}
