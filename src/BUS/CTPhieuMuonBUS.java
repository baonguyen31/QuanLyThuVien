/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.CTPhieuMuonDAO;
import DTO.CTPhieuMuonDTO;
import java.util.ArrayList;

/**
 *
 * @author noname
 */
public class CTPhieuMuonBUS {
    public static ArrayList<CTPhieuMuonDTO> dsCTPM;
    public ArrayList<CTPhieuMuonDTO> getCTPMByMaPm(String MaPM){
        CTPhieuMuonDAO dao = new CTPhieuMuonDAO();
        dsCTPM = dao.getCTPMByMaPM(MaPM);
        return dsCTPM;
    }
}
