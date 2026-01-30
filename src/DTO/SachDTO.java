/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author noname
 */
public class SachDTO {
    private String MaSach;
    private String TenSach;
    private String MaTL;
    private String MaNXB;
    private String NgayXB;
    private int SoLuong;
    private int DonGia;

    public SachDTO() {
    }

    public SachDTO(String MaSach, String TenSach, String MaTL, String MaNXB, String NgayXB, int SoLuong, int DonGia) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.MaTL = MaTL;
        this.MaNXB = MaNXB;
        this.NgayXB = NgayXB;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getMaTL() {
        return MaTL;
    }

    public void setMaTL(String MaTL) {
        this.MaTL = MaTL;
    }

    public String getMaNXB() {
        return MaNXB;
    }

    public void setMaNXB(String MaNXB) {
        this.MaNXB = MaNXB;
    }

    public String getNgayXB() {
        return NgayXB;
    }

    public void setNgayXB(String NgayXB) {
        this.NgayXB = NgayXB;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

   
    
}