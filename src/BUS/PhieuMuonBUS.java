/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.CTPhieuMuonDAO;
import DAO.PhieuMuonDAO;
import DAO.SachDAO;
import DTO.CTPhieuMuonDTO;
import DTO.PhieuMuonDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author noname
 */
public class PhieuMuonBUS {
    public static ArrayList<PhieuMuonDTO> dsPhieuMuon;
    private PhieuMuonDAO phieuMuonDao = new PhieuMuonDAO();
    private CTPhieuMuonDAO ctpmDao = new CTPhieuMuonDAO();
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
   public boolean insert(PhieuMuonDTO pm, ArrayList<CTPhieuMuonDTO> ctpm){
//     public void insert(PhieuMuonDTO pm, ArrayList<CTPhieuMuonDTO> ctpm){
       SachDAO sachDao = new SachDAO();
       
       for (CTPhieuMuonDTO ct : ctpm){
           int soLuongcon = sachDao.getSoluong(ct.getMaSach());
           int soLuongmuon = ct.getSoLuong();
           System.out.print(soLuongcon +"," +soLuongmuon);
           if (soLuongcon < soLuongmuon){
                JOptionPane.showMessageDialog(null, "Số lượng sách còn lại không đủ");
                return false;
           }
          boolean sach =  sachDao.giamSoluong(ct.getMaSach(), soLuongmuon);
           if(!sach){
               return false;
           }
        boolean check = phieuMuonDao.insert(pm);
//       System.out.println("Insert PM: " + check);
        if (!check) {
          System.out.println("PM insert fail");
          return false;
       }
       
       if (ctpm == null || ctpm.isEmpty()) {
//          System.out.println("ctpm insert null");
          return false;
        }
        ct.setMaPM(pm.getMaPM());
        boolean checkCt = ctpmDao.insert(ct);
           if (!checkCt){
               return false;
           }
       }
       return true;
   }
}
