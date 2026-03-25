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
    private int SoLuongTra;
    private int tongSoLuong;

    public CTPhieuMuonDTO() {
    }

    public CTPhieuMuonDTO(String MaPM, String MaSach, int SoLuong, int SoLuongTra, int tongSoLuong) {
        this.MaPM = MaPM;
        this.MaSach = MaSach;
        this.SoLuong = SoLuong;
        this.SoLuongTra = SoLuongTra;
        this.tongSoLuong = tongSoLuong;
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

    public int getSoLuongTra() {
        return SoLuongTra;
    }

    public void setSoLuongTra(int SoLuongTra) {
        this.SoLuongTra = SoLuongTra;
    }

    public int getTongSoLuong() {
        return tongSoLuong;
    }

    public void setTongSoLuong(int tongSoLuong) {
        this.tongSoLuong = tongSoLuong;
    }

    
    
    
}
