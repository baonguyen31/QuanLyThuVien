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

/**
 *
 * @author noname
 */
public class DocGiaDAO {
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
    public ArrayList<DocGiaDTO> getAll(){
        ArrayList<DocGiaDTO> dsDocgia = new ArrayList<>();
        try {
            conn = JDBCUtil.getConnect();
            String qry = "select * from docgia";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()){
                DocGiaDTO dto = new DocGiaDTO();
                dto.setHoDG(rs.getString("Ho"));
                dto.setMaDG(rs.getString("MaDG"));
                dto.setTenDG(rs.getString("Ten"));
                dto.setSDT(rs.getString("SDT"));
                dto.setTrangThai(rs.getInt("TrangThai"));
                dsDocgia.add(dto);
                
            }
            JDBCUtil.closeConnection(conn);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return dsDocgia;
    }
    
}
