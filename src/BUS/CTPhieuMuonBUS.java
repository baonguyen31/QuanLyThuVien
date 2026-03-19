/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.CTPhieuMuonDAO;
import DTO.CTPhieuMuonDTO;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author noname
 */
public class CTPhieuMuonBUS {
    public static ArrayList<CTPhieuMuonDTO> dsCTPM;
    public  CTPhieuMuonDAO dao = new CTPhieuMuonDAO();
    public ArrayList<CTPhieuMuonDTO> getCTPMByMaPm(String MaPM){
//        CTPhieuMuonDAO dao = new CTPhieuMuonDAO();
        dsCTPM = dao.getCTPMByMaPM(MaPM);
        return dsCTPM;
    }
    
    public ArrayList<CTPhieuMuonDTO> top10sach(Date tuNgay, Date denNgay){      
        return dao.top10Sach(tuNgay, denNgay);
    }
}

