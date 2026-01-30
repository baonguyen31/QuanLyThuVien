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
    public ArrayList<SachDTO> getALL(){
        SachDAO sachDao = new SachDAO();
        if(dsSach == null ) dsSach = new ArrayList<SachDTO>();
        dsSach = sachDao.selectAll();
        return dsSach;
    }
    
}
