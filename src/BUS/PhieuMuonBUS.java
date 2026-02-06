/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.PhieuMuonDAO;
import DTO.PhieuMuonDTO;
import java.util.ArrayList;

/**
 *
 * @author noname
 */
public class PhieuMuonBUS {
    public static ArrayList<PhieuMuonDTO> dsPhieuMuon;
    private PhieuMuonDAO phieuMuonDao = new PhieuMuonDAO();
    public ArrayList<PhieuMuonDTO> getAll(){
       if(dsPhieuMuon == null ) dsPhieuMuon = new ArrayList<PhieuMuonDTO>();
       dsPhieuMuon = phieuMuonDao.selectAll();
       return dsPhieuMuon;
    }
    
    public PhieuMuonDTO getByMaPM(String MaPM){
        return phieuMuonDao.getByMaPM(MaPM);
  }
}
