/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.QuyDinhPhatDAO;
import DTO.QuyDinhPhatDTO;
import java.util.ArrayList;

/**
 *
 * @author noname
 */
public class QuyDinhPhatBUS {
    static ArrayList<QuyDinhPhatDTO> list;
    private QuyDinhPhatDAO dao;
    public ArrayList<QuyDinhPhatDTO> getAll(){
        dao = new QuyDinhPhatDAO();
        if(list == null) list = new ArrayList<>();
        list = dao.getAll();
        return list;
    }
    
    public double tinhTien(String maQDP, int soNgayTre, int soLuong){
        QuyDinhPhatDTO qdpDto = dao.getByMaQDP(maQDP);
        if(maQDP == null) return 0;
        switch (qdpDto.getLoaiphat()) {
            case "trehan":
                return soNgayTre * qdpDto.getSoTienPhat();
            case "matsach":
                // phạt theo giá trị sách * số lượng
                return qdpDto.getSoTienPhat() * soLuong;
            case "huhong":
                // phạt cố định cho mỗi cuốn hỏng
                return qdpDto.getSoTienPhat() * soLuong;
            default:
            // các loại phạt khác: trả về số tiền phạt cố định
            return 0;
        }
    }
}
