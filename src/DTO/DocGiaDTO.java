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
public class DocGiaDTO {
    private String maDG;
    private String hoDG;
    private String tenDG;
    private String SDT;
    private Date namSinh;
    private int trangThai;
    private String matKhau;
    
    public DocGiaDTO(){}

    public DocGiaDTO(String maDG, String hoDG, String tenDG, String SDT, Date namSinh, String matKhau) {
        this.maDG = maDG;
        this.hoDG = hoDG;
        this.tenDG = tenDG;
        this.SDT = SDT;
        this.namSinh = namSinh;
        this.matKhau = matKhau;
    }

    public String getMaDG() {
        return maDG;
    }

    public void setMaDG(String maDG) {
        this.maDG = maDG;
    }

    public String getHoDG() {
        return hoDG;
    }

    public void setHoDG(String hoDG) {
        this.hoDG = hoDG;
    }

    public String getTenDG() {
        return tenDG;
    }

    public void setTenDG(String tenDG) {
        this.tenDG = tenDG;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    public String getTrangThaiString(){
        switch(this.trangThai){
            case 0: return "Mở khóa";
            case 1: return "Đang khóa";
            default: return "";
        }
    }
}
