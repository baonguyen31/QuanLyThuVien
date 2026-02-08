/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author noname
 */
public class PhieuPhatDTO {
    public String maPP;
    public String maPM;
    public String maDG;
    public int tongTien;
    public String lyDo;
    public int trangThai;
    
    public PhieuPhatDTO(){}

    public PhieuPhatDTO(String maPP, String maPM, String maDG, int tongTien, String lyDo, int trangThai) {
        this.maPP = maPP;
        this.maPM = maPM;
        this.maDG = maDG;
        this.tongTien = tongTien;
        this.lyDo = lyDo;
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

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    public String getTrangThaiString(){
        switch(this.trangThai){
            case 0: return "Đã trả tiền";
            case 1: return "Chưa trả tiền";
            case 2: return "Quá hạn trả tiền";
            default: return "";
        }
    }
}
