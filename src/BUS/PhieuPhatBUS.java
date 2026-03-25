/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.CTPhieuMuonDAO;
import DAO.CTPhieuNhapDAO;
import DAO.CTPhieuPhatDAO;
import DAO.PhieuMuonDAO;
import DAO.PhieuNhapDAO;
import DAO.PhieuPhatDAO;
import DAO.QuyDinhPhatDAO;
import DAO.SachDAO;
import DTO.CTPhieuMuonDTO;
import DTO.CTPhieuNhapHangDTO;
import DTO.CTPhieuPhatDTO;
import DTO.PhieuNhapHangDTO;
import DTO.PhieuPhatDTO;
import DTO.QuyDinhPhatDTO;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author noname
 */
public class PhieuPhatBUS {
    static ArrayList<PhieuPhatDTO> list;
    private PhieuPhatDAO dao = new PhieuPhatDAO();
    private CTPhieuPhatDAO ctppDao =new CTPhieuPhatDAO();
//    private ArrayList<CTPhieuPhatDTO> ctList;

    public ArrayList<PhieuPhatDTO> getAll(){
        dao = new PhieuPhatDAO();
        if(list == null) list = new ArrayList<>();
        list = dao.getAll();
        return list;
    }
    
    //Phieu Phat
    public String generateMaPP() {
    String lastMaPM = dao.getLastMaPP();

    if (lastMaPM == null) {
        return "PP01";
    }

    int number = Integer.parseInt(lastMaPM.substring(2));
    number++;

    if(number <= 9){
    return "PP0" + number;
    }
    else{
        return "PP" + number;
    }
  }
    public PhieuPhatDTO getPPByMa(String MaPp){
        dao = new PhieuPhatDAO();
        return dao.getByMaPP(MaPp);
    }
    
    public ArrayList<CTPhieuPhatDTO> getCTByMaPP(String MaPP){
        return ctppDao.getCTPPByMaPP(MaPP);
    }
    //==================tính tiền phạt====================//
    
    public int tinhSoNgayTre(Date hanTra, Date ngayTra){
    if(hanTra == null || ngayTra == null) return 0;

    long diff = ngayTra.getTime() - hanTra.getTime();

    int days = (int)(diff / (1000 * 60 * 60 * 24));

    return Math.max(days, 0); // không âm
}
    public double tinhTongTien(ArrayList<CTPhieuPhatDTO> list, int soNgayTre){
//        QuyDinhPhatDAO qdp =  new QuyDinhPhatDAO();
//        QuyDinhPhatDTO qdpDto = qdp.getByMaQDP(maQDP);
        QuyDinhPhatDTO qdpDto = new QuyDinhPhatDTO();
        double tong = 0;
        
        for(CTPhieuPhatDTO dto : list){
            tong += dto.getThanhTien();
        }
        double tienTre = 0;
        if(soNgayTre > 0) {
             tienTre = soNgayTre *  20000;
            System.out.println("Tiền trễ hạn:" + tienTre +"Số ngày trễ:" + soNgayTre + "-"+qdpDto.getSoTienPhat() );
        }       
       
        return tong + tienTre;
    }
        
    
    public double tinhTien(String maQDP, int soLuong){
        QuyDinhPhatDAO qdp =  new QuyDinhPhatDAO();
        QuyDinhPhatDTO qdpDto = qdp.getByMaQDP(maQDP);
        if(qdpDto == null) return 0;
           
//        switch (qdpDto.getLoaiphat()) {
////            case "trehan":
////                return soNgayTre * qdpDto.getSoTienPhat();
//            case "matsach":
//                // phạt theo giá trị sách * số lượng
//                return qdpDto.getSoTienPhat() * soLuong;
//            case "huhong":
//                // phạt cố định cho mỗi cuốn hỏng
//                return qdpDto.getSoTienPhat() * soLuong;
//            default:
//            // các loại phạt khác: trả về số tiền phạt cố định
            return qdpDto.getSoTienPhat() * soLuong;
        }
    
    
    //===========Thêm sửa xóa===========//
    public boolean insertPP(PhieuPhatDTO pp, ArrayList<CTPhieuPhatDTO> ctpp){
      int soNgaytre = pp.getSoNgayTre();
      double tongTien = tinhTongTien(ctpp, soNgaytre);
      pp.setTongTien(tongTien);
      
      boolean ok = dao.insertPP(pp);
            if(!ok) return false;
        if(ctpp != null || !ctpp.isEmpty()){
            for(CTPhieuPhatDTO ct : ctpp){
                ct.setMaPP(pp.getMaPP());
                boolean checkCT = ctppDao.insertCTPP(ct);
                if(!checkCT) return false;
                
                }
            //====Đặt xulytrasach ở ngoài đẻ ko bị chạy nhiều lần trong vòng for
                xuLyTraSach(pp.getMaPM(), ctpp);
                return true;
            }
        return false;
}
    
    public boolean updatePP(PhieuPhatDTO pp, ArrayList<CTPhieuPhatDTO> ctpp) {
        boolean ok = dao.updatePP(pp);
        if (!ok) return false;

        ctppDao.deleteByMaPP(pp.getMaPP());
        for (CTPhieuPhatDTO ct : ctpp) {
            ct.setMaPP(pp.getMaPP());  
            boolean checkCT = ctppDao.insertCTPP(ct);
            if (!checkCT) return false;
        }
        return true;
    }
    
    public boolean deletePP(String maPP) {
        ctppDao.deleteByMaPP(maPP);
        return dao.deletePP(maPP);
    }
    
    //=============================//
    public boolean daCoPhieuPhat(String maPM){
        list = dao.getAll();
        for(PhieuPhatDTO ct: list){
            if(ct.getMaPM() != null && ct.getMaPM().equalsIgnoreCase(maPM)) 
                return true;
        }
        return false;
    }
    
    
    //===============================================//
    public void xuLyTraSach(String maPm, ArrayList<CTPhieuPhatDTO> list){
        System.out.println("====xử lý số lượng trả========");
        CTPhieuMuonDAO pmDao = new CTPhieuMuonDAO();
        PhieuMuonDAO pm = new PhieuMuonDAO();
        SachDAO sachDao = new SachDAO();
        ArrayList<CTPhieuMuonDTO> pmList = pmDao.getCTPMByMaPM(maPm);
        for (CTPhieuMuonDTO ct : pmList){
            int slMuon = ct.getSoLuong();
            int slMat = 0;
            
            for(CTPhieuPhatDTO ctpp : list){
                if(ctpp.getMaSach().equals(ct.getMaSach())){
                    slMat += ctpp.getSoLuong();
                     }   
                }
                    int slTra = slMuon - slMat;
                    System.out.println("Mượn" + slMuon + "Trả" + slTra + "Mất" + slMat);
                if(slTra > 0 ){
                    sachDao.tangSoluong(ct.getMaSach(), slTra);
                }
                
                ct.setSoLuongTra(slTra);
                pmDao.update(ct);
        }
//        pm.traSach(maPm);
    }
}
  

