/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.PhieuMuonDAO;
import DTO.PhieuMuonDTO;
import java.util.ArrayList;

/**
 *
 * @author noname
 */
public class PhieuMuonBUS {
    public static ArrayList<PhieuMuonDTO> dsPhieuMuon;
    private PhieuMuonDAO phieuMuonDao = new PhieuMuonDAO();
    public ArrayList<PhieuMuonDTO> getAll(){
       if(dsPhieuMuon == null ) dsPhieuMuon = new ArrayList<PhieuMuonDTO>();
       dsPhieuMuon = phieuMuonDao.selectAll();
       return dsPhieuMuon;
    }
    
    public PhieuMuonDTO getByMaPM(String MaPM){
        return phieuMuonDao.getByMaPM(MaPM);
  }
    
   public String generateMaPM() {
    PhieuMuonDAO dao = new PhieuMuonDAO();
    String lastMaPM = dao.getLastMaPM();

    if (lastMaPM == null) {
        return "PM001";
    }

    int number = Integer.parseInt(lastMaPM.substring(2));
    number++;

    if (number < 10) {
        return "PM00" + number;
    }else if (number < 100){
         return "PM0" + number;
    }else{
      return "PM" + number;
            }
    
   
}


}
