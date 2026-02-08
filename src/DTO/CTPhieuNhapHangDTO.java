/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author PC
 */
public class CTPhieuNhapHangDTO {
    public String maCTPNH;
    public String maSach;
    public int sl;
    public String donGia;
    public int thanhTien;
    
    public CTPhieuNhapHangDTO(){}

    public CTPhieuNhapHangDTO(String maCTPNH, String maSach, int sl, String donGia, int thanhTien) {
        this.maCTPNH = maCTPNH;
        this.maSach = maSach;
        this.sl = sl;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public String getMaCTPNH() {
        return maCTPNH;
    }

    public void setMaCTPNH(String maCTPNH) {
        this.maCTPNH = maCTPNH;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }
    
    
}
