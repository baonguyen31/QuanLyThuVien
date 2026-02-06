/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author noname
 */
public class PhieuMuonDTO {
    private String MaPM;
    private String MaDG;
    private String MaNV;
    private String NgayMuon;
    private String HanTra;
    private String NgayTraThucTe;
    private int TrangThai;

    public PhieuMuonDTO() {
    }

    public PhieuMuonDTO(String MaPM, String MaDG, String MaNV, String NgayMuon, String HanTra, String NgayTraThucTe, int TrangThai) {
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

    public String getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(String NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public String getHanTra() {
        return HanTra;
    }

    public void setHanTra(String HanTra) {
        this.HanTra = HanTra;
    }

    public String getNgayTraThucTe() {
        return NgayTraThucTe;
    }

    public void setNgayTraThucTe(String NgayTraThucTe) {
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
