/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.QuyDinhPhatDTO;
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
public class QuyDinhPhatDAO {
        Statement st = null;
    ResultSet rs = null;
    Connection conn = null;
    
     public ArrayList<QuyDinhPhatDTO> getAll(){
         ArrayList<QuyDinhPhatDTO> result  = new ArrayList<>();
        try{
            conn = JDBCUtil.getConnect();
            String qry = "Select * from QuyDinhPhat ";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            while(rs.next()){
                QuyDinhPhatDTO QuyDinhPhatDto = new QuyDinhPhatDTO();
                QuyDinhPhatDto.setMaQDP(rs.getString("MaQDP"));
                QuyDinhPhatDto.setQuyDinh(rs.getString("QuyDinh"));
                QuyDinhPhatDto.setSoTienPhat(rs.getInt("DonGia"));
                QuyDinhPhatDto.setLoaiphat(rs.getString("LoaiPhat"));
                result.add(QuyDinhPhatDto);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return result;
    }
    
    
    
    public QuyDinhPhatDTO getByMaQDP(String MaQDP){
        QuyDinhPhatDTO QuyDinhPhatDto = null;
        try {
            conn = JDBCUtil.getConnect();
            String qry = "Select * from QuyDinhPhat where MaQDP = " + "'"+ MaQDP +"'";
            st = conn.createStatement();
            rs = st.executeQuery(qry);
            if(rs.next()){
                QuyDinhPhatDto = new QuyDinhPhatDTO();
                QuyDinhPhatDto.setMaQDP(rs.getString("MaQDP"));
                QuyDinhPhatDto.setQuyDinh(rs.getString("QuyDinh"));
                QuyDinhPhatDto.setSoTienPhat(rs.getInt("DonGia"));
                QuyDinhPhatDto.setLoaiphat(rs.getString("LoaiPhat"));
                System.out.println(qry);
            }
            JDBCUtil.closeConnection(conn);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return QuyDinhPhatDto;
    }
}
