/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.CTPhieuNhapDAO;
import DAO.CTPhieuPhatDAO;
import DAO.PhieuNhapDAO;
import DAO.PhieuPhatDAO;
import DAO.QuyDinhPhatDAO;
import DAO.SachDAO;
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

    if(number < 9){
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
    //==================tính tiền phạt====================//
    
    public int tinhSoNgayTre(Date hanTra, Date ngayTra){
    if(hanTra == null || ngayTra == null) return 0;

    long diff = ngayTra.getTime() - hanTra.getTime();

    int days = (int)(diff / (1000 * 60 * 60 * 24));

    return Math.max(days, 0); // không âm
}
    
    public double tinhTien(String maQDP, int soNgayTre, int soLuong){
        QuyDinhPhatDAO qdp =  new QuyDinhPhatDAO();
        QuyDinhPhatDTO qdpDto = qdp.getByMaQDP(maQDP);
        
        if(qdpDto == null) return 0;
        
//        if(qdpDto.getLoaiphat().equals("trehan")){
//            return soNgayTre * qdpDto.getSoTienPhat();
//        }
//        else {
//            return qdpDto.getSoTienPhat();
//        }     
        switch (qdpDto.getLoaiphat()) {
            case "trehan":
                return soNgayTre * qdpDto.getSoTienPhat();
            case "matsach":
                // phạt theo giá trị sách * số lượng
                return qdpDto.getSoTienPhat() * soLuong;
            case "hongsach":
                // phạt cố định cho mỗi cuốn hỏng
                return qdpDto.getSoTienPhat() * soLuong;
            default:
            // các loại phạt khác: trả về số tiền phạt cố định
            return qdpDto.getSoTienPhat();
        }
    }
    
    //===========Thêm sửa xóa===========//
    public boolean insertPP(PhieuPhatDTO pp, ArrayList<CTPhieuPhatDTO> ctpp){
        if(ctpp == null || ctpp.isEmpty()){
            JOptionPane.showMessageDialog(null, "Danh sách CTPP rỗng");
            return false;
        }
        boolean ok = dao.insertPP(pp);
        if(!ok) return false;
        
        for(CTPhieuPhatDTO ct : ctpp){
            ct.setMaPP(pp.getMaPP());
            boolean checkCT = ctppDao.insertCTPP(ct);
            if(!checkCT) return false;
        }
        return true;
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
}
  

