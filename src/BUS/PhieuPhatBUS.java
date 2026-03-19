/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.CTPhieuNhapDAO;
import DAO.PhieuNhapDAO;
import DAO.PhieuPhatDAO;
import DAO.SachDAO;
import DTO.CTPhieuNhapHangDTO;
import DTO.PhieuNhapHangDTO;
import DTO.PhieuPhatDTO;
import java.util.ArrayList;


/**
 *
 * @author noname
 */
public class PhieuPhatBUS {
    static ArrayList<PhieuPhatDTO> list;
    private PhieuPhatDAO dao = new PhieuPhatDAO();
//    private CTPhieuPhatDAO ctpnDao =new CTPhieuPhatDAO();

    public ArrayList<PhieuPhatDTO> getAll(){
        dao = new PhieuPhatDAO();
        if(list == null) list = new ArrayList<>();
        list = dao.getAll();
        return list;
        
    }
    public String generateMaPP() {
    PhieuPhatDAO dao = new PhieuPhatDAO();
    String lastMaPM = dao.getLastMaPP();

    if (lastMaPM == null) {
        return "PP1";
    }

    int number = Integer.parseInt(lastMaPM.substring(2));
    number++;

    return "PP" + number;
  }
    public PhieuPhatDTO getPPByMa(String MaPp){
        dao = new PhieuPhatDAO();
        return dao.getByMaPP(MaPp);
    }
}
  

