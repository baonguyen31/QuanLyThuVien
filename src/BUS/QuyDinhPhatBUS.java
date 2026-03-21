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
    
}
