/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.DocGiaDTO;
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
public class DocGiaDAO {
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
    public ArrayList<DocGiaDTO> selectAll(){
        ArrayList<DocGiaDTO> dsDocgia = new ArrayList<>();
        try {
            conn = JDBCUtil.getConnect();
            String qry = "SELECT * FROM docgia";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()){
                DocGiaDTO dto = new DocGiaDTO();
                dto.setMaDG(rs.getString("MaDG"));
                dto.setHoDG(rs.getString("Ho"));
                dto.setTenDG(rs.getString("Ten"));
                dto.setSDT(rs.getString("SDT"));
                dto.setDiaChi(rs.getString("DiaChi"));
                dto.setTrangThai(rs.getInt("TrangThai"));
                dsDocgia.add(dto);
                
            }
            JDBCUtil.closeConnection(conn);
        }catch(java.sql.SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Khong the lay du lieu doc gia !","Lỗi",JOptionPane.ERROR_MESSAGE);
            
        }
        return dsDocgia;
    }
    
    public boolean insertDocGia(DocGiaDTO docgiadto)
    {
        try {
            conn = JDBCUtil.getConnect();
            String qry = "Insert into docgia values(";
            qry += "'" + docgiadto.getMaDG() + "',";
            qry += "'" + docgiadto.getHoDG()+ "',";
            qry += "'" + docgiadto.getTenDG() + "',";
            qry += "'" + docgiadto.getSDT() + "',";
            qry += "'" + docgiadto.getDiaChi() + "',";
            qry += "'" + docgiadto.getTrangThai()+ "',";
            qry += "'0')";
            st = conn.createStatement();
            st.executeUpdate(qry);
            JDBCUtil.closeConnection(conn);
            return true;
        }
        catch(SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Thêm độc giả không thành công");
        }
        return false;

    }
    
    public boolean deleteDocGia(String maDocGia)
    {
        try
        {
            conn=JDBCUtil.getConnect();
            String qry = "DELETE from docgia WHERE MaDG ='";
            qry += maDocGia;
            qry +="'";
            st = conn.createStatement();
            st.executeUpdate(qry);
            JDBCUtil.closeConnection(conn);
            return true;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Xóa độc giả không thành công");
        }
        return false;
    }
    
    public boolean updateDocGia(DocGiaDTO docgiadto)
    {
        try {
            conn = JDBCUtil.getConnect();
            String qry = "UPDATE docgia SET ";
            qry +="Ho ='"+docgiadto.getHoDG()+"',";
            qry +="Ten ='"+docgiadto.getTenDG()+"',";
            qry +="SDT ='"+docgiadto.getSDT()+"',";
            qry +="DiaChi ='"+docgiadto.getDiaChi()+"',";
            qry +="TrangThai ='"+docgiadto.getTrangThai()+"' ";
            qry += "WHERE MaDG = '" + docgiadto.getMaDG() + "'";
            
            System.out.println("Câu lệnh SQL của độc giả sửa: " + qry);
            st = conn.createStatement();
            st.executeUpdate(qry);
            JDBCUtil.closeConnection(conn);
            return true;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Sửa độc giả không thành công");
        }
        return false;
    }
}
