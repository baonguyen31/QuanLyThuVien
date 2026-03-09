/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.PhieuNhapDAO;
import DTO.PhieuNhapHangDTO;
import java.util.ArrayList;

/**
 *
 * @author noname
 */
public class PhieuNhapBUS {
    static ArrayList<PhieuNhapHangDTO> list;
    private PhieuNhapDAO dao;
    public ArrayList<PhieuNhapHangDTO> getAll(){
        dao = new PhieuNhapDAO();
        if(list == null) list = new ArrayList<>();
        list = dao.getAll();
        return list;
        
    }
    public PhieuNhapHangDTO getPNByMa(String MaPn){
        dao = new PhieuNhapDAO();
        return dao.getByMaPM(MaPn);
    }
}
