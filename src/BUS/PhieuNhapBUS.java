/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.CTPhieuNhapDAO;
import DAO.PhieuNhapDAO;
import DAO.SachDAO;
import DTO.CTPhieuNhapHangDTO;
import DTO.PhieuNhapHangDTO;
import DTO.SachDTO;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author noname
 */
public class PhieuNhapBUS {
    static ArrayList<PhieuNhapHangDTO> list;
    private PhieuNhapDAO dao = new PhieuNhapDAO();
    private CTPhieuNhapDAO ctpnDao =new CTPhieuNhapDAO();
    public ArrayList<PhieuNhapHangDTO> getAll(){
        dao = new PhieuNhapDAO();
        if(list == null) list = new ArrayList<>();
        list = dao.getAll();
        return list;
        
    }
    
    public String generateMaPN() {
    String lastMaPM = dao.getLastMaPN();

    if (lastMaPM == null) {
        return "PN01";
    }

    int number = Integer.parseInt(lastMaPM.substring(2));
    number++;

    if(number < 9){
    return "PM0" + number;
    } else {
        return "PM" + number;
    }
}
    public PhieuNhapHangDTO getPNByMa(String MaPn){
        dao = new PhieuNhapDAO();
        return dao.getByMaPM(MaPn);
    }
    
    
    public double tinhTongTien(ArrayList<CTPhieuNhapHangDTO> ctpn){
        double tong = 0;
        for(CTPhieuNhapHangDTO ct : ctpn){
            tong += ct.getThanhTien();
        }
        return tong;
    }
    
    
    
    
      public boolean insert(PhieuNhapHangDTO pn, ArrayList<CTPhieuNhapHangDTO> ctpn){
        SachDTO sachDTO = new SachDTO();
        try {
            
            System.out.println("Bắt đầu thêm phiếu");
            pn.setTongTien(tinhTongTien(ctpn));
            boolean check  = dao.insert(pn);
             System.out.println("thêm phiếu" + check);
             if(!check){
                              System.out.println("thêm phiếu fail");
                 return false;
             } else {
                 for (CTPhieuNhapHangDTO ct : ctpn){
                      System.out.println("Chi tiết " + ctpn.size());
                     SachDAO sachDao = new SachDAO();
                     ct.setMaPn(pn.getMaPNH());
                     boolean checkCt = ctpnDao.insert(ct);
                     if (!checkCt) {
                         System.out.println("Chi tiết " + checkCt);
                       return false;
                     }         
                     else {
                     boolean sach = sachDao.tangSoluong(ct.getMaSach(), ct.getSl());
                     if(!sach) return false;   
                     }
                 }
         }
        }catch(Exception e){
                 e.printStackTrace();
                 }
             return true;
         }
      public ArrayList<PhieuNhapHangDTO> filter(Date tuNgay, Date denNgay){
          return dao.filter(tuNgay, denNgay);
      }
     public boolean updatePN(PhieuNhapHangDTO pn){
         return dao.update(pn);
     }
     
     public ArrayList<PhieuNhapHangDTO> search(String keyWord, ArrayList<PhieuNhapHangDTO> listPn){
           ArrayList<PhieuNhapHangDTO> result = new ArrayList<>();
           for( PhieuNhapHangDTO dto : listPn){
           if(dto.getMaPNH().equalsIgnoreCase(keyWord) || dto.getMaNV().equalsIgnoreCase(keyWord) 
                   || dto.getMaNCC().equalsIgnoreCase(keyWord))
               result.add(dto);
            } 
            return result;
                 
     }
 }

