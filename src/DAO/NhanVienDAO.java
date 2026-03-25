package DAO;

import DTO.NhanVienDTO;
import Util.JDBCUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author noname
 */
public class NhanVienDAO {
    Statement st = null;
    ResultSet rs = null;
    Connection conn = null;

    public ArrayList<NhanVienDTO> selectAll() {
        ArrayList<NhanVienDTO> result = new ArrayList<NhanVienDTO>();
        try {
            conn = JDBCUtil.getConnect();
            String qry = "Select * from nhanvien";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()) {
                NhanVienDTO nv = new NhanVienDTO();
                nv.setMaNV(rs.getString("MaNV"));
                nv.setHo(rs.getString("Ho"));
                nv.setTen(rs.getString("Ten"));
                nv.setSDT(rs.getString("SDT"));
                // Lấy kiểu Date từ SQL
                nv.setNgaySinh(rs.getDate("NgaySinh")); 
                nv.setChucVu(rs.getString("ChucVu"));
                nv.setMatKhau(rs.getString("MatKhau"));
                result.add(nv);
            }
            JDBCUtil.closeConnection(conn);
        } catch (java.sql.SQLException e) {
            JOptionPane.showMessageDialog(null, "Không thể lấy dữ liệu nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

    public boolean insertNhanVien(NhanVienDTO nv) {
        // Định dạng ngày giống SachDAO
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String ngaySinhStr = sdf.format(nv.getNgaySinh());
        
        try {
            conn = JDBCUtil.getConnect();
            String qry = "INSERT INTO nhanvien(MaNV, Ho, Ten, SDT, NgaySinh, ChucVu, MatKhau) VALUES (";
            qry += "'" + nv.getMaNV() + "'";
            qry += "," + "'" + nv.getHo() + "'";
            qry += "," + "'" + nv.getTen() + "'";
            qry += "," + "'" + nv.getSDT() + "'";
            qry += "," + "'" + ngaySinhStr + "'";
            qry += "," + "'" + nv.getChucVu() + "'";
            qry += "," + "'" + nv.getMatKhau() + "'";
            qry += ")";

            st = conn.createStatement();
            st.executeUpdate(qry);
            conn.close();
            return true;
        } catch (java.sql.SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi thêm nhân viên vào DB: " + e.getMessage());
            return false;
        }
    }

    public boolean editNhanVien(NhanVienDTO nv) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String ngaySinhStr = sdf.format(nv.getNgaySinh());
        
        try {
            conn = JDBCUtil.getConnect();
            String qry = "UPDATE nhanvien SET ";
            qry += "Ho = '" + nv.getHo() + "', ";
            qry += "Ten = '" + nv.getTen() + "', ";
            qry += "SDT = '" + nv.getSDT() + "', ";
            qry += "NgaySinh = '" + ngaySinhStr + "', ";
            qry += "ChucVu = '" + nv.getChucVu() + "', ";
            qry += "MatKhau = '" + nv.getMatKhau() + "' ";
            qry += "WHERE MaNV = '" + nv.getMaNV() + "'";

            st = conn.createStatement();
            st.executeUpdate(qry);
            conn.close();
            return true;
        } catch (java.sql.SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi sửa nhân viên trong DB");
            return false;
        }
    }

    public boolean deleteNhanVien(String ma) {
        try {
            conn = JDBCUtil.getConnect();
            String qry = "Delete FROM nhanvien WHERE MaNV = '" + ma + "'";
            st = conn.createStatement();
            st.executeUpdate(qry);
            conn.close();
            return true;
        } catch (java.sql.SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa nhân viên trong DB");
            return false;
        }
    }
}