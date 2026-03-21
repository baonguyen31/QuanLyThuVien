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
import Util.JDBCUtil;
import java.util.ArrayList;
import java.util.Date;
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
       int soLuongmuon = 0; 
       int soLuongcon = 0;
       
       SachDAO sachDao = new SachDAO();
       if (ctpm == null || ctpm.isEmpty()) {
//          System.out.println("ctpm insert null");
          return false;
        }
       for (CTPhieuMuonDTO ct : ctpm){
           soLuongmuon = ct.getSoLuong();
           soLuongcon = sachDao.getSoluong(ct.getMaSach());
           if (soLuongcon < soLuongmuon){            
                JOptionPane.showMessageDialog(null, "Số lượng sách còn lại không đủ");
                return false;
           }
       }
       boolean check = phieuMuonDao.insert(pm);
//       System.out.println("Insert PM: " + check);
        if (!check) {
          System.out.println("PM insert fail");
          return false;
        }
        for (CTPhieuMuonDTO ct : ctpm){
           soLuongmuon = ct.getSoLuong();
           boolean sach =  sachDao.giamSoluong(ct.getMaSach(), soLuongmuon);
           if(!sach){
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
   
   public boolean updatePM(PhieuMuonDTO dto){ 
       return phieuMuonDao.updatePM(dto);
   }
   
//   public boolean updateQuaHan(PhieuMuonDTO pm){
//       return phieuMuonDao.updateQuaHan(pm);
//   }
      public void updateQuaHan(){
       phieuMuonDao.updateQuaHan();
   }
   
   public boolean returnSach(String MaPm){
       PhieuMuonDTO pm = phieuMuonDao.getByMaPM(MaPm);   
       ArrayList<CTPhieuMuonDTO> ctpmList = ctpmDao.getCTPMByMaPM(MaPm);
       SachDAO sachDao = new SachDAO();
       if (pm == null) return false;
       
       for(CTPhieuMuonDTO ct : ctpmList){
           boolean checkCt = sachDao.tangSoluong(ct.getMaSach(), ct.getSoLuong());
           if (!checkCt) return false;
           
       }            
       return phieuMuonDao.traSach(MaPm);
   }
   public ArrayList<PhieuMuonDTO> filter(String loaiNgay, int trangThai, Date tuNgay, Date denNgay){
       return phieuMuonDao.filter(loaiNgay, trangThai, tuNgay, denNgay);
   }
   
   public PhieuMuonDTO searchByMaPm(String maPm, ArrayList<PhieuMuonDTO> listPm){
       for( PhieuMuonDTO dto : dsPhieuMuon){
           if(dto.getMaPM().equalsIgnoreCase(maPm))
               return dto;
       }
       return null;
   }
   
    public int countDangMuon(){
         int tong = 0;
         dsPhieuMuon = new ArrayList<PhieuMuonDTO>();
         dsPhieuMuon = phieuMuonDao.selectAll();
             for(PhieuMuonDTO dto : dsPhieuMuon){
                if(dto.getTrangThai() == 0)
                tong += 1;
    
         }
         
          System.out.println("số lượng phieu muon là: "+ dsPhieuMuon.size());
         System.out.println("số lượng sách là: " + tong);
         return tong;
    }
    public boolean updateNgayTra(String maPm){
        PhieuMuonDTO dto = phieuMuonDao.getByMaPM(maPm);       
        if(maPm != null && dto.getTrangThai() == 2)
        {
            phieuMuonDao.updateNgayTra(maPm);
            return true;
        }
        else {
            JOptionPane.showMessageDialog(null, "Phiếu mượn không hợp lệ");
        }
        return false;
    }
}
