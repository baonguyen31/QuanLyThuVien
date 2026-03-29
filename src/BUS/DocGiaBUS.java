/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.DocGiaDAO;
import DTO.DocGiaDTO;
import java.util.ArrayList;

/**
 *
 * @author noname
 */
public class DocGiaBUS {
    public static ArrayList<DocGiaDTO> dsdg;
    private DocGiaDAO docgiadao = new DocGiaDAO();
    public ArrayList<DocGiaDTO> getALL(){
        if(dsdg == null ) dsdg = new ArrayList<DocGiaDTO>();
        dsdg =  docgiadao.selectAll();
        return dsdg;
    }
    
    public ArrayList<DocGiaDTO> searchList(String keyWord, ArrayList<DocGiaDTO> list){
        ArrayList<DocGiaDTO> result = new ArrayList<>();
        for(DocGiaDTO dg : list){
            if ((dg.getHoDG()+ " " + dg.getTenDG() + " " + dg.getDiaChi() + " " + dg.getSDT()).toLowerCase().contains(keyWord.toLowerCase()))
                result.add(dg);
        }
        System.out.println("Đọc giả" + result.size());
        return result;
    }

    public ArrayList<DocGiaDTO> dgKhongKhoa(){
        ArrayList<DocGiaDTO> result = new ArrayList<>();
        if(dsdg == null ) dsdg = new ArrayList<DocGiaDTO>();
        dsdg =  docgiadao.selectAll();
        for(DocGiaDTO dto : dsdg){
            if(dto.getTrangThai() == 0){
                result.add(dto);
            }
        }
        return result;
    }
    
    public String generateMADG()
    {
        getALL();
        DocGiaDTO lastDG = dsdg.get(dsdg.size() -1);
        int nextMADG = Integer.parseInt(lastDG.getMaDG().substring(2)) + 1;
        if (nextMADG >9)
        {
            return "DG" + String.format("%02d", nextMADG);
        }
        else
        {
            return "DG" + String.format("%02d", nextMADG);
        }
    }
}
