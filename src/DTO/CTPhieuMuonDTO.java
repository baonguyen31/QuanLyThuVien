/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author noname
 */
public class CTPhieuMuonDTO {
    private String MaPM;
    private String MaSach;
    private int SoLuong;

    public CTPhieuMuonDTO() {
    }

    public CTPhieuMuonDTO(String MaPM, String MaSach, int SoLuong) {
        this.MaPM = MaPM;
        this.MaSach = MaSach;
        this.SoLuong = SoLuong;
    }

    public String getMaPM() {
        return MaPM;
    }

    public void setMaPM(String MaPM) {
        this.MaPM = MaPM;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
    
}
