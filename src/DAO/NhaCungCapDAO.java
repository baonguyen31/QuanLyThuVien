/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NhaCungCapDTO;
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
public class NhaCungCapDAO {
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
      public ArrayList<NhaCungCapDTO> selectAll(){
        ArrayList<NhaCungCapDTO> result = new ArrayList<NhaCungCapDTO>();
        try {
            conn = JDBCUtil.getConnect();
            String qry = "Select * from nhacungcap";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()){
                NhaCungCapDTO ncc = new NhaCungCapDTO();
                ncc.setMaNCC(rs.getString("MaNCC"));
                ncc.setTenNCC(rs.getString("TenNCC"));

                result.add(ncc);  
            } 
            JDBCUtil.closeConnection(conn);
            
        }catch(java.sql.SQLException e)
            {
                    JOptionPane.showMessageDialog(null, "Không thể lấy dữ liệu nhà cung cấp!","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        return result;    
    }
      
       public String getTenNCCByMa(String MaNCC){
         String tenNCC = null;
         try {
            conn = JDBCUtil.getConnect();
            String qry = "Select TenNCC from nhacungcap where MaNCC = "+"'"+ MaNCC +"'";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            if (rs.next()){
                tenNCC = rs.getString("TenNCC");
            } 
//            System.out.print(qry);
            JDBCUtil.closeConnection(conn);
            
        }catch(java.sql.SQLException e)
            {
                    JOptionPane.showMessageDialog(null, "Không thể lấy dữ liệu nhà cung cấp !","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        return tenNCC;
    }
       
       
    
}
