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
    private DocGiaDAO dao = new DocGiaDAO();
    public ArrayList<DocGiaDTO> getAll(){
        if(dsdg == null ) dsdg = new ArrayList<DocGiaDTO>();
        dsdg =  dao.getAll();
        return dsdg;
    }
    
    public ArrayList<DocGiaDTO> searchList(String keyWord){
        ArrayList<DocGiaDTO> result = new ArrayList<>();
        for(DocGiaDTO dg : dsdg){
            if ((dg.getHoDG() + " " + dg.getTenDG()).toLowerCase()
                    .contains(keyWord.toLowerCase()))
                result.add(dg);
        }
        return result;
    }
}
