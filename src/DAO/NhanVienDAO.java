/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NhanVienDTO;
import Util.JDBCUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author noname
 */
public class NhanVienDAO {
    Statement st = null;
    ResultSet rs = null;
    Connection conn = null;
    public NhanVienDTO login(String maNV, String matKhau){
       try {
        Connection conn = JDBCUtil.getConnect();
        String qry = "SELECT * FROM nhanvien WHERE MaNV=" +"'"+maNV+"'";
        qry += " AND MatKhau= " +"'"+matKhau+"'";
        st = conn.createStatement();
        rs = st.executeQuery(qry);
        if (rs.next()) {
            NhanVienDTO dto = new  NhanVienDTO();
            dto.setMaNV(rs.getString("MaNV"));
            dto.setHo(rs.getString("Ho"));
            dto.setTen(rs.getString("Ten"));
            dto.setMatKhau(rs.getString("MatKhau"));
            dto.setChucVu(rs.getString("ChucVu"));
            dto.setSDT(rs.getString("SDT"));
            dto.setNgaySinh(rs.getDate("NgaySinh"));
            return dto;
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
    }
}
