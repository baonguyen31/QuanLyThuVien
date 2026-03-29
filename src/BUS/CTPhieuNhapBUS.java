/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.CTPhieuNhapDAO;
import DTO.CTPhieuNhapHangDTO;
import java.util.ArrayList;

/**
 *
 * @author noname
 */
public class CTPhieuNhapBUS {
     public static ArrayList<CTPhieuNhapHangDTO> dsCTPN;
    public ArrayList<CTPhieuNhapHangDTO> getCTPNByMaPm(String MaPN){
        CTPhieuNhapDAO dao = new CTPhieuNhapDAO();
        dsCTPN = dao.getCTPNByMaPN(MaPN);
        return dsCTPN;
    }
}
