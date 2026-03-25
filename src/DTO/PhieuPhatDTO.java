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
public class PhieuPhatDTO {
    private String maPP;
    private String maPM;
    private String maDG;
    private String maNV;
    private Date ngayLap;
    private int soNgayTre;
    private double tongTien;
    private int trangThai;
    
    public PhieuPhatDTO(){}

    public PhieuPhatDTO(String maPP, String maPM, String maDG, String maNV, Date ngayLap, double tongTien, int trangThai, int soNgayTre) {
        this.maPP = maPP;
        this.maPM = maPM;
        this.maDG = maDG;
        this.maNV = maNV;
        this.ngayLap = ngayLap;
        this.soNgayTre = soNgayTre;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
    }

    public String getMaPP() {
        return maPP;
    }

    public void setMaPP(String maPP) {
        this.maPP = maPP;
    }

    public String getMaPM() {
        return maPM;
    }

    public void setMaPM(String maPM) {
        this.maPM = maPM;
    }

    public String getMaDG() {
        return maDG;
    }

    public void setMaDG(String maDG) {
        this.maDG = maDG;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public int getSoNgayTre() {
        return soNgayTre;
    }

    public void setSoNgayTre(int soNgayTre) {
        this.soNgayTre = soNgayTre;
    }

    
    

    public String getTrangThaiString(){
        switch(this.trangThai){
            case 0: return "Chưa trả tiền";
            case 1: return "Đã trả tiền";
            case 2: return "Quá hạn trả tiền";
            default: return "";
        }
    }
}
