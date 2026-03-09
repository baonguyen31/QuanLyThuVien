/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.SachDAO;
import DTO.SachDTO;
import java.util.ArrayList;

/**
 *
 * @author noname
 */
public class SachBUS {
    public static ArrayList<SachDTO> dsSach;
    private  SachDAO sachDao = new SachDAO();
    public ArrayList<SachDTO> getALL(){
        if(dsSach == null ) dsSach = new ArrayList<SachDTO>();
        dsSach = sachDao.selectAll();
        return dsSach;
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
