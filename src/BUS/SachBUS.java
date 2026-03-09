/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.SachDAO;
import DTO.SachDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author noname
 */
public class SachBUS {
    public static ArrayList<SachDTO> dsSach;
    public SachBUS(){}
    private SachDAO sachDao = new SachDAO();
    
    // Đọc dsSach
    public ArrayList<SachDTO> getALL(){
        if(dsSach == null ) dsSach = new ArrayList<SachDTO>();
        dsSach = sachDao.selectAll();
        return dsSach;
    }
    
    public boolean insertSach(SachDTO sach){
        //Kiểm tra data hợp lệ
        sach.setDonGia(0);
        sach.setSoLuong(0);
        
        if(sach.getMaSach() == null || sach.getMaSach().trim().isEmpty() || sach.getMaSach() == null  || sach.getTenSach().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Không được để trống Tên sách/Mã sách");
            return false;
        }
        if(sach.getMaTL() == null){
            JOptionPane.showMessageDialog(null, "Không được để trống thể loại");
            return false;
        }
        for(SachDTO s : dsSach){
            if(s.getMaSach().equalsIgnoreCase(sach.getMaSach())){
                JOptionPane.showMessageDialog(null, "Mã sách đã tồn tại");
                return false;
            }
        }
        for(SachDTO s : dsSach){
            if(s.getTenSach().trim().equalsIgnoreCase(sach.getTenSach().trim())){
                JOptionPane.showMessageDialog(null, "Tên sách đã tồn tại");
                return false;
            }
        }
        
        if(sachDao.insertSach(sach)){
            dsSach.add(sach);
            return true;
        }
        return false;
    }
    
    
    public boolean editSach(SachDTO sach){
        if(sach.getTenSach() == null  || sach.getTenSach().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Không được để trống tên sách");
            return false;
        }
        if(sach.getSoLuong() < 0){
            JOptionPane.showMessageDialog(null, "Số lượng không hợp lệ");
            return false;
        }
        if(sach.getMaTL() == null){
            JOptionPane.showMessageDialog(null, "Không được để trống thể loại");
            return false;
        }
        if(sach.getDonGia() < 0){
            JOptionPane.showMessageDialog(null, "Đơn giá không hợp lệ");
            return false;
        }
        
        boolean found = false;
        for(int i = 0; i < dsSach.size(); i++){
            if(dsSach.get(i).getMaSach().equalsIgnoreCase(sach.getMaSach())){
                dsSach.set(i, sach);
                found = true;
                break;
            }
        }
        
        return sachDao.editSach(sach);
    }
    public boolean deleteSach(String ma){
        if(ma == null) return false;
        
        boolean found = false;
        for(int i = 0; i < dsSach.size(); i++){
            if(dsSach.get(i).getMaSach().equalsIgnoreCase(ma)){
                dsSach.remove(i);
                found = true;
            }
        }
        if(!found){
            JOptionPane.showMessageDialog(null, "Không tìm thấy sách để xóa");
            return false;
        }
        return sachDao.deleteSach(ma);
    }
    
    public String timTenSachTheoMa(String id){
        //Kiểm tra data hợp lệ
        boolean found = false;
        for(int i = 0; i < dsSach.size(); i++){
            if(dsSach.get(i).getMaSach().equalsIgnoreCase(id)){
                found = true;
            }
        }
        return sachDao.getTenSachByMa(id);
    }
    public String getTenByMaSach(String MaSach){
        return sachDao.getTenSachByMa(MaSach);
    } 

    
    public ArrayList<SachDTO> searchByTenSach(String keyWord){
        ArrayList<SachDTO> result = new ArrayList<>();
        for(SachDTO s: dsSach){
            if(s.getTenSach().toLowerCase().contains(keyWord.toLowerCase())){
                result.add(s);
            }
//            System.out.println("Keyword: " + keyWord);
//            System.out.println("Ten sach: " + s.getTenSach());
        }
        return result;
    }
}
