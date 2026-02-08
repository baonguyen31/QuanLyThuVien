/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author PC
 */
public class PhieuNhapHangDTO {
    public String maPNH;
    public String maNV;
    public Date ngayNhap;
    public int tongTien;
    
    public PhieuNhapHangDTO(){}

    public PhieuNhapHangDTO(String maPNH, String maNV, Date ngayNhap, int tongTien) {
        this.maPNH = maPNH;
        this.maNV = maNV;
        this.ngayNhap = ngayNhap;
        this.tongTien = tongTien;
    }

    public String getMaPNH() {
        return maPNH;
    }

    public void setMaPNH(String maPNH) {
        this.maPNH = maPNH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String NV) {
        this.maNV = maNV;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
    
    
}
