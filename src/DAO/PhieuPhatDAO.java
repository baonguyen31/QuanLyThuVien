/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Util.JDBCUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author noname
 */
public class PhieuPhatDAO {
    Statement st = null;
    ResultSet rs = null;
    Connection conn = null;
    
     public String getLastMaPM() {
    String sql = "SELECT MaPP FROM phieuphat ORDER BY MaPP DESC LIMIT 1";
    try {
        conn = JDBCUtil.getConnect();
        st = conn.createStatement();
        rs = st.executeQuery(sql);
        if (rs.next()) {
            return rs.getString("MaPP");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}
}
