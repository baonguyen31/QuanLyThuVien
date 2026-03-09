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
    private String maPn;
    private String maSach;
    private int sl;
    private double donGia;
    private double thanhTien;
    
    public CTPhieuNhapHangDTO(){}

    public CTPhieuNhapHangDTO(String maPn, String maSach, int sl, double donGia, double thanhTien) {
        this.maPn = maPn;
        this.maSach = maSach;
        this.sl = sl;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public String getMaPn() {
        return maPn;
    }

    public void setMaPn(String maPn) {
        this.maPn = maPn;
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

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    
    
}
