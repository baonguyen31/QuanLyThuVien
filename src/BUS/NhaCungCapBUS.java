/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.NhaCungCapDAO;
import DTO.NhaCungCapDTO;
import java.util.ArrayList;

/**
 *
 * @author noname
 */
public class NhaCungCapBUS {
     public static ArrayList<NhaCungCapDTO> dsNhaCungCap;
    public NhaCungCapBUS(){}
    private NhaCungCapDAO NhaCungCapDao = new NhaCungCapDAO();
    
    // Đọc dsNhaCungCap
    public ArrayList<NhaCungCapDTO> getALL(){
        if(dsNhaCungCap == null ) dsNhaCungCap = new ArrayList<NhaCungCapDTO>();
        dsNhaCungCap = NhaCungCapDao.selectAll();
        return dsNhaCungCap;
    }
    
       public ArrayList<NhaCungCapDTO> searchByTenNhaCungCap(String keyWord){
        ArrayList<NhaCungCapDTO> result = new ArrayList<>();
        for(NhaCungCapDTO s: dsNhaCungCap){
            if(s.getTenNCC().toLowerCase().contains(keyWord.toLowerCase())){
                result.add(s);
            }
//            System.out.println("Keyword: " + keyWord);
//            System.out.println("Ten NhaCungCap: " + s.getTenNhaCungCap());
        }
        return result;
    }
}
