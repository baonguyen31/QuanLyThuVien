/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author noname
 */
public class JDBCUtil {
    
    public static Connection getConnect(){
        Connection result = null;
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            
            String url = "jdbc:mySQL://localhost:3307/qltv2";
            String userName = "root";
            String passWord = "";
            
            result = DriverManager.getConnection(url, userName, passWord);
//            System.out.print(result);
            
        }
        catch(java.sql.SQLException e)
                {
                    JOptionPane.showMessageDialog(null, "Không thể kết nối cơ sở dữ liệu !","Lỗi",JOptionPane.ERROR_MESSAGE);
            
        }
        return result;
    }
    
    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        getConnect();
    }
}