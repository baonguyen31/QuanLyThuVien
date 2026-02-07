/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author noname
 */
public class PhieuMuonDTO {
    private String MaPM;
    private String MaDG;
    private String MaNV;
    private Date NgayMuon;
    private Date HanTra;
    private Date NgayTraThucTe;
    private int TrangThai;

    public PhieuMuonDTO() {
    }

    public PhieuMuonDTO(String MaPM, String MaDG, String MaNV, Date NgayMuon, Date HanTra, Date NgayTraThucTe, int TrangThai) {
        this.MaPM = MaPM;
        this.MaDG = MaDG;
        this.MaNV = MaNV;
        this.NgayMuon = NgayMuon;
        this.HanTra = HanTra;
        this.NgayTraThucTe = NgayTraThucTe;
        this.TrangThai = TrangThai;
    }

    public String getMaPM() {
        return MaPM;
    }

    public void setMaPM(String MaPM) {
        this.MaPM = MaPM;
    }

    public String getMaDG() {
        return MaDG;
    }

    public void setMaDG(String MaDG) {
        this.MaDG = MaDG;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public Date getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(Date NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public Date getHanTra() {
        return HanTra;
    }

    public void setHanTra(Date HanTra) {
        this.HanTra = HanTra;
    }

    public Date getNgayTraThucTe() {
        return NgayTraThucTe;
    }

    public void setNgayTraThucTe(Date NgayTraThucTe) {
        this.NgayTraThucTe = NgayTraThucTe;
    }

    

    public int getTrangThai() {
        return TrangThai;
    }
    
    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }
    
    public String getTrangThaiString(){
        switch(this.TrangThai){
            case 0: return "Đang mượn";
            case 1: return "Đã Trả";
            case 2: return "Quá Hạn";
            default: return "";
        }
    }
    
    
    
    
    
    
    
}
