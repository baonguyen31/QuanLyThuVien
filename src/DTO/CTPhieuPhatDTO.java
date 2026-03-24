/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author PC
 */
public class CTPhieuPhatDTO {
    private String maPP;
    private String maSach;
    private String qdPhat;
    private int soLuong;
    private String lyDo;
    private double thanhTien;
    
    public CTPhieuPhatDTO(){}

    public CTPhieuPhatDTO(String maPP, String maSach, String qdPhat,int soLuong, String lyDo, double thanhTien) {
//        this.maCtpp = maCtpp;
        this.maPP = maPP;
        this.maSach = maSach;
        this.soLuong = soLuong;
        this.qdPhat = qdPhat;
        this.lyDo = lyDo;
        this.thanhTien = thanhTien;
    }


    public String getMaPP() {
        return maPP;
    }

    public void setMaPP(String maPP) {
        this.maPP = maPP;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getQdPhat() {
        return qdPhat;
    }

    public void setQdPhat(String qdPhat) {
        this.qdPhat = qdPhat;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

   
    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    
    
    
}
